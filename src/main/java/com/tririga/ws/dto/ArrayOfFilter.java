
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filter" type="{http://dto.ws.tririga.com}Filter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFilter", propOrder = {
    "filter"
})
public class ArrayOfFilter {

    @XmlElement(name = "Filter", nillable = true)
    protected Filter[] filter;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Filter }
     *     
     */
    public Filter[] getFilter() {
        if (this.filter == null) {
            return new Filter[ 0 ] ;
        }
        Filter[] retVal = new Filter[this.filter.length] ;
        System.arraycopy(this.filter, 0, retVal, 0, this.filter.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Filter }
     *     
     */
    public Filter getFilter(int idx) {
        if (this.filter == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.filter[idx];
    }

    public int getFilterLength() {
        if (this.filter == null) {
            return  0;
        }
        return this.filter.length;
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Filter }
     *     
     */
    public void setFilter(Filter[] values) {
        if (values == null) {
            this.filter = null;
            return ;
        }
        int len = values.length;
        this.filter = ((Filter[]) new Filter[len] );
        for (int i = 0; (i<len); i ++) {
            this.filter[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Filter }
     *     
     */
    public Filter setFilter(int idx, Filter value) {
        return this.filter[idx] = value;
    }

}
