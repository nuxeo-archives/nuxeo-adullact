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
import org.nuxeo.ecm.automation.OperationContext;
import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Context;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.annotations.Param;
import org.nuxeo.ecm.automation.core.collectors.DocumentModelCollector;
import org.nuxeo.ecm.core.api.DocumentModel;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 */
@Operation(id = AdullactGetDossier.ID, category = Constants.CAT_DOCUMENT, label = "Get Dossier iParapheur", description = "")
public class AdullactGetDossier {

    public static final String ID = "AdullactGetDossier";

    @Context
    protected OperationContext ctx;

    @Param(name = "Dossier ID", required = false)
    protected String dossierID;

    @OperationMethod(collector = DocumentModelCollector.class)
    public DocumentModel run(DocumentModel input) throws Exception {
        if (dossierID == null || "".equals(dossierID.trim())) {
            AdullactDossier dossier = input.getAdapter(AdullactDossier.class);
            dossierID = dossier.getDossierID();
        }
//        return Framework.getService(AdullactService.class).getDossier(dossierID);
        throw new Exception("Unsupported Exception");
    }

}
