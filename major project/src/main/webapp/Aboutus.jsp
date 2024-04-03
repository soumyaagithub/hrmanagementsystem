<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>About Us - Employee Management System</title>
<link rel="stylesheet" href="style.css">
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
}

header {
	background-color: #333;
	color: #fff;
	padding: 20px;
	text-align: center;
}

nav ul {
	list-style: none;
	padding: 0;
}

nav ul li {
	display: inline;
	margin-right: 20px;
}

nav a {
	text-decoration: none;
	color: #fff;
}

/* About Us Section */
.about-section {
	margin: 20px;
	padding: 20px;
}

/* Contact Info Section */
.contact-info {
	margin: 20px;
	padding: 20px;
	background-color: #f9f9f9;
}

/* Footer */
footer {
	background-color: #333;
	color: #fff;
	text-align: center;
	padding: 10px;
}

/* new */
.card-container {
	display: flex;
	justify-content: space-between;
	padding-right: 28px;
}

img {
	border-radius: 5px 5px 0 0;
}

.flip-card {
	background-color: transparent;
	width: 300px;
	height: 200px;
	border: 1px solid #f1f1f1;
	perspective: 1000px; /* Remove this if you don't want the 3D effect */
}

/* This container is needed to position the front and back side */
.flip-card-inner {
	position: relative;
	width: 100%;
	height: 100%;
	text-align: center;
	transition: transform 0.8s;
	transform-style: preserve-3d;
}

/* Do an horizontal flip when you move the mouse over the flip box container */
.flip-card:hover .flip-card-inner {
	transform: rotateY(180deg);
}

/* Position the front and back side */
.flip-card-front, .flip-card-back {
	position: absolute;
	width: 100%;
	height: 100%;
	-webkit-backface-visibility: hidden; /* Safari */
	backface-visibility: hidden;
}

/* Style the front side (fallback if image is missing) */
.flip-card-front {
	background-color: #bbb;
	color: black;
}

/* Style the back side */
.flip-card-back {
	background-color: dodgerblue;
	color: white;
	transform: rotateY(180deg);
	  
}
</style>
</head>
<body>
	<header>
		<h1>About Us</h1>
		<nav>
			<ul>
				<li><a href="Home.jsp">Home</a></li>
				<li><a href="services.html">Services</a></li>
				<li><a href="contactUs.jsp">Contact</a></li>
			</ul>
		</nav>
	</header>

	<section class="about-section">
		<h2>Our Employee Management System</h2>
		<p>Welcome to our  Management System, Employees produce the final product, 
		take care of finances, promote your business, and maintain the records for 
		decision-making. They figure out how to keep making items and selling them 
		to your customers. Without your employees, you would not have a product or 
		service to sell to customers..</p>

		<h3>Our Mission</h3>
		<p>Our mission is to offer safe, affordable, and convenient
			accommodations to our guests. We strive to create a welcoming
			environment that feels like a home away from company.</p>

		<h3>Our Team</h3>
		<p>We have a dedicated team of staff members who are committed to
			ensuring your stay with us is pleasant. take employees to court to make them pay
			 an amount of money (for example, if the employee quits without telling the employer 
			 in advance, or if the employee quits before the date in the employment contract) to 
			 court to stop them from doing things that are harmful to the business.</p>


		<header>
			<h1>Our Team Members</h1>
		</header>


		<div class="card-container">
			<div class="flip-card">
				<div class="flip-card-inner">
					<div class="flip-card-front">
						<img src="images/pritu.png" alt="Image 5"
							style="width: 300px; height: 200px;">
					</div>
					<div class="flip-card-back">
						<h1>Prativa prayasi mohapatra</h1>
						<p>Architect & Engineer</p>
						<p>Project Leader</p>
					</div>
				</div>
			</div>
			<div class="flip-card">
				<div class="flip-card-inner">
					<div class="flip-card-front">
						<img src="images/soumya.jpg" alt="Image 5"
							style="width: 300px; height: 200px;">
					</div>
					<div class="flip-card-back">
						<h1>soumya Nayak</h1>
						<p>Architect & Engineer</p>
						<p>Co-Leader</p>
					</div>
				</div>
			</div>
			<div class="flip-card">
				<div class="flip-card-inner">
					<div class="flip-card-front">
						<img src="images/smruti.png" alt="Image 5"
							style="width: 300px; height: 200px;">
					</div>
					<div class="flip-card-back">
						<h1>Smruti sudha ojha</h1>
						<p>Architect & Engineer</p>
						<p>Co-leader</p>
					</div>
				</div>
			</div>
			<div class="flip-card">
				<div class="flip-card-inner">
					<div class="flip-card-front">
						<img src="images/Banya1png.png" alt="Image 5"
							style="width: 300px; height: 200px;">
					</div>
					<div class="flip-card-back">
						<h1>Banyanjali Nayak</h1>
						<p>Architect & Engineer</p>
						<p>co-lealder</p>
					</div>
				</div>
			</div>
				</div>
			</div>
		</div>

	</section>

	<footer>
		<p>&copy; 2023 Employee Management System</p>
	</footer>
</body>
</html>