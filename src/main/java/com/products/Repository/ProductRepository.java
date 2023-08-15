package com.products.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.products.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {
@Query(value="select * from prod_details where name like ?",nativeQuery = true)
	 List<Product> getByName(String a);
	

}
