package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.Contact;
import com.service.*;

@WebServlet("/add")
public class Addcontact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Contact c = null;
	ContactService cs = new ContactService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phn = request.getParameter("phn");
		String abt = request.getParameter("abt");
		int uid = Integer.parseInt(request.getParameter("userid"));
		System.out.println(uid);

	  c = new Contact(uid, name,email,phn,abt);

		HttpSession session = request.getSession();

		boolean f1 = cs.add(c);

		if (f1) {
			session.setAttribute("msg", "Contact Saved Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("addContact.jsp");
			rd.forward(request, response);
		} else {
			session.setAttribute("msg", "Something Went wrong Record Not Updated Try Again");
			RequestDispatcher rd = request.getRequestDispatcher("addContact.jsp");
			rd.forward(request, response);

		}

	}

}
