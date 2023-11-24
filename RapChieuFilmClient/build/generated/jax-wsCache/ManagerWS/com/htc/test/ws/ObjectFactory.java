
package com.htc.test.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.htc.test.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddFilm_QNAME = new QName("http://ws.test.htc.com/", "addFilm");
    private final static QName _AddFilmResponse_QNAME = new QName("http://ws.test.htc.com/", "addFilmResponse");
    private final static QName _AddNewFilmProvider_QNAME = new QName("http://ws.test.htc.com/", "addNewFilmProvider");
    private final static QName _AddNewFilmProviderResponse_QNAME = new QName("http://ws.test.htc.com/", "addNewFilmProviderResponse");
    private final static QName _GetAllFilmProvider_QNAME = new QName("http://ws.test.htc.com/", "getAllFilmProvider");
    private final static QName _GetAllFilmProviderResponse_QNAME = new QName("http://ws.test.htc.com/", "getAllFilmProviderResponse");
    private final static QName _SearchFilmProvider_QNAME = new QName("http://ws.test.htc.com/", "searchFilmProvider");
    private final static QName _SearchFilmProviderResponse_QNAME = new QName("http://ws.test.htc.com/", "searchFilmProviderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.htc.test.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FilmProvider }
     * 
     */
    public FilmProvider createFilmProvider() {
        return new FilmProvider();
    }

    /**
     * Create an instance of {@link FilmRoom }
     * 
     */
    public FilmRoom createFilmRoom() {
        return new FilmRoom();
    }

    /**
     * Create an instance of {@link Bill }
     * 
     */
    public Bill createBill() {
        return new Bill();
    }

    /**
     * Create an instance of {@link ShowTimes }
     * 
     */
    public ShowTimes createShowTimes() {
        return new ShowTimes();
    }

    /**
     * Create an instance of {@link Film }
     * 
     */
    public Film createFilm() {
        return new Film();
    }

    /**
     * Create an instance of {@link AddFilm }
     * 
     */
    public AddFilm createAddFilm() {
        return new AddFilm();
    }

    /**
     * Create an instance of {@link AddFilmResponse }
     * 
     */
    public AddFilmResponse createAddFilmResponse() {
        return new AddFilmResponse();
    }

    /**
     * Create an instance of {@link AddNewFilmProvider }
     * 
     */
    public AddNewFilmProvider createAddNewFilmProvider() {
        return new AddNewFilmProvider();
    }

    /**
     * Create an instance of {@link AddNewFilmProviderResponse }
     * 
     */
    public AddNewFilmProviderResponse createAddNewFilmProviderResponse() {
        return new AddNewFilmProviderResponse();
    }

    /**
     * Create an instance of {@link GetAllFilmProvider }
     * 
     */
    public GetAllFilmProvider createGetAllFilmProvider() {
        return new GetAllFilmProvider();
    }

    /**
     * Create an instance of {@link GetAllFilmProviderResponse }
     * 
     */
    public GetAllFilmProviderResponse createGetAllFilmProviderResponse() {
        return new GetAllFilmProviderResponse();
    }

    /**
     * Create an instance of {@link SearchFilmProvider }
     * 
     */
    public SearchFilmProvider createSearchFilmProvider() {
        return new SearchFilmProvider();
    }

    /**
     * Create an instance of {@link SearchFilmProviderResponse }
     * 
     */
    public SearchFilmProviderResponse createSearchFilmProviderResponse() {
        return new SearchFilmProviderResponse();
    }

    /**
     * Create an instance of {@link FilmCategory }
     * 
     */
    public FilmCategory createFilmCategory() {
        return new FilmCategory();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link FilmRoomChair }
     * 
     */
    public FilmRoomChair createFilmRoomChair() {
        return new FilmRoomChair();
    }

    /**
     * Create an instance of {@link ChairType }
     * 
     */
    public ChairType createChairType() {
        return new ChairType();
    }

    /**
     * Create an instance of {@link FilmProvider.ListFilm }
     * 
     */
    public FilmProvider.ListFilm createFilmProviderListFilm() {
        return new FilmProvider.ListFilm();
    }

    /**
     * Create an instance of {@link FilmRoom.ListChair }
     * 
     */
    public FilmRoom.ListChair createFilmRoomListChair() {
        return new FilmRoom.ListChair();
    }

    /**
     * Create an instance of {@link Bill.ListTicket }
     * 
     */
    public Bill.ListTicket createBillListTicket() {
        return new Bill.ListTicket();
    }

    /**
     * Create an instance of {@link ShowTimes.ListTicket }
     * 
     */
    public ShowTimes.ListTicket createShowTimesListTicket() {
        return new ShowTimes.ListTicket();
    }

    /**
     * Create an instance of {@link Film.ListFilmCategory }
     * 
     */
    public Film.ListFilmCategory createFilmListFilmCategory() {
        return new Film.ListFilmCategory();
    }

    /**
     * Create an instance of {@link Film.ListShowTime }
     * 
     */
    public Film.ListShowTime createFilmListShowTime() {
        return new Film.ListShowTime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFilm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFilm }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "addFilm")
    public JAXBElement<AddFilm> createAddFilm(AddFilm value) {
        return new JAXBElement<AddFilm>(_AddFilm_QNAME, AddFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFilmResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFilmResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "addFilmResponse")
    public JAXBElement<AddFilmResponse> createAddFilmResponse(AddFilmResponse value) {
        return new JAXBElement<AddFilmResponse>(_AddFilmResponse_QNAME, AddFilmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewFilmProvider }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddNewFilmProvider }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "addNewFilmProvider")
    public JAXBElement<AddNewFilmProvider> createAddNewFilmProvider(AddNewFilmProvider value) {
        return new JAXBElement<AddNewFilmProvider>(_AddNewFilmProvider_QNAME, AddNewFilmProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewFilmProviderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddNewFilmProviderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "addNewFilmProviderResponse")
    public JAXBElement<AddNewFilmProviderResponse> createAddNewFilmProviderResponse(AddNewFilmProviderResponse value) {
        return new JAXBElement<AddNewFilmProviderResponse>(_AddNewFilmProviderResponse_QNAME, AddNewFilmProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFilmProvider }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFilmProvider }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getAllFilmProvider")
    public JAXBElement<GetAllFilmProvider> createGetAllFilmProvider(GetAllFilmProvider value) {
        return new JAXBElement<GetAllFilmProvider>(_GetAllFilmProvider_QNAME, GetAllFilmProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFilmProviderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFilmProviderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getAllFilmProviderResponse")
    public JAXBElement<GetAllFilmProviderResponse> createGetAllFilmProviderResponse(GetAllFilmProviderResponse value) {
        return new JAXBElement<GetAllFilmProviderResponse>(_GetAllFilmProviderResponse_QNAME, GetAllFilmProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFilmProvider }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFilmProvider }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "searchFilmProvider")
    public JAXBElement<SearchFilmProvider> createSearchFilmProvider(SearchFilmProvider value) {
        return new JAXBElement<SearchFilmProvider>(_SearchFilmProvider_QNAME, SearchFilmProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFilmProviderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFilmProviderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "searchFilmProviderResponse")
    public JAXBElement<SearchFilmProviderResponse> createSearchFilmProviderResponse(SearchFilmProviderResponse value) {
        return new JAXBElement<SearchFilmProviderResponse>(_SearchFilmProviderResponse_QNAME, SearchFilmProviderResponse.class, null, value);
    }

}
