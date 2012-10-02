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

package org.nuxeo.adullact;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.adullact.jaxws.EtapeCircuit;
import org.nuxeo.adullact.jaxws.GetCircuitResponse;
import org.nuxeo.adullact.jaxws.GetDossierResponse;
import org.nuxeo.adullact.jaxws.LogDossier;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.DocumentModelList;
import org.nuxeo.ecm.core.api.adapter.DocumentAdapterFactory;
import org.nuxeo.ecm.core.api.impl.DocumentModelListImpl;
import org.nuxeo.ecm.core.api.model.PropertyException;
import org.nuxeo.ecm.directory.BaseSession;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 */
public class AdullactAdapterFactory implements DocumentAdapterFactory {

    public static final String CIRCUIT_SCHEMA_NAME = "adullact_circuit";

    public static final String HISTORIQUE_ENTRY_SCHEMA_NAME = "adullact_histor";

    public static final String DOSSIER_FACET_NAME = "AdullactDossier";

    public static final String DOSSIER_SCHEMA_NAME = "adullact_dossier";

    private static final Log log = LogFactory
            .getLog(AdullactAdapterFactory.class);

    @Override
    public Object getAdapter(DocumentModel doc, Class<?> itf) {

        if (itf.equals(AdullactDossier.class)) {
            if (!doc.hasSchema("file")) {
                return null;
            }
            if (!doc.hasFacet(DOSSIER_FACET_NAME)) {
                doc.addFacet(DOSSIER_FACET_NAME);
            }
            return new AdullactDossier(doc);
        }

        log.error("Factory not manage this kind of interface: " + itf);
        return null;
    }

    /**
     * This function copy the content of the GetDossierResponse object to the
     * given document. if document is null, create a bare document with values.
     */
    public static DocumentModel createDocumentModelFromGetDossierResponse(
            GetDossierResponse response, DocumentModel doc)
            throws ClientException {
        if (doc == null) {
            try {
                doc = BaseSession.createEntryModel(null, DOSSIER_SCHEMA_NAME,
                        null, null, true);
            } catch (PropertyException e) {
                throw new ClientException(e);
            }

        } else {
            if (!doc.hasSchema(DOSSIER_SCHEMA_NAME)) {
                doc.addFacet(DOSSIER_FACET_NAME);
            }
        }

        return doc;
    }

    public static DocumentModelList createDocumentModelListFromLogDossier(
            List<LogDossier> logsDossier) throws ClientException {
        DocumentModelList result = new DocumentModelListImpl();

        DocumentModel docModel;

        for (LogDossier logDossier : logsDossier) {
            docModel = BaseSession.createEntryModel(null,
                    HISTORIQUE_ENTRY_SCHEMA_NAME, null, null, true);

            docModel.setPropertyValue("aduhisto:nom", logDossier.getNom());
            docModel.setPropertyValue("aduhisto:accessible",
                    logDossier.getAccessible());
            docModel.setPropertyValue("aduhisto:annotation",
                    logDossier.getAnnotation());
            docModel.setPropertyValue("aduhisto:status", logDossier.getStatus());
            docModel.setPropertyValue("aduhisto:timeStamp",
                    logDossier.getTimestamp().toString());
            result.add(docModel);
        }
        return result;
    }

    public static DocumentModelList createDocumentModelListFromGetCircuitResponse(
            GetCircuitResponse circuits) throws ClientException {

        DocumentModelList result = new DocumentModelListImpl();
        DocumentModel docModel;

        for (EtapeCircuit circuit : circuits.getEtapeCircuit()) {
            docModel = BaseSession.createEntryModel(null, CIRCUIT_SCHEMA_NAME,
                    null, null, true);

            docModel.setPropertyValue("aducir:parapheur",
                    circuit.getParapheur());
            docModel.setPropertyValue("aducir:prenom", circuit.getPrenom());
            docModel.setPropertyValue("aducir:nom", circuit.getNom());
            docModel.setPropertyValue("aducir:role", circuit.getRole());
            result.add(docModel);
        }
        return result;
    }

}
