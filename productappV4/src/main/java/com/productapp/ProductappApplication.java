package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;

@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//some code
		productService.add(new Product("rich dad poor dad", 500.00));
		productService.add(new Product("laptop", 500000.00));
		System.out.println("---------------------------");
	}

}
