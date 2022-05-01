<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2>List Of Trainers </h2>

		<table class="table">
			<thead>
				<tr>					
					<th>Trainer_id</th>
					<th>Trainer_name</th>
					<th>Trainer_gender</th>
					<th>Trainer_age</th>
					<th>dateofjoin</th>										
					<th>Trainer_contact</th>
					<th>Trainer_experience</th>
					<th>Trainer_email</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
			    <%-- <c:forEach> is a jstl core tag that iterates through a list --%>
				<%-- we are able to iterate through an arraylist
				     using jstl tag without writing any Java code --%>
				<c:forEach var="e" items="${trainerList}">
					<tr class="success">						
						<td>${e.trainer_id}</td>
						<td>${e.trainer_name}</td>
						<td>${e.trainer_age}</td>
						<td>${e.dateofjoin}</td>
						<td>${e.trainer_contact}</td>	
						<td>${e.trainer_experience}</td>	
						<td>${e.trainer_email}</td>						
						<td><a href="http://localhost:9090/tc/preedit?id=${e.trainer_id}">edit</a></td>
						<td><a href="http://localhost:9090/tc/delete?id=${e.trainer_id}">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>