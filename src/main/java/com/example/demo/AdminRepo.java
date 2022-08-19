package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepo extends JpaRepository<Admin,String>{

 //                table     pojo  table       table.coloumnname
	@Query("select admin from Admin admin where admin.username=?1")
	public Admin findbyusername(String username);
	
	
	@Query("select admin from Admin admin where admin.password=?1")
	public Admin findbypassword(String password);


}