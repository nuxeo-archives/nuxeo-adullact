/**
 * EnvoyerDossierTdTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class EnvoyerDossierTdTResponse  implements java.io.Serializable {
    private org.adullact.www.spring_ws.iparapheur._1_0.LogDossier logDossier;

    private org.adullact.www.spring_ws.iparapheur._1_0.MessageRetour messageRetour;

    public EnvoyerDossierTdTResponse() {
    }

    public EnvoyerDossierTdTResponse(
           org.adullact.www.spring_ws.iparapheur._1_0.LogDossier logDossier,
           org.adullact.www.spring_ws.iparapheur._1_0.MessageRetour messageRetour) {
           this.logDossier = logDossier;
           this.messageRetour = messageRetour;
    }


    /**
     * Gets the logDossier value for this EnvoyerDossierTdTResponse.
     * 
     * @return logDossier
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.LogDossier getLogDossier() {
        return logDossier;
    }


    /**
     * Sets the logDossier value for this EnvoyerDossierTdTResponse.
     * 
     * @param logDossier
     */
    public void setLogDossier(org.adullact.www.spring_ws.iparapheur._1_0.LogDossier logDossier) {
        this.logDossier = logDossier;
    }


    /**
     * Gets the messageRetour value for this EnvoyerDossierTdTResponse.
     * 
     * @return messageRetour
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.MessageRetour getMessageRetour() {
        return messageRetour;
    }


    /**
     * Sets the messageRetour value for this EnvoyerDossierTdTResponse.
     * 
     * @param messageRetour
     */
    public void setMessageRetour(org.adullact.www.spring_ws.iparapheur._1_0.MessageRetour messageRetour) {
        this.messageRetour = messageRetour;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvoyerDossierTdTResponse)) return false;
        EnvoyerDossierTdTResponse other = (EnvoyerDossierTdTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logDossier==null && other.getLogDossier()==null) || 
             (this.logDossier!=null &&
              this.logDossier.equals(other.getLogDossier()))) &&
            ((this.messageRetour==null && other.getMessageRetour()==null) || 
             (this.messageRetour!=null &&
              this.messageRetour.equals(other.getMessageRetour())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLogDossier() != null) {
            _hashCode += getLogDossier().hashCode();
        }
        if (getMessageRetour() != null) {
            _hashCode += getMessageRetour().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvoyerDossierTdTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">EnvoyerDossierTdTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logDossier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "LogDossier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "LogDossier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageRetour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MessageRetour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MessageRetour"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
