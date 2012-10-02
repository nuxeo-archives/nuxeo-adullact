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

import org.nuxeo.adullact.AdullactDossier;
import org.nuxeo.adullact.service.AdullactService;
import org.nuxeo.ecm.automation.OperationContext;
import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Context;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.annotations.Param;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.runtime.api.Framework;

/**
 * @author bjalon
 */
@Operation(id=AdullactForcerEtape.ID, category=Constants.CAT_DOCUMENT, label="Adullact Forcer Etape", description="")
public class AdullactForcerEtape {

    public static final String ID = "AdullactForcerEtape";

    @Context
    protected OperationContext ctx;

    @Param(name = "Dossier ID", required = false)
    protected String dossierID;

    @Param(name = "Code Transition (OK/KO)", required = true)
    protected String codeTransition;

    @Param(name = "Annotation Publique", required = false)
    protected String annotationPublique;

    @Param(name = "Annotation Privée", required = false)
    protected String annotationPrivee;

    @OperationMethod
    public void run() throws ClientException, Exception {
        if (dossierID == null || "".equals(dossierID.trim())) {
            throw new ClientException("Dossier id specified is empty");
        }

        Framework.getService(
                AdullactService.class)
                .forcerEtape(dossierID, codeTransition, annotationPublique, annotationPrivee);
    }

    @OperationMethod
    public void run(DocumentModel input) throws ClientException, Exception {

        if (dossierID == null || "".equals(dossierID.trim())) {
            AdullactDossier dossier = input
                    .getAdapter(AdullactDossier.class);
            dossierID = dossier.getDossierID();
        }
        Framework.getService(
                AdullactService.class)
                .forcerEtape(dossierID, codeTransition, annotationPublique, annotationPrivee);

    }

}
