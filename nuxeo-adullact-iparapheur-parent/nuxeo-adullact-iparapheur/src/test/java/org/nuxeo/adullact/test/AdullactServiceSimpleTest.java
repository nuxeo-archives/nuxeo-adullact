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

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.adullact.service.AdullactService;
import org.nuxeo.ecm.platform.test.PlatformFeature;
import org.nuxeo.runtime.api.Framework;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;
import org.nuxeo.runtime.test.runner.RuntimeHarness;

import com.google.inject.Inject;

import static org.junit.Assert.assertEquals;

import static org.nuxeo.adullact.test.AdullactTestHelper.loadProperties;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 *
 */
@RunWith(FeaturesRunner.class)
@Features(PlatformFeature.class)
public class AdullactServiceSimpleTest {

    private AdullactService service;

    @Inject
    public RuntimeHarness runtimeHarness;

    @Before
    public void init() throws Exception {
        loadProperties();

        runtimeHarness.deployContrib("nuxeo-adullact-iparapheur-integration", "OSGI-INF/extensions/org.nuxeo.adullact.service.AdullactService.xml");
        service = Framework.getService(AdullactService.class);

    }

    @Test
    public void shouldReturnEchoFromAdullactServer() throws Exception {

        String answersPattern = "[webservice@nuxeo.com] m'a dit: \"%s\"!";
        String message = "test";
        String response = service.echoSimple(message);
        String errorMessage = "Adullact server test not reachable, please check " +
                "your test configuration and the Adullact Server instance up";

        String answers = String.format(answersPattern, message);
        assertEquals(errorMessage, answers, response);

    }

}
