package com.servlet;

import java.io.IOException;
import com.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.Contact;

@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phn = request.getParameter("phn");
		String abt = request.getParameter("abt");
		int id = Integer.parseInt(request.getParameter("id"));
		Contact c = new Contact();
		c.setId(id);
		c.setAbout(abt);
		c.setEmail(email);
		c.setName(name);
		c.setPhoneno(phn);
		
		HttpSession session = request.getSession();
		 ContactService cs = new ContactService();
		boolean f = cs.update(c);
		 System.out.println(c);
		if(f) {
			session.setAttribute("msg12", "Contact Updated Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("viewcontact.jsp");
			rd.forward(request, response);
		}
		else {
			session.setAttribute("msg12", "Something Went wrong Record Not Updated Try Again");
			RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
			rd.forward(request, response);
			
		}
	}

}
