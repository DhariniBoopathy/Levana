<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextroot" value="${pageContext.request.contextPath}"></c:set>

<style>
.navbar {
	font-style: bold;
	background-color: #F484D9;
	height: 50px;
}

.navbar-default .navbar-nav>li>a {
	color: 0DDD14;
}

a {
	font-size: 15px;
	color: #000000;
	font-family: Comic Sans MS;
}

.navbar-brand {
	padding-top: 0px;
}
</style>
<nav class="navbar navbar">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#"><img
				src="${contextroot}/resources/images/mylogo.jpg" alt="COSMETICS"
				height=50px;></a>
			<button type="button" class="navbar-toggle collapsed  "
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false"></button>

		</div>
		<c:choose>
			<c:when test="${sessionScope.userlogin==true}">
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">

						<li><a href="${contextroot}/home"><span
								class="glyphicon glyphicon-home"></span> HOME </a></li>


						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown">ABOUT <span
								class="glyphicon glyphicon-menu-down"></span></a>
							<ul class="dropdown-menu">

								<li><a href="${contextroot}/aboutus"> About us</a></li>
								<li><a href="${contextroot}/terms"> Terms & conditions
								</a></li>
								<li><a href="${contextroot}/privacy"> Privacy
										conditions </a></li>
							</ul></li>

						<li><a href="${contextroot}/contactus"><span
								class="glyphicon glyphicon-qrcode"></span> CONTACT US</a></li>

						<%--  <li><a  href="${contextroot}/admin/categorypage"><span class="glyphicon glyphicon-list"></span> CATEGORY</a></li>
       <li><a  href="${contextroot}/admin/Product"><span class="glyphicon glyphicon-list"></span> PRODUCT</a></li> --%>
						<li><a href="${contextroot}/AllProduct"> View All
								Products </a></li>
					</ul>


					<ul class="nav navbar-nav navbar-right">
						<li><a href=""><span class="glyphicon glyphicon-user"></span>
								Hi ${sessionScope.username}</a></li>
						<li><a href="${contextroot}/user/viewCart"><span
								class="glyphicon glyphicon-shopping-cart"></span></a></li>
						<li><a href="${contextroot}/user/viewOrders"><span
								class="glyphicon glyphicon-list-alt"></span>ViewOrders </a></li>
						<li><a href="${contextroot}/Signout">Signout <span
								class="glyphicon glyphicon-hand-left"></span></a></li>

					</ul>
				</div>
			</c:when>
			<c:when test="${sessionScope.userlogin==false}">
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">

						<li><a href="${contextroot}/home"><span
								class="glyphicon glyphicon-home"></span> HOME </a></li>


						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown">ABOUT <span
								class="glyphicon glyphicon-menu-down"></span></a>
							<ul class="dropdown-menu">

								<li><a href="${contextroot}/aboutus"> About us</a></li>
								<li><a href="${contextroot}/terms"> Terms & conditions
								</a></li>
								<li><a href="${contextroot}/privacy"> Privacy
										conditions </a></li>
							</ul></li>
						<li><a href="${contextroot}/contactus"><span
								class="glyphicon glyphicon-qrcode"></span> CONTACT US</a></li>
						<li><a href="${contextroot}/admin/categorypage"><span
								class="glyphicon glyphicon-list"></span> CATEGORY</a></li>
						<li><a href="${contextroot}/admin/Product"><span
								class="glyphicon glyphicon-list"></span> PRODUCT</a></li>
					</ul>


					<ul class="nav navbar-nav navbar-right">
						<li><a href=""><span class="glyphicon glyphicon-user"></span>
								Hi ${sessionScope.username}</a></li>
						<li><a href="${contextroot}/Signout">Signout <span
								class="glyphicon glyphicon-hand-left"></span></a></li>

					</ul>
				</div>
			</c:when>
			<c:otherwise>
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">

						<li><a href="${contextroot}/home"><span
								class="glyphicon glyphicon-home"></span> HOME </a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown">ABOUT <span
								class="glyphicon glyphicon-menu-down"></span></a>
							<ul class="dropdown-menu">

								<li><a href="${contextroot}/aboutus"> About us</a></li>
								<li><a href="${contextroot}/terms"> Terms & conditions
								</a></li>
								<li><a href="${contextroot}/privacy"> Privacy
										conditions </a></li>
							</ul></li>
						<li><a href="${contextroot}/contactus"><span
								class="glyphicon glyphicon-qrcode"></span> CONTACT US</a></li>
						<li><a href="${contextroot}/AllProduct"> View All
								Products </a></li>
					</ul>


					<ul class="nav navbar-nav navbar-right">
						<li><a href="Signup"><span
								class="glyphicon glyphicon-user"></span> Signup</a></li>
						<li><a href="Signin">Signin <span
								class="glyphicon glyphicon-hand-left"></span></a></li>

					</ul>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
</nav>
