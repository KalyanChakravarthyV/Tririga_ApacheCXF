
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResponseHelper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResponseHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResponseHelper"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assocBoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryResponseColumns" type="{http://dto.ws.tririga.com}ArrayOfQueryResponseColumn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResponseHelper", propOrder = {
    "assocBoId",
    "assocId",
    "queryResponseColumns"
})
public class QueryResponseHelper
    extends AbstractQueryResponseHelper
{

    @XmlElement(nillable = true)
    protected String assocBoId;
    @XmlElement(nillable = true)
    protected String assocId;
    @XmlElement(nillable = true)
    protected ArrayOfQueryResponseColumn queryResponseColumns;

    /**
     * Gets the value of the assocBoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocBoId() {
        return assocBoId;
    }

    /**
     * Sets the value of the assocBoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocBoId(String value) {
        this.assocBoId = value;
    }

    /**
     * Gets the value of the assocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocId() {
        return assocId;
    }

    /**
     * Sets the value of the assocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocId(String value) {
        this.assocId = value;
    }

    /**
     * Gets the value of the queryResponseColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQueryResponseColumn }
     *     
     */
    public ArrayOfQueryResponseColumn getQueryResponseColumns() {
        return queryResponseColumns;
    }

    /**
     * Sets the value of the queryResponseColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQueryResponseColumn }
     *     
     */
    public void setQueryResponseColumns(ArrayOfQueryResponseColumn value) {
        this.queryResponseColumns = value;
    }

}
