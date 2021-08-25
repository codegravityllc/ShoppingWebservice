package com.tutorial.webserviceClient.rest;
import org.springframework.web.client.RestTemplate;

import com.tutorial.webserviceClient.rest.Input;
import com.tutorial.webserviceClient.rest.Output;

public class RestClientMain {

	public static void main(String[] args) {
		testAdd();
		testSub();
		testMultiplyJsonReq();
		testJsonRes();
	}
/*	
	Get Http client
	URL = ? includes url and input both
	Response = what output is expected from rest services
		int/string/float etc.. if response is json an object(json compliant)
*/
	public static void testAdd() {
		RestTemplate getTest=new RestTemplate(); // similar to soap stub program
		int res=getTest.getForObject("http://localhost:8888/addCal/3/12", 
				Integer.class);
		System.out.println("Add rest service result :"+res);
	}
	// get method
	// URL = url include http part + input
	// output = resonse
	public static void testSub() {
		RestTemplate getTest=new RestTemplate();
		int res=getTest.getForObject("http://localhost:8888/subCal?param1=100&param2=20", Integer.class);
		System.out.println("Sub rest service result :"+res);
	}
/*
	Post Http client
	URL = ? includes url 
	Request = if sending json input pass object(json compliant) 
	Response = what output is expected from rest services
		int/string/float etc.. object(json compliant) if response is json
*/
	public static void testMultiplyJsonReq()
	{
		RestTemplate postTest=new RestTemplate();
		Input input=new Input();
		input.param1=20; 
		input.param2=100; 
		// { "param1":20 , "param2":50 }
		int res=postTest.postForObject("http://localhost:8888/jsonReqMul",
				input,
				Integer.class);
		// Rest template
		// 1) convert input reference into json string. { "param1":20 , "param2":50 }
		// 2) make a call to url.. and pass above json string in the body
		// 3) webservice response is converted into 3 parameter 
		System.out.println("Mul rest service with json input result:"+res);
	}
	public static void testJsonRes()
	{
		RestTemplate postTest=new RestTemplate();
		Output res=postTest.getForObject("http://localhost:8888/jsonRes/10/5", Output.class);
		/*
		{
		    "sum": 15,
		    "sub": 5,
		    "mul": 50,
		    "div": 2
		}
		*/
		System.out.println(res.sum);
		System.out.println(res.sub);
		System.out.println(res.mul);
		System.out.println(res.div);
		
		
	}
}
