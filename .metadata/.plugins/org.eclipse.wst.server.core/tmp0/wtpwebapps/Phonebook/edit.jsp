<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.service.ContactService"%>
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
						<h4 class="text-center text-success">Edit Contact</h4>

					


						<%
						String msg = (String) session.getAttribute("msg12");

						if (msg != null) {
						%>

						<h6 class="text-center text-danger"><%=msg%></h6>

						<%
						session.removeAttribute("msg12");
						}
						%>

						<form action="update" method="post">
							<%
							
						String cid = request.getParameter("cid");
							
							int val = Integer.parseInt(cid);
							ContactService sc = new ContactService();
							Contact c = sc.getDetails(val);
							%>


		<input type="hidden" name="id" value="<%=c.getId()%>" />
							
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Name</label> <input
									type="text" class="form-control" name="name"
									value="<%=c.getName()%>">

								<div class="form-group">
									<label for="exampleInputEmail1">Email address</label> <input
										type="email" class="form-control" name="email"
										value="<%=c.getEmail()%>" aria-describedby="emailHelp">

								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Phone Number</label> <input
										type="text" class="form-control" name="phn"
										value="<%=c.getPhoneno()%>" aria-describedby="emailHelp">

								</div>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">About</label>
								<textarea rows="10" cols="75" name="abt"><%=c.getAbout()%></textarea>

							</div>

							<div class="text-center mt-2">

								<button type="submit" class="btn btn-primary">
									Update Contact
									</butqton>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>