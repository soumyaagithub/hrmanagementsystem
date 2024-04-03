<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Performance of employee</title>
<link rel="stylesheet" href="css/style1.css">
<link rel="stylesheet" type="text/css"
          th:href="@{/webjars/bootstrap/css/bootstrap.min.css}"  />
</head>
</head>
<body>
<form action="Performance" method="post">
<img class ="img-banner" src="images/company3.png" style="height: 800px">
<div class="form-group">
<label for="name">Name:</label> <input type="text"
class="form-control" name="name" required>
</div>
<div class="form-group">
<label for="email">Email:</label> <input type="email"
class="form-control" name="email" required>
</div>
<div class="form-group">
<label for="department">Department:</label> <input type="department"
class="form-control" name="department" required>
</div>
<div class="form-group">
<label for="grade">Grade:</label> <input type="grade"
class="form-control" name="grade" required>
</div>
<div class="form-group">
<label for="id">Emp_id:</label> <input type="id"
class="form-control" name="id" required>
</div>
<button type="submit" class="btn btn-primary">Submit</button>
<article class="img-info">
<h2>performance employee</h2>
<p>Performance management isn’t simply a once-a-year evaluation. 
Good performance management is a continuous, positive collaboration 
between you and your supervisor. By staying connected with your supervisor 
all year round, you can make adjustments to your work performance as needed, 
and your supervisor can assess and support your performance and ability to meet your annual goals.</p>
</article>
<img class ="img-me" src="images/company.png" alt="prativa mohapatra">
</div>
</form>
</body>
</html>
<style>
img {
width: 70%;
}
@media all and (max-width: 480px){
img {
width: 100%;
}
}
</style>