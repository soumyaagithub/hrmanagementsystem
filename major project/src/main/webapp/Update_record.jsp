<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<style >
*{
margin:0px;
padding:0px;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light text-primary">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu">
          <a class="dropdown-item" href="#">About</a>
          <a class="dropdown-item" href="#">Contact</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled">Disabled</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
<div class="container">
<div class="row">
<div class="col-md-6 offset-md-3">
<div class="card roundened-lg border border-danger">
<div class="card-header">
<h3 align="center">(--UPDATE RECORD)</h3>
</div>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.ResultSet"%>
<% 
String u = request.getParameter("u");
Integer employeeId = Integer.parseInt(u);
Class.forName( "com.mysql.jdbc.Driver");
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?characterEncoding=utf8","root","1234");
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("select * from emp where employee_id='"+employeeId+"'");

%>
<div class="card-body rounded-lg ">
<form action="UpdateRecord" method="post">
<% 
while(resultSet.next()){
	

%>
<div class= "form-group"> <input type="hidden" class="form-control" name="SID" value=" <% out.print(resultSet.getString("employee_id")); %>"></div>
<div class= "form-group"> <input type="hidden" class="form-control" name="SRNO" value=" <% out.print(resultSet.getString("employee_RNO")); %>"></div>
<input type="text" class="form-control" name="SNAME" value=" <% out.print(resultSet.getString("employee_name")); %>" >
</div>
<%
}
%>
<div class="card-footer text-center">
<input type="submit" value="Update" id="update" class="form-control btn-primary" >


</div>
</div>
</div>
</div>
</div>
<br><br><br>
</div>
<div class="card-title text-center">
<br><br>
<h5 class="card-title text-warning">BUILDING SUCCESS TOGETHER</h5>
<h4 class="card-text text-danger">PROJECT GROUP 3 IS  HIRING FOR JAVA DEVELOPER AND JAVA SCRIPT DEVELOPER</h4>
<a href="https://www.nisum.com/" class="btn btn_dark">FOR MORE UPDATES VISIT THIS SITES</a>
<br></br>
</div>
</div>

</body>
</html>