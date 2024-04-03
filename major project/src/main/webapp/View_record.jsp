<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="java.io.IOException" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

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
<div class="card">
<div class="card-header text-center">
<!-- <h5 class="card-title text-primary">REGISTRATION SUCCESSFULLY</h5>
<h4 class="card-text" text-success">hjgtgftftuuguihijij</h4> -->
<a href="#" class="btn btn-primary">CRUD OPERATION</a>
</div>
<br>
<h2 align="center">EMPLOYEE RECORDS</h2>
<a href="index.jsp" class="btn btn-info">NEW REGISTRATION</a>

<table class="table table-hover text-center">
<thead>
<tr>
<th scope="col">EMPLOYEE_ID</th>
<th scope="col">EMPLOYEE_REGNO</th>
<th scope="col">EMPLOYEE_NAME</th>
<th scope="col">UPDATE</th>
<th scope="col">DELETE</th>
</thead>
</tbody>
<%
Connection connection =null;
Statement statement =null;
ResultSet resultSet= null;
try{
	Class.forName("com.mysql.jdbc.Driver");
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?charcterEncoding=utf8","root","1234");
	statement = connection.createStatement();
	resultSet = statement.executeQuery("select * from  employee.emp");
	while( resultSet.next()){
		
%>
<tr align="center">
<th scope="row"> <% out.println( resultSet.getString("employee_id")); %></th>
<td><b> <% out.println( resultSet.getString("employee_RNO")); %></b></td>
<td scope="row"> <b> <% out.println( resultSet.getString("employee_name")); %></b></td>
<td><div class="card" style="width: 5rem;">
<a href='Update_record.jsp?u=<%=resultSet.getString("employee_id")%>' class="btn btn-success"><b>Edit</b></a>
<td><b> <form action='DeleteRecord?d=<%=resultSet.getString("employee_id")%>' method="post"> <div class="card" style="width: 5rem">
<input type="submit" name="delete" value="Delete" id="<%=resultSet.getString("employee_id") %>"  class="form-control btn-danger font-weight-bolder"></form>
</div></form></b></td>
 
 </tr>
 <%  }
}catch(Exception e){
	e.printStackTrace();
}

 %>
</tbody>
</table>
<hr>
<div class="card-footer bg-info text-center">
<br><br>
</div>
</div>
</body>
</html>