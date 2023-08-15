package com.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.Dao.ProductDao;
import com.products.ProductException.ProductNotFoundException;
import com.products.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao pd;

	public String setProduct(Product p) {
		return pd.setProduct(p);
	}

	public String setAllProduct(List<Product> p) {

		return pd.setAllProduct(p);
	}

	public Product getProduct(int id) {
		return pd.getProduct(id);

	}

	public List<Product> getAllProduct() {
		return pd.getAllProduct();
	}

	public List<Product> getByname(String a) throws ProductNotFoundException {

		// List<Product> pro = getAllProduct().stream().filter(x ->
		// x.getName().equalsIgnoreCase(a)).toList();
		List<Product> pro = pd.getByName(a);
		if (pro.isEmpty()) {

			throw new ProductNotFoundException("not present");
		} else {

			return pd.getByName(a);
		}
		// return pd.getByName(a).orElseThrow(()->new ProductNotFoundException("product
		// unavailable"));
	}
}
