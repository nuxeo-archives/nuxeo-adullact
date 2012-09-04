/**
 * DocAnnexe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.adullact.www.spring_ws.iparapheur._1_0;


/**
 * mimetype: par exemple "application/pdf".  encoding: par exemple
 * "UTF-8".
 *             Et maintenant, possibilité d'y definir une signature detachee
 * CMS/PKCS7.
 */
public class DocAnnexe  implements java.io.Serializable {
    private java.lang.String nom;

    private org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc fichier;

    private java.lang.String mimetype;

    private java.lang.String encoding;

    private org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc signature;

    public DocAnnexe() {
    }

    public DocAnnexe(
           java.lang.String nom,
           org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc fichier,
           java.lang.String mimetype,
           java.lang.String encoding,
           org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc signature) {
           this.nom = nom;
           this.fichier = fichier;
           this.mimetype = mimetype;
           this.encoding = encoding;
           this.signature = signature;
    }


    /**
     * Gets the nom value for this DocAnnexe.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this DocAnnexe.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the fichier value for this DocAnnexe.
     * 
     * @return fichier
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc getFichier() {
        return fichier;
    }


    /**
     * Sets the fichier value for this DocAnnexe.
     * 
     * @param fichier
     */
    public void setFichier(org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc fichier) {
        this.fichier = fichier;
    }


    /**
     * Gets the mimetype value for this DocAnnexe.
     * 
     * @return mimetype
     */
    public java.lang.String getMimetype() {
        return mimetype;
    }


    /**
     * Sets the mimetype value for this DocAnnexe.
     * 
     * @param mimetype
     */
    public void setMimetype(java.lang.String mimetype) {
        this.mimetype = mimetype;
    }


    /**
     * Gets the encoding value for this DocAnnexe.
     * 
     * @return encoding
     */
    public java.lang.String getEncoding() {
        return encoding;
    }


    /**
     * Sets the encoding value for this DocAnnexe.
     * 
     * @param encoding
     */
    public void setEncoding(java.lang.String encoding) {
        this.encoding = encoding;
    }


    /**
     * Gets the signature value for this DocAnnexe.
     * 
     * @return signature
     */
    public org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this DocAnnexe.
     * 
     * @param signature
     */
    public void setSignature(org.adullact.www.spring_ws.iparapheur._1_0.TypeDoc signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocAnnexe)) return false;
        DocAnnexe other = (DocAnnexe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.fichier==null && other.getFichier()==null) || 
             (this.fichier!=null &&
              this.fichier.equals(other.getFichier()))) &&
            ((this.mimetype==null && other.getMimetype()==null) || 
             (this.mimetype!=null &&
              this.mimetype.equals(other.getMimetype()))) &&
            ((this.encoding==null && other.getEncoding()==null) || 
             (this.encoding!=null &&
              this.encoding.equals(other.getEncoding()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature())));
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
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getFichier() != null) {
            _hashCode += getFichier().hashCode();
        }
        if (getMimetype() != null) {
            _hashCode += getMimetype().hashCode();
        }
        if (getEncoding() != null) {
            _hashCode += getEncoding().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocAnnexe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "DocAnnexe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fichier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "fichier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDoc"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "mimetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encoding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "encoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.adullact.org/spring-ws/iparapheur/1.0", "TypeDoc"));
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
