/**
 * RechercherDossiersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class RechercherDossiersRequest  implements java.io.Serializable {
    private java.lang.String typeTechnique;

    private java.lang.String sousType;

    private java.lang.String status;

    private java.math.BigInteger nombreDossiers;

    private java.lang.String[] dossierID;

    public RechercherDossiersRequest() {
    }

    public RechercherDossiersRequest(
           java.lang.String typeTechnique,
           java.lang.String sousType,
           java.lang.String status,
           java.math.BigInteger nombreDossiers,
           java.lang.String[] dossierID) {
           this.typeTechnique = typeTechnique;
           this.sousType = sousType;
           this.status = status;
           this.nombreDossiers = nombreDossiers;
           this.dossierID = dossierID;
    }


    /**
     * Gets the typeTechnique value for this RechercherDossiersRequest.
     * 
     * @return typeTechnique
     */
    public java.lang.String getTypeTechnique() {
        return typeTechnique;
    }


    /**
     * Sets the typeTechnique value for this RechercherDossiersRequest.
     * 
     * @param typeTechnique
     */
    public void setTypeTechnique(java.lang.String typeTechnique) {
        this.typeTechnique = typeTechnique;
    }


    /**
     * Gets the sousType value for this RechercherDossiersRequest.
     * 
     * @return sousType
     */
    public java.lang.String getSousType() {
        return sousType;
    }


    /**
     * Sets the sousType value for this RechercherDossiersRequest.
     * 
     * @param sousType
     */
    public void setSousType(java.lang.String sousType) {
        this.sousType = sousType;
    }


    /**
     * Gets the status value for this RechercherDossiersRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RechercherDossiersRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the nombreDossiers value for this RechercherDossiersRequest.
     * 
     * @return nombreDossiers
     */
    public java.math.BigInteger getNombreDossiers() {
        return nombreDossiers;
    }


    /**
     * Sets the nombreDossiers value for this RechercherDossiersRequest.
     * 
     * @param nombreDossiers
     */
    public void setNombreDossiers(java.math.BigInteger nombreDossiers) {
        this.nombreDossiers = nombreDossiers;
    }


    /**
     * Gets the dossierID value for this RechercherDossiersRequest.
     * 
     * @return dossierID
     */
    public java.lang.String[] getDossierID() {
        return dossierID;
    }


    /**
     * Sets the dossierID value for this RechercherDossiersRequest.
     * 
     * @param dossierID
     */
    public void setDossierID(java.lang.String[] dossierID) {
        this.dossierID = dossierID;
    }

    public java.lang.String getDossierID(int i) {
        return this.dossierID[i];
    }

    public void setDossierID(int i, java.lang.String _value) {
        this.dossierID[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechercherDossiersRequest)) return false;
        RechercherDossiersRequest other = (RechercherDossiersRequest) obj;
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
              this.sousType.equals(other.getSousType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.nombreDossiers==null && other.getNombreDossiers()==null) || 
             (this.nombreDossiers!=null &&
              this.nombreDossiers.equals(other.getNombreDossiers()))) &&
            ((this.dossierID==null && other.getDossierID()==null) || 
             (this.dossierID!=null &&
              java.util.Arrays.equals(this.dossierID, other.getDossierID())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getNombreDossiers() != null) {
            _hashCode += getNombreDossiers().hashCode();
        }
        if (getDossierID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDossierID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDossierID(), i);
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
        new org.apache.axis.description.TypeDesc(RechercherDossiersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">RechercherDossiersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeTechnique");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeTechnique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sousType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "SousType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreDossiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "NombreDossiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"));
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
