
package com.htc.test.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VisaWS", targetNamespace = "http://ws.test.htc.com/", wsdlLocation = "http://localhost:8080/PaymentService/VisaWS?wsdl")
public class VisaWS_Service
    extends Service
{

    private final static URL VISAWS_WSDL_LOCATION;
    private final static WebServiceException VISAWS_EXCEPTION;
    private final static QName VISAWS_QNAME = new QName("http://ws.test.htc.com/", "VisaWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/PaymentService/VisaWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VISAWS_WSDL_LOCATION = url;
        VISAWS_EXCEPTION = e;
    }

    public VisaWS_Service() {
        super(__getWsdlLocation(), VISAWS_QNAME);
    }

    public VisaWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VISAWS_QNAME, features);
    }

    public VisaWS_Service(URL wsdlLocation) {
        super(wsdlLocation, VISAWS_QNAME);
    }

    public VisaWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VISAWS_QNAME, features);
    }

    public VisaWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VisaWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VisaWS
     */
    @WebEndpoint(name = "VisaWSPort")
    public VisaWS getVisaWSPort() {
        return super.getPort(new QName("http://ws.test.htc.com/", "VisaWSPort"), VisaWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VisaWS
     */
    @WebEndpoint(name = "VisaWSPort")
    public VisaWS getVisaWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.test.htc.com/", "VisaWSPort"), VisaWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VISAWS_EXCEPTION!= null) {
            throw VISAWS_EXCEPTION;
        }
        return VISAWS_WSDL_LOCATION;
    }

}
