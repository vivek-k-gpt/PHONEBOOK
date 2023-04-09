package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.ContactService;



@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int s = Integer.parseInt(request.getParameter("cid"));
		ContactService cs = new ContactService();
		 boolean b = cs.delete(s);
		 
		 HttpSession session = request.getSession();
		 

			if (b) {
				session.setAttribute("msg123", "Contact  Deleted Successfully");
				RequestDispatcher rd = request.getRequestDispatcher("viewcontact.jsp");
				rd.forward(request, response);
			} else {
				session.setAttribute("msg123", "Something Went wrong Record Not Deleted Try Again");
				RequestDispatcher rd = request.getRequestDispatcher("viewcontact.jsp");
				rd.forward(request, response);

			}
		
	}



}
