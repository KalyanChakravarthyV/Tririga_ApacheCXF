
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childBaseObjectTypes" type="{http://dto.ws.tririga.com}ArrayOfChildBaseObjectType" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseObjectType", propOrder = {
    "childBaseObjectTypes",
    "id",
    "name"
})
@XmlSeeAlso({
    HierarchyObjectType.class
})
public class BaseObjectType {

    @XmlElement(nillable = true)
    protected ArrayOfChildBaseObjectType childBaseObjectTypes;
    protected Long id;
    @XmlElement(nillable = true)
    protected String name;

    /**
     * Gets the value of the childBaseObjectTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChildBaseObjectType }
     *     
     */
    public ArrayOfChildBaseObjectType getChildBaseObjectTypes() {
        return childBaseObjectTypes;
    }

    /**
     * Sets the value of the childBaseObjectTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChildBaseObjectType }
     *     
     */
    public void setChildBaseObjectTypes(ArrayOfChildBaseObjectType value) {
        this.childBaseObjectTypes = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
