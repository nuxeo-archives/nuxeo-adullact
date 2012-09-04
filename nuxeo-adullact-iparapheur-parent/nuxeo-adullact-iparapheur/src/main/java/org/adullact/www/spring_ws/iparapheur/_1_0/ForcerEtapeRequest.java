/**
 * ForcerEtapeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class ForcerEtapeRequest  implements java.io.Serializable {
    private java.lang.String dossierID;

    private org.adullact.www.spring_ws.iparapheur._1_0.CodeRetour codeTransition;

    private java.lang.String annotationPublique;

    private java.lang.String annotationPrivee;

    public ForcerEtapeRequest() {
    }

    public ForcerEtapeRequest(
           java.lang.String dossierID,
           org.adullact.www.spring_ws.iparapheur._1_0.CodeRetour codeTransition,
           java.lang.String annotationPublique,
           java.lang.String annotationPrivee) {
           this.dossierID = dossierID;
           this.codeTransition = codeTransition;
           this.annotationPublique = annotationPublique;
           this.annotationPrivee = annotationPrivee;
    }


    /**
     * Gets the dossierID value for this ForcerEtapeRequest.
     * 
     * @return dossierID
     */
    public java.lang.String getDossierID() {
        return dossierID;
    }


    /**
     * Sets the dossierID value for this ForcerEtapeRequest.
     * 
     * @param dossierID
     */
    public void setDossierID(java.lang.String dossierID) {
        this.dossierID = dossierID;
    }


    /**
     * Gets the codeTransition value for this ForcerEtapeRequest.
     * 
     * @return codeTransition
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.CodeRetour getCodeTransition() {
        return codeTransition;
    }


    /**
     * Sets the codeTransition value for this ForcerEtapeRequest.
     * 
     * @param codeTransition
     */
    public void setCodeTransition(org.adullact.www.spring_ws.iparapheur._1_0.CodeRetour codeTransition) {
        this.codeTransition = codeTransition;
    }


    /**
     * Gets the annotationPublique value for this ForcerEtapeRequest.
     * 
     * @return annotationPublique
     */
    public java.lang.String getAnnotationPublique() {
        return annotationPublique;
    }


    /**
     * Sets the annotationPublique value for this ForcerEtapeRequest.
     * 
     * @param annotationPublique
     */
    public void setAnnotationPublique(java.lang.String annotationPublique) {
        this.annotationPublique = annotationPublique;
    }


    /**
     * Gets the annotationPrivee value for this ForcerEtapeRequest.
     * 
     * @return annotationPrivee
     */
    public java.lang.String getAnnotationPrivee() {
        return annotationPrivee;
    }


    /**
     * Sets the annotationPrivee value for this ForcerEtapeRequest.
     * 
     * @param annotationPrivee
     */
    public void setAnnotationPrivee(java.lang.String annotationPrivee) {
        this.annotationPrivee = annotationPrivee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForcerEtapeRequest)) return false;
        ForcerEtapeRequest other = (ForcerEtapeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dossierID==null && other.getDossierID()==null) || 
             (this.dossierID!=null &&
              this.dossierID.equals(other.getDossierID()))) &&
            ((this.codeTransition==null && other.getCodeTransition()==null) || 
             (this.codeTransition!=null &&
              this.codeTransition.equals(other.getCodeTransition()))) &&
            ((this.annotationPublique==null && other.getAnnotationPublique()==null) || 
             (this.annotationPublique!=null &&
              this.annotationPublique.equals(other.getAnnotationPublique()))) &&
            ((this.annotationPrivee==null && other.getAnnotationPrivee()==null) || 
             (this.annotationPrivee!=null &&
              this.annotationPrivee.equals(other.getAnnotationPrivee())));
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
        if (getDossierID() != null) {
            _hashCode += getDossierID().hashCode();
        }
        if (getCodeTransition() != null) {
            _hashCode += getCodeTransition().hashCode();
        }
        if (getAnnotationPublique() != null) {
            _hashCode += getAnnotationPublique().hashCode();
        }
        if (getAnnotationPrivee() != null) {
            _hashCode += getAnnotationPrivee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForcerEtapeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ForcerEtapeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeTransition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "CodeTransition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "codeRetour"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotationPublique");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "AnnotationPublique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotationPrivee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "AnnotationPrivee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
