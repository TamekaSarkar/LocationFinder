<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Diplay Locations</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<h2>Locations:</h2>
<table>
<tr>

<th>id</th>
<th>code</th>
<th>name</th>
<th>type</th>
<th>DELETE</th>
<th>UPDATE</th>

</tr>

<c:forEach items ="${locations}" var="location">
<tr>
<td>${location.id}</td>
<td>${location.code }</td>
<td>${location.name }</td>
<td>${location.type}</td>
<td><a href="deleteLocation?id=${location.id}">Delete</a></td>
<td><a href="showUpdate?id=${location.id}">Update</a></td>

</tr>
</c:forEach>

</table>
<a href="/show">AddLocations</a>

</body>
</html>