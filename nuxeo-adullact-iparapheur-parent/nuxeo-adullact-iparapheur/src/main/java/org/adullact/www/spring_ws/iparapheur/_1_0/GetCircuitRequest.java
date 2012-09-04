/**
 * GetCircuitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class GetCircuitRequest  implements java.io.Serializable {
    private java.lang.String typeTechnique;

    private java.lang.String sousType;

    public GetCircuitRequest() {
    }

    public GetCircuitRequest(
           java.lang.String typeTechnique,
           java.lang.String sousType) {
           this.typeTechnique = typeTechnique;
           this.sousType = sousType;
    }


    /**
     * Gets the typeTechnique value for this GetCircuitRequest.
     * 
     * @return typeTechnique
     */
    public java.lang.String getTypeTechnique() {
        return typeTechnique;
    }


    /**
     * Sets the typeTechnique value for this GetCircuitRequest.
     * 
     * @param typeTechnique
     */
    public void setTypeTechnique(java.lang.String typeTechnique) {
        this.typeTechnique = typeTechnique;
    }


    /**
     * Gets the sousType value for this GetCircuitRequest.
     * 
     * @return sousType
     */
    public java.lang.String getSousType() {
        return sousType;
    }


    /**
     * Sets the sousType value for this GetCircuitRequest.
     * 
     * @param sousType
     */
    public void setSousType(java.lang.String sousType) {
        this.sousType = sousType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCircuitRequest)) return false;
        GetCircuitRequest other = (GetCircuitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.typeTechnique==null && other.getTypeTechnique()==null) || 
             (this.typeTechnique!=null &&
              this.typeTechnique.equals(other.getTypeTechnique()))) &&
            ((this.sousType==null && other.getSousType()==null) || 
             (this.sousType!=null &&
              this.sousType.equals(other.getSousType())));
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
        if (getTypeTechnique() != null) {
            _hashCode += getTypeTechnique().hashCode();
        }
        if (getSousType() != null) {
            _hashCode += getSousType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCircuitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetCircuitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeTechnique");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeTechnique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sousType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "SousType"));
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
