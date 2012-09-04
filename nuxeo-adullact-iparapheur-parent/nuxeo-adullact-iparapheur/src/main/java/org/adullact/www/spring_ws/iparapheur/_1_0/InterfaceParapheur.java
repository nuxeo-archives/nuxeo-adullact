/**
 * InterfaceParapheur.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public interface InterfaceParapheur extends java.rmi.Remote {
    public org.adullact.www.spring_ws.iparapheur._1_0.EffacerDossierRejeteResponse effacerDossierRejete(java.lang.String effacerDossierRejeteRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.GetListeTypesResponse getListeTypes(java.lang.Object getListeTypesRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.GetListeMetaDonneesResponse getListeMetaDonnees(java.lang.Object getListeMetaDonneesRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESResponse creerDossierPES(org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESRequest creerDossierPESRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierResponse creerDossier(org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierRequest creerDossierRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersResponse rechercherDossiers(org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersRequest rechercherDossiersRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.GetDossierResponse getDossier(java.lang.String getDossierRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierTdTResponse envoyerDossierTdT(java.lang.String envoyerDossierTdTRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeResponse forcerEtape(org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeRequest forcerEtapeRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtResponse getClassificationActesTdt(org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtRequest getClassificationActesTdtRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierPESResponse envoyerDossierPES(java.lang.String envoyerDossierPESRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierResponse archiverDossier(org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierRequest archiverDossierRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitResponse getCircuit(org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitRequest getCircuitRequest) throws java.rmi.RemoteException;
    public java.lang.String echo(java.lang.String echoRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.GetListeSousTypesResponse getListeSousTypes(java.lang.String getListeSousTypesRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.GetHistoDossierResponse getHistoDossier(java.lang.String getHistoDossierRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.ExercerDroitRemordDossierResponse exercerDroitRemordDossier(java.lang.String exercerDroitRemordDossierRequest) throws java.rmi.RemoteException;
    public org.adullact.www.spring_ws.iparapheur._1_0.GetStatutTdTResponse getStatutTdT(java.lang.String getStatutTdTRequest) throws java.rmi.RemoteException;
}
