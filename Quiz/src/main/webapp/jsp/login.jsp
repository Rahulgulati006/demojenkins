<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body class = "bg-warning bg-opacity-50">
	<div class="container-fluid">
		<div class = "position-relative position-absolute top-50 start-50 translate-middle">
			<form class = "p-3 bg-light" action = "authenticate">
				<h1>Welcome to Quiz Application</h1>
				<div class="mb-3">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="usertype" id="admin" value = "ADMIN" checked> 
						<label class="form-check-label" for="usertypeadmin">Admin</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="usertype" id="applicant" value = "APPLICANT">
						<label class="form-check-label" for="usertypeapplicant">Applicant</label>
					</div>
				</div>
				<div class="mb-3">
					<label for="username" class="form-label">Username</label> <input type="text" class="form-control" name="username" id="username">
				</div>
				<div class="mb-3">
					<label for="password" class="form-label">Password</label> <input type="password" class="form-control" name="password" id="password">
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
				<div>
					<br>
					<a href="signup">New User? Signup</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>