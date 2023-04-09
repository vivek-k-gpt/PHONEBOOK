<%@page import="java.sql.Connection"%>
<%@page import="com.conn.DBconnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PhoneBook</title>
<%@include  file="Allcomponent/Allcss.jsp" %>



<style>



.txt{
color:black;
font-size: 30px;
font-weight: 900;
word-spacing: 2px;
}

.back-img{
background-image: url("img/a.jpg");
background-size: cover;
width: 100%;
height:80vh;
}

</style>

</head>


<body>
	<%@include  file="Allcomponent/Registernavbar.jsp" %>
	

	<div class="container-fluid back-img text-center">
	<marquee><h1 class="txt">Welcome to Phonebook App</h1></marquee>
	</div>
	
<%@include  file="Allcomponent/footer.jsp" %>
</body>
</html>