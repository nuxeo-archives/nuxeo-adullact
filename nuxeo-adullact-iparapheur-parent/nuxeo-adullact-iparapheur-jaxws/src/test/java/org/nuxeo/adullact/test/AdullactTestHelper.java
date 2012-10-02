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

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.runtime.api.Framework;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 *
 */
public class AdullactTestHelper {
	
	private static final Log log = LogFactory.getLog(AdullactTestHelper.class);
	
	private AdullactTestHelper() {
		
	}

	public static void loadProperties() throws IOException {
		Properties p = new Properties();
		InputStream is = AdullactTestHelper.class.getClassLoader().getResourceAsStream("adullact-iparapheur.properties");
		if (log.isInfoEnabled()) {
			URL url = AdullactTestHelper.class.getClassLoader().getResource("adullact-iparapheur.properties");
			log.info("Load property file from " + url.toString());
		}
		p.load(is);
		Framework.getRuntime().getProperties().putAll(p);
		is.close();
	}


}
