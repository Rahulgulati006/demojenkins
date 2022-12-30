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
	<table border=1>
		<tr>
			<th>ID</th>
			<th>Question</th>
			<th>Options</th>
			<th>Answer</th>
		</tr>
		<c:forEach items="${questionlist}" var="question">
		<tr>
			<td><c:out value="${question.id}"/></td>
			<td><c:out value="${question.question}"/></td>
			<td><c:out value="${question.options}"/></td>
			<td><c:out value="${question.answer}"/></td>
		</tr>
		</c:forEach>
	</table>
	<div>
		<br>
		<a href="question">Go Back to Question Portal</a>
	</div>
</body>
</html>