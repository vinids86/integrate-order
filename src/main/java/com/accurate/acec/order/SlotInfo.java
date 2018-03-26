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


/**
 * <p>Java class for slotInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="slotInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="slotId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pickupStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="pickupEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="chargedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="promotion" type="{http://www.accurate.com/acec/order}promotion" maxOccurs="unbounded"/>
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
@XmlType(name = "slotInfo", propOrder = {
    "slotId",
    "pickupStartDate",
    "pickupEndDate",
    "actualAmount",
    "chargedAmount",
    "name",
    "sourceName",
    "promotionList"
})
public class SlotInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String slotId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupEndDate;
    protected Double actualAmount;
    protected Double chargedAmount;
    protected String name;
    protected String sourceName;
    protected SlotInfo.PromotionList promotionList;

    /**
     * Gets the value of the slotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotId() {
        return slotId;
    }

    /**
     * Sets the value of the slotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotId(String value) {
        this.slotId = value;
    }

    public boolean isSetSlotId() {
        return (this.slotId!= null);
    }

    /**
     * Gets the value of the pickupStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupStartDate() {
        return pickupStartDate;
    }

    /**
     * Sets the value of the pickupStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupStartDate(XMLGregorianCalendar value) {
        this.pickupStartDate = value;
    }

    public boolean isSetPickupStartDate() {
        return (this.pickupStartDate!= null);
    }

    /**
     * Gets the value of the pickupEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupEndDate() {
        return pickupEndDate;
    }

    /**
     * Sets the value of the pickupEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupEndDate(XMLGregorianCalendar value) {
        this.pickupEndDate = value;
    }

    public boolean isSetPickupEndDate() {
        return (this.pickupEndDate!= null);
    }

    /**
     * Gets the value of the actualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualAmount() {
        return actualAmount;
    }

    /**
     * Sets the value of the actualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualAmount(Double value) {
        this.actualAmount = value;
    }

    public boolean isSetActualAmount() {
        return (this.actualAmount!= null);
    }

    /**
     * Gets the value of the chargedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChargedAmount() {
        return chargedAmount;
    }

    /**
     * Sets the value of the chargedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChargedAmount(Double value) {
        this.chargedAmount = value;
    }

    public boolean isSetChargedAmount() {
        return (this.chargedAmount!= null);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    public boolean isSetSourceName() {
        return (this.sourceName!= null);
    }

    /**
     * Gets the value of the promotionList property.
     * 
     * @return
     *     possible object is
     *     {@link SlotInfo.PromotionList }
     *     
     */
    public SlotInfo.PromotionList getPromotionList() {
        return promotionList;
    }

    /**
     * Sets the value of the promotionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotInfo.PromotionList }
     *     
     */
    public void setPromotionList(SlotInfo.PromotionList value) {
        this.promotionList = value;
    }

    public boolean isSetPromotionList() {
        return (this.promotionList!= null);
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
     *         &lt;element name="promotion" type="{http://www.accurate.com/acec/order}promotion" maxOccurs="unbounded"/>
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
        "promotion"
    })
    public static class PromotionList
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(required = true)
        protected List<Promotion> promotion;

        /**
         * Gets the value of the promotion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Promotion }
         * 
         * 
         */
        public List<Promotion> getPromotion() {
            if (promotion == null) {
                promotion = new ArrayList<Promotion>();
            }
            return this.promotion;
        }

        public boolean isSetPromotion() {
            return ((this.promotion!= null)&&(!this.promotion.isEmpty()));
        }

        public void unsetPromotion() {
            this.promotion = null;
        }

    }

}
