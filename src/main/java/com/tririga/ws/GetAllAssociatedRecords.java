
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllAssociatedRecords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllAssociatedRecords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordIds" type="{http://ws.tririga.com}ArrayOfLong"/&gt;
 *         &lt;element name="associationString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllAssociatedRecords", propOrder = {
    "recordIds",
    "associationString",
    "maxResults"
})
public class GetAllAssociatedRecords {

    @XmlElement(required = true)
    protected ArrayOfLong recordIds;
    protected String associationString;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxResults;

    /**
     * Gets the value of the recordIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getRecordIds() {
        return recordIds;
    }

    /**
     * Sets the value of the recordIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setRecordIds(ArrayOfLong value) {
        this.recordIds = value;
    }

    /**
     * Gets the value of the associationString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationString() {
        return associationString;
    }

    /**
     * Sets the value of the associationString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationString(String value) {
        this.associationString = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

}
