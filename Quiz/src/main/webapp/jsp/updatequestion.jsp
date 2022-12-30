<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Question</title>
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
	<h1>Update Question</h1>
	<br>
	<br>
	<div id="form1">
		<form action="updatefindques">
			<div class="mb-3 ">
				<label for="id" class="form-label">Enter Question ID:</label>
		    	<span>
		        	<input type="text" class="form-control" name="id" id="id" value="">
		    	</span>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	<br>
	<br>
	<table class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>Question</th>
			<th>Options</th>
			<th>Answer</th>
			<th>Update Question</th>
			<th>Update Options</th>
			<th>Update Answer</th>
		</tr>
		<c:forEach items="${questionlist}" var="question">
		<tr>
			<td><c:out value="${question.id}"/></td>
			<td><c:out value="${question.question}"/></td>
			<td><c:out value="${question.options}"/></td>
			<td><c:out value="${question.answer}"/></td>
			<td><button onclick="updateQuestion()">Update Question</button></td>
			<td><button onclick="updateAnswer()">Update Answer</button></td>
			<td><button onclick="updateOptions()">Update Options</button></td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<div id="form2" style="display:none">
		<form class = "p-3 bg-light" action = "updatequestion1">
				<h6>Update Question</h6>
				<div class="mb-3 ">
					<label for="question" class="form-label">Question</label>
					<span>
						<input type="text" class="form-control" name="question" id="question">
					</span>
				</div>				
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
	</div>
	<div id="form3" style="display:none">
		<form class = "p-3 bg-light" action = "updateanswer">
				<h6>Update Answer</h6>
				<div class="mb-3">
					<label for="answer" class="form-label">Answer</label><input type="number" class="form-control" name="answer" id="answer">
				</div>			
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
	</div>
	<div id="form4" style="display:none">
		<form class = "p-3 bg-light" action = "updateoptions">
				<h6>Update Options</h6>
				<div class="mb-3 ">
					<label for="option" class="form-label">Enter Options</label>
					<input type="text" class="form-control" name="option1" id="option1">
					<input type="text" class="form-control" name="option2" id="option2">
					<input type="text" class="form-control" name="option3" id="option3">
					<input type="text" class="form-control" name="option4" id="option4">
				</div>		
				<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	<br>
	<div>
		<br>
		<a href="question">Go Back to Question Portal</a>
	</div>
	<script type="text/javascript">
		function updateQuestion(){
			document.getElementById("form2").style.display="block";
		}
		function updateAnswer(){
			document.getElementById("form3").style.display="block";
		}
		function updateOptions(){
			document.getElementById("form4").style.display="block";
		}
	</script>
</body>
</html>