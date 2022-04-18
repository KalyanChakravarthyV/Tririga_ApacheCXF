
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfMetricQueryFilter;
import com.tririga.ws.dto.GroupBy;


/**
 * <p>Java class for runNamedMetricQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="runNamedMetricQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metricQueryfilters" type="{http://dto.ws.tririga.com}ArrayOfMetricQueryFilter"/&gt;
 *         &lt;element name="groupBy" type="{http://dto.ws.tririga.com}GroupBy" minOccurs="0"/&gt;
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
@XmlType(name = "runNamedMetricQuery", propOrder = {
    "moduleName",
    "objectTypeName",
    "queryName",
    "metricQueryfilters",
    "groupBy",
    "start",
    "maximumResultCount"
})
public class RunNamedMetricQuery {

    protected String moduleName;
    protected String objectTypeName;
    protected String queryName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMetricQueryFilter metricQueryfilters;
    @XmlElement(nillable = true)
    protected GroupBy groupBy;
    protected int start;
    protected int maximumResultCount;

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
     * Gets the value of the objectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectTypeName() {
        return objectTypeName;
    }

    /**
     * Sets the value of the objectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectTypeName(String value) {
        this.objectTypeName = value;
    }

    /**
     * Gets the value of the queryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryName() {
        return queryName;
    }

    /**
     * Sets the value of the queryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryName(String value) {
        this.queryName = value;
    }

    /**
     * Gets the value of the metricQueryfilters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetricQueryFilter }
     *     
     */
    public ArrayOfMetricQueryFilter getMetricQueryfilters() {
        return metricQueryfilters;
    }

    /**
     * Sets the value of the metricQueryfilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetricQueryFilter }
     *     
     */
    public void setMetricQueryfilters(ArrayOfMetricQueryFilter value) {
        this.metricQueryfilters = value;
    }

    /**
     * Gets the value of the groupBy property.
     * 
     * @return
     *     possible object is
     *     {@link GroupBy }
     *     
     */
    public GroupBy getGroupBy() {
        return groupBy;
    }

    /**
     * Sets the value of the groupBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupBy }
     *     
     */
    public void setGroupBy(GroupBy value) {
        this.groupBy = value;
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
