/**
 * GetClassificationActesTdtRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class GetClassificationActesTdtRequest  implements java.io.Serializable {
    private java.lang.String typeTechnique;

    private java.lang.String demanderMiseAJourTdt;

    public GetClassificationActesTdtRequest() {
    }

    public GetClassificationActesTdtRequest(
           java.lang.String typeTechnique,
           java.lang.String demanderMiseAJourTdt) {
           this.typeTechnique = typeTechnique;
           this.demanderMiseAJourTdt = demanderMiseAJourTdt;
    }


    /**
     * Gets the typeTechnique value for this GetClassificationActesTdtRequest.
     * 
     * @return typeTechnique
     */
    public java.lang.String getTypeTechnique() {
        return typeTechnique;
    }


    /**
     * Sets the typeTechnique value for this GetClassificationActesTdtRequest.
     * 
     * @param typeTechnique
     */
    public void setTypeTechnique(java.lang.String typeTechnique) {
        this.typeTechnique = typeTechnique;
    }


    /**
     * Gets the demanderMiseAJourTdt value for this GetClassificationActesTdtRequest.
     * 
     * @return demanderMiseAJourTdt
     */
    public java.lang.String getDemanderMiseAJourTdt() {
        return demanderMiseAJourTdt;
    }


    /**
     * Sets the demanderMiseAJourTdt value for this GetClassificationActesTdtRequest.
     * 
     * @param demanderMiseAJourTdt
     */
    public void setDemanderMiseAJourTdt(java.lang.String demanderMiseAJourTdt) {
        this.demanderMiseAJourTdt = demanderMiseAJourTdt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClassificationActesTdtRequest)) return false;
        GetClassificationActesTdtRequest other = (GetClassificationActesTdtRequest) obj;
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
            ((this.demanderMiseAJourTdt==null && other.getDemanderMiseAJourTdt()==null) || 
             (this.demanderMiseAJourTdt!=null &&
              this.demanderMiseAJourTdt.equals(other.getDemanderMiseAJourTdt())));
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
        if (getDemanderMiseAJourTdt() != null) {
            _hashCode += getDemanderMiseAJourTdt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClassificationActesTdtRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetClassificationActesTdtRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeTechnique");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeTechnique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demanderMiseAJourTdt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DemanderMiseAJourTdt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
