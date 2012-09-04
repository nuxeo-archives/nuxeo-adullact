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

package org.nuxeo.adullact.service;

import java.util.List;

import org.adullact.www.spring_ws.iparapheur._1_0.MetaDonneeDefinition;
import org.nuxeo.adullact.AdullactDossier;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.DocumentModelList;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 */
public interface AdullactService {

    /**
     * Execute echo call to iParapheur Service
     * @param message
     * @return the following message: [{@value login}] m'a dit: {@value message}
     * @throws ClientException
     */
    String echo(String message) throws ClientException;

    List<String> getListeTypes() throws ClientException;

    List<String> getListeSousTypes(String type) throws ClientException;

    MetaDonneeDefinition[] getListeMetaDonnees(String dossierID)
            throws ClientException;

    DocumentModelList getCircuits(String type, String sousType)
            throws ClientException;

    String echoSimple(String message) throws ClientException;

    void creerDossier(AdullactDossier dossier)
            throws ClientException;

    DocumentModelList getHistogrammeDossier(String dossierId)
            throws ClientException;

    DocumentModelList getHistogrammeDossier(DocumentModel doc)
            throws ClientException;

    void exercerDroitRemordDossier(String dossierId)
            throws ClientException;

    String archiverDossier(String dossierId,
            String archivageAction) throws ClientException;

//    DocumentModel getDossier(String dossierId) throws ClientException;

    void forcerEtape(String dossierID, String codeTransition,
            String annotationPublique, String annotationPrivee)
            throws ClientException;

    void effacerDossierRejete(String dossierID) throws ClientException;

    DocumentModelList getDossiersInfo(String type, String sousType, String status)
            throws ClientException;

    DocumentModelList getDossiersInfo(DocumentModelList dossiers,
            int nbreDossier) throws ClientException;

    DocumentModelList getDossiersInfo(List<String> dossierIDs, int nbreDossier)
            throws ClientException;

    DocumentModel retrieveFinalDocument(DocumentModel doc)
            throws ClientException;

}
