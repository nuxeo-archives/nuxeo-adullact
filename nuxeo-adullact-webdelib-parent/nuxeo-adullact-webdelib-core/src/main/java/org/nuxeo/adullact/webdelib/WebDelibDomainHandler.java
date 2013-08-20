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

import static org.nuxeo.adullact.webdelib.WebDelibConstants.DOC_TYPE_DOMAIN;
import static org.nuxeo.adullact.webdelib.WebDelibConstants.DOC_TYPE_ARCHIVE_CONTAINER;
import static org.nuxeo.adullact.webdelib.WebDelibConstants.DOMAIN_NAME;
import static org.nuxeo.adullact.webdelib.WebDelibConstants.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.ClientRuntimeException;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.DocumentRef;
import org.nuxeo.ecm.core.api.PathRef;
import org.nuxeo.ecm.core.schema.SchemaManager;
import org.nuxeo.ecm.platform.content.template.service.PostContentCreationHandler;
import org.nuxeo.runtime.api.Framework;

/**
 * Create the WebDelib Domain
 *
 */
public class WebDelibDomainHandler implements PostContentCreationHandler {

    public static final Log log = LogFactory.getLog(WebDelibDomainHandler.class);

    public static final String DOMAIN_TITLE_VALUE = "WebDelib";

    public static final String DOMAIN_DESCRIPTION_VALUE = "Référenciel WebDelib";

    public static final String ARCH_CONT_TITLE_VALUE = "Archives";

    public static final String ARCH_CONT_DESCRIPTION_VALUE = "Contient toutes les archives délivrées par WebDelib à Nuxeo.";

    @Override
    public void execute(CoreSession session) {
        SchemaManager service = Framework.getLocalService(SchemaManager.class);
        if (service.getDocumentType(DOC_TYPE_DOMAIN) == null) {
            log.error(DOC_TYPE_DOMAIN
                    + " doc type not deployed please check if Studio WebDelib project deployed.");
            return;
        }

        if (service.getDocumentType(DOC_TYPE_ARCHIVE_CONTAINER) == null) {
            log.error(DOC_TYPE_ARCHIVE_CONTAINER
                    + " doc type not deployed please check if Studio WebDelib project deployed.");
            return;
        }

        try {
            DocumentRef domainRef = new PathRef(DOMAIN_PATH);
            if (!session.exists(domainRef)) {
                String domainName = DOMAIN_NAME;

                DocumentModel doc = session.createDocumentModel("/",
                        domainName, DOC_TYPE_DOMAIN);
                doc.setPropertyValue("dc:title", DOMAIN_TITLE_VALUE);
                doc.setPropertyValue("dc:description", DOMAIN_DESCRIPTION_VALUE);
                session.createDocument(doc);
            }

            DocumentRef archContRef = new PathRef(ARCHIVE_CONTAINER_PATH);
            if (!session.exists(archContRef)) {
                String archContName = ARCHIVE_CONTAINER_NAME;

                DocumentModel doc = session.createDocumentModel(DOMAIN_PATH,
                        archContName, DOC_TYPE_ARCHIVE_CONTAINER);
                doc.setPropertyValue("dc:title", ARCH_CONT_TITLE_VALUE);
                doc.setPropertyValue("dc:description", ARCH_CONT_DESCRIPTION_VALUE);
                session.createDocument(doc);
            }
        } catch (ClientException e) {
            throw new ClientRuntimeException(e);
        }
    }

}
