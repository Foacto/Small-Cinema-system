
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

    private final static QName _AddBill_QNAME = new QName("http://ws.test.htc.com/", "addBill");
    private final static QName _AddBillResponse_QNAME = new QName("http://ws.test.htc.com/", "addBillResponse");
    private final static QName _GetBill_QNAME = new QName("http://ws.test.htc.com/", "getBill");
    private final static QName _GetBillResponse_QNAME = new QName("http://ws.test.htc.com/", "getBillResponse");
    private final static QName _GetCus_QNAME = new QName("http://ws.test.htc.com/", "getCus");
    private final static QName _GetCusResponse_QNAME = new QName("http://ws.test.htc.com/", "getCusResponse");
    private final static QName _GetEmp_QNAME = new QName("http://ws.test.htc.com/", "getEmp");
    private final static QName _GetEmpResponse_QNAME = new QName("http://ws.test.htc.com/", "getEmpResponse");
    private final static QName _GetFilm_QNAME = new QName("http://ws.test.htc.com/", "getFilm");
    private final static QName _GetFilmResponse_QNAME = new QName("http://ws.test.htc.com/", "getFilmResponse");
    private final static QName _GetListFilm_QNAME = new QName("http://ws.test.htc.com/", "getListFilm");
    private final static QName _GetListFilmCategory_QNAME = new QName("http://ws.test.htc.com/", "getListFilmCategory");
    private final static QName _GetListFilmCategoryResponse_QNAME = new QName("http://ws.test.htc.com/", "getListFilmCategoryResponse");
    private final static QName _GetListFilmResponse_QNAME = new QName("http://ws.test.htc.com/", "getListFilmResponse");
    private final static QName _GetListShowTimesOfFilm_QNAME = new QName("http://ws.test.htc.com/", "getListShowTimesOfFilm");
    private final static QName _GetListShowTimesOfFilmResponse_QNAME = new QName("http://ws.test.htc.com/", "getListShowTimesOfFilmResponse");
    private final static QName _GetShowTimesDetails_QNAME = new QName("http://ws.test.htc.com/", "getShowTimesDetails");
    private final static QName _GetShowTimesDetailsResponse_QNAME = new QName("http://ws.test.htc.com/", "getShowTimesDetailsResponse");
    private final static QName _Login_QNAME = new QName("http://ws.test.htc.com/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://ws.test.htc.com/", "loginResponse");
    private final static QName _Logout_QNAME = new QName("http://ws.test.htc.com/", "logout");
    private final static QName _LogoutResponse_QNAME = new QName("http://ws.test.htc.com/", "logoutResponse");
    private final static QName _Register_QNAME = new QName("http://ws.test.htc.com/", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://ws.test.htc.com/", "registerResponse");
    private final static QName _SearchFilm_QNAME = new QName("http://ws.test.htc.com/", "searchFilm");
    private final static QName _SearchFilmResponse_QNAME = new QName("http://ws.test.htc.com/", "searchFilmResponse");
    private final static QName _UpdatePaidBill_QNAME = new QName("http://ws.test.htc.com/", "updatePaidBill");
    private final static QName _UpdatePaidBillResponse_QNAME = new QName("http://ws.test.htc.com/", "updatePaidBillResponse");

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
     * Create an instance of {@link AddBill }
     * 
     */
    public AddBill createAddBill() {
        return new AddBill();
    }

    /**
     * Create an instance of {@link AddBillResponse }
     * 
     */
    public AddBillResponse createAddBillResponse() {
        return new AddBillResponse();
    }

    /**
     * Create an instance of {@link GetBill }
     * 
     */
    public GetBill createGetBill() {
        return new GetBill();
    }

    /**
     * Create an instance of {@link GetBillResponse }
     * 
     */
    public GetBillResponse createGetBillResponse() {
        return new GetBillResponse();
    }

    /**
     * Create an instance of {@link GetCus }
     * 
     */
    public GetCus createGetCus() {
        return new GetCus();
    }

    /**
     * Create an instance of {@link GetCusResponse }
     * 
     */
    public GetCusResponse createGetCusResponse() {
        return new GetCusResponse();
    }

    /**
     * Create an instance of {@link GetEmp }
     * 
     */
    public GetEmp createGetEmp() {
        return new GetEmp();
    }

    /**
     * Create an instance of {@link GetEmpResponse }
     * 
     */
    public GetEmpResponse createGetEmpResponse() {
        return new GetEmpResponse();
    }

    /**
     * Create an instance of {@link GetFilm }
     * 
     */
    public GetFilm createGetFilm() {
        return new GetFilm();
    }

    /**
     * Create an instance of {@link GetFilmResponse }
     * 
     */
    public GetFilmResponse createGetFilmResponse() {
        return new GetFilmResponse();
    }

    /**
     * Create an instance of {@link GetListFilm }
     * 
     */
    public GetListFilm createGetListFilm() {
        return new GetListFilm();
    }

    /**
     * Create an instance of {@link GetListFilmCategory }
     * 
     */
    public GetListFilmCategory createGetListFilmCategory() {
        return new GetListFilmCategory();
    }

    /**
     * Create an instance of {@link GetListFilmCategoryResponse }
     * 
     */
    public GetListFilmCategoryResponse createGetListFilmCategoryResponse() {
        return new GetListFilmCategoryResponse();
    }

    /**
     * Create an instance of {@link GetListFilmResponse }
     * 
     */
    public GetListFilmResponse createGetListFilmResponse() {
        return new GetListFilmResponse();
    }

    /**
     * Create an instance of {@link GetListShowTimesOfFilm }
     * 
     */
    public GetListShowTimesOfFilm createGetListShowTimesOfFilm() {
        return new GetListShowTimesOfFilm();
    }

    /**
     * Create an instance of {@link GetListShowTimesOfFilmResponse }
     * 
     */
    public GetListShowTimesOfFilmResponse createGetListShowTimesOfFilmResponse() {
        return new GetListShowTimesOfFilmResponse();
    }

    /**
     * Create an instance of {@link GetShowTimesDetails }
     * 
     */
    public GetShowTimesDetails createGetShowTimesDetails() {
        return new GetShowTimesDetails();
    }

    /**
     * Create an instance of {@link GetShowTimesDetailsResponse }
     * 
     */
    public GetShowTimesDetailsResponse createGetShowTimesDetailsResponse() {
        return new GetShowTimesDetailsResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link SearchFilm }
     * 
     */
    public SearchFilm createSearchFilm() {
        return new SearchFilm();
    }

    /**
     * Create an instance of {@link SearchFilmResponse }
     * 
     */
    public SearchFilmResponse createSearchFilmResponse() {
        return new SearchFilmResponse();
    }

    /**
     * Create an instance of {@link UpdatePaidBill }
     * 
     */
    public UpdatePaidBill createUpdatePaidBill() {
        return new UpdatePaidBill();
    }

    /**
     * Create an instance of {@link UpdatePaidBillResponse }
     * 
     */
    public UpdatePaidBillResponse createUpdatePaidBillResponse() {
        return new UpdatePaidBillResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBill }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBill }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "addBill")
    public JAXBElement<AddBill> createAddBill(AddBill value) {
        return new JAXBElement<AddBill>(_AddBill_QNAME, AddBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBillResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBillResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "addBillResponse")
    public JAXBElement<AddBillResponse> createAddBillResponse(AddBillResponse value) {
        return new JAXBElement<AddBillResponse>(_AddBillResponse_QNAME, AddBillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBill }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBill }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getBill")
    public JAXBElement<GetBill> createGetBill(GetBill value) {
        return new JAXBElement<GetBill>(_GetBill_QNAME, GetBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBillResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getBillResponse")
    public JAXBElement<GetBillResponse> createGetBillResponse(GetBillResponse value) {
        return new JAXBElement<GetBillResponse>(_GetBillResponse_QNAME, GetBillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCus }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getCus")
    public JAXBElement<GetCus> createGetCus(GetCus value) {
        return new JAXBElement<GetCus>(_GetCus_QNAME, GetCus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getCusResponse")
    public JAXBElement<GetCusResponse> createGetCusResponse(GetCusResponse value) {
        return new JAXBElement<GetCusResponse>(_GetCusResponse_QNAME, GetCusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmp }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getEmp")
    public JAXBElement<GetEmp> createGetEmp(GetEmp value) {
        return new JAXBElement<GetEmp>(_GetEmp_QNAME, GetEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getEmpResponse")
    public JAXBElement<GetEmpResponse> createGetEmpResponse(GetEmpResponse value) {
        return new JAXBElement<GetEmpResponse>(_GetEmpResponse_QNAME, GetEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFilm }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getFilm")
    public JAXBElement<GetFilm> createGetFilm(GetFilm value) {
        return new JAXBElement<GetFilm>(_GetFilm_QNAME, GetFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFilmResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getFilmResponse")
    public JAXBElement<GetFilmResponse> createGetFilmResponse(GetFilmResponse value) {
        return new JAXBElement<GetFilmResponse>(_GetFilmResponse_QNAME, GetFilmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListFilm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListFilm }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getListFilm")
    public JAXBElement<GetListFilm> createGetListFilm(GetListFilm value) {
        return new JAXBElement<GetListFilm>(_GetListFilm_QNAME, GetListFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListFilmCategory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListFilmCategory }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getListFilmCategory")
    public JAXBElement<GetListFilmCategory> createGetListFilmCategory(GetListFilmCategory value) {
        return new JAXBElement<GetListFilmCategory>(_GetListFilmCategory_QNAME, GetListFilmCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListFilmCategoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListFilmCategoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getListFilmCategoryResponse")
    public JAXBElement<GetListFilmCategoryResponse> createGetListFilmCategoryResponse(GetListFilmCategoryResponse value) {
        return new JAXBElement<GetListFilmCategoryResponse>(_GetListFilmCategoryResponse_QNAME, GetListFilmCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListFilmResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListFilmResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getListFilmResponse")
    public JAXBElement<GetListFilmResponse> createGetListFilmResponse(GetListFilmResponse value) {
        return new JAXBElement<GetListFilmResponse>(_GetListFilmResponse_QNAME, GetListFilmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListShowTimesOfFilm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListShowTimesOfFilm }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getListShowTimesOfFilm")
    public JAXBElement<GetListShowTimesOfFilm> createGetListShowTimesOfFilm(GetListShowTimesOfFilm value) {
        return new JAXBElement<GetListShowTimesOfFilm>(_GetListShowTimesOfFilm_QNAME, GetListShowTimesOfFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListShowTimesOfFilmResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListShowTimesOfFilmResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getListShowTimesOfFilmResponse")
    public JAXBElement<GetListShowTimesOfFilmResponse> createGetListShowTimesOfFilmResponse(GetListShowTimesOfFilmResponse value) {
        return new JAXBElement<GetListShowTimesOfFilmResponse>(_GetListShowTimesOfFilmResponse_QNAME, GetListShowTimesOfFilmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShowTimesDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetShowTimesDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getShowTimesDetails")
    public JAXBElement<GetShowTimesDetails> createGetShowTimesDetails(GetShowTimesDetails value) {
        return new JAXBElement<GetShowTimesDetails>(_GetShowTimesDetails_QNAME, GetShowTimesDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShowTimesDetailsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetShowTimesDetailsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "getShowTimesDetailsResponse")
    public JAXBElement<GetShowTimesDetailsResponse> createGetShowTimesDetailsResponse(GetShowTimesDetailsResponse value) {
        return new JAXBElement<GetShowTimesDetailsResponse>(_GetShowTimesDetailsResponse_QNAME, GetShowTimesDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Register }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFilm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFilm }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "searchFilm")
    public JAXBElement<SearchFilm> createSearchFilm(SearchFilm value) {
        return new JAXBElement<SearchFilm>(_SearchFilm_QNAME, SearchFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFilmResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFilmResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "searchFilmResponse")
    public JAXBElement<SearchFilmResponse> createSearchFilmResponse(SearchFilmResponse value) {
        return new JAXBElement<SearchFilmResponse>(_SearchFilmResponse_QNAME, SearchFilmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePaidBill }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePaidBill }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "updatePaidBill")
    public JAXBElement<UpdatePaidBill> createUpdatePaidBill(UpdatePaidBill value) {
        return new JAXBElement<UpdatePaidBill>(_UpdatePaidBill_QNAME, UpdatePaidBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePaidBillResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePaidBillResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "updatePaidBillResponse")
    public JAXBElement<UpdatePaidBillResponse> createUpdatePaidBillResponse(UpdatePaidBillResponse value) {
        return new JAXBElement<UpdatePaidBillResponse>(_UpdatePaidBillResponse_QNAME, UpdatePaidBillResponse.class, null, value);
    }

}
