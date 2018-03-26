//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.26 at 05:00:48 AM BRT 
//


package com.accurate.acec.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.accurate.acec.invoiceinfo.InvoiceInfo;


/**
 * Tracking
 * 
 * <p>Java class for tracking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tracking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trackingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="trackingStep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackingTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackingMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackingStepStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adjustedDeliveryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="carrierURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.accurate.com/acec/InvoiceInfo}invoiceInfo" minOccurs="0"/>
 *         &lt;element name="trackingPropertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trackingProperty" type="{http://www.accurate.com/acec/order}trackingProperty" maxOccurs="unbounded"/>
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
@XmlType(name = "tracking", propOrder = {
    "trackingId",
    "trackingCode",
    "trackingDate",
    "trackingStep",
    "trackingTitle",
    "trackingMessage",
    "trackingStepStatus",
    "adjustedDeliveryDt",
    "carrierURL",
    "invoiceURL",
    "invoiceInfo",
    "trackingPropertyList"
})
public class Tracking
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String trackingId;
    @XmlElement(required = true)
    protected String trackingCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trackingDate;
    @XmlElement(required = true)
    protected String trackingStep;
    @XmlElement(required = true)
    protected String trackingTitle;
    @XmlElement(required = true)
    protected String trackingMessage;
    @XmlElement(required = true)
    protected String trackingStepStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adjustedDeliveryDt;
    protected String carrierURL;
    protected String invoiceURL;
    @XmlElement(namespace = "http://www.accurate.com/acec/InvoiceInfo")
    protected InvoiceInfo invoiceInfo;
    protected Tracking.TrackingPropertyList trackingPropertyList;

    /**
     * Gets the value of the trackingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingId(String value) {
        this.trackingId = value;
    }

    public boolean isSetTrackingId() {
        return (this.trackingId!= null);
    }

    /**
     * Gets the value of the trackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the value of the trackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingCode(String value) {
        this.trackingCode = value;
    }

    public boolean isSetTrackingCode() {
        return (this.trackingCode!= null);
    }

    /**
     * Gets the value of the trackingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrackingDate() {
        return trackingDate;
    }

    /**
     * Sets the value of the trackingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrackingDate(XMLGregorianCalendar value) {
        this.trackingDate = value;
    }

    public boolean isSetTrackingDate() {
        return (this.trackingDate!= null);
    }

    /**
     * Gets the value of the trackingStep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingStep() {
        return trackingStep;
    }

    /**
     * Sets the value of the trackingStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingStep(String value) {
        this.trackingStep = value;
    }

    public boolean isSetTrackingStep() {
        return (this.trackingStep!= null);
    }

    /**
     * Gets the value of the trackingTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingTitle() {
        return trackingTitle;
    }

    /**
     * Sets the value of the trackingTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingTitle(String value) {
        this.trackingTitle = value;
    }

    public boolean isSetTrackingTitle() {
        return (this.trackingTitle!= null);
    }

    /**
     * Gets the value of the trackingMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingMessage() {
        return trackingMessage;
    }

    /**
     * Sets the value of the trackingMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingMessage(String value) {
        this.trackingMessage = value;
    }

    public boolean isSetTrackingMessage() {
        return (this.trackingMessage!= null);
    }

    /**
     * Gets the value of the trackingStepStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingStepStatus() {
        return trackingStepStatus;
    }

    /**
     * Sets the value of the trackingStepStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingStepStatus(String value) {
        this.trackingStepStatus = value;
    }

    public boolean isSetTrackingStepStatus() {
        return (this.trackingStepStatus!= null);
    }

    /**
     * Gets the value of the adjustedDeliveryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustedDeliveryDt() {
        return adjustedDeliveryDt;
    }

    /**
     * Sets the value of the adjustedDeliveryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustedDeliveryDt(XMLGregorianCalendar value) {
        this.adjustedDeliveryDt = value;
    }

    public boolean isSetAdjustedDeliveryDt() {
        return (this.adjustedDeliveryDt!= null);
    }

    /**
     * Gets the value of the carrierURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierURL() {
        return carrierURL;
    }

    /**
     * Sets the value of the carrierURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierURL(String value) {
        this.carrierURL = value;
    }

    public boolean isSetCarrierURL() {
        return (this.carrierURL!= null);
    }

    /**
     * Gets the value of the invoiceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceURL() {
        return invoiceURL;
    }

    /**
     * Sets the value of the invoiceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceURL(String value) {
        this.invoiceURL = value;
    }

    public boolean isSetInvoiceURL() {
        return (this.invoiceURL!= null);
    }

    /**
     * Informações referentes a nota fiscal.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInfo }
     *     
     */
    public InvoiceInfo getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * Sets the value of the invoiceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInfo }
     *     
     */
    public void setInvoiceInfo(InvoiceInfo value) {
        this.invoiceInfo = value;
    }

    public boolean isSetInvoiceInfo() {
        return (this.invoiceInfo!= null);
    }

    /**
     * Gets the value of the trackingPropertyList property.
     * 
     * @return
     *     possible object is
     *     {@link Tracking.TrackingPropertyList }
     *     
     */
    public Tracking.TrackingPropertyList getTrackingPropertyList() {
        return trackingPropertyList;
    }

    /**
     * Sets the value of the trackingPropertyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tracking.TrackingPropertyList }
     *     
     */
    public void setTrackingPropertyList(Tracking.TrackingPropertyList value) {
        this.trackingPropertyList = value;
    }

    public boolean isSetTrackingPropertyList() {
        return (this.trackingPropertyList!= null);
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
     *         &lt;element name="trackingProperty" type="{http://www.accurate.com/acec/order}trackingProperty" maxOccurs="unbounded"/>
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
        "trackingProperty"
    })
    public static class TrackingPropertyList
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<TrackingProperty> trackingProperty;

        /**
         * Gets the value of the trackingProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trackingProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrackingProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrackingProperty }
         * 
         * 
         */
        public List<TrackingProperty> getTrackingProperty() {
            if (trackingProperty == null) {
                trackingProperty = new ArrayList<TrackingProperty>();
            }
            return this.trackingProperty;
        }

        public boolean isSetTrackingProperty() {
            return ((this.trackingProperty!= null)&&(!this.trackingProperty.isEmpty()));
        }

        public void unsetTrackingProperty() {
            this.trackingProperty = null;
        }

    }

}
