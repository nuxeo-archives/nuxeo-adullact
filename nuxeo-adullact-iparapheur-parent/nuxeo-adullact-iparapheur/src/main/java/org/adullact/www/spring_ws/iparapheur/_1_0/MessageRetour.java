/**
 * MessageRetour.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class MessageRetour  implements java.io.Serializable {
    private org.adullact.www.spring_ws.iparapheur._1_0.CodeRetour codeRetour;

    private java.lang.String message;

    private java.lang.String severite;

    public MessageRetour() {
    }

    public MessageRetour(
           org.adullact.www.spring_ws.iparapheur._1_0.CodeRetour codeRetour,
           java.lang.String message,
           java.lang.String severite) {
           this.codeRetour = codeRetour;
           this.message = message;
           this.severite = severite;
    }


    /**
     * Gets the codeRetour value for this MessageRetour.
     * 
     * @return codeRetour
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.CodeRetour getCodeRetour() {
        return codeRetour;
    }


    /**
     * Sets the codeRetour value for this MessageRetour.
     * 
     * @param codeRetour
     */
    public void setCodeRetour(org.adullact.www.spring_ws.iparapheur._1_0.CodeRetour codeRetour) {
        this.codeRetour = codeRetour;
    }


    /**
     * Gets the message value for this MessageRetour.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this MessageRetour.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the severite value for this MessageRetour.
     * 
     * @return severite
     */
    public java.lang.String getSeverite() {
        return severite;
    }


    /**
     * Sets the severite value for this MessageRetour.
     * 
     * @param severite
     */
    public void setSeverite(java.lang.String severite) {
        this.severite = severite;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageRetour)) return false;
        MessageRetour other = (MessageRetour) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codeRetour==null && other.getCodeRetour()==null) || 
             (this.codeRetour!=null &&
              this.codeRetour.equals(other.getCodeRetour()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.severite==null && other.getSeverite()==null) || 
             (this.severite!=null &&
              this.severite.equals(other.getSeverite())));
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
        if (getCodeRetour() != null) {
            _hashCode += getCodeRetour().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getSeverite() != null) {
            _hashCode += getSeverite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageRetour.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MessageRetour"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeRetour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "codeRetour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "codeRetour"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "severite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
