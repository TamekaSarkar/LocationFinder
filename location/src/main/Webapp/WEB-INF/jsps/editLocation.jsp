<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
	
	<style>
	
	body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

h2{
 align:Center;
}

input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}



.container {
  padding: 16px;
}

	
	</style>

</head>
<body>
	<h2>Create Location</h2>

	<form action="updateLoc" method="post">


		<div class="container">
			<label>Enter ID:</label> <input type="text" name="id" value="${location.id}" readonly=true /> 
			<label>Enter Code:</label>
			<input type="text" name="code" value="${location.code}"/> 
			<label>Enter Name: </label> 
			<input type="text" name="name" value="${location.name}" />
			<label>Enter Type:</label>
			<label>Urban</label>
			<input type="radio" name="type" value="Urban" value="URBAN"${location.type=='URBAN'?'checked':'' } /> 
				<label>Rular</label>
				<input type="radio" name="type" value="Rular"${location.type=='RULAR'?'checked':'' }/>
               <br>
            
			<button type="submit" class="btn btn-primary" value="save">save</button>


		</div>


		<script
			src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
		
			</form>
			
</body>
</html>