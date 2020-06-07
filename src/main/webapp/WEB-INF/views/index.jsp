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
	
	<form>
<label for="keyword"> Search by: </label>
<input type="text" id ="keyword" name ="keyword"><br>
<input type="submit" value="Submit">
</form>
	
	<table style="width: 100%">
	<tr>
		<th>Artist Name</th>
		<th>Classification</th>
		<th>Time</th>
	</tr>
    </table>

	<c:forEach items="${tickets}" var="tickets">
        <table>
			<tr>
				<td><img src="${tickets.image}" width = "50" height = "50"> </td>
				<td><c:out value="${tickets.artistName}"/></td>
				<td><c:out value="${tickets.classifications}"/></td>
				<td><c:out value="${tickets.localTime}"/></td>
				<td><c:out value="${tickets.localDate}"/></td>
				<td><c:out value="${tickets.locale}"/></td>
				<td><form action=${tickets.urlIn}}>
			    <button>More Info</button>
			    </form></td>
			    <td><form method="post" action="/addtofavoriteslist/" >
                <input type="hidden" name="artistName" value="${tickets.artistName}" />
                <input type="hidden" name = "classifications" value="${tickets.classifications}"/>
                <input type="hidden" name="localTime" value="${tickets.localTime}" />
                <input type="hidden" name="localDate" value="${tickets.localDate}" />
                <input type="hidden" name="locale" value="${tickets.locale}" />
                <input type="hidden" name="urlIn" value="${tickets.urlIn}" />
                <input type="hidden" name="image" value="${tickets.image}" />
                <input type="submit" value="Add to Favorites" />
			    </form> 
			    </td>
			</tr>
		</table>
	</c:forEach>


<a href="/?keyword=${keyword}&pageNumber=${pageNumber-1}">Go back</a>
<a href="/?keyword=${keyword}&pageNumber=${pageNumber+1}">Go forward</a>
</body>
</html>