/**
 * GetListeTypesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class GetListeTypesResponse  implements java.io.Serializable {
    private java.lang.String[] typeTechnique;

    public GetListeTypesResponse() {
    }

    public GetListeTypesResponse(
           java.lang.String[] typeTechnique) {
           this.typeTechnique = typeTechnique;
    }


    /**
     * Gets the typeTechnique value for this GetListeTypesResponse.
     * 
     * @return typeTechnique
     */
    public java.lang.String[] getTypeTechnique() {
        return typeTechnique;
    }


    /**
     * Sets the typeTechnique value for this GetListeTypesResponse.
     * 
     * @param typeTechnique
     */
    public void setTypeTechnique(java.lang.String[] typeTechnique) {
        this.typeTechnique = typeTechnique;
    }

    public java.lang.String getTypeTechnique(int i) {
        return this.typeTechnique[i];
    }

    public void setTypeTechnique(int i, java.lang.String _value) {
        this.typeTechnique[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetListeTypesResponse)) return false;
        GetListeTypesResponse other = (GetListeTypesResponse) obj;
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
              java.util.Arrays.equals(this.typeTechnique, other.getTypeTechnique())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypeTechnique());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypeTechnique(), i);
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
        new org.apache.axis.description.TypeDesc(GetListeTypesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetListeTypesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeTechnique");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeTechnique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeTechnique"));
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
