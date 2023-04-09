package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;
import com.service.UserService;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	User u = null;
	UserService us = new UserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
		
		
		String name = request.getParameter("name");
	String username = request.getParameter("username");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	
	 u = new User(username,name,email,password);
	
	 HttpSession session = request.getSession();
	 boolean status = us.register(u);
	 
	 if(status) {
		 session.setAttribute("msg", "user registered succesfully");
		 response.sendRedirect("register.jsp");
	 }
	 else {
		 session.setAttribute("msg", "Registration Failed");
		 response.sendRedirect("register.jsp");
	 }
		 
	 }
	 
	 
	}


