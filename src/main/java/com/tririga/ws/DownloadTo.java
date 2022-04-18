
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.content.ArrayOfContent1;


/**
 * <p>Java class for downloadTo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadTo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contents" type="{http://content.dto.ws.tririga.com}ArrayOfContent-1-"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadTo", propOrder = {
    "contents"
})
public class DownloadTo {

    @XmlElement(required = true)
    protected ArrayOfContent1 contents;

    /**
     * Gets the value of the contents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContent1 }
     *     
     */
    public ArrayOfContent1 getContents() {
        return contents;
    }

    /**
     * Sets the value of the contents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContent1 }
     *     
     */
    public void setContents(ArrayOfContent1 value) {
        this.contents = value;
    }

}
