/*
 * (C) Copyright ${year} Nuxeo SA (http://nuxeo.com/) and contributors.
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

package org.nuxeo.adullact.webdelib.vocabulary;

import static org.nuxeo.ecm.platform.importer.xml.parser.XMLImporterServiceImpl.XML_IMPORTER_INITIALIZATION;
import static org.nuxeo.ecm.core.api.event.DocumentEventTypes.ABOUT_TO_CREATE;
import static org.nuxeo.ecm.core.api.event.DocumentEventTypes.ABOUT_TO_REMOVE;
import static org.nuxeo.ecm.core.api.event.DocumentEventTypes.BEFORE_DOC_UPDATE;

import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.event.Event;
import org.nuxeo.ecm.core.event.EventListener;
import org.nuxeo.ecm.core.event.impl.DocumentEventContext;
import org.nuxeo.runtime.api.Framework;

/**
 *
 */
public class WebDelibVocabularyManagerListener implements EventListener {

    @Override
    public void handleEvent(Event event) throws ClientException {
        if (!(event.getContext() instanceof DocumentEventContext)) {
            return;
        }

        String eventName = event.getName();
        if (!ABOUT_TO_REMOVE.equals(eventName)
                && !BEFORE_DOC_UPDATE.equals(eventName) && !ABOUT_TO_CREATE.equals(eventName)) {
            return;
        }

        DocumentModel source = ((DocumentEventContext) event.getContext()).getSourceDocument();
        if (source == null) {
            return;
        }

        WebDelibVocabularyManager service = Framework.getLocalService(WebDelibVocabularyManager.class);

        if (ABOUT_TO_CREATE.equals(eventName)) {
            service.documentAdded(source);
            return;
        }

        if (ABOUT_TO_REMOVE.equals(eventName)) {
            service.documentRemoved(source);
            return;
        }

        boolean xmlImportInitialization = source.getContextData(XML_IMPORTER_INITIALIZATION) != null
                && (Boolean) source.getContextData(XML_IMPORTER_INITIALIZATION);
        if (BEFORE_DOC_UPDATE.equals(eventName) && xmlImportInitialization) {
            service.documentAdded(source);
        }

    }

}
