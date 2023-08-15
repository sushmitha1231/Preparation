package com.products.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.ProductException.ProductNotFoundException;
import com.products.entity.Product;
import com.products.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;

	@PostMapping("/setProduct")
	public String setProduct(@RequestBody Product p) {
		return ps.setProduct(p);
	}

	@PostMapping("/setAllProduct")
	public String setAllProduct(@RequestBody List<Product> p) {
		return ps.setAllProduct(p);

	}

	@GetMapping("/getByIdProduct/{id}")
	public Product getProduct(@PathVariable int id) {
		return ps.getProduct(id);

	}

	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct() {
		return ps.getAllProduct();

	}

	@GetMapping("/getString")
	public String getString() {
		return "Hello World";
	}

	@GetMapping("/getByName/{a}")
	public List<Product> getByName(@PathVariable String a) throws ProductNotFoundException {
		return ps.getByname(a);
	}

}
