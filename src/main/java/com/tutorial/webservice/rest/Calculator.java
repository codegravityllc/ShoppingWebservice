package com.tutorial.webservice.rest;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="this is my service to add and substract")
public class Calculator{
	Logger log=Logger.getLogger("Calculator");
	@ApiOperation(value="this is used for adding 2 numbers")
	@RequestMapping(value = "/addition", method = RequestMethod.GET)
	public int add(@RequestParam("input1") int a, @RequestParam("input2") int b) {
		return a+b;
	}
	@RequestMapping(value = "/substraction/{param1}/{param2}", method = RequestMethod.GET)
	public int sub(@PathVariable(name="param1") int a, @PathVariable(name="param2") int b) {
		return a-b;
	}
	@RequestMapping(value = "/reg", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	
	// consumes : input is json
	// json input into Address java object
	public boolean registration (@RequestBody Address a){
		System.out.print(a.street);
		return true;
	}
	
	// http://localhost:8888/getProfile
	@RequestMapping(value = "/getProfile", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	// produces: output is json
	// Address java object into json string
	public Address getProf (   ){
		Address a=new Address();
		a.street="street123";
		a.state="NY";
		a.city="nnyy";
		a.country="usa";
		return a;
				
	}
}


