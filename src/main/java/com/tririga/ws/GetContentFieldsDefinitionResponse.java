
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.content.ArrayOfContentField;


/**
 * <p>Java class for getContentFieldsDefinitionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getContentFieldsDefinitionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contentFields" type="{http://content.dto.ws.tririga.com}ArrayOfContentField"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContentFieldsDefinitionResponse", propOrder = {
    "contentFields"
})
public class GetContentFieldsDefinitionResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContentField contentFields;

    /**
     * Gets the value of the contentFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContentField }
     *     
     */
    public ArrayOfContentField getContentFields() {
        return contentFields;
    }

    /**
     * Sets the value of the contentFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContentField }
     *     
     */
    public void setContentFields(ArrayOfContentField value) {
        this.contentFields = value;
    }

}
