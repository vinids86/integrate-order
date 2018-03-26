//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.26 at 05:00:48 AM BRT 
//


package com.accurate.acec.invoiceinfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvoiceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issuerDocumentNr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="invoiceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceEmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="invoiceEletronicKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectDataList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="objectData" type="{http://www.accurate.com/acec/InvoiceInfo}ObjectData" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInfo", propOrder = {
    "issuerDocumentNr",
    "invoiceNumber",
    "invoiceSerialNumber",
    "invoiceEmissionDate",
    "invoiceEletronicKey",
    "objectDataList"
})
public class InvoiceInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Long issuerDocumentNr;
    protected Long invoiceNumber;
    protected String invoiceSerialNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceEmissionDate;
    protected String invoiceEletronicKey;
    protected InvoiceInfo.ObjectDataList objectDataList;

    /**
     * Gets the value of the issuerDocumentNr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIssuerDocumentNr() {
        return issuerDocumentNr;
    }

    /**
     * Sets the value of the issuerDocumentNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIssuerDocumentNr(Long value) {
        this.issuerDocumentNr = value;
    }

    public boolean isSetIssuerDocumentNr() {
        return (this.issuerDocumentNr!= null);
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceNumber(Long value) {
        this.invoiceNumber = value;
    }

    public boolean isSetInvoiceNumber() {
        return (this.invoiceNumber!= null);
    }

    /**
     * Gets the value of the invoiceSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSerialNumber() {
        return invoiceSerialNumber;
    }

    /**
     * Sets the value of the invoiceSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSerialNumber(String value) {
        this.invoiceSerialNumber = value;
    }

    public boolean isSetInvoiceSerialNumber() {
        return (this.invoiceSerialNumber!= null);
    }

    /**
     * Gets the value of the invoiceEmissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceEmissionDate() {
        return invoiceEmissionDate;
    }

    /**
     * Sets the value of the invoiceEmissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceEmissionDate(XMLGregorianCalendar value) {
        this.invoiceEmissionDate = value;
    }

    public boolean isSetInvoiceEmissionDate() {
        return (this.invoiceEmissionDate!= null);
    }

    /**
     * Gets the value of the invoiceEletronicKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceEletronicKey() {
        return invoiceEletronicKey;
    }

    /**
     * Sets the value of the invoiceEletronicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceEletronicKey(String value) {
        this.invoiceEletronicKey = value;
    }

    public boolean isSetInvoiceEletronicKey() {
        return (this.invoiceEletronicKey!= null);
    }

    /**
     * Gets the value of the objectDataList property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInfo.ObjectDataList }
     *     
     */
    public InvoiceInfo.ObjectDataList getObjectDataList() {
        return objectDataList;
    }

    /**
     * Sets the value of the objectDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInfo.ObjectDataList }
     *     
     */
    public void setObjectDataList(InvoiceInfo.ObjectDataList value) {
        this.objectDataList = value;
    }

    public boolean isSetObjectDataList() {
        return (this.objectDataList!= null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="objectData" type="{http://www.accurate.com/acec/InvoiceInfo}ObjectData" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objectData"
    })
    public static class ObjectDataList
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<ObjectData> objectData;

        /**
         * Gets the value of the objectData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the objectData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObjectData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObjectData }
         * 
         * 
         */
        public List<ObjectData> getObjectData() {
            if (objectData == null) {
                objectData = new ArrayList<ObjectData>();
            }
            return this.objectData;
        }

        public boolean isSetObjectData() {
            return ((this.objectData!= null)&&(!this.objectData.isEmpty()));
        }

        public void unsetObjectData() {
            this.objectData = null;
        }

    }

}
