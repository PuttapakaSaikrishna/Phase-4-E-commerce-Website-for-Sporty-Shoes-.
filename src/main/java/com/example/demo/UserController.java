package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	UserRepo repo;
	@Autowired
	UserDao dao;
	
	
	//this is for userlogin
	@RequestMapping("/User")
	public ModelAndView User(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		if(repo.findbyusername(username).equals(repo.findbypassword(password))) {			
			HttpSession session=req.getSession();
     		session.setAttribute("username", username);
			mv.setViewName("home.jsp");
		}else
		{
			mv.setViewName("failure.jsp");
		}
		return mv;
		
	 
}
	//this is for register
	@RequestMapping("/adduser")
	public String insert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User u=new User();
	u.setEmail(request.getParameter("email"));
	u.setPassword(request.getParameter("password"));
	u.setUsername(request.getParameter("username"));
	
	User uu=dao.insert(u);
	if(uu!=null) {
		mv.setViewName("userregister.jsp");
	}
	return "index.jsp";
	}
	

@RequestMapping("/all")
public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	List<User> list=dao.getall();
	mv.setViewName("allusers.jsp");
	mv.addObject("list",list);
	return mv;	
 }


}