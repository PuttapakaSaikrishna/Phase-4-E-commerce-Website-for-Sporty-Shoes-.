package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserDao {
	@Autowired
    UserRepo repo;
	
	//insert
	public User insert(User u) {
		
		return repo.save(u);
	}
	
	//retreive
	public List<User> getall(){
		return repo.findAll();
	}
	
}
