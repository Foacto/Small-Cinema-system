
package com.htc.test.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for film complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="film"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="list-film-category" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="film-category" type="{http://ws.test.htc.com/}filmCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="list-show-time" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="show-time" type="{http://ws.test.htc.com/}showTimes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="director" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fp" type="{http://ws.test.htc.com/}filmProvider" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "film", propOrder = {
    "listFilmCategory",
    "listShowTime",
    "des",
    "director",
    "fp",
    "id",
    "length",
    "name",
    "rate"
})
public class Film {

    @XmlElement(name = "list-film-category")
    protected Film.ListFilmCategory listFilmCategory;
    @XmlElement(name = "list-show-time")
    protected Film.ListShowTime listShowTime;
    protected String des;
    protected String director;
    protected FilmProvider fp;
    protected int id;
    protected String length;
    protected String name;
    protected int rate;

    /**
     * Gets the value of the listFilmCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Film.ListFilmCategory }
     *     
     */
    public Film.ListFilmCategory getListFilmCategory() {
        return listFilmCategory;
    }

    /**
     * Sets the value of the listFilmCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Film.ListFilmCategory }
     *     
     */
    public void setListFilmCategory(Film.ListFilmCategory value) {
        this.listFilmCategory = value;
    }

    /**
     * Gets the value of the listShowTime property.
     * 
     * @return
     *     possible object is
     *     {@link Film.ListShowTime }
     *     
     */
    public Film.ListShowTime getListShowTime() {
        return listShowTime;
    }

    /**
     * Sets the value of the listShowTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Film.ListShowTime }
     *     
     */
    public void setListShowTime(Film.ListShowTime value) {
        this.listShowTime = value;
    }

    /**
     * Gets the value of the des property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDes() {
        return des;
    }

    /**
     * Sets the value of the des property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDes(String value) {
        this.des = value;
    }

    /**
     * Gets the value of the director property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector(String value) {
        this.director = value;
    }

    /**
     * Gets the value of the fp property.
     * 
     * @return
     *     possible object is
     *     {@link FilmProvider }
     *     
     */
    public FilmProvider getFp() {
        return fp;
    }

    /**
     * Sets the value of the fp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilmProvider }
     *     
     */
    public void setFp(FilmProvider value) {
        this.fp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     */
    public int getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     */
    public void setRate(int value) {
        this.rate = value;
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
     *         &lt;element name="film-category" type="{http://ws.test.htc.com/}filmCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "filmCategory"
    })
    public static class ListFilmCategory {

        @XmlElement(name = "film-category")
        protected List<FilmCategory> filmCategory;

        /**
         * Gets the value of the filmCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the filmCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFilmCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FilmCategory }
         * 
         * 
         */
        public List<FilmCategory> getFilmCategory() {
            if (filmCategory == null) {
                filmCategory = new ArrayList<FilmCategory>();
            }
            return this.filmCategory;
        }

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
     *         &lt;element name="show-time" type="{http://ws.test.htc.com/}showTimes" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "showTime"
    })
    public static class ListShowTime {

        @XmlElement(name = "show-time")
        protected List<ShowTimes> showTime;

        /**
         * Gets the value of the showTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the showTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShowTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ShowTimes }
         * 
         * 
         */
        public List<ShowTimes> getShowTime() {
            if (showTime == null) {
                showTime = new ArrayList<ShowTimes>();
            }
            return this.showTime;
        }

    }

}
