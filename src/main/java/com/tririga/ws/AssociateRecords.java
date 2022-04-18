
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfAssociation;


/**
 * <p>Java class for associateRecords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="associateRecords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Associations" type="{http://dto.ws.tririga.com}ArrayOfAssociation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "associateRecords", propOrder = {
    "associations"
})
public class AssociateRecords {

    @XmlElement(name = "Associations", required = true)
    protected ArrayOfAssociation associations;

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssociation }
     *     
     */
    public ArrayOfAssociation getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssociation }
     *     
     */
    public void setAssociations(ArrayOfAssociation value) {
        this.associations = value;
    }

}
