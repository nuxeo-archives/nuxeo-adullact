/*
 * (C) Copyright 2012 Nuxeo SA (http://nuxeo.com/) and contributors.
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

import static org.nuxeo.adullact.AdullactAdapterFactory.createDocumentModelListFromGetCircuitResponse;
import static org.nuxeo.adullact.AdullactAdapterFactory.createDocumentModelListFromLogDossier;

import java.io.File;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.adullact.AdullactDossier;
import org.nuxeo.adullact.jaxws.ArchivageAction;
import org.nuxeo.adullact.jaxws.ArchiverDossierRequest;
import org.nuxeo.adullact.jaxws.ArchiverDossierResponse;
import org.nuxeo.adullact.jaxws.CreerDossierRequest;
import org.nuxeo.adullact.jaxws.CreerDossierResponse;
import org.nuxeo.adullact.jaxws.EffacerDossierRejeteResponse;
import org.nuxeo.adullact.jaxws.ExercerDroitRemordDossierResponse;
import org.nuxeo.adullact.jaxws.ForcerEtapeRequest;
import org.nuxeo.adullact.jaxws.ForcerEtapeResponse;
import org.nuxeo.adullact.jaxws.GetCircuitRequest;
import org.nuxeo.adullact.jaxws.GetCircuitResponse;
import org.nuxeo.adullact.jaxws.GetDossierResponse;
import org.nuxeo.adullact.jaxws.GetHistoDossierResponse;
import org.nuxeo.adullact.jaxws.GetListeMetaDonneesResponse;
import org.nuxeo.adullact.jaxws.GetListeSousTypesResponse;
import org.nuxeo.adullact.jaxws.GetListeTypesResponse;
import org.nuxeo.adullact.jaxws.InterfaceParapheur;
import org.nuxeo.adullact.jaxws.InterfaceParapheurService;
import org.nuxeo.adullact.jaxws.MetaDonneeDefinition;
import org.nuxeo.adullact.jaxws.RechercherDossiersRequest;
import org.nuxeo.adullact.jaxws.RechercherDossiersResponse;
import org.nuxeo.ecm.core.api.Blob;
import org.nuxeo.ecm.core.api.ClientException;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.DocumentModelList;
import org.nuxeo.ecm.core.api.impl.DocumentModelListImpl;
import org.nuxeo.ecm.core.api.impl.blob.ByteArrayBlob;
import org.nuxeo.runtime.api.Framework;
import org.nuxeo.runtime.model.ComponentContext;
import org.nuxeo.runtime.model.ComponentInstance;
import org.nuxeo.runtime.model.DefaultComponent;

/**
 * @author <a href="mailto:bjalon@nuxeo.com">Benjamin JALON</a>
 */
public class AdullactServiceImpl extends DefaultComponent implements
        AdullactService {

    private static final String WS_BASE_URL = "nuxeo.adullact.iparapheur.webservice.base.url";

    private static final String WS_BASE_URL_DEFAULT = "https://iparapheur.demonstrations.adullact.org/ws-iparapheur";

    private static final String LOGIN = "nuxeo.adullact.iparapheur.login";

    private static final String PASSWORD = "nuxeo.adullact.iparapheur.password";

    private static final String TRUSTSTORE_PATH = "nuxeo.adullact.iparapheur.truststore.path";

    private static final String TRUSTSTORE_TYPE = "nuxeo.adullact.iparapheur.truststore.type";

    private static final String KEYSTORE_PATH = "nuxeo.adullact.iparapheur.keystore.path";

    private static final String KEYSTORE_PASSWORD = "nuxeo.adullact.iparapheur.keystore.password";

    private static final Log log = LogFactory.getLog(AdullactServiceImpl.class);

    private String servername;

    private String login;

    private String password;

    private URL webServiceBaseURL;

    @Override
    public void activate(ComponentContext context) throws Exception {

        servername = Framework.getProperty(WS_BASE_URL);
        if (servername == null) {
            throw new ClientException(
                    "Can't initilialize iParapheur service, no target servername set");
        }
        webServiceBaseURL = new URL(servername+"?wsdl");

        login = Framework.getProperty(LOGIN);
        if (login == null) {
            throw new ClientException(
                    "Can't initilialize iParapheur service, no login set to let Nuxeo authenticated");
        }

        password = Framework.getProperty(PASSWORD);
        if (password == null) {
            throw new ClientException(
                    "Can't initilialize iParapheur service, no passowrd set to let Nuxeo authenticated");
        }

        String trustStorePath = Framework.getProperty(TRUSTSTORE_PATH);
        if (trustStorePath == null) {
            throw new ClientException(
                    "Can't initilialize iParapheur service, no trust store set needed to establish the connexion");
        }
        File tmp = new File(trustStorePath);
        if (!(tmp.exists())) {
            throw new ClientException("Can't find trust store "
                    + trustStorePath);
        } else {
            log.debug("Trust store found : " + tmp.getAbsolutePath());
        }
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);

        String trustStoreType = Framework.getProperty(TRUSTSTORE_TYPE);
        if (trustStoreType == null) {
            log.warn("No TrustStore type defined, will assume that is JKS");
            trustStoreType = "JKS";
        }
        System.setProperty("javax.net.ssl.keyStoreType", trustStoreType);

        String keyStorePath = Framework.getProperty(KEYSTORE_PATH);
        if (keyStorePath == null) {
            throw new ClientException(
                    "Can't initilialize iParapheur service, no key store set needed to establish the connexion");
        }
        tmp = new File(keyStorePath);
        if (!tmp.exists()) {
            throw new ClientException("Can't find key store " + keyStorePath);
        } else {
            log.debug("Key store found : " + tmp.getAbsolutePath());
        }
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);

        String keyStorePassword = Framework.getProperty(KEYSTORE_PASSWORD);
        if (keyStorePassword == null) {
            throw new ClientException(
                    "Can't initilialize iParapheur service, no key store password set needed to establish the connexion");
        }
        System.setProperty("javax.net.ssl.keyStorePassword", keyStorePassword);

        doLogInformations();

    }

    private void doLogInformations() {
        if (log.isDebugEnabled()) {
            String message = "iParapheur base url for WebServices used will be : "
                    + "%s (stored into %s property into default value is %s)";
            log.debug(String.format(message, servername, WS_BASE_URL,
                    WS_BASE_URL_DEFAULT));

            message = "iParapheur trust store path stored into %s property and value is %s";
            log.debug(String.format(message, TRUSTSTORE_PATH,
                    Framework.getProperty(TRUSTSTORE_PATH)));

            message = "iParapheur trust store type stored into %s property and value is %s";
            log.debug(String.format(message, TRUSTSTORE_TYPE,
                    Framework.getProperty(TRUSTSTORE_TYPE)));

            message = "iParapheur key store path stored into %s property and value is %s";
            log.debug(String.format(message, KEYSTORE_PATH,
                    Framework.getProperty(KEYSTORE_PATH)));

            message = "iParapheur key store password stored into %s property and value is %s";
            log.debug(String.format(message, KEYSTORE_PASSWORD,
                    Framework.getProperty(KEYSTORE_PASSWORD)));

            message = "iParapheur login stored into %s property and value is %s";
            log.debug(String.format(message, LOGIN,
                    Framework.getProperty(LOGIN)));

            message = "iParapheur password stored into %s property and value is %s";
            log.debug(String.format(message, PASSWORD,
                    Framework.getProperty(PASSWORD)));
        }
    }

    @Override
    public void registerContribution(Object contribution,
            String extensionPoint, ComponentInstance contributor)
            throws Exception {
    }

    @Override
    public void creerDossier(AdullactDossier doc) throws ClientException {
        CreerDossierRequest dossier = doc.getCreerDossierRequest();
        
        InterfaceParapheur service = serviceSOAPFactory();
        CreerDossierResponse response = service.creerDossier(dossier);
        if ("KO".equals(response.getMessageRetour().getCodeRetour())) {
            throw new ClientException("request failed: "
                    + response.getMessageRetour().getMessage());
        }

    }

    @Override
    public String echo(String message) throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        return service.echo(message);
    }

    @Override
    public DocumentModelList getHistogrammeDossier(String dossierId)
            throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        GetHistoDossierResponse response = service.getHistoDossier(dossierId);

        if (response == null || response.getLogDossier() == null) {
            return new DocumentModelListImpl();
        }

        return createDocumentModelListFromLogDossier(response.getLogDossier());
    }

    @Override
    public DocumentModelList getHistogrammeDossier(DocumentModel doc)
            throws ClientException {
        AdullactDossier dossierInfo = doc.getAdapter(AdullactDossier.class);
        return getHistogrammeDossier(dossierInfo.getDossierID());
    }

    @Override
    public void exercerDroitRemordDossier(String dossierId)
            throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        ExercerDroitRemordDossierResponse response = service.exercerDroitRemordDossier(dossierId);
        if ("KO".equals(response.getMessageRetour().getCodeRetour())) {
            throw new ClientException("request failed: "
                    + response.getMessageRetour().getMessage());
        }

    }

    @Override
    public DocumentModelList getDossiersInfo(String type, String sousType,
            String status) throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        RechercherDossiersRequest rechercherDossiersRequest = new RechercherDossiersRequest();
        if (status == null && type == null && sousType == null) {
            throw new ClientException(
                    "type, sousType and statuc can't be null in the same time");
        }
        if (status != null) {
            rechercherDossiersRequest.setStatus(status);
        }
        if (sousType != null) {
            rechercherDossiersRequest.setTypeTechnique(type);
        }
        if (type != null) {
            rechercherDossiersRequest.setSousType(sousType);
        }

        RechercherDossiersResponse response = service.rechercherDossiers(rechercherDossiersRequest);

        return createDocumentModelListFromLogDossier(response.getLogDossier());
    }

    @Override
    public DocumentModelList getDossiersInfo(List<String> dossierIDs,
            int nbreDossier) throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        RechercherDossiersRequest rechercherDossiersRequest = new RechercherDossiersRequest();
        if (dossierIDs == null || dossierIDs.size() == 0) {
            return new DocumentModelListImpl();
        }
        // rechercherDossiersRequest.setDossierID((String[])
        // dossierIDs.toArray());
        rechercherDossiersRequest.setNombreDossiers(BigInteger.valueOf(nbreDossier));

        RechercherDossiersResponse response = service.rechercherDossiers(rechercherDossiersRequest);

        return createDocumentModelListFromLogDossier(response.getLogDossier());
    }

    @Override
    public DocumentModelList getDossiersInfo(DocumentModelList dossiers,
            int nbreDossier) throws ClientException {
        List<String> dossierIDs = new ArrayList<String>();

        return getDossiersInfo(dossierIDs, nbreDossier);
    }

    @Override
    public String archiverDossier(String dossierId, String archivageAction)
            throws ClientException {
        ArchiverDossierRequest archiverDossierRequest = new ArchiverDossierRequest();
        archiverDossierRequest.setArchivageAction(ArchivageAction.fromValue(archivageAction));
        archiverDossierRequest.setDossierID(dossierId);
        InterfaceParapheur service = serviceSOAPFactory();

        ArchiverDossierResponse response = service.archiverDossier(archiverDossierRequest);

        if ("KO".equals(response.getMessageRetour().getCodeRetour())) {
            throw new ClientException("request failed: "
                    + response.getMessageRetour().getMessage());
        }
        return response.getURL().getValue();
    }

    public GetDossierResponse getDossier(String dossierId)
            throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        return service.getDossier(dossierId);

    }

    @Override
    public List<String> getListeTypes() throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        GetListeTypesResponse response = service.getListeTypes(null);
        return response.getTypeTechnique();
    }

    @Override
    public List<String> getListeSousTypes(String type) throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        GetListeSousTypesResponse response = service.getListeSousTypes(type);
        return response.getSousType();
    }

    @Override
    public DocumentModelList getCircuits(String type, String sousType)
            throws ClientException {

        InterfaceParapheur service = serviceSOAPFactory();

        GetCircuitRequest request = new GetCircuitRequest();
        request.setTypeTechnique(type);
        request.setSousType(sousType);

        GetCircuitResponse response = service.getCircuit(request);

        return createDocumentModelListFromGetCircuitResponse(response);
    }

    @Override
    public void forcerEtape(String dossierID, String codeTransition,
            String annotationPublique, String annotationPrivee)
            throws ClientException {

        InterfaceParapheur service = serviceSOAPFactory();

        ForcerEtapeRequest request = new ForcerEtapeRequest();
        request.setDossierID(dossierID);
        request.setCodeTransition(codeTransition);
        request.setAnnotationPrivee(annotationPrivee);
        request.setAnnotationPublique(annotationPublique);

        ForcerEtapeResponse response = service.forcerEtape(request);
        if ("KO".equals(response.getMessageRetour().getCodeRetour())) {
            throw new ClientException("request failed: "
                    + response.getMessageRetour().getMessage());
        }

    }

    @Override
    public List<MetaDonneeDefinition> getListeMetaDonnees(String dossierID)
            throws ClientException {

        InterfaceParapheur service = serviceSOAPFactory();

        GetListeMetaDonneesResponse response = service.getListeMetaDonnees(new Object());
        return response.getMetaDonnee();
    }

    @Override
    public void effacerDossierRejete(String dossierID) throws ClientException {

        InterfaceParapheur service = serviceSOAPFactory();

        EffacerDossierRejeteResponse response = service.effacerDossierRejete(dossierID);
        if ("KO".equals(response.getMessageRetour().getCodeRetour())) {
            throw new ClientException("request failed: "
                    + response.getMessageRetour().getMessage());
        }
    }

    private InterfaceParapheur serviceSOAPFactory() throws ClientException {
        // in wsdl definitions target name space
        QName qname = new QName(
                "http://www.adullact.org/spring-ws/iparapheur/1.0", "InterfaceParapheurService");
        URL wsdlUrl = AdullactServiceImpl.class.getResource(
                "/wsdl/iparapheur.xml.wsdl");
        Service service = Service.create(wsdlUrl, qname);
        
        InterfaceParapheurService ifParapheurService = new InterfaceParapheurService(wsdlUrl, qname);

        InterfaceParapheur ifParapheur = ifParapheurService.getInterfaceParapheurSoap11();
        
        Map<String, Object> requestContext = ((BindingProvider) ifParapheur).getRequestContext();
        
        requestContext.put(BindingProvider.SESSION_MAINTAIN_PROPERTY, Boolean.TRUE);
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, webServiceBaseURL.toString());
        requestContext.put(BindingProvider.USERNAME_PROPERTY, login);
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);
        return ifParapheur;
    }

    @Override
    public DocumentModel retrieveFinalDocument(DocumentModel doc)
            throws ClientException {
        AdullactDossier dossier = doc.getAdapter(AdullactDossier.class);
        GetDossierResponse response = getDossier(dossier.getDossierID());
        Blob blob = new ByteArrayBlob(response.getDocPrincipal().getValue());

        dossier.setMainFile(blob);
        return dossier.getDocumentModel();
    }

}
