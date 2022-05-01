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
							Edit Trainer Details
						</h3>
					</div>
					<div class="panel-body">
						<form:form role="form"  modelAttribute="trainer"   method="post" action="http://localhost:9090/tc/postedit">
							<div class="row">
								
								
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
									<label for="name" class="cols-sm-2 control-label">Edit trainer name</label>
										<form:input  path="trainer_name"  id="trainer_name" class="form-control input-sm" />
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label for="name" class="cols-sm-2 control-label">Edit trainer gender</label>
									<form:input  path="trainer_gender"  id="trainer_gender" class="form-control input-sm" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<form:input path="trainer_age" readonly="true"   id="trainer_age" class="form-control input-sm" />
							</div>											
							<div class="col-xs-6 col-sm-6 col-md-6">
							<div class="form-group">
								<label for="name" class="cols-sm-2 control-label">Edit Date of join</label>
								<form:input  path="dateofjoin"  id="dateofjoin"	class="form-control input-sm" />
							</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">	
							<div class="form-group">
								<label for="name" class="cols-sm-2 control-label">Edit trainer Contact</label>
								<form:input path="trainer_contact" id="trainer_contact" class="form-control input-sm" />
							</div>
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<label for="name" class="cols-sm-2 control-label">Edit trainer id</label>
										<form:input path="trainer_id"   id="trainer_id"	class="form-control input-sm" />
									</div>
								</div>	
							<div class="form-group">
								<form:input path="trainer_experience" readonly="true"   id="trainer_experience" class="form-control input-sm" />
							</div>	
							<div class="form-group">
								<form:input path="trainer_email" readonly="true"   id="trainer_email" class="form-control input-sm" />
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