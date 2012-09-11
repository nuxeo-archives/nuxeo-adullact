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

import java.math.BigInteger;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.adullact.AdullactDossier;
import org.nuxeo.adullact.axis.iparapheur.xml.ArchivageAction;
import org.nuxeo.adullact.axis.iparapheur.xml.ArchiverDossierRequest;
import org.nuxeo.adullact.axis.iparapheur.xml.ArchiverDossierResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.CodeRetour;
import org.nuxeo.adullact.axis.iparapheur.xml.CreerDossierRequest;
import org.nuxeo.adullact.axis.iparapheur.xml.CreerDossierResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.EffacerDossierRejeteResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.ExercerDroitRemordDossierResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.ForcerEtapeRequest;
import org.nuxeo.adullact.axis.iparapheur.xml.ForcerEtapeResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.GetCircuitRequest;
import org.nuxeo.adullact.axis.iparapheur.xml.GetCircuitResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.GetDossierResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.GetHistoDossierResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.GetListeMetaDonneesResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.GetListeSousTypesResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.GetListeTypesResponse;
import org.nuxeo.adullact.axis.iparapheur.xml.InterfaceParapheur;
import org.nuxeo.adullact.axis.iparapheur.xml.InterfaceParapheurService;
import org.nuxeo.adullact.axis.iparapheur.xml.InterfaceParapheurServiceLocator;
import org.nuxeo.adullact.axis.iparapheur.xml.MetaDonneeDefinition;
import org.nuxeo.adullact.axis.iparapheur.xml.RechercherDossiersRequest;
import org.nuxeo.adullact.axis.iparapheur.xml.RechercherDossiersResponse;
import org.nuxeo.adullact.service.ws.calls.EchoCall;
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

    private static final String TRUSTSTORE_PATH = "nuxeo.adullact.ipararpheur.truststore.path";

    private static final String TRUSTSTORE_TYPE = "nuxeo.adullact.iparapheur.truststore.type";

    private static final String KEYSTORE_PATH = "nuxeo.adullact.iparapheur.keystore.path";

    private static final String KEYSTORE_PASSWORD = "nuxeo.adullact.iparapheur.keystore.password";

    private static final Log log = LogFactory.getLog(AdullactServiceImpl.class);

    private String servername;

    private String login;

    private String password;

    private Service service;

    private URL webServiceBaseURL;

    @Override
    public void activate(ComponentContext context) throws Exception {

        servername = Framework.getProperty(WS_BASE_URL);
        if (servername == null) {
            throw new ClientException(
                    "Can't initilialize iParapheur service, no target servername set");
        }
        webServiceBaseURL = new URL(servername);
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
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);

        String keyStorePassword = Framework.getProperty(KEYSTORE_PASSWORD);
        if (keyStorePassword == null) {
            throw new ClientException(
                    "Can't initilialize iParapheur service, no key store password set needed to establish the connexion");
        }
        System.setProperty("javax.net.ssl.keyStorePassword", keyStorePassword);

        service = new Service();

        doLogInformations();

    }

    private void doLogInformations() {
        String message = "iParapheur base url for WebServices used will be : "
                + "%s (stored into %s property into default value is %s)";
        log.info(String.format(message, servername, WS_BASE_URL,
                WS_BASE_URL_DEFAULT));

        message = "iParapheur trust store path stored into %s property and value is %s";
        log.info(String.format(message, TRUSTSTORE_PATH,
                Framework.getProperty(TRUSTSTORE_PATH)));

        message = "iParapheur trust store type stored into %s property and value is %s";
        log.info(String.format(message, TRUSTSTORE_TYPE,
                Framework.getProperty(TRUSTSTORE_TYPE)));

        message = "iParapheur key store path stored into %s property and value is %s";
        log.info(String.format(message, KEYSTORE_PATH,
                Framework.getProperty(KEYSTORE_PATH)));

        message = "iParapheur key store password stored into %s property and value is %s";
        log.info(String.format(message, KEYSTORE_PATH,
                Framework.getProperty(KEYSTORE_PATH)));

        message = "iParapheur login stored into %s property and value is %s";
        log.debug(String.format(message, LOGIN, Framework.getProperty(LOGIN)));

        message = "iParapheur password stored into %s property and value is %s";
        log.debug(String.format(message, PASSWORD,
                Framework.getProperty(PASSWORD)));

    }

    @Override
    public void registerContribution(Object contribution,
            String extensionPoint, ComponentInstance contributor)
            throws Exception {
    }

    @Override
    public void creerDossier(AdullactDossier doc)
            throws ClientException {
        CreerDossierRequest dossier = doc.getCreerDossierRequest();

        InterfaceParapheur service = serviceSOAPFactory();

        try {
            CreerDossierResponse response = service.creerDossier(dossier);

            if ("KO".equals(response.getMessageRetour().getCodeRetour().getValue())) {
                throw new ClientException("request failed: "
                        + response.getMessageRetour().getMessage());
            }
        } catch (RemoteException e) {
            throw new ClientException(e);
        }

    }

    @Override
    public String echo(String message) throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        try {
            return service.echo(message);
        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    public DocumentModelList getHistogrammeDossier(String dossierId)
            throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        try {
            GetHistoDossierResponse response = service.getHistoDossier(dossierId);

            if (response == null || response.getLogDossier() == null) {
                return new DocumentModelListImpl();
            }

            return createDocumentModelListFromLogDossier(response.getLogDossier());
        } catch (RemoteException e) {
            throw new ClientException(e);
        }
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

        try {
            ExercerDroitRemordDossierResponse response = service.exercerDroitRemordDossier(dossierId);
            if ("KO".equals(response.getMessageRetour().getCodeRetour().getValue())) {
                throw new ClientException("request failed: "
                        + response.getMessageRetour().getMessage());
            }

        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    public DocumentModelList getDossiersInfo(String type, String sousType, String status)
            throws ClientException {
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

        try {
            RechercherDossiersResponse response = service.rechercherDossiers(rechercherDossiersRequest);

            return createDocumentModelListFromLogDossier(response.getLogDossier());
        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    public DocumentModelList getDossiersInfo(List<String> dossierIDs, int nbreDossier)
            throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        RechercherDossiersRequest rechercherDossiersRequest = new RechercherDossiersRequest();
        if (dossierIDs == null || dossierIDs.size() == 0) {
            return new DocumentModelListImpl();
        }
        rechercherDossiersRequest.setDossierID((String[]) dossierIDs.toArray());
        rechercherDossiersRequest.setNombreDossiers(BigInteger.valueOf(nbreDossier));

        try {
            RechercherDossiersResponse response = service.rechercherDossiers(rechercherDossiersRequest);

            return createDocumentModelListFromLogDossier(response.getLogDossier());
        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    public DocumentModelList getDossiersInfo(DocumentModelList dossiers, int nbreDossier)
            throws ClientException {
        List<String> dossierIDs = new ArrayList<String>();

        return getDossiersInfo(dossierIDs, nbreDossier);
    }

        @Override
    public String archiverDossier(String dossierId, String archivageAction)
            throws ClientException {
        ArchiverDossierRequest archiverDossierRequest = new ArchiverDossierRequest();
        archiverDossierRequest.setArchivageAction(ArchivageAction.fromString(archivageAction));
        archiverDossierRequest.setDossierID(dossierId);
        InterfaceParapheur service = serviceSOAPFactory();

        try {
            ArchiverDossierResponse response = service.archiverDossier(archiverDossierRequest);

            if ("KO".equals(response.getMessageRetour().getCodeRetour().getValue())) {
                throw new ClientException("request failed: "
                        + response.getMessageRetour().getMessage());
            }
            return response.getURL();
        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    public GetDossierResponse getDossier(String dossierId) throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        try {
            return service.getDossier(dossierId);

        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    public List<String> getListeTypes() throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        try {
            GetListeTypesResponse response = service.getListeTypes(null);
            return Arrays.asList(response.getTypeTechnique());
        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    public List<String> getListeSousTypes(String type) throws ClientException {
        InterfaceParapheur service = serviceSOAPFactory();

        try {
            GetListeSousTypesResponse response = service.getListeSousTypes(type);
            return Arrays.asList(response.getSousType());
        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    public DocumentModelList getCircuits(String type, String sousType)
            throws ClientException {

        InterfaceParapheur service = serviceSOAPFactory();

        GetCircuitRequest request = new GetCircuitRequest();
        request.setTypeTechnique(type);
        request.setSousType(sousType);

        try {
            GetCircuitResponse response = service.getCircuit(request);

            return createDocumentModelListFromGetCircuitResponse(response);
        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    public void forcerEtape(String dossierID, String codeTransition,
            String annotationPublique, String annotationPrivee)
            throws ClientException {

        InterfaceParapheur service = serviceSOAPFactory();

        ForcerEtapeRequest request = new ForcerEtapeRequest();
        request.setDossierID(dossierID);
        request.setCodeTransition(CodeRetour.fromString(codeTransition));
        request.setAnnotationPrivee(annotationPrivee);
        request.setAnnotationPublique(annotationPublique);

        try {
            ForcerEtapeResponse response = service.forcerEtape(request);
            if ("KO".equals(response.getMessageRetour().getCodeRetour().getValue())) {
                throw new ClientException("request failed: "
                        + response.getMessageRetour().getMessage());
            }

        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    public MetaDonneeDefinition[] getListeMetaDonnees(String dossierID)
            throws ClientException {

        InterfaceParapheur service = serviceSOAPFactory();

        try {
            GetListeMetaDonneesResponse response = service.getListeMetaDonnees(new Object());
            return response.getMetaDonnee();
        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    public void effacerDossierRejete(String dossierID) throws ClientException {

        InterfaceParapheur service = serviceSOAPFactory();

        try {
            EffacerDossierRejeteResponse response = service.effacerDossierRejete(dossierID);
            if ("KO".equals(response.getMessageRetour().getCodeRetour().getValue())) {
                throw new ClientException("request failed: "
                        + response.getMessageRetour().getMessage());
            }
        } catch (RemoteException e) {
            throw new ClientException(e);
        }
    }

    @Override
    @Deprecated
    public String echoSimple(String message) throws ClientException {
        EchoCall call = callFactory(EchoCall.class);

        call.setMessage(message);
        return (String) call.invokeCall();
    }

    private InterfaceParapheur serviceSOAPFactory() throws ClientException {
        InterfaceParapheurService locator = new InterfaceParapheurServiceLocator();

        InterfaceParapheur service;
        try {
            service = locator.getInterfaceParapheurSoap11(webServiceBaseURL);
            ((Stub) service).setUsername(login);
            ((Stub) service).setPassword(password);
        } catch (ServiceException e) {
            throw new ClientException(e);
        }
        return service;
    }

    private <T extends Call> T callFactory(Class<T> callClass)
            throws ClientException {
        T call;
        try {
            call = callClass.getConstructor(Service.class).newInstance(service);
        } catch (Exception e) {
            throw new ClientException(e);
        }
        call.setTargetEndpointAddress(webServiceBaseURL);
        call.setUsername(login);
        call.setPassword(password);

        return call;
    }

    @Override
    public DocumentModel retrieveFinalDocument(DocumentModel doc)
            throws ClientException {
        AdullactDossier dossier = doc.getAdapter(AdullactDossier.class);
        GetDossierResponse response = getDossier(dossier.getDossierID());
        Blob blob = new ByteArrayBlob(response.getDocPrincipal().get_value());

        dossier.setMainFile(blob);
        return dossier.getDocumentModel();
    }

}
