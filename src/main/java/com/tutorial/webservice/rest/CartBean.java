package com.tutorial.webservice.rest;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class CartBean {
	ArrayList<String> cartList = new ArrayList<String>();
	public ArrayList<String> add(String prodName){
		cartList.add(prodName);
		return cartList;
	}
}
