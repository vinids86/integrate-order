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
 * <p>Java class for orderLineProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderLineProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderLinePropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderLinePropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderLineProperty", propOrder = {
    "orderLinePropertyId",
    "orderLinePropertyValue"
})
public class OrderLineProperty
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String orderLinePropertyId;
    @XmlElement(required = true)
    protected String orderLinePropertyValue;

    /**
     * Gets the value of the orderLinePropertyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLinePropertyId() {
        return orderLinePropertyId;
    }

    /**
     * Sets the value of the orderLinePropertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLinePropertyId(String value) {
        this.orderLinePropertyId = value;
    }

    public boolean isSetOrderLinePropertyId() {
        return (this.orderLinePropertyId!= null);
    }

    /**
     * Gets the value of the orderLinePropertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLinePropertyValue() {
        return orderLinePropertyValue;
    }

    /**
     * Sets the value of the orderLinePropertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLinePropertyValue(String value) {
        this.orderLinePropertyValue = value;
    }

    public boolean isSetOrderLinePropertyValue() {
        return (this.orderLinePropertyValue!= null);
    }

}