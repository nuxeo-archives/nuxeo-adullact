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

package org.nuxeo.adullact.operations;

import org.nuxeo.adullact.AdullactDossier;
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
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 */
@Operation(id = AdullactCreerDossier.ID, category = Constants.CAT_DOCUMENT, label = "AdulactCreerDossier", description = "")
public class AdullactCreerDossier {

    public static final String ID = "AdulactCreerDossier";

    @Context
    protected OperationContext ctx;

    @Param(name = "Save")
    protected boolean save = false;

    @OperationMethod(collector = DocumentModelCollector.class)
    public DocumentModel run(DocumentModel input) throws ClientException,
            Exception {
        AdullactDossier dossier = input.getAdapter(AdullactDossier.class);

        Framework.getService(AdullactService.class).creerDossier(dossier);

        dossier.setStatus("sent");

        CoreSession session = ctx.getCoreSession();
        session.saveDocument(input);
        if (save) {
            session.save();

        }
        return input;
    }

}
