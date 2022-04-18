
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfBaseObjectType;


/**
 * <p>Java class for getObjectTypeListByModuleNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getObjectTypeListByModuleNameResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}ArrayOfBaseObjectType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getObjectTypeListByModuleNameResponse", propOrder = {
    "out"
})
public class GetObjectTypeListByModuleNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfBaseObjectType out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseObjectType }
     *     
     */
    public ArrayOfBaseObjectType getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseObjectType }
     *     
     */
    public void setOut(ArrayOfBaseObjectType value) {
        this.out = value;
    }

}
