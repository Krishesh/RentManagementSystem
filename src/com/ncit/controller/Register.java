package com.ncit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ncit.model.UserServiceImpl;
import com.ncit.userservice.User;
import com.ncit.userservice.UserService;

public class Register extends HttpServlet {

	ServletContext context;
	RequestDispatcher disp;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		
		String fullname = req.getParameter("fullname");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		  String email = req.getParameter("email"); String phone =
		  req.getParameter("phone");
		 
		
		User Ruser = new User();
		Ruser.setUsername(username);
		Ruser.setPassword(password);
		  Ruser.setFullname(fullname);
		  Ruser.setEmail(email); 
		  Ruser.setMobile(phone);
		
		
		UserService usrService = new UserServiceImpl();
		boolean createuser = usrService.create(Ruser);
		
		if(createuser){
			disp = context.getRequestDispatcher("/home.jsp");
		} 
		else {
			disp = context.getRequestDispatcher("/index.jsp");
		}
		
		disp.forward(req, resp);
	}
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		doPost(req, resp);
	}

}
