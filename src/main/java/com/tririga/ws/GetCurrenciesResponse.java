
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfCurrency;


/**
 * <p>Java class for getCurrenciesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCurrenciesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}ArrayOfCurrency"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrenciesResponse", propOrder = {
    "out"
})
public class GetCurrenciesResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCurrency out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrency }
     *     
     */
    public ArrayOfCurrency getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrency }
     *     
     */
    public void setOut(ArrayOfCurrency value) {
        this.out = value;
    }

}
