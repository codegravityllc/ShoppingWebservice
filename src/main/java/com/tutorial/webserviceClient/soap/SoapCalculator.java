
package com.tutorial.webserviceClient.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SoapCalculator", targetNamespace = "http://soap.webservice.tutorial.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapCalculator {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://soap.webservice.tutorial.com/", className = "com.tutorial.webserviceClient.soap.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://soap.webservice.tutorial.com/", className = "com.tutorial.webserviceClient.soap.AddResponse")
    @Action(input = "http://soap.webservice.tutorial.com/SoapCalculator/addRequest", output = "http://soap.webservice.tutorial.com/SoapCalculator/addResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://soap.webservice.tutorial.com/", className = "com.tutorial.webserviceClient.soap.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://soap.webservice.tutorial.com/", className = "com.tutorial.webserviceClient.soap.LoginResponse")
    @Action(input = "http://soap.webservice.tutorial.com/SoapCalculator/loginRequest", output = "http://soap.webservice.tutorial.com/SoapCalculator/loginResponse")
    public boolean login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
