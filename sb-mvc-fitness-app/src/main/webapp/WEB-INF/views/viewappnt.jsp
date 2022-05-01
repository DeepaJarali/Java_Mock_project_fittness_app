<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
		<style type="text/css">
			.btn-glyphicon { padding:8px; background:#ffffff; margin-right:4px; }
			.icon-btn { padding: 1px 15px 3px 2px; border-radius:50px;}
		</style>
		<link rel="stylesheet"	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>   
         <div class="container">
		<h1>View Appointments </h1>

		<table class="table">
			<thead> 
		<tr>
			<th>AppntId</th>
			<th>fname</th>
			<th>lname</th>
			<th>Address</th>
			<th>Email</th>
			<th>Age</th>
			<th>Bdate</th>
			<th>Gender</th>
			<th>Contact</th>
			<th>Trn sdate</th>
			<th>Trn edate</th>
			<th>Physio</th>
			<th>Package</th>
			<th>Edit</th>
			<th>Delete</th>			
		</tr>
		</thead>
		<tbody>
		<c:forEach var="e" items="${appointmentList}">
		<tr class="success" >	
			<td>${e.training_appointment_id} </td>
			<td>${e.first_name} </td>
			<td>${e.last_name} </td>
			<td>${e.address} </td>
			<td>${e.email} </td>
			<td>${e.age} </td>
			<td>${e.birthdate} </td>
			<td>${e.gender} </td>
			<td>${e.contact} </td>	
			<td>${e.training_start_date} </td>
			<td>${e.training_end_date} </td>
			<td>${e.physio} </td>
			<td>${e.training_package_amount} </td>
					
			<td><a href="http://localhost:9090/ac/preedit?id=${e.training_appointment_id}">edit</a></td>
		    <td><a href="http://localhost:9090/ac/delete?id=${e.training_appointment_id}">delete</a></td>			
		</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>

	</body>
	</html>
		