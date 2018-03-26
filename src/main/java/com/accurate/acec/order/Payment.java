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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.accurate.com/acec/order}abstractPayment"/>
 *         &lt;element ref="{http://www.accurate.com/acec/order}creditCardPayment"/>
 *         &lt;element ref="{http://www.accurate.com/acec/order}cieloPayment"/>
 *         &lt;element ref="{http://www.accurate.com/acec/order}sipsPayment"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment", propOrder = {
    "abstractPayment",
    "creditCardPayment",
    "cieloPayment",
    "sipsPayment"
})
public class Payment
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AbstractPayment abstractPayment;
    protected CreditCardPayment creditCardPayment;
    protected CieloPayment cieloPayment;
    protected SipsPayment sipsPayment;

    /**
     * Gets the value of the abstractPayment property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPayment }
     *     
     */
    public AbstractPayment getAbstractPayment() {
        return abstractPayment;
    }

    /**
     * Sets the value of the abstractPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPayment }
     *     
     */
    public void setAbstractPayment(AbstractPayment value) {
        this.abstractPayment = value;
    }

    public boolean isSetAbstractPayment() {
        return (this.abstractPayment!= null);
    }

    /**
     * Gets the value of the creditCardPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardPayment }
     *     
     */
    public CreditCardPayment getCreditCardPayment() {
        return creditCardPayment;
    }

    /**
     * Sets the value of the creditCardPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardPayment }
     *     
     */
    public void setCreditCardPayment(CreditCardPayment value) {
        this.creditCardPayment = value;
    }

    public boolean isSetCreditCardPayment() {
        return (this.creditCardPayment!= null);
    }

    /**
     * Gets the value of the cieloPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CieloPayment }
     *     
     */
    public CieloPayment getCieloPayment() {
        return cieloPayment;
    }

    /**
     * Sets the value of the cieloPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CieloPayment }
     *     
     */
    public void setCieloPayment(CieloPayment value) {
        this.cieloPayment = value;
    }

    public boolean isSetCieloPayment() {
        return (this.cieloPayment!= null);
    }

    /**
     * Gets the value of the sipsPayment property.
     * 
     * @return
     *     possible object is
     *     {@link SipsPayment }
     *     
     */
    public SipsPayment getSipsPayment() {
        return sipsPayment;
    }

    /**
     * Sets the value of the sipsPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SipsPayment }
     *     
     */
    public void setSipsPayment(SipsPayment value) {
        this.sipsPayment = value;
    }

    public boolean isSetSipsPayment() {
        return (this.sipsPayment!= null);
    }

}