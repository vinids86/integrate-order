//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.26 at 05:00:48 AM BRT 
//


package com.accurate.acec.order;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shopInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shopInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shopId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shopCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacyShopId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shopName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shopService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shopInfo", propOrder = {
    "shopId",
    "shopCode",
    "legacyShopId",
    "shopName",
    "shopService",
    "classification",
    "state"
})
public class ShopInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String shopId;
    @XmlElement(required = true)
    protected String shopCode;
    @XmlElement(required = true)
    protected String legacyShopId;
    @XmlElement(required = true)
    protected String shopName;
    @XmlElement(required = true)
    protected String shopService;
    @XmlElement(required = true)
    protected String classification;
    @XmlElement(required = true)
    protected String state;

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
     * Gets the value of the shopCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopCode() {
        return shopCode;
    }

    /**
     * Sets the value of the shopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopCode(String value) {
        this.shopCode = value;
    }

    public boolean isSetShopCode() {
        return (this.shopCode!= null);
    }

    /**
     * Gets the value of the legacyShopId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyShopId() {
        return legacyShopId;
    }

    /**
     * Sets the value of the legacyShopId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyShopId(String value) {
        this.legacyShopId = value;
    }

    public boolean isSetLegacyShopId() {
        return (this.legacyShopId!= null);
    }

    /**
     * Gets the value of the shopName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * Sets the value of the shopName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopName(String value) {
        this.shopName = value;
    }

    public boolean isSetShopName() {
        return (this.shopName!= null);
    }

    /**
     * Gets the value of the shopService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopService() {
        return shopService;
    }

    /**
     * Sets the value of the shopService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopService(String value) {
        this.shopService = value;
    }

    public boolean isSetShopService() {
        return (this.shopService!= null);
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    public boolean isSetClassification() {
        return (this.classification!= null);
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    public boolean isSetState() {
        return (this.state!= null);
    }

}
