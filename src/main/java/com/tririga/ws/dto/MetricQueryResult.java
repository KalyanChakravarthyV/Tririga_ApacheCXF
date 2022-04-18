
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetricQueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetricQueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metricQueryResponseHelpers" type="{http://dto.ws.tririga.com}ArrayOfMetricQueryResponseHelper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetricQueryResult", propOrder = {
    "metricQueryResponseHelpers"
})
public class MetricQueryResult
    extends AbstractQueryResult
{

    @XmlElement(nillable = true)
    protected ArrayOfMetricQueryResponseHelper metricQueryResponseHelpers;

    /**
     * Gets the value of the metricQueryResponseHelpers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetricQueryResponseHelper }
     *     
     */
    public ArrayOfMetricQueryResponseHelper getMetricQueryResponseHelpers() {
        return metricQueryResponseHelpers;
    }

    /**
     * Sets the value of the metricQueryResponseHelpers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetricQueryResponseHelper }
     *     
     */
    public void setMetricQueryResponseHelpers(ArrayOfMetricQueryResponseHelper value) {
        this.metricQueryResponseHelpers = value;
    }

}
