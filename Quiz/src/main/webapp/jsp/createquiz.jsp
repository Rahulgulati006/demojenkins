<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Quiz</title>
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
<body>
	<div>
		<form class = "p-3 bg-light" action = "subcreatequiz">
				<h1>Create Quiz</h1>
				<div class="mb-3 ">
					<label for="noofquestions" class="form-label">Enter No of Questions</label>
					<span>
						<input type="number" class="form-control" name="noofquestions" id="noofquestions">
					</span>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
				<div>
					<br>
					<a href="quiz">Go Back to Quiz Portal</a>
				</div>
			</form>
	</div>
</body>
</html>