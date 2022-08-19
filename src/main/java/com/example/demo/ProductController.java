package com.example.demo;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@ResponseBody
@Controller
public class ProductController {

	@Autowired
	ProductDao dao;
	
	@RequestMapping("/add")
	public String insert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Product p=new Product();
	//p.setId(Integer.parseInt(request.getParameter("id")));
	p.setDescription(request.getParameter("description"));
	p.setPrice(Integer.parseInt(request.getParameter("price")));
	p.setProduct(request.getParameter("product"));
	p.setQuantity(Integer.parseInt(request.getParameter("quantity")));
	Product pp=dao.insert(p);
	if(pp!=null) {
		mv.setViewName("success.jsp");
	}
	return "inserted succeessfully...check in the all the products";
	}

@RequestMapping("/getall")
public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	List<Product> list=dao.getall();
	mv.setViewName("allProducts.jsp");
	mv.addObject("list",list);
	return mv;	
 }

@RequestMapping("/getAllForUser")
public ModelAndView getAllForUser(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	List<Product> list=dao.getall();
	mv.setViewName("allProductsForUsers.jsp");
	mv.addObject("list",list);
	return mv;	
 }

@RequestMapping("/update")
public String update(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Product p=new Product();
//p.setId(Integer.parseInt(request.getParameter("id")));
p.setDescription(request.getParameter("description"));
p.setPrice(Integer.parseInt(request.getParameter("price")));
p.setProduct(request.getParameter("product"));
p.setQuantity(Integer.parseInt(request.getParameter("quantity")));
Product pp=dao.insert(p);
 if(pp!=null) {
	mv.setViewName("success.jsp");
}
return "updated successfully...check in the all the products";

 }
  @RequestMapping("/delete")
  public String delete(HttpServletRequest request,HttpServletResponse response) {
	  Product p=new Product();
	  p.deleteByid(Integer.parseInt(request.getParameter("id")));
	
	return "deleted successfully....check in the all the products";	  
 }
}