
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.gui.GUI;


/**
 * <p>Java class for getDefaultGUIResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDefaultGUIResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://gui.dto.ws.tririga.com}GUI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDefaultGUIResponse", propOrder = {
    "out"
})
public class GetDefaultGUIResponse {

    protected GUI out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link GUI }
     *     
     */
    public GUI getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link GUI }
     *     
     */
    public void setOut(GUI value) {
        this.out = value;
    }

}
