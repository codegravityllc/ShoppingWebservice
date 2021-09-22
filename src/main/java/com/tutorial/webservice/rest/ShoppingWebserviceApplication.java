package com.tutorial.webservice.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories("com.springData")
@EntityScan({"com.springData"})
@EnableTransactionManagement
public class ShoppingWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingWebserviceApplication.class, args);
	}

}
