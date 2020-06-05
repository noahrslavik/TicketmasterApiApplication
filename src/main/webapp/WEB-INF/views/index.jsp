<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table style="width: 100%">
	<tr>
		<th>Artist Name</th>
		<th>Classification</th>
		<th>Time</th>
	</tr>

<form>
<label for="keyword"> Search by: </label>
<input type="text" id ="keyword" name ="keyword"><br>
<input type="submit" value="Submit">
</form>


	<c:forEach items="${tickets}" var="tickets">

			<tr>
				<td><img src="${tickets.image}" width = "50" height = "50"> </td>
				<td><c:out value="${tickets.artistName}" /></td>
				<td><c:out value="${tickets.classifications}" /></td>
				<td><c:out value="${tickets.localTime} ${tickets.localDate}" /></td>
				<td><c:out value="${tickets.locale}" /></td>
			</tr>
			<tr>
			
			</tr>
		</table>
	</c:forEach>

<a href="/?keyword=${keyword}&pageNumber=${pageNumber+1}">Go forward</a>
<a href="/?keyword=${keyword}&pageNumber=${pageNumber-1}">Go back</a>

</body>
</html>