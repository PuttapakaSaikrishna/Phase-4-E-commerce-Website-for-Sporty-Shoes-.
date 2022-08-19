package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface ProductRepo extends JpaRepository<Product, Integer> {
//	@Query("delete product from Product product where product.id=?1")
//	public Product deletebyid(int id);
}
