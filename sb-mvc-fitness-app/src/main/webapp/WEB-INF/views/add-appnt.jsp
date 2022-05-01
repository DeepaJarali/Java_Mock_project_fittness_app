<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
	body {
		background-color: #525252;
	}

	.centered-form {
		margin-top: 60px;
	}

	.centered-form .panel {
		background: rgba(255, 255, 255, 0.8);
		box-shadow: rgba(0, 0, 0, 0.3) 20px 20px 20px;
	}
</style>

</head>
<body>
	<div class="container">
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							 Training appointment details
						</h3>
					</div>
					<div class="panel-body">
						<form:form class="form-horizontal" modelAttribute="appointment" method="post" action="http://localhost:9090/ac/register">
						
							<div class="row">
								
								<div class="col-xs-12 col-sm-12 col-md-12">
									<label for="training_appointment_id" class="cols-sm-2 control-label">Training appointment id</label>
									<div class="form-group">
										<form:input path="training_appointment_id"  id="training_appointment_id" class="form-control input-sm" />
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									
									<div class="form-group">		
									<label for="first_name" class="cols-sm-2 control-label">First Name</label>								
										<form:input  path="first_name"  id="first_name" class="form-control input-sm" />
									</div>
								</div>
								
								<div class="col-xs-6 col-sm-6 col-md-6">
									
									<div class="form-group">
									<label for="last_name" class="cols-sm-2 control-label">Last Name</label>
										<form:input path="last_name" id="last_name"	class="form-control input-sm" />
									</div>
								</div>
								
								<div class="col-xs-12 col-sm-12 col-md-12">
									<label for="address" class="cols-sm-2 control-label">Address</label>
									<div class="form-group">
										<form:input path="address"  id="address" class="form-control input-sm" />
									</div>
								</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
									
									<div class="form-group">		
									<label for="email" class="cols-sm-2 control-label">Email</label>								
										<form:input  path="email"  id="email" class="form-control input-sm" />
									</div>
								</div>
								
								<div class="col-xs-6 col-sm-6 col-md-6">
									
									<div class="form-group">
									<label for="age" class="cols-sm-2 control-label">Age</label>
										<form:input path="age" id="age"	class="form-control input-sm" />
									</div>
								</div>
								<div class="col-xs-12 col-sm-12 col-md-12">
									<label for="birthdate" class="cols-sm-2 control-label">Birthdate</label>
									<div class="form-group">
										<form:input path="birthdate"  id="birthdate" class="form-control input-sm" />
									</div>
								</div>
								<div class="col-xs-12 col-sm-12 col-md-12">
								<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Gender</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<!-- <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<form:input  path="gender" cssClass="form-control" id="gender" /> -->
									<span> <input type="radio" id="gender" name="gender"/>Male</span>		
									<span> <input type="radio" id="gender" name="gender"/>Female</span>					
								</div>
							</div>
							</div>
						    </div>
						    <div class="col-xs-12 col-sm-12 col-md-12">
									<label for="contact" class="cols-sm-2 control-label">Contact</label>
									<div class="form-group">
										<form:input path="contact"  id="contact" class="form-control input-sm" />
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									
									<div class="form-group">		
									<label for="training_start_date" class="cols-sm-2 control-label">Training start date</label>								
										<form:input  path="training_start_date"  id="training_start_date" class="form-control input-sm" />
									</div>
								</div>
								
								<div class="col-xs-6 col-sm-6 col-md-6">
									
									<div class="form-group">
									<label for="training_end_date" class="cols-sm-2 control-label">Training end date</label>
										<form:input path="training_end_date" id="training_end_date"	class="form-control input-sm" />
									</div>
								</div>
								<div class="col-xs-12 col-sm-12 col-md-12">
								<div class="form-group">
							<label for="physio" class="cols-sm-2 control-label">Physio therapist?</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<!-- <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<form:input  path="gender" cssClass="form-control" id="gender" /> -->
									<span> <input type="radio" id="physio" name="physio"/>Yes	</span>		
									<span> <input type="radio" id="physio" name="physio"/>No </span>					
								</div>
							</div>
							</div>
						    </div>
						    <div class="col-xs-12 col-sm-12 col-md-12">
									<label for="training_package_amount" class="cols-sm-2 control-label">training package amount</label>
									<div class="form-group">
										<form:input path="training_package_amount"  id="training_package_amount" class="form-control input-sm" />
									</div>
								</div>
							</div>
							 
							<input type="submit" value="Register"
								class="btn btn-info btn-block">

						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>