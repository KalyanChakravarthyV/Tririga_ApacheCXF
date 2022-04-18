
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}Section"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordFields" type="{http://dto.ws.tririga.com}ArrayOfRecordField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordSection", propOrder = {
    "recordFields"
})
public class RecordSection
    extends Section
{

    @XmlElement(nillable = true)
    protected ArrayOfRecordField recordFields;

    /**
     * Gets the value of the recordFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecordField }
     *     
     */
    public ArrayOfRecordField getRecordFields() {
        return recordFields;
    }

    /**
     * Sets the value of the recordFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecordField }
     *     
     */
    public void setRecordFields(ArrayOfRecordField value) {
        this.recordFields = value;
    }

}
