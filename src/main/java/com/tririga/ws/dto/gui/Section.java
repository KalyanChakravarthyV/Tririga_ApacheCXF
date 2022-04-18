
package com.tririga.ws.dto.gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Section complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Section"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fields" type="{http://gui.dto.ws.tririga.com}ArrayOfField" minOccurs="0"/&gt;
 *         &lt;element name="guiSectionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="guiSectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="refModuleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="refObjectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rows" type="{http://gui.dto.ws.tririga.com}ArrayOfGuiRow" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Section", propOrder = {
    "fields",
    "guiSectionId",
    "guiSectionName",
    "id",
    "label",
    "name",
    "readOnly",
    "refModuleId",
    "refObjectTypeId",
    "rows",
    "type",
    "typeId",
    "visible"
})
public class Section {

    @XmlElement(nillable = true)
    protected ArrayOfField fields;
    protected Long guiSectionId;
    @XmlElement(nillable = true)
    protected String guiSectionName;
    protected Long id;
    @XmlElement(nillable = true)
    protected String label;
    @XmlElement(nillable = true)
    protected String name;
    protected Boolean readOnly;
    protected Long refModuleId;
    protected Long refObjectTypeId;
    @XmlElement(nillable = true)
    protected ArrayOfGuiRow rows;
    @XmlElement(nillable = true)
    protected String type;
    protected Integer typeId;
    protected Boolean visible;

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
     * Gets the value of the guiSectionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuiSectionId() {
        return guiSectionId;
    }

    /**
     * Sets the value of the guiSectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuiSectionId(Long value) {
        this.guiSectionId = value;
    }

    /**
     * Gets the value of the guiSectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiSectionName() {
        return guiSectionName;
    }

    /**
     * Sets the value of the guiSectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiSectionName(String value) {
        this.guiSectionName = value;
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

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the refModuleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefModuleId() {
        return refModuleId;
    }

    /**
     * Sets the value of the refModuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefModuleId(Long value) {
        this.refModuleId = value;
    }

    /**
     * Gets the value of the refObjectTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefObjectTypeId() {
        return refObjectTypeId;
    }

    /**
     * Sets the value of the refObjectTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefObjectTypeId(Long value) {
        this.refObjectTypeId = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuiRow }
     *     
     */
    public ArrayOfGuiRow getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuiRow }
     *     
     */
    public void setRows(ArrayOfGuiRow value) {
        this.rows = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeId(Integer value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

}
