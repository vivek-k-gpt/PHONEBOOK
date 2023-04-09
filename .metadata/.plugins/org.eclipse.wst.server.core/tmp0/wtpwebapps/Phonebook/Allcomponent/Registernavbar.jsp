<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PhoneBook</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark  bg-primary">
  <a class="navbar-brand" href="index.jsp"><i class="fas fa-phone-square-alt"></i>Phonebook</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
     <li class="nav-item active">
        <a class="nav-link" href="About.jsp">About us </a>
      </li>
      
      <li class="nav-item active">
        <a class="nav-link" href="contact.jsp">Contact us</a>
      </li>
    
      
    </ul>
    <form class="form-inline my-2 my-lg-0">
     <a href="login.jsp"   class="btn btn-success">Login</a>
     <a href="register.jsp" class="btn btn-danger ml-2">Register</a>
    </form>
  </div>
</nav>

</body>
</html>