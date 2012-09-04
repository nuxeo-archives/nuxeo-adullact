/**
 * ArchiverDossierResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class ArchiverDossierResponse  implements java.io.Serializable {
    private java.lang.String URL;

    private org.adullact.www.spring_ws.iparapheur._1_0.MessageRetour messageRetour;

    public ArchiverDossierResponse() {
    }

    public ArchiverDossierResponse(
           java.lang.String URL,
           org.adullact.www.spring_ws.iparapheur._1_0.MessageRetour messageRetour) {
           this.URL = URL;
           this.messageRetour = messageRetour;
    }


    /**
     * Gets the URL value for this ArchiverDossierResponse.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this ArchiverDossierResponse.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the messageRetour value for this ArchiverDossierResponse.
     * 
     * @return messageRetour
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.MessageRetour getMessageRetour() {
        return messageRetour;
    }


    /**
     * Sets the messageRetour value for this ArchiverDossierResponse.
     * 
     * @param messageRetour
     */
    public void setMessageRetour(org.adullact.www.spring_ws.iparapheur._1_0.MessageRetour messageRetour) {
        this.messageRetour = messageRetour;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchiverDossierResponse)) return false;
        ArchiverDossierResponse other = (ArchiverDossierResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
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
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getMessageRetour() != null) {
            _hashCode += getMessageRetour().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchiverDossierResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ArchiverDossierResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
