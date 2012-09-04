/**
 * InterfaceParapheurSoap11Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class InterfaceParapheurSoap11Stub extends org.apache.axis.client.Stub implements org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheur {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[18];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EffacerDossierRejete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "EffacerDossierRejeteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">EffacerDossierRejeteResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.EffacerDossierRejeteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "EffacerDossierRejeteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetListeTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetListeTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), java.lang.Object.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetListeTypesResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.GetListeTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetListeTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetListeMetaDonnees");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetListeMetaDonneesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), java.lang.Object.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetListeMetaDonneesResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.GetListeMetaDonneesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetListeMetaDonneesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreerDossier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "CreerDossierRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">CreerDossierRequest"), org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">CreerDossierResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "CreerDossierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreerDossierPES");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "CreerDossierPESRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">CreerDossierPESRequest"), org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">CreerDossierPESResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "CreerDossierPESResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RechercherDossiers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "RechercherDossiersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">RechercherDossiersRequest"), org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">RechercherDossiersResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "RechercherDossiersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDossier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetDossierRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetDossierResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.GetDossierResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetDossierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnvoyerDossierTdT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "EnvoyerDossierTdTRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">EnvoyerDossierTdTResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierTdTResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "EnvoyerDossierTdTResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ForcerEtape");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "ForcerEtapeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ForcerEtapeRequest"), org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ForcerEtapeResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "ForcerEtapeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClassificationActesTdt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetClassificationActesTdtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetClassificationActesTdtRequest"), org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetClassificationActesTdtResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetClassificationActesTdtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnvoyerDossierPES");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "EnvoyerDossierPESRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">EnvoyerDossierPESResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierPESResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "EnvoyerDossierPESResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ArchiverDossier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "ArchiverDossierRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ArchiverDossierRequest"), org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ArchiverDossierResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "ArchiverDossierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCircuit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetCircuitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetCircuitRequest"), org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetCircuitResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetCircuitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "echoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">echoRequest"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "echoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetListeSousTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetListeSousTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeTechnique"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetListeSousTypesResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.GetListeSousTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetListeSousTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHistoDossier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetHistoDossierRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetHistoDossierResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.GetHistoDossierResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetHistoDossierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExercerDroitRemordDossier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "ExercerDroitRemordDossierRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ExercerDroitRemordDossierResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.ExercerDroitRemordDossierResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "ExercerDroitRemordDossierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatutTdT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetStatutTdTRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetStatutTdTResponse"));
        oper.setReturnClass(org.adullact.www.spring_ws.iparapheur._1_0.GetStatutTdTResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "GetStatutTdTResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

    }

    public InterfaceParapheurSoap11Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public InterfaceParapheurSoap11Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public InterfaceParapheurSoap11Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ArchiverDossierRequest");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ArchiverDossierResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">CreerDossierPESRequest");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">CreerDossierPESResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">CreerDossierRequest");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">CreerDossierResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">echoRequest");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">EffacerDossierRejeteResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.EffacerDossierRejeteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">EnvoyerDossierPESResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierPESResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">EnvoyerDossierTdTResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierTdTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ExercerDroitRemordDossierResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.ExercerDroitRemordDossierResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ForcerEtapeRequest");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ForcerEtapeResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetCircuitRequest");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetCircuitResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetClassificationActesTdtRequest");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetClassificationActesTdtResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetDossierResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.GetDossierResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetHistoDossierResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.GetHistoDossierResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetListeMetaDonneesResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.GetListeMetaDonneesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetListeSousTypesResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.GetListeSousTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetListeTypesResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.GetListeTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetStatutTdTResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.GetStatutTdTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">RechercherDossiersRequest");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">RechercherDossiersResponse");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "ArchivageAction");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.ArchivageAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "codeRetour");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.CodeRetour.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "date_AAAA-MM-JJ");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DocAnnexe");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.DocAnnexe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "EtapeCircuit");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.EtapeCircuit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "LogDossier");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.LogDossier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MessageRetour");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.MessageRetour.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "metaDataTdtACTES");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.MetaDataTdtACTES.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MetaDonnee");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.MetaDonnee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MetaDonneeDefinition");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.MetaDonneeDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "NatureMetaDonnee");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.NatureMetaDonnee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "SousType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeCircuit");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.TypeCircuit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDoc");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDocAnnexes");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.TypeDocAnnexes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeMetaDonnees");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.TypeMetaDonnees.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeNomCourt");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeTechnique");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "Visibilite");
            cachedSerQNames.add(qName);
            cls = org.adullact.www.spring_ws.iparapheur._1_0.Visibilite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", ">contentType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", "base64Binary");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2005._05.xmlmime.Base64Binary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", "hexBinary");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2005._05.xmlmime.HexBinary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.EffacerDossierRejeteResponse effacerDossierRejete(java.lang.String effacerDossierRejeteRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EffacerDossierRejete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {effacerDossierRejeteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.EffacerDossierRejeteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.EffacerDossierRejeteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.EffacerDossierRejeteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.GetListeTypesResponse getListeTypes(java.lang.Object getListeTypesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetListeTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getListeTypesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetListeTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetListeTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.GetListeTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.GetListeMetaDonneesResponse getListeMetaDonnees(java.lang.Object getListeMetaDonneesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetListeMetaDonnees"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getListeMetaDonneesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetListeMetaDonneesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetListeMetaDonneesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.GetListeMetaDonneesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierResponse creerDossier(org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierRequest creerDossierRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreerDossier"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creerDossierRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESResponse creerDossierPES(org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESRequest creerDossierPESRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreerDossierPES"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creerDossierPESRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.CreerDossierPESResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersResponse rechercherDossiers(org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersRequest rechercherDossiersRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RechercherDossiers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rechercherDossiersRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.RechercherDossiersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.GetDossierResponse getDossier(java.lang.String getDossierRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDossier"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDossierRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetDossierResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetDossierResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.GetDossierResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierTdTResponse envoyerDossierTdT(java.lang.String envoyerDossierTdTRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EnvoyerDossierTdT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envoyerDossierTdTRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierTdTResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierTdTResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierTdTResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeResponse forcerEtape(org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeRequest forcerEtapeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ForcerEtape"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {forcerEtapeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.ForcerEtapeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtResponse getClassificationActesTdt(org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtRequest getClassificationActesTdtRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetClassificationActesTdt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getClassificationActesTdtRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.GetClassificationActesTdtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierPESResponse envoyerDossierPES(java.lang.String envoyerDossierPESRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EnvoyerDossierPES"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envoyerDossierPESRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierPESResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierPESResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.EnvoyerDossierPESResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierResponse archiverDossier(org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierRequest archiverDossierRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ArchiverDossier"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {archiverDossierRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.ArchiverDossierResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitResponse getCircuit(org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitRequest getCircuitRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCircuit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCircuitRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.GetCircuitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String echo(java.lang.String echoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {echoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.GetListeSousTypesResponse getListeSousTypes(java.lang.String getListeSousTypesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetListeSousTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getListeSousTypesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetListeSousTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetListeSousTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.GetListeSousTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.GetHistoDossierResponse getHistoDossier(java.lang.String getHistoDossierRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetHistoDossier"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getHistoDossierRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetHistoDossierResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetHistoDossierResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.GetHistoDossierResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.ExercerDroitRemordDossierResponse exercerDroitRemordDossier(java.lang.String exercerDroitRemordDossierRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExercerDroitRemordDossier"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {exercerDroitRemordDossierRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.ExercerDroitRemordDossierResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.ExercerDroitRemordDossierResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.ExercerDroitRemordDossierResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.GetStatutTdTResponse getStatutTdT(java.lang.String getStatutTdTRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetStatutTdT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getStatutTdTRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetStatutTdTResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.adullact.www.spring_ws.iparapheur._1_0.GetStatutTdTResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.adullact.www.spring_ws.iparapheur._1_0.GetStatutTdTResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
