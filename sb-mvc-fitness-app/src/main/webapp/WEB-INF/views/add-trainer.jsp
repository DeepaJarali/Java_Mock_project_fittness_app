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
							Enter New Trainer Details
						</h3>
					</div>
					<div class="panel-body">
						<form:form class="form-horizontal" modelAttribute="trainer" method="post" action="http://localhost:9090/tc/register">
						
							<div class="row">
								
								<div class="col-xs-6 col-sm-6 col-md-6">
									<label for="trainer_id" class="cols-sm-2 control-label">Enter Trainer id</label>
									<div class="form-group">										
										<form:input  path="trainer_id"  id="trainer_id" class="form-control input-sm" />
									</div>
								</div>
								
								<div class="col-xs-6 col-sm-6 col-md-6">
									<label for="trainer_name" class="cols-sm-2 control-label">Enter trainer name</label>
									<div class="form-group">
										<form:input path="trainer_name" id="trainer_name"	class="form-control input-sm" />
									</div>
								</div>
								
								<div class="col-xs-6 col-sm-6 col-md-6">
									<label for="trainer_gender" class="cols-sm-2 control-label">Enter Trainer gender</label>
									<div class="form-group">
										<form:input path="trainer_gender"  id="trainer_gender" class="form-control input-sm" />
									</div>
								</div>
							</div>
							
							<div class="form-group">
								<label for="trainer_age" class="cols-sm-2 control-label">Enter trainer age</label>
								<form:input path="trainer_age"  id="trainer_age" class="form-control input-sm"/>
							</div>											
							
							<div class="form-group">
								<label for="dateofjoin" class="cols-sm-2 control-label">Enter Date of join(dd-mm-yyyy)</label>
								<form:input path="dateofjoin"  id="dateofjoin" class="form-control input-sm" />
							</div>	
							<div class="form-group">
								<label for="" class="cols-sm-2 control-label">Enter trainer Contact</label>
								<form:input path="trainer_contact"  id="trainer_contact"  class="form-control input-sm"/>
							</div>	
							
							<div class="form-group">
								<label for="trainer_experience" class="cols-sm-2 control-label">Enter trainer experience</label>
								<form:input path="trainer_experience"  id="trainer_experience"	class="form-control input-sm" />
							</div>
							<label for="trainer_email" class="cols-sm-2 control-label">Enter Email</label>
							<div class="form-group">
								<form:input path="trainer_email"  id="trainer_email"	class="form-control input-sm" />
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