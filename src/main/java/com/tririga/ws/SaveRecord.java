
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfIntegrationRecord;


/**
 * <p>Java class for saveRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntegrationRecords" type="{http://dto.ws.tririga.com}ArrayOfIntegrationRecord"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveRecord", propOrder = {
    "integrationRecords"
})
public class SaveRecord {

    @XmlElement(name = "IntegrationRecords", required = true)
    protected ArrayOfIntegrationRecord integrationRecords;

    /**
     * Gets the value of the integrationRecords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntegrationRecord }
     *     
     */
    public ArrayOfIntegrationRecord getIntegrationRecords() {
        return integrationRecords;
    }

    /**
     * Sets the value of the integrationRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntegrationRecord }
     *     
     */
    public void setIntegrationRecords(ArrayOfIntegrationRecord value) {
        this.integrationRecords = value;
    }

}
