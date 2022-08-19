package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {

	@Autowired
    ProductRepo repo;
	
	//insert
	public Product insert(Product p) {
		
		return repo.save(p);
	}
	
	//retreive
	public List<Product> getall(){
		return repo.findAll();
	}
	
	//update
	public Product update(Product s) {
		//
		Product pp=repo.findById(s.getId()).orElse(null);
		            //kishore
		pp.setProduct(s.getProduct());
		return repo.save(pp);
	}
	//delete 
	public void deleteByid(int id) {
		repo.deleteById(id);
		
	}

}