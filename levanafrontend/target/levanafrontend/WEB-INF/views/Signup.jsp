<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!--Pulling Awesome Font -->
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="styles.css">
<style>
@import url(http://fonts.googleapis.com/css?family=Roboto:400);

body {
	background-color: #fff;
	-webkit-font-smoothing: antialiased;
	font: normal 14px Roboto, arial, sans-serif;
}

.container {
	padding-top: 25px;
	padding-right: 200px;
	padding-left: 200px;
}

.stylingerror {
	color: red;
}

.form-login {
	background-color: #D7D7D7;
	padding-top: 10px;
	padding-bottom: 20px;
	padding-left: 20px;
	padding-right: 20px;
	border-radius: 15px;
	border-color: #d2d2d2;
	border-width: 5px;
	box-shadow: 0 1px 0 #cfcfcf;
}

h4 {
	border: 0 solid #fff;
	border-bottom-width: 1px;
	padding-bottom: 10px;
	text-align: center;
}

.form-control {
	border-radius: 10px;
}

.wrapper {
	text-align: center;
}
</style>

<script type="text/javascript">
	$(document).ready(function() {

		$('#table_id').dataTable({

			"pagingType" : "full_numbers",

			"lengthMenu" : [ [ 2, 5, 10, -1 ], [ 2, 5, 10, "All" ] ],

			"ordering" : true,

		});

	});
</script>


<div class="container">
	<div class="row">
		<div>
			<div class="form-login">
				<h4>SIGNUP</h4>
				<form:form action="addUser" modelAttribute="User"
					method="post">
					<form:input type="text" id="user_name"
						class="form-control input-sm chat-input"
						placeholder="user_name" path="user_name" />
					<form:errors path="user_name" class="stylingerror" />
					<br />

					<form:input type="text" id="Emailid"
						class="form-control input-sm chat-input" placeholder="Emailid"
						path="Emailid" />
					<form:errors path="Emailid" class="stylingerror" />
					<br />

					<form:input type="text" id="phoneno"
						class="form-control input-sm chat-input" placeholder="phoneno"
						path="phoneno" />
					<form:errors path="phoneno" class="stylingerror" />
					<br />

					<form:input type="text" id="u_password"
						class="form-control input-sm chat-input" placeholder="u_password"
						path="u_password" />
					<form:errors path="u_password" class="stylingerror" />
					<br /> 
					<div class="wrapper">
						<span class="group-btn"> <i
							class="fa fa-sign-in"></i><input type="submit"
							class="btn btn-primary btn-md" value="Signup"> 
						</span>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</div>