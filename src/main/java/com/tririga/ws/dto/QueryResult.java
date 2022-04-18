
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryResponseHelpers" type="{http://dto.ws.tririga.com}ArrayOfQueryResponseHelper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", propOrder = {
    "queryResponseHelpers"
})
public class QueryResult
    extends AbstractQueryResult
{

    @XmlElement(nillable = true)
    protected ArrayOfQueryResponseHelper queryResponseHelpers;

    /**
     * Gets the value of the queryResponseHelpers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQueryResponseHelper }
     *     
     */
    public ArrayOfQueryResponseHelper getQueryResponseHelpers() {
        return queryResponseHelpers;
    }

    /**
     * Sets the value of the queryResponseHelpers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQueryResponseHelper }
     *     
     */
    public void setQueryResponseHelpers(ArrayOfQueryResponseHelper value) {
        this.queryResponseHelpers = value;
    }

}
