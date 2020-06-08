<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<form>
		<label for="keyword"> Search by: </label> <input type="text"
			id="keyword" name="keyword"> <select id="classificationName"
			name="classificationName">
			<option value=""></option>
			<option value="Alternative">Alternative</option>
			<option value="Blues">Blues</option>
			<option value="Classical">Classical</option>
			<option value="Country">Country</option>
			<option value="Electronic">Electronic</option>
			<option value="Folk">Folk</option>
			<option value="Rap">Rap</option>
			<option value="Holiday">Holiday</option>
			<option value="Jazz">Jazz</option>
			<option value="Latin">Latin</option>
			<option value="Metal">Metal</option>
			<option value="New Age">New Age</option>
			<option value="Pop">Pop</option>
			<option value="R&B">R&B</option>
			<option value="Reggae">Reggae</option>
			<option value="Religious">Religious</option>
			<option value="Rock">Rock</option>
			<option value="Other">Other</option>
		</select> <input type="date" id="localStartEndDate" name="localStartEndDate"
			required pattern="d{4}-\d{2}-\d{2}">
		<script>
			localStartEndDate = localStartEndDate.toString();
		</script>



		<input type="submit" value="Submit">
	</form>
	<br>
    

	<c:forEach items="${tickets}" var="tickets">
		<div class="card w-100">
			<div class=row>
				<div class=column>
					<img src="${tickets.image}" width="150" height="150">
				</div>

				<div class="card-body">
					<h5 class="card-title">
						<div class=column>
							<c:out value="${tickets.artistName}"></c:out>
					</h5>
					<p class="card-text">
						<c:out value="${tickets.classifications}"></c:out>
					</p>
					<p class="card-text">
						<c:out value="${tickets.localTime}	${tickets.localDate}"></c:out>
					</p>
				       </div>
				<div class=column>
					<form method="post" action=${tickets.urlIn}}>
						<button class="btn btn-primary">More Info</button>
					</form>
				</div>
				<div class=column>
					<form method="Post" action="/addtofavoriteslist">
					<input type="hidden" name="artistName" value="${tickets.artistName}"/>
					<input type="hidden" name="classifications" value="${tickets.classifications}"/>
					<input type="hidden" name="localTime" value="${tickets.localTime}"/>
					<input type="hidden" name="localDate" value="${tickets.localDate}"/>
					<input type="hidden" name="locale" value="${tickets.locale}"/>
					<input type="hidden" name="urlIn" value="${tickets.urlIn}"/>
					<input type="hidden" name="image" value="${tickets.image}"/>
					<input type="hidden" name="pageNumber" value="${pageNumber}"/>
					<input type="hidden" name="keyword" value="${keyword}"/>
					<button class="btn btn-primary">Add to Favorites</button>
					</form>
				</div>
			</div>
		</div>

	</c:forEach>


	<a
		href="/?keyword=${keyword}&classificationName=${classificationName}&pageNumber=${pageNumber-1}">Go
		back</a>
	<a
		href="/?keyword=${keyword}&classificationName=${classificationName}&pageNumber=${pageNumber+1}">Go
		forward</a>
</body>
</html>