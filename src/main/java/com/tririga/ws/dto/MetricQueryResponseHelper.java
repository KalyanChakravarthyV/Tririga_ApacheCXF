
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetricQueryResponseHelper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetricQueryResponseHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResponseHelper"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metricQueryResponseColumns" type="{http://dto.ws.tririga.com}ArrayOfMetricQueryResponseColumn" minOccurs="0"/&gt;
 *         &lt;element name="primaryGroupByDisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryGroupById" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryGroupByLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryGroupByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryGroupByValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondaryGroupByDisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondaryGroupById" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondaryGroupByLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondaryGroupByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondaryGroupByValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetricQueryResponseHelper", propOrder = {
    "metricQueryResponseColumns",
    "primaryGroupByDisplayValue",
    "primaryGroupById",
    "primaryGroupByLabel",
    "primaryGroupByName",
    "primaryGroupByValue",
    "secondaryGroupByDisplayValue",
    "secondaryGroupById",
    "secondaryGroupByLabel",
    "secondaryGroupByName",
    "secondaryGroupByValue"
})
public class MetricQueryResponseHelper
    extends AbstractQueryResponseHelper
{

    @XmlElement(nillable = true)
    protected ArrayOfMetricQueryResponseColumn metricQueryResponseColumns;
    @XmlElement(nillable = true)
    protected String primaryGroupByDisplayValue;
    @XmlElement(nillable = true)
    protected String primaryGroupById;
    @XmlElement(nillable = true)
    protected String primaryGroupByLabel;
    @XmlElement(nillable = true)
    protected String primaryGroupByName;
    @XmlElement(nillable = true)
    protected String primaryGroupByValue;
    @XmlElement(nillable = true)
    protected String secondaryGroupByDisplayValue;
    @XmlElement(nillable = true)
    protected String secondaryGroupById;
    @XmlElement(nillable = true)
    protected String secondaryGroupByLabel;
    @XmlElement(nillable = true)
    protected String secondaryGroupByName;
    @XmlElement(nillable = true)
    protected String secondaryGroupByValue;

    /**
     * Gets the value of the metricQueryResponseColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetricQueryResponseColumn }
     *     
     */
    public ArrayOfMetricQueryResponseColumn getMetricQueryResponseColumns() {
        return metricQueryResponseColumns;
    }

    /**
     * Sets the value of the metricQueryResponseColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetricQueryResponseColumn }
     *     
     */
    public void setMetricQueryResponseColumns(ArrayOfMetricQueryResponseColumn value) {
        this.metricQueryResponseColumns = value;
    }

    /**
     * Gets the value of the primaryGroupByDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryGroupByDisplayValue() {
        return primaryGroupByDisplayValue;
    }

    /**
     * Sets the value of the primaryGroupByDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryGroupByDisplayValue(String value) {
        this.primaryGroupByDisplayValue = value;
    }

    /**
     * Gets the value of the primaryGroupById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryGroupById() {
        return primaryGroupById;
    }

    /**
     * Sets the value of the primaryGroupById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryGroupById(String value) {
        this.primaryGroupById = value;
    }

    /**
     * Gets the value of the primaryGroupByLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryGroupByLabel() {
        return primaryGroupByLabel;
    }

    /**
     * Sets the value of the primaryGroupByLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryGroupByLabel(String value) {
        this.primaryGroupByLabel = value;
    }

    /**
     * Gets the value of the primaryGroupByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryGroupByName() {
        return primaryGroupByName;
    }

    /**
     * Sets the value of the primaryGroupByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryGroupByName(String value) {
        this.primaryGroupByName = value;
    }

    /**
     * Gets the value of the primaryGroupByValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryGroupByValue() {
        return primaryGroupByValue;
    }

    /**
     * Sets the value of the primaryGroupByValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryGroupByValue(String value) {
        this.primaryGroupByValue = value;
    }

    /**
     * Gets the value of the secondaryGroupByDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryGroupByDisplayValue() {
        return secondaryGroupByDisplayValue;
    }

    /**
     * Sets the value of the secondaryGroupByDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryGroupByDisplayValue(String value) {
        this.secondaryGroupByDisplayValue = value;
    }

    /**
     * Gets the value of the secondaryGroupById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryGroupById() {
        return secondaryGroupById;
    }

    /**
     * Sets the value of the secondaryGroupById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryGroupById(String value) {
        this.secondaryGroupById = value;
    }

    /**
     * Gets the value of the secondaryGroupByLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryGroupByLabel() {
        return secondaryGroupByLabel;
    }

    /**
     * Sets the value of the secondaryGroupByLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryGroupByLabel(String value) {
        this.secondaryGroupByLabel = value;
    }

    /**
     * Gets the value of the secondaryGroupByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryGroupByName() {
        return secondaryGroupByName;
    }

    /**
     * Sets the value of the secondaryGroupByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryGroupByName(String value) {
        this.secondaryGroupByName = value;
    }

    /**
     * Gets the value of the secondaryGroupByValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryGroupByValue() {
        return secondaryGroupByValue;
    }

    /**
     * Sets the value of the secondaryGroupByValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryGroupByValue(String value) {
        this.secondaryGroupByValue = value;
    }

}
