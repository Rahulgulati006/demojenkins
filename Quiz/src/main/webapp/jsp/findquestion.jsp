<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="subfindques">
		<div class="mb-3 ">
			<label for="id" class="form-label">Enter Question ID</label>
			<input type="text" class="form-control" name="id" id="id">
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	<div>
		<br>
		<a href="question">Go Back to Question Portal</a>
	</div>
</body>
</html>