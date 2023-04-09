<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.entity.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark  bg-primary">
		<a class="navbar-brand" href="#"><i
			class="fas fa-phone-square-alt"></i>Phonebook</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				
				<li class="nav-item active"><a class="nav-link"
					href="addContact.jsp"><i class="fas fa-plus-square"></i>Add
						Phone Number</a></li>

				<li class="nav-item active"><a class="nav-link"
					href="viewcontact.jsp"><i class="fas fa-eye"></i>View Contact</a></li>

			</ul>
			<%
			User user = (User) session.getAttribute("user");

			if (user != null) {
			%>

			<form class="form-inline my-2 my-lg-0">
				<button class="btn btn-success"><%=user.getName()%></button>
				<a class="btn btn-danger ml-2" data-toggle="modal"
					data-target="#exampleModalCenter">Log out</a>

				<%
				}

				else {
				response.sendRedirect("login.jsp");
				}
				%>






			</form>
		</div>
		<!-- Button trigger modal -->


		<!-- Modal -->
		<div class="modal fade" id="exampleModalCenter" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalCenterTitle"
			aria-hidden="true">
			<div class="modal-dialog modal-dialog-centered" role="document">
				<div class="modal-content">
					
					<div class="modal-body">
					<h6>Do you want to logout?</h6>
					<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<a href="logout" type="button" class="btn btn-primary">Logout</a></div>
					<div class="modal-footer">
						
					</div>
				</div>
			</div>
		</div>
	</nav>

</body>
</html>