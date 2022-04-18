
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedFormulaParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedFormulaParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associationChain" type="{http://dto.ws.tririga.com}ArrayOfAssociationDefinition" minOccurs="0"/&gt;
 *         &lt;element name="fieldKey" type="{http://dto.ws.tririga.com}FieldKey" minOccurs="0"/&gt;
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
@XmlType(name = "ExtendedFormulaParam", propOrder = {
    "associationChain",
    "fieldKey",
    "name"
})
public class ExtendedFormulaParam {

    @XmlElement(nillable = true)
    protected ArrayOfAssociationDefinition associationChain;
    @XmlElement(nillable = true)
    protected FieldKey fieldKey;
    @XmlElement(nillable = true)
    protected String name;

    /**
     * Gets the value of the associationChain property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssociationDefinition }
     *     
     */
    public ArrayOfAssociationDefinition getAssociationChain() {
        return associationChain;
    }

    /**
     * Sets the value of the associationChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssociationDefinition }
     *     
     */
    public void setAssociationChain(ArrayOfAssociationDefinition value) {
        this.associationChain = value;
    }

    /**
     * Gets the value of the fieldKey property.
     * 
     * @return
     *     possible object is
     *     {@link FieldKey }
     *     
     */
    public FieldKey getFieldKey() {
        return fieldKey;
    }

    /**
     * Sets the value of the fieldKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldKey }
     *     
     */
    public void setFieldKey(FieldKey value) {
        this.fieldKey = value;
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
