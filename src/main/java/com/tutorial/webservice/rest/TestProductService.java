package com.tutorial.webservice.rest;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springData.ITestProductRepository;
import com.springData.TestProductEntity;

@Service
public class TestProductService {
	
	@Autowired
	ITestProductRepository repo;
	
	public void add(String prod) {
		TestProductEntity tpe=new TestProductEntity();
		tpe.setProd(prod);
		repo.save(tpe); // if product name does not exist
		// save method will insert new record
	}

	public void remove(String prod) {
		TestProductEntity tpe=new TestProductEntity();
		tpe.setProd(prod);
		repo.delete(tpe);
	}
	
	public void updateStock(String prod,int qu) {
		TestProductEntity tpe=new TestProductEntity();
		tpe.setProd(prod);
		tpe.setQua(qu);
		repo.save(tpe);// if product name exist
		// save method will update existing record
	}
	public int readQuantity(String pro) {
		Optional<TestProductEntity> tpe =repo.findById(pro);
		return tpe.get().getQua();
	}
	
	public String readProd(int quant) {
		ArrayList<TestProductEntity> res= repo.findByQua(quant);
		if(res.size() == 0)
			return "No Products matching quantity";
		else 
			return res.get(0).getProd();
		
	}
	
	
}
