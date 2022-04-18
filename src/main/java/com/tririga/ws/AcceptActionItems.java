
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfActionItem;


/**
 * <p>Java class for acceptActionItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acceptActionItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionItems" type="{http://dto.ws.tririga.com}ArrayOfActionItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acceptActionItems", propOrder = {
    "actionItems"
})
public class AcceptActionItems {

    @XmlElement(name = "ActionItems", required = true)
    protected ArrayOfActionItem actionItems;

    /**
     * Gets the value of the actionItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActionItem }
     *     
     */
    public ArrayOfActionItem getActionItems() {
        return actionItems;
    }

    /**
     * Sets the value of the actionItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActionItem }
     *     
     */
    public void setActionItems(ArrayOfActionItem value) {
        this.actionItems = value;
    }

}
