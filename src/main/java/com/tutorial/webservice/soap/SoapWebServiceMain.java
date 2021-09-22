package com.tutorial.webservice.soap;
import javax.xml.ws.Endpoint;
public class SoapWebServiceMain {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:6060/math", new Math());
	}

}
