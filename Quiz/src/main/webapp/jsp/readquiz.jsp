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
			<th>Questions</th>
		</tr>
		<c:forEach items="${quizlist}" var="quiz">
		<tr>
			<td><c:out value="${quiz.quizId}"/></td>
			<td><c:out value="${quiz.questions}"/></td>
		</tr>
		</c:forEach>
	</table>
	<div>
		<br>
		<a href="quiz">Go Back to Quiz Portal</a>
	</div>
</body>
</html>