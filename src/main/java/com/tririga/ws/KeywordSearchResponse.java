
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfKeywordSearchResult;


/**
 * <p>Java class for keywordSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="keywordSearchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}ArrayOfKeywordSearchResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keywordSearchResponse", propOrder = {
    "out"
})
public class KeywordSearchResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfKeywordSearchResult out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordSearchResult }
     *     
     */
    public ArrayOfKeywordSearchResult getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordSearchResult }
     *     
     */
    public void setOut(ArrayOfKeywordSearchResult value) {
        this.out = value;
    }

}
