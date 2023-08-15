package com.products.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.products.Repository.ProductRepository;
import com.products.entity.Product;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;

	public String setProduct(Product p) {
		pr.save(p);
		return "Saved";
	}

	public String setAllProduct(List<Product> p) {
		pr.saveAll(p);
		return "Saved sucessfully";
	}

	public Product getProduct(int id) {
		return pr.findById(id).get();

	}

	public List<Product> getAllProduct() {
		return pr.findAll();
	}

	public List<Product> getByName(String a) {

		return pr.getByName(a);
	}

}
