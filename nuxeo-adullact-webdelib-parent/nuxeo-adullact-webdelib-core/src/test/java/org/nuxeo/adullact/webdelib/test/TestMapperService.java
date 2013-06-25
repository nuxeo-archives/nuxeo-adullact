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
package org.nuxeo.adullact.webdelib.test;

import static org.nuxeo.adullact.webdelib.test.WebDelibConstantsForTests.*;
import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.adullact.importer.XmlImporterSevice;
import org.nuxeo.common.utils.FileUtils;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.test.CoreFeature;
import org.nuxeo.runtime.api.Framework;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;

import com.google.inject.Inject;

@RunWith(FeaturesRunner.class)
@Features(CoreFeature.class)
@Deploy({ "org.nuxeo.adullact.importer", "nuxeo-adullact-webdelib-core",
        STUDIO_SYMBOLIC_NAME })
public class TestMapperService {

    @Inject
    CoreSession session;

    @Inject
    XmlImporterSevice importerService;

    @Test
    public void testImportXML() throws Exception {

        File xml = FileUtils.getResourceFileFromContext("test-export-webdelib.xml");
        assertNotNull(xml);

        DocumentModel root = session.getRootDocument();

        XmlImporterSevice importer = Framework.getLocalService(XmlImporterSevice.class);
        assertNotNull(importer);
        importer.importDocuments(root, xml);

        session.save();

        // ****** SEANCES *******
        List<DocumentModel> docs = session.query("select * from "
                + DOC_TYPE_SEANCE);
        assertEquals("we should have only one Seance", 1, docs.size());
        DocumentModel seanceDoc = docs.get(0);
        assertEquals("/WebDelibSeance-1", seanceDoc.getPathAsString());
        assertEquals("Conseil Général",
                seanceDoc.getPropertyValue("webdelibseance:type"));
        // assertEquals("",
        // seanceDoc.getPropertyValue("webdelibseance:date_seance"));
        // assertEquals("",
        // seanceDoc.getPropertyValue("webdelibseance:date_convocation"));
        assertEquals("12",
                seanceDoc.getPropertyValue("webdelibseance:idSeance"));

        // ****** ACTES *******
        docs = session.query("select * from " + DOC_TYPE_ACTE
                + " ORDER BY dc:created");
        assertEquals("we should have 5 actes", 5, docs.size());
        DocumentModel acte = docs.get(0);
        assertEquals("/WebDelibSeance-1/Acte-38", acte.getPathAsString());
        assertEquals("Changement des horaires d'ouverture de la mairie",
                acte.getPropertyValue("dc:title"));
        assertEquals("Projet chambre des notaires",
                acte.getPropertyValue("dc:description"));
        // assertEquals("", acte.getPropertyValue("webdelibacte:date"));
        assertNull(acte.getPropertyValue("webdelibacte:numero"));
        assertEquals("Administration Generale",
                acte.getPropertyValue("webdelibacte:theme"));
        assertEquals("Direction Informatique",
                acte.getPropertyValue("webdelibacte:emetteur"));
        assertEquals("Marc Marchal",
                acte.getPropertyValue("webdelibacte:redacteur"));
        assertEquals("Pascal PERTUSA",
                acte.getPropertyValue("webdelibacte:rapporteur"));
        assertEquals("Basse ville",
                acte.getPropertyValue("webdelibacte:canton"));
        assertEquals("Valence", acte.getPropertyValue("webdelibacte:commune"));
        assertEquals("Commission Ressources",
                acte.getPropertyValue("webdelibacte:type"));
        assertEquals(
                "Commission Ressources : 2013-02-07 14:00:00, Commission Ressources"
                        + " : 2013-03-29 16:00:00, test FD : 2013-04-05 17:17:00, ",
                acte.getPropertyValue("webdelibacte:commissions"));

        assertEquals("/WebDelibSeance-1/Acte-59", docs.get(1).getPathAsString());
        assertEquals("/WebDelibSeance-1/Acte-37", docs.get(2).getPathAsString());

        // Acte sans seance
        acte = docs.get(3);
        assertEquals("Tu le verras celui-là ?",
                acte.getPropertyValue("dc:title"));
        assertNull(acte.getPropertyValue("dc:description"));
        // assertEquals("", acte.getPropertyValue("webdelibacte:date"));
        assertNull(acte.getPropertyValue("webdelibacte:numero"));
        assertNull(acte.getPropertyValue("webdelibacte:theme"));
        assertEquals("DGS", acte.getPropertyValue("webdelibacte:emetteur"));
        assertEquals("Brigitte Liège",
                acte.getPropertyValue("webdelibacte:redacteur"));
        assertEquals(" ", acte.getPropertyValue("webdelibacte:rapporteur"));
        assertNull(acte.getPropertyValue("webdelibacte:canton"));
        assertEquals("Valence", acte.getPropertyValue("webdelibacte:commune"));
        assertNull(acte.getPropertyValue("webdelibacte:type"));
        assertEquals("/Acte-149", acte.getPathAsString());

        assertEquals("/WebDelibSeance-1/Acte-205",
                docs.get(4).getPathAsString());

        // ****** DOCUMENTS *******
        docs = session.query("select * from " + DOC_TYPE_DOCUMENT
                + " ORDER BY dc:created");
        assertEquals("we should have 18 files", 18, docs.size());
        DocumentModel document = docs.get(0);
        assertEquals("convocation.pdf", document.getPropertyValue("dc:title"));
        assertEquals("convocation", document.getPropertyValue("webdelibdocument:type"));
//        assertEquals("application/pdf", document.getPropertyValue("file:content/mime-type"));
//        assertEquals("utf-8", document.getPropertyValue("file:content/encoding"));
        assertEquals("p7s", document.getPropertyValue("webdelibdocument:format_signature"));
        assertEquals("/WebDelibSeance-1/convocation.pdf", document.getPathAsString());

        docs = session.query("select * from " + DOC_TYPE_DOCUMENT
                + " where ecm:parentId='" + seanceDoc.getId() + "'");
        assertEquals("we should have only 4 files in the seance", 4,
                docs.size());
    }

}