<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<nav class="navbar navbar-light bg-light">
  <a class="navbar-brand" href="/">
    <img src="nandy.jpg" width="30" height="30" class="d-inline-block align-top" alt="">
    andy
  </a>
</nav>


</head>
<body>


<c:forEach items="${bucket}" var="bucket">
		<div class="card w-50">
			<div class=row>
				<div class=column>
					<img src="${bucket.burlimage}" width="175" height=100%>
				</div>

				<div class="card-body">
					<div class=column>
						<h5 class="card-title">
							<c:out value="${bucket.bname}"></c:out>
						</h5>
						<p class="card-text">
							<c:out
								value="${bucket.bgenre} ${bucket.btime}	${bucket.bdate}"></c:out>
						<form method="Post" action=${tickets.urlIn}}>
							<button class="btn btn-sm btn-outline-secondary">More
								Info</button>
						</form>
						
						<form>
							 <a href="/delete?bid=${bucket.bid}">Delete from list</a>
						</form>
						</p>
					</div>
				</div>
			</div>
		</div>
	<br>
	</c:forEach>

</body>
</html>