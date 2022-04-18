
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.ArrayOfTriggerActions;


/**
 * <p>Java class for triggerActions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="triggerActions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TriggerActions" type="{http://dto.ws.tririga.com}ArrayOfTriggerActions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "triggerActions", propOrder = {
    "triggerActions"
})
public class TriggerActions {

    @XmlElement(name = "TriggerActions", required = true)
    protected ArrayOfTriggerActions triggerActions;

    /**
     * Gets the value of the triggerActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTriggerActions }
     *     
     */
    public ArrayOfTriggerActions getTriggerActions() {
        return triggerActions;
    }

    /**
     * Sets the value of the triggerActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTriggerActions }
     *     
     */
    public void setTriggerActions(ArrayOfTriggerActions value) {
        this.triggerActions = value;
    }

}
