/*
 * (C) Copyright 2011 Nuxeo SA (http://nuxeo.com/) and contributors.
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
 *     bjalon
 */

package org.nuxeo.adullact.operations;

import org.nuxeo.adullact.service.AdullactService;
import org.nuxeo.ecm.automation.OperationContext;
import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Context;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.annotations.Param;
import org.nuxeo.ecm.automation.core.collectors.DocumentModelCollector;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.runtime.api.Framework;

/**
 * @author bjalon
 */
@Operation(id = AdullactAttachFileToDocument.ID, category = Constants.CAT_DOCUMENT, label = "Adullact Attache Fichier Final", description = "")
public class AdullactAttachFileToDocument {

    public static final String ID = "AdullactAttachFileToDocument";

    @Context
    protected OperationContext ctx;

    @Param(name = "Save")
    protected boolean save = false;

    @OperationMethod(collector = DocumentModelCollector.class)
    public DocumentModel run(DocumentModel input) throws ClientException,
            Exception {

        AdullactService service = Framework.getService(AdullactService.class);
        input = service.retrieveFinalDocument(input);

        CoreSession session = ctx.getCoreSession();
        if (session.exists(input.getRef())) {
            input = session.saveDocument(input);
        } else {
            input = session.createDocument(input);
        }

        if (save) {
            session.save();
        }

        return input;
    }

}
