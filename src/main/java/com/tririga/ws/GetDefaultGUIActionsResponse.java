
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfTransition;


/**
 * <p>Java class for getDefaultGUIActionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDefaultGUIActionsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}ArrayOfTransition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDefaultGUIActionsResponse", propOrder = {
    "out"
})
public class GetDefaultGUIActionsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTransition out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransition }
     *     
     */
    public ArrayOfTransition getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransition }
     *     
     */
    public void setOut(ArrayOfTransition value) {
        this.out = value;
    }

}
