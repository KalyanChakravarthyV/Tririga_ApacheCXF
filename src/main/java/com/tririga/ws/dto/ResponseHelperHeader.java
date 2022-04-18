
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseHelperHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHelperHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anyFailed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="failed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="responseHelpers" type="{http://dto.ws.tririga.com}ArrayOfResponseHelper" minOccurs="0"/&gt;
 *         &lt;element name="successful" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHelperHeader", propOrder = {
    "anyFailed",
    "failed",
    "responseHelpers",
    "successful",
    "total"
})
public class ResponseHelperHeader {

    protected Boolean anyFailed;
    protected Integer failed;
    @XmlElement(nillable = true)
    protected ArrayOfResponseHelper responseHelpers;
    protected Integer successful;
    protected Integer total;

    /**
     * Gets the value of the anyFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnyFailed() {
        return anyFailed;
    }

    /**
     * Sets the value of the anyFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnyFailed(Boolean value) {
        this.anyFailed = value;
    }

    /**
     * Gets the value of the failed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailed() {
        return failed;
    }

    /**
     * Sets the value of the failed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailed(Integer value) {
        this.failed = value;
    }

    /**
     * Gets the value of the responseHelpers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponseHelper }
     *     
     */
    public ArrayOfResponseHelper getResponseHelpers() {
        return responseHelpers;
    }

    /**
     * Sets the value of the responseHelpers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponseHelper }
     *     
     */
    public void setResponseHelpers(ArrayOfResponseHelper value) {
        this.responseHelpers = value;
    }

    /**
     * Gets the value of the successful property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessful(Integer value) {
        this.successful = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

}
