package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.app.entities.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

	@Autowired
	private ProductService prodServ;

	public ProductController() {
		System.out.println("in product controller ctor");
	}

	@GetMapping
	public List<Product> getAllDetails() {

		return prodServ.getAllProductDetails();

	}

	@PostMapping
	public Product getProductById(@RequestBody Product TransientProd) {
		return prodServ.addProductDetails(TransientProd);

	}

}
