<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee leave application</title>
<!-- Add Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- Add Custom CSS -->
<style>
body {
	background-color: #f5f5f5;
}

.contact-container {
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
	padding: 30px;
	margin-top: 20px;
}

.contact-header {
	text-align: center;
}

.contact-form {
	margin-top: 20px;
}

.form-group label {
	font-weight: bold;
}

.btn-primary {
	background-color: #007bff;
	border: none;
}

.btn-primary:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="container contact-container">
		<h1 class="contact-header"> Employee Leave Application</h1>
		<div class="row">
			<div class="col-md-6 mx-auto contact-form">
				<form action="Leave" method="post">
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
					<label for="leave">leave from:</label> <input type="leave"
							class="form-control" name="leave" required>
						</div>
						<div class="form-group">
					<label for="leave1">Leave to:</label> <input type="leave1"
							class="form-control" name="leave1" required>
						</div>	

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>

	<!-- Add Bootstrap JS and Popper.js (for Bootstrap tooltips and popovers) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
