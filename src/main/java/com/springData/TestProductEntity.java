package com.springData;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="testproduct")
public class TestProductEntity {
	@Id
	@Column(name="product")
	String prod;

	@Column(name="quantity")
	int qua;
	
	public int getQua() {
		return qua;
	}

	public void setQua(int qua) {
		this.qua = qua;
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}
	
}
