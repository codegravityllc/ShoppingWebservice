package com.tutorial.webservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProductController {
	 
	@Autowired
	TestProductService tps;
	
	// http://localhost:8888/addProduct/Iphone
	@RequestMapping(value = "/addProduct/{product}", method = RequestMethod.GET)
	public boolean add(@PathVariable(name="product") String product) throws Exception {
		tps.add(product);
		return true;
	}

	@RequestMapping(value = "/deleteProduct/{product}", method = RequestMethod.GET)
	public boolean delete(@PathVariable(name="product") String product) throws Exception {
		tps.remove(product);
		return true;
	}
	
	@RequestMapping(value = "/updateProduct/{product}/{quantity}", method = RequestMethod.GET)
	public boolean update(@PathVariable(name="product") String product,
			@PathVariable(name="quantity") int quant
			) throws Exception {
		tps.updateStock(product,quant);
		return true;
	}
	
	@RequestMapping(value = "/getQuantity/{product}", method = RequestMethod.GET)
	public int read(@PathVariable(name="product") String product) throws Exception {
		int qu=tps.readQuantity(product);
		return qu;
	}
	
	@RequestMapping(value = "/getProduct/{quant}", method = RequestMethod.GET)
	public String read(@PathVariable(name="quant") int quantity) throws Exception {
		String prod=tps.readProd(quantity);
		return prod;
	}
	
}