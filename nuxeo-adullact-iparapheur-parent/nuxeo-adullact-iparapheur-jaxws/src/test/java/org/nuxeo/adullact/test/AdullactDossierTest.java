/*
 * (C) Copyright 2012 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Benjamin JALON
 */
package org.nuxeo.adullact.test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.fail;
import static org.nuxeo.adullact.test.AdullactTestHelper.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.adullact.AdullactDossier;
import org.nuxeo.adullact.jaxws.CreerDossierRequest;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.impl.blob.StringBlob;
import org.nuxeo.ecm.core.test.CoreFeature;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;
import org.nuxeo.runtime.test.runner.RuntimeHarness;

import com.google.inject.Inject;

@RunWith(FeaturesRunner.class)
@Features(CoreFeature.class)
@Deploy({ "nuxeo-adullact-iparapheur-integration:OSGI-INF/adullact-coretype-contrib.xml" })
public class AdullactDossierTest {

    private static final String STATUS = "status";

    private static final String PUBLIC_ANNOTATION = "publicAnnotation";

    private static final String PRIVATE_ANNOTATION = "privateAnnotation";

    private static final String EMAIL_EMETTEUR = "emailEmetteur";

    private static final String DOSSIER_ID = "dossierID";

    @Inject
    public RuntimeHarness runtimeHarness;

    @Inject
    protected CoreSession session;

    @Before
    public void init() throws Exception {
        loadProperties();

        runtimeHarness.deployContrib("nuxeo-adullact-iparapheur-integration",
                "OSGI-INF/extensions/org.nuxeo.adullact.AdullactAdapterFactory.xml");
    }

    @Test
    public void shouldFolderNotBeAdaptableAsAdullactDossier()
            throws ClientException {
        DocumentModel folder = session.createDocumentModel("/", "test",
                "Folder");
        session.createDocument(folder);
        session.save();

        AdullactDossier adapter = folder.getAdapter(AdullactDossier.class);
        assertNull("Folder is not adaptable as not implement file schema",
                adapter);
    }

    @Test
    public void shouldFileBeAdaptableAsAdullactDossier() throws ClientException {
        DocumentModel file = session.createDocumentModel("/", "test", "File");
        file = session.createDocument(file);
        session.save();

        AdullactDossier adapter = file.getAdapter(AdullactDossier.class);
        assertNotNull("File is adaptable as implement file schema", file);
        initIParapheurDossier(adapter);

        file = session.getDocument(file.getRef());
        adapter = file.getAdapter(AdullactDossier.class);

        assertEquals(DOSSIER_ID, adapter.getDossierID());
        assertEquals(EMAIL_EMETTEUR, adapter.getEmailEmetteur());
        assertEquals(PRIVATE_ANNOTATION, adapter.getPrivateAnnotation());
        assertEquals(PUBLIC_ANNOTATION, adapter.getPublicAnnotation());
        assertEquals(STATUS, adapter.getStatus());
    }

    @Test
    public void shouldFailedForRequestGenerationFromFileAdapterWithoutFileAttached() throws ClientException {
        DocumentModel file = session.createDocumentModel("/", "test", "File");
        file = session.createDocument(file);
        session.save();

        AdullactDossier adapter = file.getAdapter(AdullactDossier.class);
        assertNotNull("File is adaptable as implement file schema", file);
        initIParapheurDossier(adapter);

        file = session.getDocument(file.getRef());
        adapter = file.getAdapter(AdullactDossier.class);

        try {
            adapter.getCreerDossierRequest();
            fail("Request generation should failed as no file attach to Document for iParapheur");
        } catch (ClientException e) {
            assertEquals("No file attach to document can't ask signature to iParapheur", e.getMessage());
        }
    }

    @Test
    public void shouldCreateRequestFromFileAdapterWithFileAttached() throws ClientException {
        DocumentModel file = session.createDocumentModel("/", "test", "File");
        file = session.createDocument(file);
        session.save();

        AdullactDossier adapter = file.getAdapter(AdullactDossier.class);
        initIParapheurDossier(adapter);

        file = session.getDocument(file.getRef());

        StringBlob blob = new StringBlob("test");
        blob.setFilename("test.txt");
        blob.setMimeType("text/plain");
        file.setPropertyValue("file:content", blob);
        session.saveDocument(file);
        session.save();

        file = session.getDocument(file.getRef());
        adapter = file.getAdapter(AdullactDossier.class);

        CreerDossierRequest request = adapter.getCreerDossierRequest();
        assertEquals(DOSSIER_ID, request.getDossierID());
        assertEquals(EMAIL_EMETTEUR, request.getEmailEmetteur());
        assertEquals(PRIVATE_ANNOTATION, request.getAnnotationPrivee());
        assertEquals(PUBLIC_ANNOTATION, request.getAnnotationPublique());

    }

    private void initIParapheurDossier(AdullactDossier adapter)
            throws ClientException {
        adapter.setDossierID(DOSSIER_ID);
        adapter.setEmailEmetteur(EMAIL_EMETTEUR);
        adapter.setPrivateAnnotation(PRIVATE_ANNOTATION);
        adapter.setPublicAnnotation(PUBLIC_ANNOTATION);
        adapter.setStatus(STATUS);
        DocumentModel file = adapter.getDocumentModel();

        session.saveDocument(file);
        session.save();
    }

}
