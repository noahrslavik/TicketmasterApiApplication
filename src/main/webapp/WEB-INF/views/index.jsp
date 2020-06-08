<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<title>Nandy Tickets</title>

<nav class="navbar navbar-light bg-light">
	<a class="navbar-brand" href="/"> <img src="nandy.jpg" width="30"
		height="30" class="d-inline-block align-top" alt=""> andy
	</a>
</nav>
<style>
.bg {
	background-image: url("newbg.jpg");
}
</style>
</head>

<body>
	<div class="bg">
	<div id="carouselExampleControls" class="carousel slide"
		data-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="confetti.jpeg" class="d-block w-25" alt="...">
			</div>
			<div class="carousel-item">
				<img src="confetti.jpeg" class="d-block w-25" alt="...">
			</div>
			<div class="carousel-item">
				<img src="confetti.jpeg" class="d-block w-25" alt="...">
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleControls"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleControls"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>

		<form class="form-inline">
			<div class="form-row align-items-center">
				<div class="col-auto my-1">
					<input type="text" class="form-control" id="keyword" name="keyword"
						placeholder="Search by keyword">
				</div>
				<div class="col-auto my-1">
					<select class="custom-select mr-sm-2" id="classificationName"
						name="classificationName">
						<option value="">Genre...</option>
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
					</select> <label for="keyword"></label>
				</div>

				<div class="col-auto my-1">
					<select class="custom-select mr-sm-2" id="local" name="local">
						<option value="en-us">Locale...</option>
						<option value="en-us">English</option>
						<option value="es-es">Spanish</option>
						<option value="fr-fr">French</option>
						<option value="de-de">Greek</option>
						<option value="es-es">Spanish</option>

					</select>
				</div>
				<div class="col-auto my-1">
					<input type="submit" class=btn btn-sm btn-outline-secondary
						value="Submit">
				</div>
			</div>
		</form>

		<br>


		<c:forEach items="${tickets}" var="tickets">
			<div class="card w-50">
				<div class=row>
					<div class=column>
						<img src="${tickets.image}" width="175" height=100%>
					</div>

					<div class="card-body">
						<div class=column>
							<h5 class="card-title">
								<c:out value="${tickets.artistName}"></c:out>
							</h5>
							<p class="card-text">
								<c:out
									value="${tickets.classifications} ${tickets.localTime}	${tickets.localDate}"></c:out>
							<form method="Post" action=${tickets.urlIn}}>
								<button class="btn btn-sm btn-outline-secondary">More
									Info</button>
							</form>

							<form method="Post" action="/addtofavoriteslist">
								<input type="hidden" name="artistName"
									value="${tickets.artistName}" /> <input type="hidden"
									name="classifications" value="${tickets.classifications}" /> <input
									type="hidden" name="localTime" value="${tickets.localTime}" />
								<input type="hidden" name="localDate"
									value="${tickets.localDate}" /> <input type="hidden"
									name="locale" value="${tickets.locale}" /> <input type="hidden"
									name="urlIn" value="${tickets.urlIn}" /> <input type="hidden"
									name="image" value="${tickets.image}" /> <input type="hidden"
									name="pageNumber" value="${pageNumber}" /> <input type="hidden"
									name="keyword" value="${keyword}" />
								<button class="btn btn-primary">Add to Favorites</button>
							</form>
							</p>
						</div>
					</div>
				</div>
			</div>
			<br>

		</c:forEach>


		<a
			href="/?keyword=${keyword}&classificationName=${classificationName}&pageNumber=${pageNumber-1}">Go
			back</a> <a
			href="/?keyword=${keyword}&classificationName=${classificationName}&pageNumber=${pageNumber+1}">Go
			forward</a>
	</div>
</body>
</html>