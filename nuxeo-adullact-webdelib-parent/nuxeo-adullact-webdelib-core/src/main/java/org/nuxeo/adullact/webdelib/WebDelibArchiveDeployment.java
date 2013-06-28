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

package org.nuxeo.adullact.webdelib;

import static org.nuxeo.adullact.webdelib.WebDelibConstants.ARCHIVE_ZIP_FIELD;
import static org.nuxeo.adullact.webdelib.WebDelibConstants.DOC_TYPE_ARCHIVE;
import static org.nuxeo.adullact.webdelib.WebDelibConstants.DOMAIN_PATH;
import static org.nuxeo.ecm.core.api.event.DocumentEventTypes.ABOUT_TO_MOVE;
import static org.nuxeo.ecm.core.api.event.DocumentEventTypes.BEFORE_DOC_UPDATE;

import org.nuxeo.adullact.importer.XmlImporterSevice;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.PathRef;
import org.nuxeo.ecm.core.api.impl.blob.FileBlob;
import org.nuxeo.ecm.core.event.Event;
import org.nuxeo.ecm.core.event.EventListener;
import org.nuxeo.ecm.core.event.impl.DocumentEventContext;
import org.nuxeo.runtime.api.Framework;

/**
 *
 */
public class WebDelibArchiveDeployment implements EventListener {

    @Override
    public void handleEvent(Event event) throws ClientException {

        if (!(event.getContext() instanceof DocumentEventContext)) {
            return;
        }

        String eventName = event.getName();
        DocumentModel source = ((DocumentEventContext) event.getContext()).getSourceDocument();
        CoreSession session = event.getContext().getCoreSession();

        if (!DOC_TYPE_ARCHIVE.equals(source.getType())) {
            return;
        }

        if (ABOUT_TO_MOVE.equals(eventName)
                || BEFORE_DOC_UPDATE.equals(eventName)) {
            throw new ClientException(
                    "WebDelib Archive can't be moved or updated");
        }

        FileBlob zip = (FileBlob) source.getPropertyValue(ARCHIVE_ZIP_FIELD);
        DocumentModel root = session.getDocument(new PathRef(DOMAIN_PATH));

        XmlImporterSevice importer = Framework.getLocalService(XmlImporterSevice.class);
        try {
            importer.importDocuments(root, zip.getFile());
        } catch (Exception e) {
            throw new ClientException(e);
        }

        session.save();
    }
}
