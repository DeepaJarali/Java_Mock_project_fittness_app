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
							Edit Appointments
						</h3>
					</div>
					<div class="panel-body">
						<form:form role="form"  modelAttribute="appointment"   method="post" action="http://localhost:9090/ac/postedit">
							<div class="row">
								
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
									<label for="first_name" class="cols-sm-2 control-label">Edit first name</label>
										<form:input  path="first_name"  id="first_name" class="form-control input-sm" />
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label for="last_name" class="cols-sm-2 control-label">Edit last name</label>
									<form:input  path="last_name"  id="last_name" class="form-control input-sm" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<form:input path="address" readonly="true"   id="address" class="form-control input-sm" />
							</div>	
							<div class="form-group">
								<form:input path="email" readonly="true"   id="email" class="form-control input-sm" />
							</div>	
							<div class="form-group">
								<form:input path="age" readonly="true"   id="age" class="form-control input-sm" />
							</div>											
							<div class="col-xs-6 col-sm-6 col-md-6">
							<div class="form-group">
								<label for="birthdate" class="cols-sm-2 control-label">Edit Birth date</label>
								<form:input  path="birthdate"  id="birthdate"	class="form-control input-sm" />
							</div>
							</div>
							<div class="form-group">
								<form:input path="gender" readonly="true"   id="gender" class="form-control input-sm" />
							</div>	
							<div class="col-xs-6 col-sm-6 col-md-6">	
							<div class="form-group">
								<label for="contact" class="cols-sm-2 control-label">Edit Contact</label>
								<form:input path="contact" id="contact" class="form-control input-sm" />
							</div>
							</div>
							<div class="form-group">
								<form:input path="training_start_date" readonly="true"   id="training_start_date" class="form-control input-sm" />
							</div>	
							<div class="form-group">
								<form:input path="training_end_date" readonly="true"   id="training_end_date" class="form-control input-sm" />
							</div>	
							<div class="form-group">
								<form:input path="physio" readonly="true"   id="physio" class="form-control input-sm" />
							</div>	
							<div class="form-group">
								<form:input path="training_package_amount" readonly="true"   id="training_package_amount" class="form-control input-sm" />
							</div>	
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label for="training_appointment_id" class="cols-sm-2 control-label">Edit training_appointment_id</label>
										<form:input path="training_appointment_id"   id="training_appointment_id"	class="form-control input-sm" />
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