package com.tutorial.webservice.rest;

import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class cal{
	
	// http://localhost:8888/adds?param1=25&param2=10
	@RequestMapping(value = "/adds", method = RequestMethod.POST)
	public int add(@RequestParam("param1")  int a,
			@RequestParam("params2") int b){
		return a+b;
	}
	@RequestMapping(value = "/subs/{x}/{y}", method = RequestMethod.GET)
	public int sub(@PathVariable(name="x")  int a,@PathVariable(name="y")  int b){
		return a-b;
	}

	@RequestMapping(value = "/muls", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public int mul(@RequestBody restinput ri){
		return ri.input1 * ri.input2;
	}
	
	
	@RequestMapping(value = "/allcal/{x}/{y}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public restoutput mul(@PathVariable(name="x")  int a,@PathVariable(name="y")  int b){
		restoutput result=new restoutput();
		result.add=a+b;
		result.sub=a-b;
		result.mul=a*b;
		result.div=a/b;
		return result;
	}
	
}