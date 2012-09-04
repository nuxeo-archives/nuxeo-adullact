/**
 * RechercherDossiersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class RechercherDossiersResponse  implements java.io.Serializable {
    private org.adullact.www.spring_ws.iparapheur._1_0.LogDossier[] logDossier;

    public RechercherDossiersResponse() {
    }

    public RechercherDossiersResponse(
           org.adullact.www.spring_ws.iparapheur._1_0.LogDossier[] logDossier) {
           this.logDossier = logDossier;
    }


    /**
     * Gets the logDossier value for this RechercherDossiersResponse.
     * 
     * @return logDossier
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.LogDossier[] getLogDossier() {
        return logDossier;
    }


    /**
     * Sets the logDossier value for this RechercherDossiersResponse.
     * 
     * @param logDossier
     */
    public void setLogDossier(org.adullact.www.spring_ws.iparapheur._1_0.LogDossier[] logDossier) {
        this.logDossier = logDossier;
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.LogDossier getLogDossier(int i) {
        return this.logDossier[i];
    }

    public void setLogDossier(int i, org.adullact.www.spring_ws.iparapheur._1_0.LogDossier _value) {
        this.logDossier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechercherDossiersResponse)) return false;
        RechercherDossiersResponse other = (RechercherDossiersResponse) obj;
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
              java.util.Arrays.equals(this.logDossier, other.getLogDossier())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogDossier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogDossier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechercherDossiersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">RechercherDossiersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logDossier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "LogDossier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "LogDossier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
