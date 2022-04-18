
package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HierarchyObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HierarchyObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}BaseObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="children" type="{http://dto.ws.tririga.com}ArrayOfHierarchyObjectType" minOccurs="0"/&gt;
 *         &lt;element name="rootOfHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchyObjectType", propOrder = {
    "children",
    "rootOfHierarchy"
})
@XmlSeeAlso({
    ObjectType.class
})
public class HierarchyObjectType
    extends BaseObjectType
{

    @XmlElement(nillable = true)
    protected ArrayOfHierarchyObjectType children;
    protected Boolean rootOfHierarchy;

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHierarchyObjectType }
     *     
     */
    public ArrayOfHierarchyObjectType getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHierarchyObjectType }
     *     
     */
    public void setChildren(ArrayOfHierarchyObjectType value) {
        this.children = value;
    }

    /**
     * Gets the value of the rootOfHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRootOfHierarchy() {
        return rootOfHierarchy;
    }

    /**
     * Sets the value of the rootOfHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRootOfHierarchy(Boolean value) {
        this.rootOfHierarchy = value;
    }

}
