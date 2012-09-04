/**
 * TypeDocAnnexes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class TypeDocAnnexes  implements java.io.Serializable {
    private org.adullact.www.spring_ws.iparapheur._1_0.DocAnnexe[] docAnnexe;

    public TypeDocAnnexes() {
    }

    public TypeDocAnnexes(
           org.adullact.www.spring_ws.iparapheur._1_0.DocAnnexe[] docAnnexe) {
           this.docAnnexe = docAnnexe;
    }


    /**
     * Gets the docAnnexe value for this TypeDocAnnexes.
     * 
     * @return docAnnexe
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.DocAnnexe[] getDocAnnexe() {
        return docAnnexe;
    }


    /**
     * Sets the docAnnexe value for this TypeDocAnnexes.
     * 
     * @param docAnnexe
     */
    public void setDocAnnexe(org.adullact.www.spring_ws.iparapheur._1_0.DocAnnexe[] docAnnexe) {
        this.docAnnexe = docAnnexe;
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.DocAnnexe getDocAnnexe(int i) {
        return this.docAnnexe[i];
    }

    public void setDocAnnexe(int i, org.adullact.www.spring_ws.iparapheur._1_0.DocAnnexe _value) {
        this.docAnnexe[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TypeDocAnnexes)) return false;
        TypeDocAnnexes other = (TypeDocAnnexes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docAnnexe==null && other.getDocAnnexe()==null) || 
             (this.docAnnexe!=null &&
              java.util.Arrays.equals(this.docAnnexe, other.getDocAnnexe())));
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
        if (getDocAnnexe() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocAnnexe());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocAnnexe(), i);
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
        new org.apache.axis.description.TypeDesc(TypeDocAnnexes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDocAnnexes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docAnnexe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DocAnnexe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DocAnnexe"));
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
