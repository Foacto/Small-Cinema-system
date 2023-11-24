
package com.htc.test.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getShowTimesDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getShowTimesDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="showTimes" type="{http://ws.test.htc.com/}showTimes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getShowTimesDetails", propOrder = {
    "showTimes"
})
public class GetShowTimesDetails {

    protected ShowTimes showTimes;

    /**
     * Gets the value of the showTimes property.
     * 
     * @return
     *     possible object is
     *     {@link ShowTimes }
     *     
     */
    public ShowTimes getShowTimes() {
        return showTimes;
    }

    /**
     * Sets the value of the showTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowTimes }
     *     
     */
    public void setShowTimes(ShowTimes value) {
        this.showTimes = value;
    }

}
