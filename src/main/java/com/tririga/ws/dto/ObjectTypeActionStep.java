
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectTypeActionStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectTypeActionStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeActionSteps" type="{http://dto.ws.tririga.com}ArrayOfObjectTypeActionStep" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectTypeActionStep", propOrder = {
    "action",
    "actionId",
    "label",
    "objectTypeActionSteps"
})
public class ObjectTypeActionStep {

    @XmlElement(nillable = true)
    protected String action;
    protected Long actionId;
    @XmlElement(nillable = true)
    protected String label;
    @XmlElement(nillable = true)
    protected ArrayOfObjectTypeActionStep objectTypeActionSteps;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the actionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * Sets the value of the actionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActionId(Long value) {
        this.actionId = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the objectTypeActionSteps property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectTypeActionStep }
     *     
     */
    public ArrayOfObjectTypeActionStep getObjectTypeActionSteps() {
        return objectTypeActionSteps;
    }

    /**
     * Sets the value of the objectTypeActionSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectTypeActionStep }
     *     
     */
    public void setObjectTypeActionSteps(ArrayOfObjectTypeActionStep value) {
        this.objectTypeActionSteps = value;
    }

}
