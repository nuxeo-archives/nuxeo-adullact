/**
 * ArchiverDossierRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class ArchiverDossierRequest  implements java.io.Serializable {
    private java.lang.String dossierID;

    private org.adullact.www.spring_ws.iparapheur._1_0.ArchivageAction archivageAction;

    public ArchiverDossierRequest() {
    }

    public ArchiverDossierRequest(
           java.lang.String dossierID,
           org.adullact.www.spring_ws.iparapheur._1_0.ArchivageAction archivageAction) {
           this.dossierID = dossierID;
           this.archivageAction = archivageAction;
    }


    /**
     * Gets the dossierID value for this ArchiverDossierRequest.
     * 
     * @return dossierID
     */
    public java.lang.String getDossierID() {
        return dossierID;
    }


    /**
     * Sets the dossierID value for this ArchiverDossierRequest.
     * 
     * @param dossierID
     */
    public void setDossierID(java.lang.String dossierID) {
        this.dossierID = dossierID;
    }


    /**
     * Gets the archivageAction value for this ArchiverDossierRequest.
     * 
     * @return archivageAction
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.ArchivageAction getArchivageAction() {
        return archivageAction;
    }


    /**
     * Sets the archivageAction value for this ArchiverDossierRequest.
     * 
     * @param archivageAction
     */
    public void setArchivageAction(org.adullact.www.spring_ws.iparapheur._1_0.ArchivageAction archivageAction) {
        this.archivageAction = archivageAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchiverDossierRequest)) return false;
        ArchiverDossierRequest other = (ArchiverDossierRequest) obj;
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
            ((this.archivageAction==null && other.getArchivageAction()==null) || 
             (this.archivageAction!=null &&
              this.archivageAction.equals(other.getArchivageAction())));
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
        if (getArchivageAction() != null) {
            _hashCode += getArchivageAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchiverDossierRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">ArchiverDossierRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivageAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "ArchivageAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "ArchivageAction"));
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
