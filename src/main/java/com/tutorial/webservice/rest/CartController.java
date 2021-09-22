package com.tutorial.webservice.rest;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("prototype")
public class CartController{
	@Autowired
	CartBean cb;
	// http://localhost:8888/add2Cart/iphone
	@RequestMapping (value = "/add2Cart/{product}",method = RequestMethod.GET)
	public ArrayList<String> add (@PathVariable(name="product") String product) throws Exception 
	{
		ArrayList<String> cart=cb.add(product);
		return cart;
	}
}