
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfCurrencyConversionRate;


/**
 * <p>Java class for putCurrencyConversionRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="putCurrencyConversionRates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrencyConversionRates" type="{http://dto.ws.tririga.com}ArrayOfCurrencyConversionRate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putCurrencyConversionRates", propOrder = {
    "currencyConversionRates"
})
public class PutCurrencyConversionRates {

    @XmlElement(name = "CurrencyConversionRates", required = true)
    protected ArrayOfCurrencyConversionRate currencyConversionRates;

    /**
     * Gets the value of the currencyConversionRates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrencyConversionRate }
     *     
     */
    public ArrayOfCurrencyConversionRate getCurrencyConversionRates() {
        return currencyConversionRates;
    }

    /**
     * Sets the value of the currencyConversionRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrencyConversionRate }
     *     
     */
    public void setCurrencyConversionRates(ArrayOfCurrencyConversionRate value) {
        this.currencyConversionRates = value;
    }

}
