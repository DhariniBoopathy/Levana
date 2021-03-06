<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style type="text/css">
.panel-heading {
	padding: 5px 15px;
	background-color: F9C3EC;
}

.panel-footer {
	padding: 1px 15px;
	color: #A0A0A0;
}

.profile-img {
	width: 96px;
	height: 96px;
	margin: 0 auto 10px;
	display: block;
	-moz-border-radius: 50%;
	-webkit-border-radius: 50%;
	border-radius: 50%;
}
</style>

<div class="container">
	<div class="row">
		<div class="col-sm-6 col-md-4 col-md-offset-4">
			<div class="panel panel-default">
				<div class="panel-heading">
					<strong> Sign in to continue</strong>
				</div>

				<c:if test="${error}">
					<div class="alert alert-danger">
						<strong>UserName or Password Incorrect</strong>
					</div>
				</c:if>
				<div class="panel-body">
					<form role="form" action="perform_login" method="POST">
						<fieldset>
							<div class="row">
								<div class="center-block">
									<img class="profile-img" src="resources/mylogo.jpg" alt="">
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12 col-md-10  col-md-offset-1 ">
									<div class="form-group">
										<div class="input-group">
											<span class="input-group-addon"> <i
												class="glyphicon glyphicon-user"></i>
											</span> <input class="form-control" placeholder="Username"
												name="login_name" type="text" autofocus id="login_name">
										</div>
									</div>
									<div class="form-group">
										<div class="input-group">
											<span class="input-group-addon"> <i
												class="glyphicon glyphicon-lock"></i>
											</span> <input class="form-control" placeholder="Password"
												name="login_password" type="password" id="login_password">
										</div>
									</div>
									<div class="form-group">
										<input type="submit" class="btn btn-lg btn-primary btn-block"
											value="Sign in">
									</div>
								</div>
							</div>
						</fieldset>
					</form>
				</div>				
			</div>
		</div>
	</div>
</div>