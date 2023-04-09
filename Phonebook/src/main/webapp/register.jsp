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
					
<h4 class="text-center text-success">Welcome to Registaration Page</h4>
   <% 
   String statusmsg = (String)session.getAttribute("msg");
   
   
   if(statusmsg != null){
 
  %>
  
  <p class="text-center text-primary"><%=statusmsg %></p>
  
  <% 
  
  session.removeAttribute("msg");
  } %>


						<form action="register" method="post">
							<div class="form-group">
								<label for="exampleInputPassword1">Name</label> <input
									type="text" name="name" class="form-control" id="examplename">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Username</label> <input
									type="text" name="username" class="form-control" id="exampleuser"
									>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="email" name="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" >

							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" name="password" class="form-control" id="exampleInputPassword1"
								>
							</div>

<div class="text-center mt-2">

<button type="submit" class="btn btn-primary">Register</button>
</div>
							
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>