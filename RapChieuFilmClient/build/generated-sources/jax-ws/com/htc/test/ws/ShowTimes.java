
package com.htc.test.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for showTimes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="showTimes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="list-ticket" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ticket" type="{http://ws.test.htc.com/}ticket" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="film" type="{http://ws.test.htc.com/}film" minOccurs="0"/&gt;
 *         &lt;element name="filmRoom" type="{http://ws.test.htc.com/}filmRoom" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="timeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="timeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showTimes", propOrder = {
    "listTicket",
    "film",
    "filmRoom",
    "id",
    "timeEnd",
    "timeStart"
})
public class ShowTimes {

    @XmlElement(name = "list-ticket")
    protected ShowTimes.ListTicket listTicket;
    protected Film film;
    protected FilmRoom filmRoom;
    protected int id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStart;

    /**
     * Gets the value of the listTicket property.
     * 
     * @return
     *     possible object is
     *     {@link ShowTimes.ListTicket }
     *     
     */
    public ShowTimes.ListTicket getListTicket() {
        return listTicket;
    }

    /**
     * Sets the value of the listTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowTimes.ListTicket }
     *     
     */
    public void setListTicket(ShowTimes.ListTicket value) {
        this.listTicket = value;
    }

    /**
     * Gets the value of the film property.
     * 
     * @return
     *     possible object is
     *     {@link Film }
     *     
     */
    public Film getFilm() {
        return film;
    }

    /**
     * Sets the value of the film property.
     * 
     * @param value
     *     allowed object is
     *     {@link Film }
     *     
     */
    public void setFilm(Film value) {
        this.film = value;
    }

    /**
     * Gets the value of the filmRoom property.
     * 
     * @return
     *     possible object is
     *     {@link FilmRoom }
     *     
     */
    public FilmRoom getFilmRoom() {
        return filmRoom;
    }

    /**
     * Sets the value of the filmRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilmRoom }
     *     
     */
    public void setFilmRoom(FilmRoom value) {
        this.filmRoom = value;
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
     * Gets the value of the timeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeEnd() {
        return timeEnd;
    }

    /**
     * Sets the value of the timeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeEnd(XMLGregorianCalendar value) {
        this.timeEnd = value;
    }

    /**
     * Gets the value of the timeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStart() {
        return timeStart;
    }

    /**
     * Sets the value of the timeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStart(XMLGregorianCalendar value) {
        this.timeStart = value;
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
     *         &lt;element name="ticket" type="{http://ws.test.htc.com/}ticket" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "ticket"
    })
    public static class ListTicket {

        protected List<Ticket> ticket;

        /**
         * Gets the value of the ticket property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticket property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicket().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ticket }
         * 
         * 
         */
        public List<Ticket> getTicket() {
            if (ticket == null) {
                ticket = new ArrayList<Ticket>();
            }
            return this.ticket;
        }

    }

}
