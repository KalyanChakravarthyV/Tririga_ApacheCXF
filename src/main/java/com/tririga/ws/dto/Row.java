
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Row complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Row"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fields" type="{http://dto.ws.tririga.com}ArrayOfField" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Row", propOrder = {
    "fields",
    "recordId"
})
public class Row {

    @XmlElement(nillable = true)
    protected ArrayOfField fields;
    protected Long recordId;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfField }
     *     
     */
    public ArrayOfField getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfField }
     *     
     */
    public void setFields(ArrayOfField value) {
        this.fields = value;
    }

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordId(Long value) {
        this.recordId = value;
    }

}
