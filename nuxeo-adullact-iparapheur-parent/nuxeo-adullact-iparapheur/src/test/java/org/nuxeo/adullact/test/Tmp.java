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

import static org.nuxeo.adullact.test.AdullactTestHelper.loadProperties;

import org.eclipse.jetty.util.log.Log;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.adullact.axis.iparapheur.xml.GetDossierResponse;
import org.nuxeo.adullact.service.AdullactService;
import org.nuxeo.adullact.service.AdullactServiceImpl;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.test.CoreFeature;
import org.nuxeo.runtime.api.Framework;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;
import org.nuxeo.runtime.test.runner.RuntimeHarness;

import com.google.inject.Inject;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 *
 */
@RunWith(FeaturesRunner.class)
@Features(CoreFeature.class)
@Deploy({ "nuxeo-adullact-iparapheur-integration:OSGI-INF/adullact-coretype-contrib.xml" })
public class Tmp {

    private AdullactServiceImpl service;

    private DocumentModel file;

    @Inject
    public RuntimeHarness runtimeHarness;

    @Inject
    protected CoreSession session;

    @Before
    public void init() throws Exception {
        loadProperties();

        // runtimeHarness.deployContrib("nuxeo-adullact-operation",
        // "OSGI-INF/adullact-coretype-contrib.xml");
        runtimeHarness.deployContrib("nuxeo-adullact-iparapheur-integration",
                "OSGI-INF/extensions/org.nuxeo.adullact.service.AdullactService.xml");
        runtimeHarness.deployContrib("nuxeo-adullact-iparapheur-integration",
                "OSGI-INF/extensions/org.nuxeo.adullact.AdullactAdapterFactory.xml");

        file = null;
        service = (AdullactServiceImpl) Framework.getService(AdullactService.class);
    }

    @Test
    public void shouldCreateNewFolderAndFetchInformation()
            throws ClientException {
        GetDossierResponse response = service.getDossier("950aeb03-9a47-4663-96b7-420f1a3d271e");
        Log.info(response.getMessageRetour().getMessage());


    }

}
