/**
 * CreerDossierPESRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class CreerDossierPESRequest  implements java.io.Serializable {
    private java.lang.String typeTechnique;

    private java.lang.String sousType;

    private java.lang.String emailEmetteur;

    private java.lang.String dossierID;

    private org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc fichierPES;

    private org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc visuelPDF;

    private java.lang.String XPathPourSignaturePES;

    private java.lang.String annotationPublique;

    private java.lang.String annotationPrivee;

    private org.adullact.www.spring_ws.iparapheur._1_0.Visibilite visibilite;

    private java.lang.String dateLimite;

    public CreerDossierPESRequest() {
    }

    public CreerDossierPESRequest(
           java.lang.String typeTechnique,
           java.lang.String sousType,
           java.lang.String emailEmetteur,
           java.lang.String dossierID,
           org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc fichierPES,
           org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc visuelPDF,
           java.lang.String XPathPourSignaturePES,
           java.lang.String annotationPublique,
           java.lang.String annotationPrivee,
           org.adullact.www.spring_ws.iparapheur._1_0.Visibilite visibilite,
           java.lang.String dateLimite) {
           this.typeTechnique = typeTechnique;
           this.sousType = sousType;
           this.emailEmetteur = emailEmetteur;
           this.dossierID = dossierID;
           this.fichierPES = fichierPES;
           this.visuelPDF = visuelPDF;
           this.XPathPourSignaturePES = XPathPourSignaturePES;
           this.annotationPublique = annotationPublique;
           this.annotationPrivee = annotationPrivee;
           this.visibilite = visibilite;
           this.dateLimite = dateLimite;
    }


    /**
     * Gets the typeTechnique value for this CreerDossierPESRequest.
     * 
     * @return typeTechnique
     */
    public java.lang.String getTypeTechnique() {
        return typeTechnique;
    }


    /**
     * Sets the typeTechnique value for this CreerDossierPESRequest.
     * 
     * @param typeTechnique
     */
    public void setTypeTechnique(java.lang.String typeTechnique) {
        this.typeTechnique = typeTechnique;
    }


    /**
     * Gets the sousType value for this CreerDossierPESRequest.
     * 
     * @return sousType
     */
    public java.lang.String getSousType() {
        return sousType;
    }


    /**
     * Sets the sousType value for this CreerDossierPESRequest.
     * 
     * @param sousType
     */
    public void setSousType(java.lang.String sousType) {
        this.sousType = sousType;
    }


    /**
     * Gets the emailEmetteur value for this CreerDossierPESRequest.
     * 
     * @return emailEmetteur
     */
    public java.lang.String getEmailEmetteur() {
        return emailEmetteur;
    }


    /**
     * Sets the emailEmetteur value for this CreerDossierPESRequest.
     * 
     * @param emailEmetteur
     */
    public void setEmailEmetteur(java.lang.String emailEmetteur) {
        this.emailEmetteur = emailEmetteur;
    }


    /**
     * Gets the dossierID value for this CreerDossierPESRequest.
     * 
     * @return dossierID
     */
    public java.lang.String getDossierID() {
        return dossierID;
    }


    /**
     * Sets the dossierID value for this CreerDossierPESRequest.
     * 
     * @param dossierID
     */
    public void setDossierID(java.lang.String dossierID) {
        this.dossierID = dossierID;
    }


    /**
     * Gets the fichierPES value for this CreerDossierPESRequest.
     * 
     * @return fichierPES
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc getFichierPES() {
        return fichierPES;
    }


    /**
     * Sets the fichierPES value for this CreerDossierPESRequest.
     * 
     * @param fichierPES
     */
    public void setFichierPES(org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc fichierPES) {
        this.fichierPES = fichierPES;
    }


    /**
     * Gets the visuelPDF value for this CreerDossierPESRequest.
     * 
     * @return visuelPDF
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc getVisuelPDF() {
        return visuelPDF;
    }


    /**
     * Sets the visuelPDF value for this CreerDossierPESRequest.
     * 
     * @param visuelPDF
     */
    public void setVisuelPDF(org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc visuelPDF) {
        this.visuelPDF = visuelPDF;
    }


    /**
     * Gets the XPathPourSignaturePES value for this CreerDossierPESRequest.
     * 
     * @return XPathPourSignaturePES
     */
    public java.lang.String getXPathPourSignaturePES() {
        return XPathPourSignaturePES;
    }


    /**
     * Sets the XPathPourSignaturePES value for this CreerDossierPESRequest.
     * 
     * @param XPathPourSignaturePES
     */
    public void setXPathPourSignaturePES(java.lang.String XPathPourSignaturePES) {
        this.XPathPourSignaturePES = XPathPourSignaturePES;
    }


    /**
     * Gets the annotationPublique value for this CreerDossierPESRequest.
     * 
     * @return annotationPublique
     */
    public java.lang.String getAnnotationPublique() {
        return annotationPublique;
    }


    /**
     * Sets the annotationPublique value for this CreerDossierPESRequest.
     * 
     * @param annotationPublique
     */
    public void setAnnotationPublique(java.lang.String annotationPublique) {
        this.annotationPublique = annotationPublique;
    }


    /**
     * Gets the annotationPrivee value for this CreerDossierPESRequest.
     * 
     * @return annotationPrivee
     */
    public java.lang.String getAnnotationPrivee() {
        return annotationPrivee;
    }


    /**
     * Sets the annotationPrivee value for this CreerDossierPESRequest.
     * 
     * @param annotationPrivee
     */
    public void setAnnotationPrivee(java.lang.String annotationPrivee) {
        this.annotationPrivee = annotationPrivee;
    }


    /**
     * Gets the visibilite value for this CreerDossierPESRequest.
     * 
     * @return visibilite
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.Visibilite getVisibilite() {
        return visibilite;
    }


    /**
     * Sets the visibilite value for this CreerDossierPESRequest.
     * 
     * @param visibilite
     */
    public void setVisibilite(org.adullact.www.spring_ws.iparapheur._1_0.Visibilite visibilite) {
        this.visibilite = visibilite;
    }


    /**
     * Gets the dateLimite value for this CreerDossierPESRequest.
     * 
     * @return dateLimite
     */
    public java.lang.String getDateLimite() {
        return dateLimite;
    }


    /**
     * Sets the dateLimite value for this CreerDossierPESRequest.
     * 
     * @param dateLimite
     */
    public void setDateLimite(java.lang.String dateLimite) {
        this.dateLimite = dateLimite;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreerDossierPESRequest)) return false;
        CreerDossierPESRequest other = (CreerDossierPESRequest) obj;
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
            ((this.emailEmetteur==null && other.getEmailEmetteur()==null) || 
             (this.emailEmetteur!=null &&
              this.emailEmetteur.equals(other.getEmailEmetteur()))) &&
            ((this.dossierID==null && other.getDossierID()==null) || 
             (this.dossierID!=null &&
              this.dossierID.equals(other.getDossierID()))) &&
            ((this.fichierPES==null && other.getFichierPES()==null) || 
             (this.fichierPES!=null &&
              this.fichierPES.equals(other.getFichierPES()))) &&
            ((this.visuelPDF==null && other.getVisuelPDF()==null) || 
             (this.visuelPDF!=null &&
              this.visuelPDF.equals(other.getVisuelPDF()))) &&
            ((this.XPathPourSignaturePES==null && other.getXPathPourSignaturePES()==null) || 
             (this.XPathPourSignaturePES!=null &&
              this.XPathPourSignaturePES.equals(other.getXPathPourSignaturePES()))) &&
            ((this.annotationPublique==null && other.getAnnotationPublique()==null) || 
             (this.annotationPublique!=null &&
              this.annotationPublique.equals(other.getAnnotationPublique()))) &&
            ((this.annotationPrivee==null && other.getAnnotationPrivee()==null) || 
             (this.annotationPrivee!=null &&
              this.annotationPrivee.equals(other.getAnnotationPrivee()))) &&
            ((this.visibilite==null && other.getVisibilite()==null) || 
             (this.visibilite!=null &&
              this.visibilite.equals(other.getVisibilite()))) &&
            ((this.dateLimite==null && other.getDateLimite()==null) || 
             (this.dateLimite!=null &&
              this.dateLimite.equals(other.getDateLimite())));
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
        if (getEmailEmetteur() != null) {
            _hashCode += getEmailEmetteur().hashCode();
        }
        if (getDossierID() != null) {
            _hashCode += getDossierID().hashCode();
        }
        if (getFichierPES() != null) {
            _hashCode += getFichierPES().hashCode();
        }
        if (getVisuelPDF() != null) {
            _hashCode += getVisuelPDF().hashCode();
        }
        if (getXPathPourSignaturePES() != null) {
            _hashCode += getXPathPourSignaturePES().hashCode();
        }
        if (getAnnotationPublique() != null) {
            _hashCode += getAnnotationPublique().hashCode();
        }
        if (getAnnotationPrivee() != null) {
            _hashCode += getAnnotationPrivee().hashCode();
        }
        if (getVisibilite() != null) {
            _hashCode += getVisibilite().hashCode();
        }
        if (getDateLimite() != null) {
            _hashCode += getDateLimite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreerDossierPESRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">CreerDossierPESRequest"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailEmetteur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "EmailEmetteur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fichierPES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "FichierPES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDoc"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visuelPDF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "VisuelPDF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDoc"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XPathPourSignaturePES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "XPathPourSignaturePES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibilite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "Visibilite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "Visibilite"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLimite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DateLimite"));
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
