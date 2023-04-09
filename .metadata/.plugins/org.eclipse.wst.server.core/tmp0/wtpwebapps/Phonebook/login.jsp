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
	<%@include file="Allcomponent/Registernavbar.jsp"%>

	<div class="container-fluid">
		<div class="row p-2">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-success">Welcome to Login Page</h4>


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
						String msg1 = (String) session.getAttribute("logmsg");

						if (msg1 != null) {
						%>

						<h6 class="text-center text-success"><%=msg1%></h6>

						<%
						session.removeAttribute("logmsg");
						}
						%>


						<form action="login" method="post">

							<div class="form-group">
								<label for="exampleInputPassword1">Username</label> <input
									type="text" class="form-control" name="username">
							</div>

							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" name="password">
							</div>

							<div class="text-center mt-2">

								<button type="submit" class="btn btn-primary">Login</button>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>