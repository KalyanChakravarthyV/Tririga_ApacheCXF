
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfAssociationFilter;
import com.tririga.ws.dto.ArrayOfDisplayLabel;
import com.tririga.ws.dto.ArrayOfFieldSortOrder;
import com.tririga.ws.dto.ArrayOfFilter;


/**
 * <p>Java class for runDynamicQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="runDynamicQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeNames" type="{http://ws.tririga.com}ArrayOfString"/&gt;
 *         &lt;element name="guiNames" type="{http://ws.tririga.com}ArrayOfString"/&gt;
 *         &lt;element name="associatedModuleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="associatedObjectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="projectScope" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="displayFields" type="{http://dto.ws.tririga.com}ArrayOfDisplayLabel"/&gt;
 *         &lt;element name="associatedDisplayFields" type="{http://dto.ws.tririga.com}ArrayOfDisplayLabel"/&gt;
 *         &lt;element name="fieldSortOrders" type="{http://dto.ws.tririga.com}ArrayOfFieldSortOrder"/&gt;
 *         &lt;element name="filters" type="{http://dto.ws.tririga.com}ArrayOfFilter"/&gt;
 *         &lt;element name="associationFilters" type="{http://dto.ws.tririga.com}ArrayOfAssociationFilter"/&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maximumResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runDynamicQuery", propOrder = {
    "projectName",
    "moduleName",
    "objectTypeNames",
    "guiNames",
    "associatedModuleName",
    "associatedObjectTypeName",
    "projectScope",
    "displayFields",
    "associatedDisplayFields",
    "fieldSortOrders",
    "filters",
    "associationFilters",
    "start",
    "maximumResultCount"
})
public class RunDynamicQuery {

    @XmlElement(nillable = true)
    protected String projectName;
    protected String moduleName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString objectTypeNames;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString guiNames;
    @XmlElement(nillable = true)
    protected String associatedModuleName;
    @XmlElement(nillable = true)
    protected String associatedObjectTypeName;
    protected int projectScope;
    @XmlElement(required = true)
    protected ArrayOfDisplayLabel displayFields;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfDisplayLabel associatedDisplayFields;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfFieldSortOrder fieldSortOrders;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfFilter filters;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAssociationFilter associationFilters;
    protected int start;
    protected int maximumResultCount;

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the objectTypeNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getObjectTypeNames() {
        return objectTypeNames;
    }

    /**
     * Sets the value of the objectTypeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setObjectTypeNames(ArrayOfString value) {
        this.objectTypeNames = value;
    }

    /**
     * Gets the value of the guiNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGuiNames() {
        return guiNames;
    }

    /**
     * Sets the value of the guiNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGuiNames(ArrayOfString value) {
        this.guiNames = value;
    }

    /**
     * Gets the value of the associatedModuleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedModuleName() {
        return associatedModuleName;
    }

    /**
     * Sets the value of the associatedModuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedModuleName(String value) {
        this.associatedModuleName = value;
    }

    /**
     * Gets the value of the associatedObjectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedObjectTypeName() {
        return associatedObjectTypeName;
    }

    /**
     * Sets the value of the associatedObjectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedObjectTypeName(String value) {
        this.associatedObjectTypeName = value;
    }

    /**
     * Gets the value of the projectScope property.
     * 
     */
    public int getProjectScope() {
        return projectScope;
    }

    /**
     * Sets the value of the projectScope property.
     * 
     */
    public void setProjectScope(int value) {
        this.projectScope = value;
    }

    /**
     * Gets the value of the displayFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDisplayLabel }
     *     
     */
    public ArrayOfDisplayLabel getDisplayFields() {
        return displayFields;
    }

    /**
     * Sets the value of the displayFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDisplayLabel }
     *     
     */
    public void setDisplayFields(ArrayOfDisplayLabel value) {
        this.displayFields = value;
    }

    /**
     * Gets the value of the associatedDisplayFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDisplayLabel }
     *     
     */
    public ArrayOfDisplayLabel getAssociatedDisplayFields() {
        return associatedDisplayFields;
    }

    /**
     * Sets the value of the associatedDisplayFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDisplayLabel }
     *     
     */
    public void setAssociatedDisplayFields(ArrayOfDisplayLabel value) {
        this.associatedDisplayFields = value;
    }

    /**
     * Gets the value of the fieldSortOrders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldSortOrder }
     *     
     */
    public ArrayOfFieldSortOrder getFieldSortOrders() {
        return fieldSortOrders;
    }

    /**
     * Sets the value of the fieldSortOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldSortOrder }
     *     
     */
    public void setFieldSortOrders(ArrayOfFieldSortOrder value) {
        this.fieldSortOrders = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFilter }
     *     
     */
    public ArrayOfFilter getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFilter }
     *     
     */
    public void setFilters(ArrayOfFilter value) {
        this.filters = value;
    }

    /**
     * Gets the value of the associationFilters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssociationFilter }
     *     
     */
    public ArrayOfAssociationFilter getAssociationFilters() {
        return associationFilters;
    }

    /**
     * Sets the value of the associationFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssociationFilter }
     *     
     */
    public void setAssociationFilters(ArrayOfAssociationFilter value) {
        this.associationFilters = value;
    }

    /**
     * Gets the value of the start property.
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     */
    public void setStart(int value) {
        this.start = value;
    }

    /**
     * Gets the value of the maximumResultCount property.
     * 
     */
    public int getMaximumResultCount() {
        return maximumResultCount;
    }

    /**
     * Sets the value of the maximumResultCount property.
     * 
     */
    public void setMaximumResultCount(int value) {
        this.maximumResultCount = value;
    }

}
