
package edu.bradley.gradebookservice;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GradeBookService", targetNamespace = "http://GradeBookService.bradley.edu/", wsdlLocation = "http://localhost:8080/GradeBookService/GradeBookService?wsdl")
public class GradeBookService_Service
    extends Service
{

    private final static URL GRADEBOOKSERVICE_WSDL_LOCATION;
    private final static WebServiceException GRADEBOOKSERVICE_EXCEPTION;
    private final static QName GRADEBOOKSERVICE_QNAME = new QName("http://GradeBookService.bradley.edu/", "GradeBookService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/GradeBookService/GradeBookService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GRADEBOOKSERVICE_WSDL_LOCATION = url;
        GRADEBOOKSERVICE_EXCEPTION = e;
    }

    public GradeBookService_Service() {
        super(__getWsdlLocation(), GRADEBOOKSERVICE_QNAME);
    }

    public GradeBookService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GRADEBOOKSERVICE_QNAME, features);
    }

    public GradeBookService_Service(URL wsdlLocation) {
        super(wsdlLocation, GRADEBOOKSERVICE_QNAME);
    }

    public GradeBookService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GRADEBOOKSERVICE_QNAME, features);
    }

    public GradeBookService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GradeBookService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GradeBookService
     */
    @WebEndpoint(name = "GradeBookServicePort")
    public GradeBookService getGradeBookServicePort() {
        return super.getPort(new QName("http://GradeBookService.bradley.edu/", "GradeBookServicePort"), GradeBookService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GradeBookService
     */
    @WebEndpoint(name = "GradeBookServicePort")
    public GradeBookService getGradeBookServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://GradeBookService.bradley.edu/", "GradeBookServicePort"), GradeBookService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GRADEBOOKSERVICE_EXCEPTION!= null) {
            throw GRADEBOOKSERVICE_EXCEPTION;
        }
        return GRADEBOOKSERVICE_WSDL_LOCATION;
    }

}