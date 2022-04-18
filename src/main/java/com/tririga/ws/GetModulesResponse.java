
package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tririga.ws.dto.Module;


/**
 * <p>Java class for getModulesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getModulesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Module" type="{http://dto.ws.tririga.com}Module" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getModulesResponse", propOrder = {
    "out"
})
public class GetModulesResponse {

    @XmlElement(required = true)
    protected GetModulesResponse.Out out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link GetModulesResponse.Out }
     *     
     */
    public GetModulesResponse.Out getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetModulesResponse.Out }
     *     
     */
    public void setOut(GetModulesResponse.Out value) {
        this.out = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Module" type="{http://dto.ws.tririga.com}Module" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "module"
    })
    public static class Out {

        @XmlElement(name = "Module")
        protected Module[] module;

        /**
         * 
         * 
         * @return
         *     array of
         *     {@link Module }
         *     
         */
        public Module[] getModule() {
            if (this.module == null) {
                return new Module[ 0 ] ;
            }
            Module[] retVal = new Module[this.module.length] ;
            System.arraycopy(this.module, 0, retVal, 0, this.module.length);
            return (retVal);
        }

        /**
         * 
         * 
         * @return
         *     one of
         *     {@link Module }
         *     
         */
        public Module getModule(int idx) {
            if (this.module == null) {
                throw new IndexOutOfBoundsException();
            }
            return this.module[idx];
        }

        public int getModuleLength() {
            if (this.module == null) {
                return  0;
            }
            return this.module.length;
        }

        /**
         * 
         * 
         * @param values
         *     allowed objects are
         *     {@link Module }
         *     
         */
        public void setModule(Module[] values) {
            if (values == null) {
                this.module = null;
                return ;
            }
            int len = values.length;
            this.module = ((Module[]) new Module[len] );
            for (int i = 0; (i<len); i ++) {
                this.module[i] = values[i];
            }
        }

        /**
         * 
         * 
         * @param value
         *     allowed object is
         *     {@link Module }
         *     
         */
        public Module setModule(int idx, Module value) {
            return this.module[idx] = value;
        }

    }

}
