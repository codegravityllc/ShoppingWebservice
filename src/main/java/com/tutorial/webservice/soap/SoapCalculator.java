package com.tutorial.webservice.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
@WebService// annotation- program configuration
public class SoapCalculator {
	
	public int add( int p1, int p2) {
		System.out.println("adding "+p1+"  "+p2); 
		return p1+p2;
	}
	public boolean login(String userid,String password) {
		if(userid.equals("john") && password.equals("john1!"))
			return true;
		else
			return false;
		
	}
}
