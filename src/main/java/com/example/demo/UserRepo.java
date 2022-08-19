package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,String> {
	@Query("select user from User user where user.username=?1")
	public User findbyusername(String username);
	@Query("select user from User user where user.password=?1")
	public User findbypassword(String password);

}
//1 is parameter
