
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCurrencyConversionRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCurrencyConversionRates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conversionRateIds" type="{http://ws.tririga.com}ArrayOfLong"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCurrencyConversionRates", propOrder = {
    "conversionRateIds"
})
public class DeleteCurrencyConversionRates {

    @XmlElement(required = true)
    protected ArrayOfLong conversionRateIds;

    /**
     * Gets the value of the conversionRateIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getConversionRateIds() {
        return conversionRateIds;
    }

    /**
     * Sets the value of the conversionRateIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setConversionRateIds(ArrayOfLong value) {
        this.conversionRateIds = value;
    }

}
