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
 * <p>Java class for deliveryProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryPropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryPropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryProperty", propOrder = {
    "deliveryPropertyId",
    "deliveryPropertyValue"
})
public class DeliveryProperty
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String deliveryPropertyId;
    @XmlElement(required = true)
    protected String deliveryPropertyValue;

    /**
     * Gets the value of the deliveryPropertyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPropertyId() {
        return deliveryPropertyId;
    }

    /**
     * Sets the value of the deliveryPropertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPropertyId(String value) {
        this.deliveryPropertyId = value;
    }

    public boolean isSetDeliveryPropertyId() {
        return (this.deliveryPropertyId!= null);
    }

    /**
     * Gets the value of the deliveryPropertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPropertyValue() {
        return deliveryPropertyValue;
    }

    /**
     * Sets the value of the deliveryPropertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPropertyValue(String value) {
        this.deliveryPropertyValue = value;
    }

    public boolean isSetDeliveryPropertyValue() {
        return (this.deliveryPropertyValue!= null);
    }

}
