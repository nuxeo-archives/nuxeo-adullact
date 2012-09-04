/**
 * InterfaceParapheurServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class InterfaceParapheurServiceLocator extends org.apache.axis.client.Service implements org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheurService {

    public InterfaceParapheurServiceLocator() {
    }


    public InterfaceParapheurServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InterfaceParapheurServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InterfaceParapheurSoap11
    private java.lang.String InterfaceParapheurSoap11_address = "https://iparapheur.demonstrations.adullact.org:443/ws-iparapheur";

    public java.lang.String getInterfaceParapheurSoap11Address() {
        return InterfaceParapheurSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InterfaceParapheurSoap11WSDDServiceName = "InterfaceParapheurSoap11";

    public java.lang.String getInterfaceParapheurSoap11WSDDServiceName() {
        return InterfaceParapheurSoap11WSDDServiceName;
    }

    public void setInterfaceParapheurSoap11WSDDServiceName(java.lang.String name) {
        InterfaceParapheurSoap11WSDDServiceName = name;
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheur getInterfaceParapheurSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InterfaceParapheurSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInterfaceParapheurSoap11(endpoint);
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheur getInterfaceParapheurSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheurSoap11Stub _stub = new org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheurSoap11Stub(portAddress, this);
            _stub.setPortName(getInterfaceParapheurSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInterfaceParapheurSoap11EndpointAddress(java.lang.String address) {
        InterfaceParapheurSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheur.class.isAssignableFrom(serviceEndpointInterface)) {
                org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheurSoap11Stub _stub = new org.adullact.www.spring_ws.iparapheur._1_0.InterfaceParapheurSoap11Stub(new java.net.URL(InterfaceParapheurSoap11_address), this);
                _stub.setPortName(getInterfaceParapheurSoap11WSDDServiceName());
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
        if ("InterfaceParapheurSoap11".equals(inputPortName)) {
            return getInterfaceParapheurSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "InterfaceParapheurService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "InterfaceParapheurSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InterfaceParapheurSoap11".equals(portName)) {
            setInterfaceParapheurSoap11EndpointAddress(address);
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
