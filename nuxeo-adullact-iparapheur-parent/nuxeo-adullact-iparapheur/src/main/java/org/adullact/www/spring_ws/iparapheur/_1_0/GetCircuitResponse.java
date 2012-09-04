/**
 * GetCircuitResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class GetCircuitResponse  implements java.io.Serializable {
    private org.adullact.www.spring_ws.iparapheur._1_0.EtapeCircuit[] etapeCircuit;

    public GetCircuitResponse() {
    }

    public GetCircuitResponse(
           org.adullact.www.spring_ws.iparapheur._1_0.EtapeCircuit[] etapeCircuit) {
           this.etapeCircuit = etapeCircuit;
    }


    /**
     * Gets the etapeCircuit value for this GetCircuitResponse.
     * 
     * @return etapeCircuit
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.EtapeCircuit[] getEtapeCircuit() {
        return etapeCircuit;
    }


    /**
     * Sets the etapeCircuit value for this GetCircuitResponse.
     * 
     * @param etapeCircuit
     */
    public void setEtapeCircuit(org.adullact.www.spring_ws.iparapheur._1_0.EtapeCircuit[] etapeCircuit) {
        this.etapeCircuit = etapeCircuit;
    }

    public org.adullact.www.spring_ws.iparapheur._1_0.EtapeCircuit getEtapeCircuit(int i) {
        return this.etapeCircuit[i];
    }

    public void setEtapeCircuit(int i, org.adullact.www.spring_ws.iparapheur._1_0.EtapeCircuit _value) {
        this.etapeCircuit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCircuitResponse)) return false;
        GetCircuitResponse other = (GetCircuitResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.etapeCircuit==null && other.getEtapeCircuit()==null) || 
             (this.etapeCircuit!=null &&
              java.util.Arrays.equals(this.etapeCircuit, other.getEtapeCircuit())));
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
        if (getEtapeCircuit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEtapeCircuit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEtapeCircuit(), i);
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
        new org.apache.axis.description.TypeDesc(GetCircuitResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">GetCircuitResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etapeCircuit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "EtapeCircuit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "EtapeCircuit"));
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
