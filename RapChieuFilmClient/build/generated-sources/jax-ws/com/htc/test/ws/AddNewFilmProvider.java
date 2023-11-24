
package com.htc.test.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addNewFilmProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addNewFilmProvider"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filmProvider" type="{http://ws.test.htc.com/}filmProvider" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addNewFilmProvider", propOrder = {
    "filmProvider"
})
public class AddNewFilmProvider {

    protected FilmProvider filmProvider;

    /**
     * Gets the value of the filmProvider property.
     * 
     * @return
     *     possible object is
     *     {@link FilmProvider }
     *     
     */
    public FilmProvider getFilmProvider() {
        return filmProvider;
    }

    /**
     * Sets the value of the filmProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilmProvider }
     *     
     */
    public void setFilmProvider(FilmProvider value) {
        this.filmProvider = value;
    }

}
