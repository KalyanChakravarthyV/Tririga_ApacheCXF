
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMultiBoResponseHelper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryMultiBoResponseHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResponseHelper"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryMultiBoResponseColumns" type="{http://dto.ws.tririga.com}ArrayOfQueryMultiBoResponseColumn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMultiBoResponseHelper", propOrder = {
    "queryMultiBoResponseColumns"
})
public class QueryMultiBoResponseHelper
    extends AbstractQueryResponseHelper
{

    @XmlElement(nillable = true)
    protected ArrayOfQueryMultiBoResponseColumn queryMultiBoResponseColumns;

    /**
     * Gets the value of the queryMultiBoResponseColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQueryMultiBoResponseColumn }
     *     
     */
    public ArrayOfQueryMultiBoResponseColumn getQueryMultiBoResponseColumns() {
        return queryMultiBoResponseColumns;
    }

    /**
     * Sets the value of the queryMultiBoResponseColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQueryMultiBoResponseColumn }
     *     
     */
    public void setQueryMultiBoResponseColumns(ArrayOfQueryMultiBoResponseColumn value) {
        this.queryMultiBoResponseColumns = value;
    }

}
