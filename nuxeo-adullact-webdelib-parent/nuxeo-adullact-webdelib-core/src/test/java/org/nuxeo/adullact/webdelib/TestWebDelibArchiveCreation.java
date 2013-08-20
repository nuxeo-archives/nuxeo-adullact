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
import static org.nuxeo.adullact.webdelib.WebDelibConstants.DOC_TYPE_ARCHIVE;
import static org.nuxeo.adullact.webdelib.WebDelibConstants.DOC_TYPE_SEANCE;
import static org.nuxeo.adullact.webdelib.WebDelibConstants.DOMAIN_PATH;
import static org.nuxeo.adullact.webdelib.WebDelibConstants.STUDIO_SYMBOLIC_NAME;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.common.utils.FileUtils;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.DocumentModelList;
import org.nuxeo.ecm.core.api.impl.blob.FileBlob;
import org.nuxeo.ecm.core.test.CoreFeature;
import org.nuxeo.ecm.core.test.DefaultRepositoryInit;
import org.nuxeo.ecm.core.test.annotations.Granularity;
import org.nuxeo.ecm.core.test.annotations.RepositoryConfig;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;

import com.google.inject.Inject;

@RunWith(FeaturesRunner.class)
@Features(CoreFeature.class)
@Deploy({ "org.nuxeo.ecm.platform.content.template",
        "org.nuxeo.adullact.importer", "org.nuxeo.ecm.automation.core",
        "nuxeo-adullact-webdelib-core", STUDIO_SYMBOLIC_NAME })
@RepositoryConfig(cleanup = Granularity.METHOD, init = DefaultRepositoryInit.class)
public class TestWebDelibArchiveCreation {

    @Inject
    CoreSession session;

    private DocumentModel archive;

    @Before
    public void setup() throws Exception {
        String path = DOMAIN_PATH;
        archive = session.createDocumentModel(DOC_TYPE_ARCHIVE);
        archive.setPathInfo(path, "sd");
        archive.setPropertyValue(
                "file:content",
                new FileBlob(
                        FileUtils.getResourceFileFromContext("test-export-webdelib.zip")));
        archive.setPropertyValue("dc:source", "Administrator");

        archive = session.createDocument(archive);
        session.save();
    }

    @Test
    public void shouldDeployZip() throws Exception {
        DocumentModelList docs = session.query("SELECT * FROM "
                + DOC_TYPE_SEANCE);

        assertEquals(1, docs.size());
        assertEquals("/webdelib-referentiel/2013/02/07/WebDelibSeance-1", docs.get(0).getPathAsString());
        assertEquals("Conseil Général - 07/02/2013", docs.get(0).getTitle());

    }

}