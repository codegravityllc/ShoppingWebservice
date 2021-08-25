package com.tutorial.webserviceClient.soap;

import com.tutorial.webserviceClient.soap.SoapCalculatorService;

public class SoapClientMain {
	
	public static void main(String[] args) {
		testAddService();
	}
	public static void testAddService() {
		SoapCalculatorService sc=new SoapCalculatorService();
		int res=sc.getSoapCalculatorPort().add(20, 25);
		System.out.println("Soap webservice Add Result:"+res);
	}
	
}

