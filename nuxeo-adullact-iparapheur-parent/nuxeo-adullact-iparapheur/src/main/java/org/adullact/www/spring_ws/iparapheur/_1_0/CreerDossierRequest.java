/**
 * CreerDossierRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;

public class CreerDossierRequest  implements java.io.Serializable {
    private java.lang.String typeTechnique;

    private java.lang.String sousType;

    private java.lang.String emailEmetteur;

    private java.lang.String dossierID;

    private org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc documentPrincipal;

    private java.lang.String nomDocPrincipal;

    private org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc signatureDocPrincipal;

    private org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc visuelPDF;

    private org.adullact.www.spring_ws.iparapheur._1_0.TypeDocAnnexes documentsAnnexes;

    private org.adullact.www.spring_ws.iparapheur._1_0.TypeMetaDonnees metaData;

    private java.lang.String XPathPourSignatureXML;

    private org.adullact.www.spring_ws.iparapheur._1_0.MetaDataTdtACTES metaDataTdtACTES;

    private java.lang.String annotationPublique;

    private java.lang.String annotationPrivee;

    private org.adullact.www.spring_ws.iparapheur._1_0.Visibilite visibilite;

    private java.lang.String dateLimite;

    private org.adullact.www.spring_ws.iparapheur._1_0.TypeCircuit circuitObligatoire;

    public CreerDossierRequest() {
    }

    public CreerDossierRequest(
           java.lang.String typeTechnique,
           java.lang.String sousType,
           java.lang.String emailEmetteur,
           java.lang.String dossierID,
           org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc documentPrincipal,
           java.lang.String nomDocPrincipal,
           org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc signatureDocPrincipal,
           org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc visuelPDF,
           org.adullact.www.spring_ws.iparapheur._1_0.TypeDocAnnexes documentsAnnexes,
           org.adullact.www.spring_ws.iparapheur._1_0.TypeMetaDonnees metaData,
           java.lang.String XPathPourSignatureXML,
           org.adullact.www.spring_ws.iparapheur._1_0.MetaDataTdtACTES metaDataTdtACTES,
           java.lang.String annotationPublique,
           java.lang.String annotationPrivee,
           org.adullact.www.spring_ws.iparapheur._1_0.Visibilite visibilite,
           java.lang.String dateLimite,
           org.adullact.www.spring_ws.iparapheur._1_0.TypeCircuit circuitObligatoire) {
           this.typeTechnique = typeTechnique;
           this.sousType = sousType;
           this.emailEmetteur = emailEmetteur;
           this.dossierID = dossierID;
           this.documentPrincipal = documentPrincipal;
           this.nomDocPrincipal = nomDocPrincipal;
           this.signatureDocPrincipal = signatureDocPrincipal;
           this.visuelPDF = visuelPDF;
           this.documentsAnnexes = documentsAnnexes;
           this.metaData = metaData;
           this.XPathPourSignatureXML = XPathPourSignatureXML;
           this.metaDataTdtACTES = metaDataTdtACTES;
           this.annotationPublique = annotationPublique;
           this.annotationPrivee = annotationPrivee;
           this.visibilite = visibilite;
           this.dateLimite = dateLimite;
           this.circuitObligatoire = circuitObligatoire;
    }


    /**
     * Gets the typeTechnique value for this CreerDossierRequest.
     * 
     * @return typeTechnique
     */
    public java.lang.String getTypeTechnique() {
        return typeTechnique;
    }


    /**
     * Sets the typeTechnique value for this CreerDossierRequest.
     * 
     * @param typeTechnique
     */
    public void setTypeTechnique(java.lang.String typeTechnique) {
        this.typeTechnique = typeTechnique;
    }


    /**
     * Gets the sousType value for this CreerDossierRequest.
     * 
     * @return sousType
     */
    public java.lang.String getSousType() {
        return sousType;
    }


    /**
     * Sets the sousType value for this CreerDossierRequest.
     * 
     * @param sousType
     */
    public void setSousType(java.lang.String sousType) {
        this.sousType = sousType;
    }


    /**
     * Gets the emailEmetteur value for this CreerDossierRequest.
     * 
     * @return emailEmetteur
     */
    public java.lang.String getEmailEmetteur() {
        return emailEmetteur;
    }


    /**
     * Sets the emailEmetteur value for this CreerDossierRequest.
     * 
     * @param emailEmetteur
     */
    public void setEmailEmetteur(java.lang.String emailEmetteur) {
        this.emailEmetteur = emailEmetteur;
    }


    /**
     * Gets the dossierID value for this CreerDossierRequest.
     * 
     * @return dossierID
     */
    public java.lang.String getDossierID() {
        return dossierID;
    }


    /**
     * Sets the dossierID value for this CreerDossierRequest.
     * 
     * @param dossierID
     */
    public void setDossierID(java.lang.String dossierID) {
        this.dossierID = dossierID;
    }


    /**
     * Gets the documentPrincipal value for this CreerDossierRequest.
     * 
     * @return documentPrincipal
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc getDocumentPrincipal() {
        return documentPrincipal;
    }


    /**
     * Sets the documentPrincipal value for this CreerDossierRequest.
     * 
     * @param documentPrincipal
     */
    public void setDocumentPrincipal(org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc documentPrincipal) {
        this.documentPrincipal = documentPrincipal;
    }


    /**
     * Gets the nomDocPrincipal value for this CreerDossierRequest.
     * 
     * @return nomDocPrincipal
     */
    public java.lang.String getNomDocPrincipal() {
        return nomDocPrincipal;
    }


    /**
     * Sets the nomDocPrincipal value for this CreerDossierRequest.
     * 
     * @param nomDocPrincipal
     */
    public void setNomDocPrincipal(java.lang.String nomDocPrincipal) {
        this.nomDocPrincipal = nomDocPrincipal;
    }


    /**
     * Gets the signatureDocPrincipal value for this CreerDossierRequest.
     * 
     * @return signatureDocPrincipal
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc getSignatureDocPrincipal() {
        return signatureDocPrincipal;
    }


    /**
     * Sets the signatureDocPrincipal value for this CreerDossierRequest.
     * 
     * @param signatureDocPrincipal
     */
    public void setSignatureDocPrincipal(org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc signatureDocPrincipal) {
        this.signatureDocPrincipal = signatureDocPrincipal;
    }


    /**
     * Gets the visuelPDF value for this CreerDossierRequest.
     * 
     * @return visuelPDF
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc getVisuelPDF() {
        return visuelPDF;
    }


    /**
     * Sets the visuelPDF value for this CreerDossierRequest.
     * 
     * @param visuelPDF
     */
    public void setVisuelPDF(org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc visuelPDF) {
        this.visuelPDF = visuelPDF;
    }


    /**
     * Gets the documentsAnnexes value for this CreerDossierRequest.
     * 
     * @return documentsAnnexes
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.TypeDocAnnexes getDocumentsAnnexes() {
        return documentsAnnexes;
    }


    /**
     * Sets the documentsAnnexes value for this CreerDossierRequest.
     * 
     * @param documentsAnnexes
     */
    public void setDocumentsAnnexes(org.adullact.www.spring_ws.iparapheur._1_0.TypeDocAnnexes documentsAnnexes) {
        this.documentsAnnexes = documentsAnnexes;
    }


    /**
     * Gets the metaData value for this CreerDossierRequest.
     * 
     * @return metaData
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.TypeMetaDonnees getMetaData() {
        return metaData;
    }


    /**
     * Sets the metaData value for this CreerDossierRequest.
     * 
     * @param metaData
     */
    public void setMetaData(org.adullact.www.spring_ws.iparapheur._1_0.TypeMetaDonnees metaData) {
        this.metaData = metaData;
    }


    /**
     * Gets the XPathPourSignatureXML value for this CreerDossierRequest.
     * 
     * @return XPathPourSignatureXML
     */
    public java.lang.String getXPathPourSignatureXML() {
        return XPathPourSignatureXML;
    }


    /**
     * Sets the XPathPourSignatureXML value for this CreerDossierRequest.
     * 
     * @param XPathPourSignatureXML
     */
    public void setXPathPourSignatureXML(java.lang.String XPathPourSignatureXML) {
        this.XPathPourSignatureXML = XPathPourSignatureXML;
    }


    /**
     * Gets the metaDataTdtACTES value for this CreerDossierRequest.
     * 
     * @return metaDataTdtACTES
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.MetaDataTdtACTES getMetaDataTdtACTES() {
        return metaDataTdtACTES;
    }


    /**
     * Sets the metaDataTdtACTES value for this CreerDossierRequest.
     * 
     * @param metaDataTdtACTES
     */
    public void setMetaDataTdtACTES(org.adullact.www.spring_ws.iparapheur._1_0.MetaDataTdtACTES metaDataTdtACTES) {
        this.metaDataTdtACTES = metaDataTdtACTES;
    }


    /**
     * Gets the annotationPublique value for this CreerDossierRequest.
     * 
     * @return annotationPublique
     */
    public java.lang.String getAnnotationPublique() {
        return annotationPublique;
    }


    /**
     * Sets the annotationPublique value for this CreerDossierRequest.
     * 
     * @param annotationPublique
     */
    public void setAnnotationPublique(java.lang.String annotationPublique) {
        this.annotationPublique = annotationPublique;
    }


    /**
     * Gets the annotationPrivee value for this CreerDossierRequest.
     * 
     * @return annotationPrivee
     */
    public java.lang.String getAnnotationPrivee() {
        return annotationPrivee;
    }


    /**
     * Sets the annotationPrivee value for this CreerDossierRequest.
     * 
     * @param annotationPrivee
     */
    public void setAnnotationPrivee(java.lang.String annotationPrivee) {
        this.annotationPrivee = annotationPrivee;
    }


    /**
     * Gets the visibilite value for this CreerDossierRequest.
     * 
     * @return visibilite
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.Visibilite getVisibilite() {
        return visibilite;
    }


    /**
     * Sets the visibilite value for this CreerDossierRequest.
     * 
     * @param visibilite
     */
    public void setVisibilite(org.adullact.www.spring_ws.iparapheur._1_0.Visibilite visibilite) {
        this.visibilite = visibilite;
    }


    /**
     * Gets the dateLimite value for this CreerDossierRequest.
     * 
     * @return dateLimite
     */
    public java.lang.String getDateLimite() {
        return dateLimite;
    }


    /**
     * Sets the dateLimite value for this CreerDossierRequest.
     * 
     * @param dateLimite
     */
    public void setDateLimite(java.lang.String dateLimite) {
        this.dateLimite = dateLimite;
    }


    /**
     * Gets the circuitObligatoire value for this CreerDossierRequest.
     * 
     * @return circuitObligatoire
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.TypeCircuit getCircuitObligatoire() {
        return circuitObligatoire;
    }


    /**
     * Sets the circuitObligatoire value for this CreerDossierRequest.
     * 
     * @param circuitObligatoire
     */
    public void setCircuitObligatoire(org.adullact.www.spring_ws.iparapheur._1_0.TypeCircuit circuitObligatoire) {
        this.circuitObligatoire = circuitObligatoire;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreerDossierRequest)) return false;
        CreerDossierRequest other = (CreerDossierRequest) obj;
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
            ((this.documentPrincipal==null && other.getDocumentPrincipal()==null) || 
             (this.documentPrincipal!=null &&
              this.documentPrincipal.equals(other.getDocumentPrincipal()))) &&
            ((this.nomDocPrincipal==null && other.getNomDocPrincipal()==null) || 
             (this.nomDocPrincipal!=null &&
              this.nomDocPrincipal.equals(other.getNomDocPrincipal()))) &&
            ((this.signatureDocPrincipal==null && other.getSignatureDocPrincipal()==null) || 
             (this.signatureDocPrincipal!=null &&
              this.signatureDocPrincipal.equals(other.getSignatureDocPrincipal()))) &&
            ((this.visuelPDF==null && other.getVisuelPDF()==null) || 
             (this.visuelPDF!=null &&
              this.visuelPDF.equals(other.getVisuelPDF()))) &&
            ((this.documentsAnnexes==null && other.getDocumentsAnnexes()==null) || 
             (this.documentsAnnexes!=null &&
              this.documentsAnnexes.equals(other.getDocumentsAnnexes()))) &&
            ((this.metaData==null && other.getMetaData()==null) || 
             (this.metaData!=null &&
              this.metaData.equals(other.getMetaData()))) &&
            ((this.XPathPourSignatureXML==null && other.getXPathPourSignatureXML()==null) || 
             (this.XPathPourSignatureXML!=null &&
              this.XPathPourSignatureXML.equals(other.getXPathPourSignatureXML()))) &&
            ((this.metaDataTdtACTES==null && other.getMetaDataTdtACTES()==null) || 
             (this.metaDataTdtACTES!=null &&
              this.metaDataTdtACTES.equals(other.getMetaDataTdtACTES()))) &&
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
              this.dateLimite.equals(other.getDateLimite()))) &&
            ((this.circuitObligatoire==null && other.getCircuitObligatoire()==null) || 
             (this.circuitObligatoire!=null &&
              this.circuitObligatoire.equals(other.getCircuitObligatoire())));
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
        if (getDocumentPrincipal() != null) {
            _hashCode += getDocumentPrincipal().hashCode();
        }
        if (getNomDocPrincipal() != null) {
            _hashCode += getNomDocPrincipal().hashCode();
        }
        if (getSignatureDocPrincipal() != null) {
            _hashCode += getSignatureDocPrincipal().hashCode();
        }
        if (getVisuelPDF() != null) {
            _hashCode += getVisuelPDF().hashCode();
        }
        if (getDocumentsAnnexes() != null) {
            _hashCode += getDocumentsAnnexes().hashCode();
        }
        if (getMetaData() != null) {
            _hashCode += getMetaData().hashCode();
        }
        if (getXPathPourSignatureXML() != null) {
            _hashCode += getXPathPourSignatureXML().hashCode();
        }
        if (getMetaDataTdtACTES() != null) {
            _hashCode += getMetaDataTdtACTES().hashCode();
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
        if (getCircuitObligatoire() != null) {
            _hashCode += getCircuitObligatoire().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreerDossierRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", ">CreerDossierRequest"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DossierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DocumentPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDoc"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomDocPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "NomDocPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureDocPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "SignatureDocPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDoc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visuelPDF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "VisuelPDF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDoc"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentsAnnexes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DocumentsAnnexes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDocAnnexes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MetaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeMetaDonnees"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XPathPourSignatureXML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "XPathPourSignatureXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaDataTdtACTES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "MetaDataTdtACTES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "metaDataTdtACTES"));
        elemField.setNillable(true);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circuitObligatoire");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "CircuitObligatoire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeCircuit"));
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
