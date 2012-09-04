/**
 * TypeMetaDonnees.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class TypeMetaDonnees  implements java.io.Serializable {
    private org.adullact.www.spring_ws.iparapheur._1_0.MetaDonnee[] metaDonnee;

    public TypeMetaDonnees() {
    }

    public TypeMetaDonnees(
           org.adullact.www.spring_ws.iparapheur._1_0.MetaDonnee[] metaDonnee) {
           this.metaDonnee = metaDonnee;
    }


    /**
     * Gets the metaDonnee value for this TypeMetaDonnees.
     * 
     * @return metaDonnee
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.MetaDonnee[] getMetaDonnee() {
        return metaDonnee;
    }


    /**
     * Sets the metaDonnee value for this TypeMetaDonnees.
     * 
     * @param metaDonnee
     */
    public void setMetaDonnee(org.adullact.www.spring_ws.iparapheur._1_0.MetaDonnee[] metaDonnee) {
        this.metaDonnee = metaDonnee;
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.MetaDonnee getMetaDonnee(int i) {
        return this.metaDonnee[i];
    }

    public void setMetaDonnee(int i, org.adullact.www.spring_ws.iparapheur._1_0.MetaDonnee _value) {
        this.metaDonnee[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TypeMetaDonnees)) return false;
        TypeMetaDonnees other = (TypeMetaDonnees) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metaDonnee==null && other.getMetaDonnee()==null) || 
             (this.metaDonnee!=null &&
              java.util.Arrays.equals(this.metaDonnee, other.getMetaDonnee())));
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
        if (getMetaDonnee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetaDonnee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetaDonnee(), i);
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
        new org.apache.axis.description.TypeDesc(TypeMetaDonnees.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeMetaDonnees"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaDonnee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MetaDonnee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MetaDonnee"));
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
