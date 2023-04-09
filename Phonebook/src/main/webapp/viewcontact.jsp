<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.service.ContactService"%>
<%@ page import="com.entity.Contact"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PhoneBook</title>
<%@include file="Allcomponent/Allcss.jsp"%>




<style type="text/css">
.crd-ho:hover {
	background-color: #f7f7f7;
}
</style>
</head>



<body>
	<%@include file="Allcomponent/Navbar.jsp"%>

	<%
	String msg1 = (String) session.getAttribute("msg12");

	if (msg1 != null) {
	%>

	<h6 class="text-center text-success"><%=msg1%></h6>

	<%
	session.removeAttribute("msg12");
	}
	%>


	<%
	String msg12 = (String) session.getAttribute("msg123");

	if (msg12 != null) {
	%>

	<h6 class="text-center text-success"><%=msg12%></h6>

	<%
	session.removeAttribute("msg123");
	}
	%>


	<div class="container">
		<div class="row p-4">



			<%
			ContactService cs = new ContactService();

			List<Contact> ls = cs.getContact(user.getId());

			for (Contact c : ls) {
			%>
			<div class="col-md-3 text-center">





				<div class="card crd-ho">
					<div class="card-body">
						<h5>
							Name :<%=c.getName()%></h5>
						<p>
							Email :
							<%=c.getEmail()%></p>
						<p>
							Phone No. :<%=c.getPhoneno()%></p>
						<p>
							About :<%=c.getAbout()%></p>
						<div class="text-center">
							<a href="edit.jsp?cid=<%=c.getId()%>"
								class="btn btn-success btn-sm text-white">Edit</a> 
								<a href="delete?cid=<%=c.getId()%>"
								class="btn btn-danger btn-sm text-white">Delete</a> 
							
						</div>
					</div>
				</div>
			</div>
			<%
			}
			%>

		</div>
	</div>

</body>
</html>