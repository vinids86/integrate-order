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
 * Pedido
 * 
 * <p>Java class for order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="totalDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="totalLoyaltyCreditEarningAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="partnerOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="visitorIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visitorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesOperatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesOperatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shopId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NORMAL"/>
 *               &lt;enumeration value="PRESENT"/>
 *               &lt;enumeration value="OTHER"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="brandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderMasterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveries" type="{http://www.accurate.com/acec/order}deliveries"/>
 *         &lt;element name="orderPropertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orderProperty" type="{http://www.accurate.com/acec/order}orderProperty" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customer" type="{http://www.accurate.com/acec/order}customer"/>
 *         &lt;element name="billingAddress" type="{http://www.accurate.com/acec/order}address"/>
 *         &lt;element name="paymentList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="payment" type="{http://www.accurate.com/acec/order}payment" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="freightChargedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="freightActualAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="freightCommercialAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="countDistinctSku" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="orderOwnerTp" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="shopInfo" type="{http://www.accurate.com/acec/order}shopInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = {
    "orderId",
    "customerId",
    "partnerId",
    "totalAmount",
    "totalDiscountAmount",
    "totalLoyaltyCreditEarningAmount",
    "partnerOrderId",
    "purchaseDate",
    "visitorIp",
    "visitorId",
    "salesOperatorId",
    "salesOperatorName",
    "sessionCreationDate",
    "applicationVersion",
    "listId",
    "saleChannel",
    "shopId",
    "leader",
    "orderType",
    "brandId",
    "storeId",
    "orderMasterId",
    "deliveries",
    "orderPropertyList",
    "customer",
    "billingAddress",
    "paymentList",
    "freightChargedAmount",
    "freightActualAmount",
    "freightCommercialAmount",
    "countDistinctSku",
    "orderOwnerTp",
    "shopInfo"
})
public class Order
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String orderId;
    @XmlElement(required = true)
    protected String customerId;
    protected String partnerId;
    @XmlElement(required = true)
    protected BigDecimal totalAmount;
    @XmlElement(required = true)
    protected BigDecimal totalDiscountAmount;
    @XmlElement(required = true)
    protected BigDecimal totalLoyaltyCreditEarningAmount;
    protected String partnerOrderId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchaseDate;
    @XmlElement(required = true)
    protected String visitorIp;
    protected String visitorId;
    protected String salesOperatorId;
    protected String salesOperatorName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sessionCreationDate;
    protected String applicationVersion;
    protected String listId;
    @XmlElement(required = true)
    protected String saleChannel;
    @XmlElement(required = true)
    protected String shopId;
    @XmlElement(required = true)
    protected String leader;
    @XmlElement(required = true)
    protected String orderType;
    protected String brandId;
    protected String storeId;
    protected String orderMasterId;
    @XmlElement(required = true)
    protected Deliveries deliveries;
    protected Order.OrderPropertyList orderPropertyList;
    @XmlElement(required = true)
    protected Customer customer;
    @XmlElement(required = true)
    protected Address billingAddress;
    @XmlElement(required = true)
    protected Order.PaymentList paymentList;
    protected BigDecimal freightChargedAmount;
    protected BigDecimal freightActualAmount;
    protected BigDecimal freightCommercialAmount;
    protected BigInteger countDistinctSku;
    protected BigInteger orderOwnerTp;
    protected ShopInfo shopInfo;

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
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    public boolean isSetCustomerId() {
        return (this.customerId!= null);
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    public boolean isSetPartnerId() {
        return (this.partnerId!= null);
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
     * Gets the value of the partnerOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    /**
     * Sets the value of the partnerOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerOrderId(String value) {
        this.partnerOrderId = value;
    }

    public boolean isSetPartnerOrderId() {
        return (this.partnerOrderId!= null);
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseDate(XMLGregorianCalendar value) {
        this.purchaseDate = value;
    }

    public boolean isSetPurchaseDate() {
        return (this.purchaseDate!= null);
    }

    /**
     * Gets the value of the visitorIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitorIp() {
        return visitorIp;
    }

    /**
     * Sets the value of the visitorIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitorIp(String value) {
        this.visitorIp = value;
    }

    public boolean isSetVisitorIp() {
        return (this.visitorIp!= null);
    }

    /**
     * Gets the value of the visitorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitorId() {
        return visitorId;
    }

    /**
     * Sets the value of the visitorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitorId(String value) {
        this.visitorId = value;
    }

    public boolean isSetVisitorId() {
        return (this.visitorId!= null);
    }

    /**
     * Gets the value of the salesOperatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOperatorId() {
        return salesOperatorId;
    }

    /**
     * Sets the value of the salesOperatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOperatorId(String value) {
        this.salesOperatorId = value;
    }

    public boolean isSetSalesOperatorId() {
        return (this.salesOperatorId!= null);
    }

    /**
     * Gets the value of the salesOperatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOperatorName() {
        return salesOperatorName;
    }

    /**
     * Sets the value of the salesOperatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOperatorName(String value) {
        this.salesOperatorName = value;
    }

    public boolean isSetSalesOperatorName() {
        return (this.salesOperatorName!= null);
    }

    /**
     * Gets the value of the sessionCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionCreationDate() {
        return sessionCreationDate;
    }

    /**
     * Sets the value of the sessionCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionCreationDate(XMLGregorianCalendar value) {
        this.sessionCreationDate = value;
    }

    public boolean isSetSessionCreationDate() {
        return (this.sessionCreationDate!= null);
    }

    /**
     * Gets the value of the applicationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * Sets the value of the applicationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationVersion(String value) {
        this.applicationVersion = value;
    }

    public boolean isSetApplicationVersion() {
        return (this.applicationVersion!= null);
    }

    /**
     * Gets the value of the listId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListId(String value) {
        this.listId = value;
    }

    public boolean isSetListId() {
        return (this.listId!= null);
    }

    /**
     * Gets the value of the saleChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleChannel() {
        return saleChannel;
    }

    /**
     * Sets the value of the saleChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleChannel(String value) {
        this.saleChannel = value;
    }

    public boolean isSetSaleChannel() {
        return (this.saleChannel!= null);
    }

    /**
     * Gets the value of the shopId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * Sets the value of the shopId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopId(String value) {
        this.shopId = value;
    }

    public boolean isSetShopId() {
        return (this.shopId!= null);
    }

    /**
     * Gets the value of the leader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeader() {
        return leader;
    }

    /**
     * Sets the value of the leader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeader(String value) {
        this.leader = value;
    }

    public boolean isSetLeader() {
        return (this.leader!= null);
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    public boolean isSetOrderType() {
        return (this.orderType!= null);
    }

    /**
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    public boolean isSetBrandId() {
        return (this.brandId!= null);
    }

    /**
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreId(String value) {
        this.storeId = value;
    }

    public boolean isSetStoreId() {
        return (this.storeId!= null);
    }

    /**
     * Gets the value of the orderMasterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderMasterId() {
        return orderMasterId;
    }

    /**
     * Sets the value of the orderMasterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderMasterId(String value) {
        this.orderMasterId = value;
    }

    public boolean isSetOrderMasterId() {
        return (this.orderMasterId!= null);
    }

    /**
     * Gets the value of the deliveries property.
     * 
     * @return
     *     possible object is
     *     {@link Deliveries }
     *     
     */
    public Deliveries getDeliveries() {
        return deliveries;
    }

    /**
     * Sets the value of the deliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deliveries }
     *     
     */
    public void setDeliveries(Deliveries value) {
        this.deliveries = value;
    }

    public boolean isSetDeliveries() {
        return (this.deliveries!= null);
    }

    /**
     * Gets the value of the orderPropertyList property.
     * 
     * @return
     *     possible object is
     *     {@link Order.OrderPropertyList }
     *     
     */
    public Order.OrderPropertyList getOrderPropertyList() {
        return orderPropertyList;
    }

    /**
     * Sets the value of the orderPropertyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.OrderPropertyList }
     *     
     */
    public void setOrderPropertyList(Order.OrderPropertyList value) {
        this.orderPropertyList = value;
    }

    public boolean isSetOrderPropertyList() {
        return (this.orderPropertyList!= null);
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    public boolean isSetCustomer() {
        return (this.customer!= null);
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

    public boolean isSetBillingAddress() {
        return (this.billingAddress!= null);
    }

    /**
     * Gets the value of the paymentList property.
     * 
     * @return
     *     possible object is
     *     {@link Order.PaymentList }
     *     
     */
    public Order.PaymentList getPaymentList() {
        return paymentList;
    }

    /**
     * Sets the value of the paymentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.PaymentList }
     *     
     */
    public void setPaymentList(Order.PaymentList value) {
        this.paymentList = value;
    }

    public boolean isSetPaymentList() {
        return (this.paymentList!= null);
    }

    /**
     * Gets the value of the freightChargedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreightChargedAmount() {
        return freightChargedAmount;
    }

    /**
     * Sets the value of the freightChargedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreightChargedAmount(BigDecimal value) {
        this.freightChargedAmount = value;
    }

    public boolean isSetFreightChargedAmount() {
        return (this.freightChargedAmount!= null);
    }

    /**
     * Gets the value of the freightActualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreightActualAmount() {
        return freightActualAmount;
    }

    /**
     * Sets the value of the freightActualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreightActualAmount(BigDecimal value) {
        this.freightActualAmount = value;
    }

    public boolean isSetFreightActualAmount() {
        return (this.freightActualAmount!= null);
    }

    /**
     * Gets the value of the freightCommercialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreightCommercialAmount() {
        return freightCommercialAmount;
    }

    /**
     * Sets the value of the freightCommercialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreightCommercialAmount(BigDecimal value) {
        this.freightCommercialAmount = value;
    }

    public boolean isSetFreightCommercialAmount() {
        return (this.freightCommercialAmount!= null);
    }

    /**
     * Gets the value of the countDistinctSku property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountDistinctSku() {
        return countDistinctSku;
    }

    /**
     * Sets the value of the countDistinctSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountDistinctSku(BigInteger value) {
        this.countDistinctSku = value;
    }

    public boolean isSetCountDistinctSku() {
        return (this.countDistinctSku!= null);
    }

    /**
     * Gets the value of the orderOwnerTp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderOwnerTp() {
        return orderOwnerTp;
    }

    /**
     * Sets the value of the orderOwnerTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderOwnerTp(BigInteger value) {
        this.orderOwnerTp = value;
    }

    public boolean isSetOrderOwnerTp() {
        return (this.orderOwnerTp!= null);
    }

    /**
     * Gets the value of the shopInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ShopInfo }
     *     
     */
    public ShopInfo getShopInfo() {
        return shopInfo;
    }

    /**
     * Sets the value of the shopInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShopInfo }
     *     
     */
    public void setShopInfo(ShopInfo value) {
        this.shopInfo = value;
    }

    public boolean isSetShopInfo() {
        return (this.shopInfo!= null);
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
     *         &lt;element name="orderProperty" type="{http://www.accurate.com/acec/order}orderProperty" maxOccurs="unbounded"/>
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
        "orderProperty"
    })
    public static class OrderPropertyList
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<OrderProperty> orderProperty;

        /**
         * Gets the value of the orderProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderProperty }
         * 
         * 
         */
        public List<OrderProperty> getOrderProperty() {
            if (orderProperty == null) {
                orderProperty = new ArrayList<OrderProperty>();
            }
            return this.orderProperty;
        }

        public boolean isSetOrderProperty() {
            return ((this.orderProperty!= null)&&(!this.orderProperty.isEmpty()));
        }

        public void unsetOrderProperty() {
            this.orderProperty = null;
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
     *         &lt;element name="payment" type="{http://www.accurate.com/acec/order}payment" maxOccurs="unbounded"/>
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
        "payment"
    })
    public static class PaymentList
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<Payment> payment;

        /**
         * Gets the value of the payment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Payment }
         * 
         * 
         */
        public List<Payment> getPayment() {
            if (payment == null) {
                payment = new ArrayList<Payment>();
            }
            return this.payment;
        }

        public boolean isSetPayment() {
            return ((this.payment!= null)&&(!this.payment.isEmpty()));
        }

        public void unsetPayment() {
            this.payment = null;
        }

    }

}