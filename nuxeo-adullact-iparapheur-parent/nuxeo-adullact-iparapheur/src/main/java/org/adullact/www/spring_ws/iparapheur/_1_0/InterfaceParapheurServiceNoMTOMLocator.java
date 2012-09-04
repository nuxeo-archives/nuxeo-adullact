/**
 * InterfaceParapheurServiceNoMTOMLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class InterfaceParapheurServiceNoMTOMLocator extends org.apache.axis.client.Service implements org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheurServiceNoMTOM {

    public InterfaceParapheurServiceNoMTOMLocator() {
    }


    public InterfaceParapheurServiceNoMTOMLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InterfaceParapheurServiceNoMTOMLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InterfaceParapheurSoap11NoMtom
    private java.lang.String InterfaceParapheurSoap11NoMtom_address = "https://iparapheur.demonstrations.adullact.org:443/ws-iparapheur-no-mtom";

    public java.lang.String getInterfaceParapheurSoap11NoMtomAddress() {
        return InterfaceParapheurSoap11NoMtom_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InterfaceParapheurSoap11NoMtomWSDDServiceName = "InterfaceParapheurSoap11NoMtom";

    public java.lang.String getInterfaceParapheurSoap11NoMtomWSDDServiceName() {
        return InterfaceParapheurSoap11NoMtomWSDDServiceName;
    }

    public void setInterfaceParapheurSoap11NoMtomWSDDServiceName(java.lang.String name) {
        InterfaceParapheurSoap11NoMtomWSDDServiceName = name;
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheur getInterfaceParapheurSoap11NoMtom() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InterfaceParapheurSoap11NoMtom_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInterfaceParapheurSoap11NoMtom(endpoint);
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheur getInterfaceParapheurSoap11NoMtom(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheurSoap11Stub _stub = new org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheurSoap11Stub(portAddress, this);
            _stub.setPortName(getInterfaceParapheurSoap11NoMtomWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInterfaceParapheurSoap11NoMtomEndpointAddress(java.lang.String address) {
        InterfaceParapheurSoap11NoMtom_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheur.class.isAssignableFrom(serviceEndpointInterface)) {
                org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheurSoap11Stub _stub = new org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheurSoap11Stub(new java.net.URL(InterfaceParapheurSoap11NoMtom_address), this);
                _stub.setPortName(getInterfaceParapheurSoap11NoMtomWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("InterfaceParapheurSoap11NoMtom".equals(inputPortName)) {
            return getInterfaceParapheurSoap11NoMtom();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "InterfaceParapheurServiceNoMTOM");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "InterfaceParapheurSoap11NoMtom"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InterfaceParapheurSoap11NoMtom".equals(portName)) {
            setInterfaceParapheurSoap11NoMtomEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
