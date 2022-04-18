
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMultiBoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryMultiBoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryMultiBoResponseHelpers" type="{http://dto.ws.tririga.com}ArrayOfQueryMultiBoResponseHelper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMultiBoResult", propOrder = {
    "queryMultiBoResponseHelpers"
})
public class QueryMultiBoResult
    extends AbstractQueryResult
{

    @XmlElement(nillable = true)
    protected ArrayOfQueryMultiBoResponseHelper queryMultiBoResponseHelpers;

    /**
     * Gets the value of the queryMultiBoResponseHelpers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQueryMultiBoResponseHelper }
     *     
     */
    public ArrayOfQueryMultiBoResponseHelper getQueryMultiBoResponseHelpers() {
        return queryMultiBoResponseHelpers;
    }

    /**
     * Sets the value of the queryMultiBoResponseHelpers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQueryMultiBoResponseHelper }
     *     
     */
    public void setQueryMultiBoResponseHelpers(ArrayOfQueryMultiBoResponseHelper value) {
        this.queryMultiBoResponseHelpers = value;
    }

}
