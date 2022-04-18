
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.gui.ArrayOfGUI;


/**
 * <p>Java class for getGUIsByNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGUIsByNameResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://gui.dto.ws.tririga.com}ArrayOfGUI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGUIsByNameResponse", propOrder = {
    "out"
})
public class GetGUIsByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfGUI out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGUI }
     *     
     */
    public ArrayOfGUI getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGUI }
     *     
     */
    public void setOut(ArrayOfGUI value) {
        this.out = value;
    }

}
