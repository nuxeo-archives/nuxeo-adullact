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
import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.annotations.Param;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.runtime.api.Framework;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 */
@Operation(id = AdullactExercerDroitRemordDossier.ID, category = Constants.CAT_DOCUMENT, label = "AdullactExercerDroitRemordDossier", description = "")
public class AdullactExercerDroitRemordDossier {

    public static final String ID = "AdullactExercerDroitRemordDossier";

    @Param(name = "Dossier ID", required = false)
    protected String dossierID;

    @OperationMethod
    public void run() throws Exception {
        if (dossierID == null || "".equals(dossierID.trim())) {
            throw new ClientException("Dossier id specified is empty");
        }

        Framework.getService(AdullactService.class).exercerDroitRemordDossier(
                dossierID);
    }

    @OperationMethod
    public void run(DocumentModel input) throws ClientException, Exception {

        if (dossierID == null || "".equals(dossierID.trim())) {
            AdullactDossier dossier = input
                    .getAdapter(AdullactDossier.class);
            dossierID = dossier.getDossierID();
        }
        Framework.getService(AdullactService.class).exercerDroitRemordDossier(
                dossierID);

    }

}
