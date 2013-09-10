/*
 * (C) Copyright 2013 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Benjamin JALON<bjalon@nuxeo.com>
 */
package org.nuxeo.adullact.webdelib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.nuxeo.adullact.webdelib.WebDelibConstants.STUDIO_SYMBOLIC_NAME;

import java.io.File;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.common.utils.FileUtils;
import org.nuxeo.ecm.core.api.Blob;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.PathRef;
import org.nuxeo.ecm.core.event.EventService;
import org.nuxeo.ecm.core.test.CoreFeature;
import org.nuxeo.ecm.core.test.DefaultRepositoryInit;
import org.nuxeo.ecm.core.test.annotations.Granularity;
import org.nuxeo.ecm.core.test.annotations.RepositoryConfig;
import org.nuxeo.ecm.platform.importer.xml.parser.XmlImporterService;
import org.nuxeo.runtime.api.Framework;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;

import com.google.inject.Inject;

@RunWith(FeaturesRunner.class)
@Features(CoreFeature.class)
@Deploy({ "org.nuxeo.ecm.automation.core", "nuxeo-importer-xml-parser",
        "org.nuxeo.ecm.platform.content.template",
        "nuxeo-adullact-webdelib-core", STUDIO_SYMBOLIC_NAME })
@RepositoryConfig(cleanup = Granularity.METHOD, init = DefaultRepositoryInit.class)
public class TestMapperService {

    public static final String DATE_FORMAT = "%d-%02d-%02d %02d:%02d:%02d";

    @Inject
    CoreSession session;

    @Inject
    EventService eventService;

    @Inject
    XmlImporterService importerService;

    @Test
    public void testImportXML() throws Exception {

        File xml = FileUtils.getResourceFileFromContext("test-export-webdelib.xml");
        assertNotNull(xml);

        DocumentModel root = session.getRootDocument();

        XmlImporterService importer = Framework.getLocalService(XmlImporterService.class);
        assertNotNull(importer);
        importer.importDocuments(root, xml);

        session.save();
        eventService.waitForAsyncCompletion();

        checkImport();
    }


    @Test
    public void testImportZip() throws Exception {

        File zip = FileUtils.getResourceFileFromContext("test-export-webdelib.zip");
        assertNotNull(zip);

        DocumentModel root = session.getRootDocument();

        XmlImporterService importer = Framework.getLocalService(XmlImporterService.class);
        assertNotNull(importer);
        importer.importDocuments(root, zip);

        session.save();

        checkImport();
    }


    @Test
    public void testReImportXML() throws Exception {

        File xml = FileUtils.getResourceFileFromContext("test-export-webdelib.xml");
        assertNotNull(xml);

        DocumentModel root = session.getRootDocument();

        XmlImporterService importer = Framework.getLocalService(XmlImporterService.class);
        assertNotNull(importer);
        importer.importDocuments(root, xml);
        session.save();

        importer.importDocuments(root, xml);
        session.save();

        checkImport();
    }

    public void checkImport() throws ClientException {
        // ****** STATISTICS *******
        List<DocumentModel> docs = session.query("SELECT * FROM WebDelibSeance");
        assertEquals(1, docs.size());
        docs = session.query("SELECT * FROM WebDelibActe");
        assertEquals(5, docs.size());
        docs = session.query("SELECT * FROM WebDelibSignature");
        assertEquals(2, docs.size());
        docs = session.query("SELECT * FROM WebDelibDocument");
        assertEquals(25, docs.size());


        // ****** SEANCES *******
        DocumentModel seanceDoc = session.getDocument(new PathRef(
                "/2013/02/07/WebDelibSeance-1"));
        assertEquals("Conseil Général",
                seanceDoc.getPropertyValue("webdelibseance:type"));
        assertEquals("3", seanceDoc.getPropertyValue("webdelib_common:adu_id"));
        assertEqualsDate("2013-02-07 14:00:00",
                seanceDoc.getPropertyValue("webdelibseance:date_seance"));
        assertEqualsDate("2012-11-30 18:16:01",
                seanceDoc.getPropertyValue("webdelibseance:date_convocation"));
        assertEquals("Conseil Général - 07/02/2013",
                seanceDoc.getPropertyValue("dc:title"));
        assertEquals("12",
                seanceDoc.getPropertyValue("webdelibseance:idSeance"));
        assertEqualsFile("convocation.pdf", "application/pdf", "utf-8",
                seanceDoc.getPropertyValue("webdelibseance:convocation_file"));
        assertEqualsFile("odj.pdf", "application/pdf", "utf-8",
                seanceDoc.getPropertyValue("webdelibseance:ordre_du_jour_file"));
        assertEqualsFile("pv.pdf", "application/pdf", "utf-8",
                seanceDoc.getPropertyValue("webdelibseance:pv_sommaire_file"));
        assertEqualsFile("pvcomplet.pdf", "application/pdf", "utf-8",
                seanceDoc.getPropertyValue("webdelibseance:pv_complet_file"));

        // ****** ACTES 38 *******
        DocumentModel acte38 = session.getDocument(new PathRef(
                "/2013/02/07/WebDelibSeance-1/Acte-38"));
        assertEquals("38", acte38.getPropertyValue("webdelibacte:idActe"));
        assertEquals("3", acte38.getPropertyValue("webdelib_common:adu_id"));
        assertNull(acte38.getPropertyValue("webdelibacte:numero"));
        assertEquals("Changement des horaires d'ouverture de la mairie",
                acte38.getPropertyValue("dc:title"));
        assertEquals("Délibération",
                acte38.getPropertyValue("webdelibacte:nature"));
        assertEqualsDate("2013-02-07 14:00:00",
                acte38.getPropertyValue("webdelibacte:date"));
        assertEquals("Administration Generale",
                acte38.getPropertyValue("webdelibacte:theme"));
        assertEquals("Direction Informatique",
                acte38.getPropertyValue("webdelibacte:emetteur"));
        assertEquals("Marc Marchal",
                acte38.getPropertyValue("webdelibacte:redacteur"));
        assertEquals("Pascal PERTUSA",
                acte38.getPropertyValue("webdelibacte:rapporteur"));
        assertEquals("Basse ville",
                acte38.getPropertyValue("webdelibacte:canton"));
        assertEquals("Valence", acte38.getPropertyValue("webdelibacte:commune"));
        assertEquals("Commission Ressources",
                acte38.getPropertyValue("webdelibacte:type"));
        assertEquals(
                "Commission Ressources : 2013-02-07 14:00:00, Commission Ressources"
                        + " : 2013-03-29 16:00:00, test FD : 2013-04-05 17:17:00, ",
                acte38.getPropertyValue("webdelibacte:commissions"));
        assertEquals("Projet chambre des notaires",
                acte38.getPropertyValue("dc:description"));

        docs = session.query("SELECT * FROM WebDelibDocument WHERE ecm:path STARTSWITH '/2013/02/07/WebDelibSeance-1/Acte-38/'");
        assertEquals(13, docs.size());
        docs = session.query("SELECT * FROM WebDelibSignature WHERE ecm:path STARTSWITH '/2013/02/07/WebDelibSeance-1/Acte-38/'");
        assertEquals(2, docs.size());
        assertEqualsFile("signature.zip", "application/zip", "utf-8", docs.get(0).getPropertyValue("file:content"));

        // ****** ACTES 59 *******
        DocumentModel acte59 = session.getDocument(new PathRef(
                "/2013/02/07/WebDelibSeance-1/Acte-59"));
        assertEquals("3", acte59.getPropertyValue("webdelib_common:adu_id"));
        assertEquals("59", acte59.getPropertyValue("webdelibacte:idActe"));
        assertEquals("Projet chambre des notaires",
                acte59.getPropertyValue("dc:title"));
        assertEquals("Projet chambre des notaires",
                acte59.getPropertyValue("dc:description"));
        assertEqualsDate("2013-02-07 14:00:00",
                acte59.getPropertyValue("webdelibacte:date"));
        assertEquals("DELIB_0001",
                acte59.getPropertyValue("webdelibacte:numero"));
        assertEquals("Technologies d'Information et de Communication",
                acte59.getPropertyValue("webdelibacte:theme"));
        assertEquals("Direction Informatique",
                acte59.getPropertyValue("webdelibacte:emetteur"));
        assertEquals("redac1 redac1",
                acte59.getPropertyValue("webdelibacte:redacteur"));
        assertEquals("Paul ARNOUX",
                acte59.getPropertyValue("webdelibacte:rapporteur"));
        assertEquals("Basse ville",
                acte59.getPropertyValue("webdelibacte:canton"));
        assertEquals("Valence", acte59.getPropertyValue("webdelibacte:commune"));
        assertEquals("Commission Ressources",
                acte59.getPropertyValue("webdelibacte:type"));

        docs = session.query("SELECT * FROM WebDelibDocument WHERE ecm:path STARTSWITH '/2013/02/07/WebDelibSeance-1/Acte-59/'");
        assertEquals(3, docs.size());
        docs = session.query("SELECT * FROM WebDelibSignature WHERE ecm:path STARTSWITH '/2013/02/07/WebDelibSeance-1/Acte-59/'");
        assertEquals(0, docs.size());

        // ****** ACTES 59 *******
        DocumentModel acte37 = session.getDocument(new PathRef(
                "/2013/02/07/WebDelibSeance-1/Acte-37"));
        assertEquals("3", acte37.getPropertyValue("webdelib_common:adu_id"));
        assertEquals("37", acte37.getPropertyValue("webdelibacte:idActe"));
        assertEquals("Éclairage du terrain de foot",
                acte37.getPropertyValue("dc:title"));
        assertNull(acte37.getPropertyValue("dc:description"));
        assertEqualsDate("2013-02-07 14:00:00",
                acte37.getPropertyValue("webdelibacte:date"));
        assertEquals("DELIB_0003",
                acte37.getPropertyValue("webdelibacte:numero"));
        assertEquals("Habitat, Urbanisme, Logement",
                acte37.getPropertyValue("webdelibacte:theme"));
        assertEquals("Direction Informatique",
                acte37.getPropertyValue("webdelibacte:emetteur"));
        assertEquals("Marc Marchal",
                acte37.getPropertyValue("webdelibacte:redacteur"));
        assertEquals("Claude BRES",
                acte37.getPropertyValue("webdelibacte:rapporteur"));
        assertEquals("Basse ville",
                acte37.getPropertyValue("webdelibacte:canton"));
        assertEquals("Valence", acte37.getPropertyValue("webdelibacte:commune"));
        assertEquals("Commission Ressources : 2013-02-07 14:00:00, ",
                acte37.getPropertyValue("webdelibacte:commissions"));
        assertEquals("Commission Ressources",
                acte37.getPropertyValue("webdelibacte:type"));

        docs = session.query("SELECT * FROM WebDelibDocument WHERE ecm:path STARTSWITH '/2013/02/07/WebDelibSeance-1/Acte-37/'");
        assertEquals(3, docs.size());
        docs = session.query("SELECT * FROM WebDelibSignature WHERE ecm:path STARTSWITH '/2013/02/07/WebDelibSeance-1/Acte-37/'");
        assertEquals(0, docs.size());

        // ****** ACTES 149 *******
        DocumentModel acte149 = session.getDocument(new PathRef(
                "/2013/02/09/Autres/Acte-149"));
        assertEquals("3", acte149.getPropertyValue("webdelib_common:adu_id"));
        assertEquals("149", acte149.getPropertyValue("webdelibacte:idActe"));
        assertEquals("Refection de la cantine",
                acte149.getPropertyValue("dc:title"));
        assertNull(acte149.getPropertyValue("dc:description"));
        assertEquals("Arrete", acte149.getPropertyValue("webdelibacte:nature"));
        assertEqualsDate("2013-02-09 00:00:00",
                acte149.getPropertyValue("webdelibacte:date"));
        assertNull(acte149.getPropertyValue("webdelibacte:numero"));
        assertNull(acte149.getPropertyValue("webdelibacte:theme"));
        assertEquals("DGS", acte149.getPropertyValue("webdelibacte:emetteur"));
        assertEquals("Brigitte Liège",
                acte149.getPropertyValue("webdelibacte:redacteur"));
        assertEquals(" ", acte149.getPropertyValue("webdelibacte:rapporteur"));
        assertNull(acte149.getPropertyValue("webdelibacte:canton"));
        assertEquals("Valence",
                acte149.getPropertyValue("webdelibacte:commune"));
        assertNull(acte149.getPropertyValue("webdelibacte:commissions"));
        assertNull(acte149.getPropertyValue("webdelibacte:type"));

        docs = session.query("SELECT * FROM WebDelibDocument WHERE ecm:path STARTSWITH '/2013/02/09/Autres/Acte-149/'");
        assertEquals(3, docs.size());
        docs = session.query("SELECT * FROM WebDelibSignature WHERE ecm:path STARTSWITH '/2013/02/09/Autres/Acte-149/'");
        assertEquals(0, docs.size());

        // ****** ACTES 205 *******
        DocumentModel acte205 = session.getDocument(new PathRef(
                "/2013/02/07/WebDelibSeance-1/Acte-205"));
        assertEquals("3", acte205.getPropertyValue("webdelib_common:adu_id"));
        assertEquals("205", acte205.getPropertyValue("webdelibacte:idActe"));
        assertEquals("test ticket", acte205.getPropertyValue("dc:title"));
        assertNull(acte205.getPropertyValue("dc:description"));
        assertEquals("Délibération",
                acte205.getPropertyValue("webdelibacte:nature"));
        assertEqualsDate("2013-02-07 14:00:00",
                acte205.getPropertyValue("webdelibacte:date"));
        assertNull(acte205.getPropertyValue("webdelibacte:numero"));
        assertEquals("Sports, Jeunesse, Education Populaire",
                acte205.getPropertyValue("webdelibacte:theme"));
        assertEquals("Direction Informatique",
                acte205.getPropertyValue("webdelibacte:emetteur"));
        assertEquals("Marc Marchal",
                acte205.getPropertyValue("webdelibacte:redacteur"));
        assertEquals(" ", acte205.getPropertyValue("webdelibacte:rapporteur"));
        assertEquals("Basse ville",
                acte205.getPropertyValue("webdelibacte:canton"));
        assertEquals("Valence",
                acte205.getPropertyValue("webdelibacte:commune"));
        assertEquals("Commission Ressources : 2013-02-07 14:00:00, ",
                acte205.getPropertyValue("webdelibacte:commissions"));
        assertEquals("Commission Ressources",
                acte205.getPropertyValue("webdelibacte:type"));

        docs = session.query("SELECT * FROM WebDelibDocument WHERE ecm:path STARTSWITH '/2013/02/07/WebDelibSeance-1/Acte-205'");
        assertEquals(3, docs.size());
        docs = session.query("SELECT * FROM WebDelibSignature WHERE ecm:path STARTSWITH '/2013/02/07/WebDelibSeance-1/Acte-205/'");
        assertEquals(0, docs.size());


    }

    private void assertEqualsFile(String filename, String mimetype,
            String encoding, Serializable serializable) {
        assertNotNull(serializable);
        assertTrue("Waiting value as Blob , but was "
                + serializable.getClass().toString(),
                serializable instanceof Blob);
        Blob blob = (Blob) serializable;
        assertNotNull(blob);
        assertEquals(filename, blob.getFilename());
        assertEquals(mimetype, blob.getMimeType());
        // assertEquals(encoding, blob.getEncoding());

    }

    private void assertEqualsDate(String expected, Serializable serializable) {
        assertNotNull(serializable);
        assertTrue("Waiting value as Calendar , but was "
                + serializable.getClass().toString(),
                serializable instanceof Calendar);
        Calendar date = (Calendar) serializable;
        String current = String.format(DATE_FORMAT, date.get(Calendar.YEAR),
                date.get(Calendar.MONTH) + 1, date.get(Calendar.DAY_OF_MONTH),
                date.get(Calendar.HOUR_OF_DAY), date.get(Calendar.MINUTE),
                date.get(Calendar.SECOND));
        assertEquals(expected, current);
        // assertEquals(year, date.get(Calendar.YEAR));
        // assertEquals(month, date.get(Calendar.MONTH));
        // assertEquals(day, date.get(Calendar.DAY_OF_MONTH));
        // assertEquals(hour, date.get(Calendar.HOUR_OF_DAY));
        // assertEquals(minute, date.get(Calendar.MINUTE));
        // assertEquals(seconde, date.get(Calendar.SECOND));

    }
}