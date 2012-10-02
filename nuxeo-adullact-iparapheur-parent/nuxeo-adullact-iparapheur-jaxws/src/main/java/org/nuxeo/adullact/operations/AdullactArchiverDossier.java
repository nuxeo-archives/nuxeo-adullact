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

import org.nuxeo.adullact.service.AdullactService;
import org.nuxeo.ecm.automation.OperationContext;
import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Context;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.annotations.Param;
import org.nuxeo.runtime.api.Framework;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 */
@Operation(id = AdullactArchiverDossier.ID, category = Constants.CAT_DOCUMENT, label = "Adullact Archiver Dossier", description = "")
public class AdullactArchiverDossier {

    public static final String ID = "AdullactArchiverDossier";

    @Context
    protected OperationContext ctx;

    @Param(name = "Dossier ID", required = true)
    protected String dossierID;

    @Param(name = "URL Param For final Binary Access", required = true)
    protected String urlParam;

    @Param(name = "Archive Action", required = false, widget = "Option", values = {
            "EFFACER", "ARCHIVER" })
    protected String archiveAction;

    @OperationMethod
    public void run() throws Exception {

        String url = Framework.getService(AdullactService.class).archiverDossier(
                dossierID, archiveAction);
        ctx.put(urlParam, url);
    }
}
