<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="shortcut icon" href="resources/mylogo.ico" />
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">

<script>
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
</head>
<body>
	<c:import url="navbar.jsp" />
	<div style="min-height: 500px;">
		<c:if test="${sliderpage}">
			<c:import url="carousel.jsp" />
		</c:if>

		<c:if test="${aboutuspage}">
			<c:import url="aboutus.jsp" />
		</c:if>

		<c:if test="${termspage}">
			<c:import url="terms.jsp" />
		</c:if>

		<c:if test="${privacypage}">
			<c:import url="privacy.jsp" />
		</c:if>

		<c:if test="${contactuspage}">
			<c:import url="contactus.jsp" />
		</c:if>



		<c:if test="${Signuppage}">
			<c:import url="Signup.jsp" />
		</c:if>

		<c:if test="${Signinpage}">
			<c:import url="Signin.jsp" />
		</c:if>

		<c:if test="${categorypage}">
			<c:import url="Category.jsp" />
		</c:if>

		<c:if test="${productpage}">
			<c:import url="Product.jsp" />
		</c:if>

		<c:if test="${viewallproductpage}">
			<c:import url="viewallproducts.jsp" />
		</c:if>

		<c:if test="${viewoneproductpage}">
			<c:import url="viewoneproduct.jsp" />
		</c:if>
		<c:if test="${cartpage}">
			<c:import url="Cart.jsp" />
		</c:if>
		
	</div>
	<c:import url="footer.jsp" />

</body>
</html>
