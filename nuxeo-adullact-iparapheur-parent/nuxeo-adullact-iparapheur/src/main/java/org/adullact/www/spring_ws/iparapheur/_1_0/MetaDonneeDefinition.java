/**
 * MetaDonneeDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;


/**
 * Définition de méta donnée dans le dictionnaire du modèle de contenu
 * dynamique.
 */
public class MetaDonneeDefinition  implements java.io.Serializable {
    private java.lang.String nomCourt;

    private java.lang.String nomLong;

    private org.adullact.www.spring_ws.iparapheur._1_0.NatureMetaDonnee nature;

    public MetaDonneeDefinition() {
    }

    public MetaDonneeDefinition(
           java.lang.String nomCourt,
           java.lang.String nomLong,
           org.adullact.www.spring_ws.iparapheur._1_0.NatureMetaDonnee nature) {
           this.nomCourt = nomCourt;
           this.nomLong = nomLong;
           this.nature = nature;
    }


    /**
     * Gets the nomCourt value for this MetaDonneeDefinition.
     * 
     * @return nomCourt
     */
    public java.lang.String getNomCourt() {
        return nomCourt;
    }


    /**
     * Sets the nomCourt value for this MetaDonneeDefinition.
     * 
     * @param nomCourt
     */
    public void setNomCourt(java.lang.String nomCourt) {
        this.nomCourt = nomCourt;
    }


    /**
     * Gets the nomLong value for this MetaDonneeDefinition.
     * 
     * @return nomLong
     */
    public java.lang.String getNomLong() {
        return nomLong;
    }


    /**
     * Sets the nomLong value for this MetaDonneeDefinition.
     * 
     * @param nomLong
     */
    public void setNomLong(java.lang.String nomLong) {
        this.nomLong = nomLong;
    }


    /**
     * Gets the nature value for this MetaDonneeDefinition.
     * 
     * @return nature
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.NatureMetaDonnee getNature() {
        return nature;
    }


    /**
     * Sets the nature value for this MetaDonneeDefinition.
     * 
     * @param nature
     */
    public void setNature(org.adullact.www.spring_ws.iparapheur._1_0.NatureMetaDonnee nature) {
        this.nature = nature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaDonneeDefinition)) return false;
        MetaDonneeDefinition other = (MetaDonneeDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomCourt==null && other.getNomCourt()==null) || 
             (this.nomCourt!=null &&
              this.nomCourt.equals(other.getNomCourt()))) &&
            ((this.nomLong==null && other.getNomLong()==null) || 
             (this.nomLong!=null &&
              this.nomLong.equals(other.getNomLong()))) &&
            ((this.nature==null && other.getNature()==null) || 
             (this.nature!=null &&
              this.nature.equals(other.getNature())));
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
        if (getNomCourt() != null) {
            _hashCode += getNomCourt().hashCode();
        }
        if (getNomLong() != null) {
            _hashCode += getNomLong().hashCode();
        }
        if (getNature() != null) {
            _hashCode += getNature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetaDonneeDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MetaDonneeDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomCourt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "nomCourt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomLong");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "nomLong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "nature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "NatureMetaDonnee"));
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
