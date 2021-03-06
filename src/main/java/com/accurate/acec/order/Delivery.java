//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.26 at 05:00:48 AM BRT 
//


package com.accurate.acec.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for delivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relatedDeliveryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="totalDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="discountRoundingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="totalLoyaltyCreditEarningAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="loyaltyCreditEarningRoundingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="billingAddressId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryAddressId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderLineList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orderLine" type="{http://www.accurate.com/acec/order}orderLine" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="trackingList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tracking" type="{http://www.accurate.com/acec/order}tracking" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="skuDeliveryTrackingList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="skuDeliveryTracking" type="{http://www.accurate.com/acec/order}skuDeliveryTracking" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="freightAmount" type="{http://www.accurate.com/acec/order}freight"/>
 *         &lt;element name="wareHouseId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="wareHouseCNPJ" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryAddress" type="{http://www.accurate.com/acec/order}address"/>
 *         &lt;element name="scheduledPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deliveryPropertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="deliveryProperty" type="{http://www.accurate.com/acec/order}deliveryProperty" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="slotInfo" type="{http://www.accurate.com/acec/order}slotInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delivery", propOrder = {
    "deliveryId",
    "orderId",
    "deliveryType",
    "relatedDeliveryId",
    "status",
    "totalAmount",
    "totalDiscountAmount",
    "discountRoundingAmount",
    "totalLoyaltyCreditEarningAmount",
    "loyaltyCreditEarningRoundingAmount",
    "billingAddressId",
    "deliveryAddressId",
    "orderLineList",
    "trackingList",
    "skuDeliveryTrackingList",
    "freightAmount",
    "wareHouseId",
    "wareHouseCNPJ",
    "invoiceNumber",
    "invoiceSeries",
    "carrierCode",
    "deliveryAddress",
    "scheduledPeriod",
    "scheduledDate",
    "deliveryPropertyList",
    "slotInfo"
})
public class Delivery
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String deliveryId;
    @XmlElement(required = true)
    protected String orderId;
    @XmlElement(required = true)
    protected String deliveryType;
    @XmlElement(required = true)
    protected String relatedDeliveryId;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected BigDecimal totalAmount;
    @XmlElement(required = true)
    protected BigDecimal totalDiscountAmount;
    @XmlElement(required = true)
    protected BigDecimal discountRoundingAmount;
    @XmlElement(required = true)
    protected BigDecimal totalLoyaltyCreditEarningAmount;
    @XmlElement(required = true)
    protected BigDecimal loyaltyCreditEarningRoundingAmount;
    @XmlElement(required = true)
    protected String billingAddressId;
    @XmlElement(required = true)
    protected String deliveryAddressId;
    @XmlElement(required = true)
    protected Delivery.OrderLineList orderLineList;
    @XmlElement(required = true)
    protected Delivery.TrackingList trackingList;
    @XmlElement(required = true)
    protected Delivery.SkuDeliveryTrackingList skuDeliveryTrackingList;
    @XmlElement(required = true)
    protected Freight freightAmount;
    @XmlElement(required = true)
    protected BigInteger wareHouseId;
    protected long wareHouseCNPJ;
    protected String invoiceNumber;
    protected String invoiceSeries;
    @XmlElement(required = true)
    protected String carrierCode;
    @XmlElement(required = true)
    protected Address deliveryAddress;
    protected String scheduledPeriod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDate;
    protected Delivery.DeliveryPropertyList deliveryPropertyList;
    protected SlotInfo slotInfo;

    /**
     * Gets the value of the deliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryId() {
        return deliveryId;
    }

    /**
     * Sets the value of the deliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryId(String value) {
        this.deliveryId = value;
    }

    public boolean isSetDeliveryId() {
        return (this.deliveryId!= null);
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    public boolean isSetOrderId() {
        return (this.orderId!= null);
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryType(String value) {
        this.deliveryType = value;
    }

    public boolean isSetDeliveryType() {
        return (this.deliveryType!= null);
    }

    /**
     * Gets the value of the relatedDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedDeliveryId() {
        return relatedDeliveryId;
    }

    /**
     * Sets the value of the relatedDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedDeliveryId(String value) {
        this.relatedDeliveryId = value;
    }

    public boolean isSetRelatedDeliveryId() {
        return (this.relatedDeliveryId!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    public boolean isSetTotalAmount() {
        return (this.totalAmount!= null);
    }

    /**
     * Gets the value of the totalDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    /**
     * Sets the value of the totalDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDiscountAmount(BigDecimal value) {
        this.totalDiscountAmount = value;
    }

    public boolean isSetTotalDiscountAmount() {
        return (this.totalDiscountAmount!= null);
    }

    /**
     * Gets the value of the discountRoundingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountRoundingAmount() {
        return discountRoundingAmount;
    }

    /**
     * Sets the value of the discountRoundingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountRoundingAmount(BigDecimal value) {
        this.discountRoundingAmount = value;
    }

    public boolean isSetDiscountRoundingAmount() {
        return (this.discountRoundingAmount!= null);
    }

    /**
     * Gets the value of the totalLoyaltyCreditEarningAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLoyaltyCreditEarningAmount() {
        return totalLoyaltyCreditEarningAmount;
    }

    /**
     * Sets the value of the totalLoyaltyCreditEarningAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLoyaltyCreditEarningAmount(BigDecimal value) {
        this.totalLoyaltyCreditEarningAmount = value;
    }

    public boolean isSetTotalLoyaltyCreditEarningAmount() {
        return (this.totalLoyaltyCreditEarningAmount!= null);
    }

    /**
     * Gets the value of the loyaltyCreditEarningRoundingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoyaltyCreditEarningRoundingAmount() {
        return loyaltyCreditEarningRoundingAmount;
    }

    /**
     * Sets the value of the loyaltyCreditEarningRoundingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoyaltyCreditEarningRoundingAmount(BigDecimal value) {
        this.loyaltyCreditEarningRoundingAmount = value;
    }

    public boolean isSetLoyaltyCreditEarningRoundingAmount() {
        return (this.loyaltyCreditEarningRoundingAmount!= null);
    }

    /**
     * Gets the value of the billingAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressId() {
        return billingAddressId;
    }

    /**
     * Sets the value of the billingAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressId(String value) {
        this.billingAddressId = value;
    }

    public boolean isSetBillingAddressId() {
        return (this.billingAddressId!= null);
    }

    /**
     * Gets the value of the deliveryAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAddressId() {
        return deliveryAddressId;
    }

    /**
     * Sets the value of the deliveryAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAddressId(String value) {
        this.deliveryAddressId = value;
    }

    public boolean isSetDeliveryAddressId() {
        return (this.deliveryAddressId!= null);
    }

    /**
     * Gets the value of the orderLineList property.
     * 
     * @return
     *     possible object is
     *     {@link Delivery.OrderLineList }
     *     
     */
    public Delivery.OrderLineList getOrderLineList() {
        return orderLineList;
    }

    /**
     * Sets the value of the orderLineList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery.OrderLineList }
     *     
     */
    public void setOrderLineList(Delivery.OrderLineList value) {
        this.orderLineList = value;
    }

    public boolean isSetOrderLineList() {
        return (this.orderLineList!= null);
    }

    /**
     * Gets the value of the trackingList property.
     * 
     * @return
     *     possible object is
     *     {@link Delivery.TrackingList }
     *     
     */
    public Delivery.TrackingList getTrackingList() {
        return trackingList;
    }

    /**
     * Sets the value of the trackingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery.TrackingList }
     *     
     */
    public void setTrackingList(Delivery.TrackingList value) {
        this.trackingList = value;
    }

    public boolean isSetTrackingList() {
        return (this.trackingList!= null);
    }

    /**
     * Gets the value of the skuDeliveryTrackingList property.
     * 
     * @return
     *     possible object is
     *     {@link Delivery.SkuDeliveryTrackingList }
     *     
     */
    public Delivery.SkuDeliveryTrackingList getSkuDeliveryTrackingList() {
        return skuDeliveryTrackingList;
    }

    /**
     * Sets the value of the skuDeliveryTrackingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery.SkuDeliveryTrackingList }
     *     
     */
    public void setSkuDeliveryTrackingList(Delivery.SkuDeliveryTrackingList value) {
        this.skuDeliveryTrackingList = value;
    }

    public boolean isSetSkuDeliveryTrackingList() {
        return (this.skuDeliveryTrackingList!= null);
    }

    /**
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Freight }
     *     
     */
    public Freight getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Freight }
     *     
     */
    public void setFreightAmount(Freight value) {
        this.freightAmount = value;
    }

    public boolean isSetFreightAmount() {
        return (this.freightAmount!= null);
    }

    /**
     * Gets the value of the wareHouseId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWareHouseId() {
        return wareHouseId;
    }

    /**
     * Sets the value of the wareHouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWareHouseId(BigInteger value) {
        this.wareHouseId = value;
    }

    public boolean isSetWareHouseId() {
        return (this.wareHouseId!= null);
    }

    /**
     * Gets the value of the wareHouseCNPJ property.
     * 
     */
    public long getWareHouseCNPJ() {
        return wareHouseCNPJ;
    }

    /**
     * Sets the value of the wareHouseCNPJ property.
     * 
     */
    public void setWareHouseCNPJ(long value) {
        this.wareHouseCNPJ = value;
    }

    public boolean isSetWareHouseCNPJ() {
        return true;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    public boolean isSetInvoiceNumber() {
        return (this.invoiceNumber!= null);
    }

    /**
     * Gets the value of the invoiceSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSeries() {
        return invoiceSeries;
    }

    /**
     * Sets the value of the invoiceSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSeries(String value) {
        this.invoiceSeries = value;
    }

    public boolean isSetInvoiceSeries() {
        return (this.invoiceSeries!= null);
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    public boolean isSetCarrierCode() {
        return (this.carrierCode!= null);
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDeliveryAddress(Address value) {
        this.deliveryAddress = value;
    }

    public boolean isSetDeliveryAddress() {
        return (this.deliveryAddress!= null);
    }

    /**
     * Gets the value of the scheduledPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledPeriod() {
        return scheduledPeriod;
    }

    /**
     * Sets the value of the scheduledPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledPeriod(String value) {
        this.scheduledPeriod = value;
    }

    public boolean isSetScheduledPeriod() {
        return (this.scheduledPeriod!= null);
    }

    /**
     * Gets the value of the scheduledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDate() {
        return scheduledDate;
    }

    /**
     * Sets the value of the scheduledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDate(XMLGregorianCalendar value) {
        this.scheduledDate = value;
    }

    public boolean isSetScheduledDate() {
        return (this.scheduledDate!= null);
    }

    /**
     * Gets the value of the deliveryPropertyList property.
     * 
     * @return
     *     possible object is
     *     {@link Delivery.DeliveryPropertyList }
     *     
     */
    public Delivery.DeliveryPropertyList getDeliveryPropertyList() {
        return deliveryPropertyList;
    }

    /**
     * Sets the value of the deliveryPropertyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery.DeliveryPropertyList }
     *     
     */
    public void setDeliveryPropertyList(Delivery.DeliveryPropertyList value) {
        this.deliveryPropertyList = value;
    }

    public boolean isSetDeliveryPropertyList() {
        return (this.deliveryPropertyList!= null);
    }

    /**
     * Gets the value of the slotInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SlotInfo }
     *     
     */
    public SlotInfo getSlotInfo() {
        return slotInfo;
    }

    /**
     * Sets the value of the slotInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotInfo }
     *     
     */
    public void setSlotInfo(SlotInfo value) {
        this.slotInfo = value;
    }

    public boolean isSetSlotInfo() {
        return (this.slotInfo!= null);
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
     *         &lt;element name="deliveryProperty" type="{http://www.accurate.com/acec/order}deliveryProperty" maxOccurs="unbounded"/>
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
        "deliveryProperty"
    })
    public static class DeliveryPropertyList
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<DeliveryProperty> deliveryProperty;

        /**
         * Gets the value of the deliveryProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deliveryProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeliveryProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeliveryProperty }
         * 
         * 
         */
        public List<DeliveryProperty> getDeliveryProperty() {
            if (deliveryProperty == null) {
                deliveryProperty = new ArrayList<DeliveryProperty>();
            }
            return this.deliveryProperty;
        }

        public boolean isSetDeliveryProperty() {
            return ((this.deliveryProperty!= null)&&(!this.deliveryProperty.isEmpty()));
        }

        public void unsetDeliveryProperty() {
            this.deliveryProperty = null;
        }

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
     *         &lt;element name="orderLine" type="{http://www.accurate.com/acec/order}orderLine" maxOccurs="unbounded"/>
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
        "orderLine"
    })
    public static class OrderLineList
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<OrderLine> orderLine;

        /**
         * Gets the value of the orderLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderLine }
         * 
         * 
         */
        public List<OrderLine> getOrderLine() {
            if (orderLine == null) {
                orderLine = new ArrayList<OrderLine>();
            }
            return this.orderLine;
        }

        public boolean isSetOrderLine() {
            return ((this.orderLine!= null)&&(!this.orderLine.isEmpty()));
        }

        public void unsetOrderLine() {
            this.orderLine = null;
        }

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
     *         &lt;element name="skuDeliveryTracking" type="{http://www.accurate.com/acec/order}skuDeliveryTracking" maxOccurs="unbounded"/>
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
        "skuDeliveryTracking"
    })
    public static class SkuDeliveryTrackingList
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<SkuDeliveryTracking> skuDeliveryTracking;

        /**
         * Gets the value of the skuDeliveryTracking property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the skuDeliveryTracking property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSkuDeliveryTracking().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SkuDeliveryTracking }
         * 
         * 
         */
        public List<SkuDeliveryTracking> getSkuDeliveryTracking() {
            if (skuDeliveryTracking == null) {
                skuDeliveryTracking = new ArrayList<SkuDeliveryTracking>();
            }
            return this.skuDeliveryTracking;
        }

        public boolean isSetSkuDeliveryTracking() {
            return ((this.skuDeliveryTracking!= null)&&(!this.skuDeliveryTracking.isEmpty()));
        }

        public void unsetSkuDeliveryTracking() {
            this.skuDeliveryTracking = null;
        }

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
     *         &lt;element name="tracking" type="{http://www.accurate.com/acec/order}tracking" maxOccurs="unbounded"/>
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
        "tracking"
    })
    public static class TrackingList
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<Tracking> tracking;

        /**
         * Gets the value of the tracking property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tracking property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTracking().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tracking }
         * 
         * 
         */
        public List<Tracking> getTracking() {
            if (tracking == null) {
                tracking = new ArrayList<Tracking>();
            }
            return this.tracking;
        }

        public boolean isSetTracking() {
            return ((this.tracking!= null)&&(!this.tracking.isEmpty()));
        }

        public void unsetTracking() {
            this.tracking = null;
        }

    }

}
