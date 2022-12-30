<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CreateQuestion</title>
<style>
        label {
            float: left;
        }
          
        span {
            display: block;
            overflow: hidden;
            padding: 0px 4px 0px 6px;
        }
          
        input {
            width: 30%;
        }
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body class = "bg-danger bg-opacity-50">
	<div class="container-fluid">
		<div class = "position-relative position-absolute top-50 start-50 translate-middle p-3">
			<form class = "p-3 bg-light" action = "subcreateques">
				<h1>Create Question</h1>
				<div class="mb-3 ">
					<label for="question" class="form-label">Question</label>
					<span>
						<input type="text" class="form-control" name="question" id="question">
					</span>
				</div>
<!-- 				<div class="mb-3 "> -->
<!-- 					<label for="noofoptions" class="form-label">Enter Number of Options</label><input type="text" class="form-control" name="noofoptions" id="noofoptions"> -->
<!-- 				</div> -->
				<div class="mb-3 ">
					<label for="option" class="form-label">Enter Options</label>
					<input type="text" class="form-control" name="option1" id="option1">
					<input type="text" class="form-control" name="option2" id="option2">
					<input type="text" class="form-control" name="option3" id="option3">
					<input type="text" class="form-control" name="option4" id="option4">
				</div>
				<div class="mb-3">
					<label for="answer" class="form-label">Answer</label>
					<span>
						<input type="number" class="form-control" name="answer" id="answer">
					</span>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
				<div>
					<br>
					<a href="question">Go Back to Question Portal</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>