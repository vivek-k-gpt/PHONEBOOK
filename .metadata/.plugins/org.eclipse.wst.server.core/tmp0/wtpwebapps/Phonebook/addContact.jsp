

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PhoneBook</title>
<%@include file="Allcomponent/Allcss.jsp"%>
</head>
<body>
	<%@include file="Allcomponent/Navbar.jsp"%>


	<div class="container-fluid">
		<div class="row p-2">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-success">Add Contact</h4>



						<%
						String msg = (String) session.getAttribute("msg");

						if (msg != null) {
						%>

						<h6 class="text-center text-danger"><%=msg%></h6>

						<%
						session.removeAttribute("msg");
						}
						%>


<% 
User us = (User)session.getAttribute("user");

%>

						<form action="add" method="post">
							
							<input type="hidden" name="userid" value="<%=us.getId()%>" />
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Name</label> <input
									type="text" class="form-control" name="name">

								<div class="form-group">
									<label for="exampleInputEmail1">Email address</label> <input
										type="email" class="form-control" name="email"
										aria-describedby="emailHelp">

								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Phone Number</label> <input
										type="text" class="form-control" name="phn"
										aria-describedby="emailHelp">

								</div>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">About</label>
								<textarea rows="10" cols="75" name="abt"></textarea>

							</div>

							<div class="text-center mt-2">

								<button type="submit" class="btn btn-primary">Save
									Contact</button>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>