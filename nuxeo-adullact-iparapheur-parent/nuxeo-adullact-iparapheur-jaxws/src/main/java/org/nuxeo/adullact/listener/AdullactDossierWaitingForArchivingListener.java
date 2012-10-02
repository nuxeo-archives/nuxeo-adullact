/*
 * (C) Copyright ${year} Nuxeo SA (http://nuxeo.com/) and contributors.
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

package org.nuxeo.adullact.listener;

import java.util.HashMap;
import java.util.Map;

import org.nuxeo.ecm.automation.AutomationService;
import org.nuxeo.ecm.automation.OperationContext;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.CoreInstance;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.repository.Repository;
import org.nuxeo.ecm.core.api.repository.RepositoryManager;
import org.nuxeo.ecm.core.event.Event;
import org.nuxeo.ecm.core.event.EventListener;
import org.nuxeo.runtime.api.Framework;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 */
public class AdullactDossierWaitingForArchivingListener implements
		EventListener {

	protected AutomationService service;

	protected CoreSession session;

	public void handleEvent(Event event) throws ClientException {
		createSession();
		try {
			service = Framework.getService(AutomationService.class);
			Map<String, Object> vars = new HashMap<String, Object>();
			OperationContext subctx = new OperationContext(session, vars);
			subctx.setInput(null);
			service.run(subctx, "AdullactCheckDossierClosed");
		} catch (Exception e) {
			throw new ClientException(e);
		} finally {
			closeSession();
		}
	}

	private void closeSession() {
		if (session != null) {
			CoreInstance.getInstance().close(session);
		}
	}

	private CoreSession createSession() throws ClientException {
		if (session == null) {
			try {
				// open a system session
				Framework.login();
				RepositoryManager mgr = Framework
						.getService(RepositoryManager.class);
				Repository repository = mgr.getDefaultRepository();
				if (repository != null) {
					session = repository.open();
				}
				if (session == null) {
					return null;
				}
			} catch (Exception e) {
				throw new ClientException(e.getMessage(), e);
			}
		}
		return session;
	}
}
