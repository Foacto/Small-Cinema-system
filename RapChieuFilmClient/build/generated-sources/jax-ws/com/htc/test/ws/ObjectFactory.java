
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

    private final static QName _MakePayment_QNAME = new QName("http://ws.test.htc.com/", "makePayment");
    private final static QName _MakePaymentResponse_QNAME = new QName("http://ws.test.htc.com/", "makePaymentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.htc.test.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MakePayment }
     * 
     */
    public MakePayment createMakePayment() {
        return new MakePayment();
    }

    /**
     * Create an instance of {@link MakePaymentResponse }
     * 
     */
    public MakePaymentResponse createMakePaymentResponse() {
        return new MakePaymentResponse();
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePayment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakePayment }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "makePayment")
    public JAXBElement<MakePayment> createMakePayment(MakePayment value) {
        return new JAXBElement<MakePayment>(_MakePayment_QNAME, MakePayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePaymentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakePaymentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.test.htc.com/", name = "makePaymentResponse")
    public JAXBElement<MakePaymentResponse> createMakePaymentResponse(MakePaymentResponse value) {
        return new JAXBElement<MakePaymentResponse>(_MakePaymentResponse_QNAME, MakePaymentResponse.class, null, value);
    }

}
