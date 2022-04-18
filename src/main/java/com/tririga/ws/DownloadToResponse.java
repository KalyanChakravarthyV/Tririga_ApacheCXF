
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.content.ArrayOfResponse;


/**
 * <p>Java class for downloadToResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadToResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reponses" type="{http://content.dto.ws.tririga.com}ArrayOfResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadToResponse", propOrder = {
    "reponses"
})
public class DownloadToResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfResponse reponses;

    /**
     * Gets the value of the reponses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponse }
     *     
     */
    public ArrayOfResponse getReponses() {
        return reponses;
    }

    /**
     * Sets the value of the reponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponse }
     *     
     */
    public void setReponses(ArrayOfResponse value) {
        this.reponses = value;
    }

}
