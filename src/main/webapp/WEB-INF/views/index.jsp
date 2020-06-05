<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        
        <c:forEach items="${tickets}" var="tickets">    
   <table style="width:100%">
  <tr>
    <th>Artist Name</th>
    <th>Classification</th>
    <th>Time</th>
  </tr>
  <tr>
    <td><c:out value="${tickets.artistName}"/></td>
    <td><c:out value="${tickets.classifications}"/></td>
    <td><c:out value="${tickets.localTime}${tickets.localDate}"/></td>
  </tr>
 
</table>     
        </c:forEach>
        
        
        
        
        
        
        
        
</body>
</html>