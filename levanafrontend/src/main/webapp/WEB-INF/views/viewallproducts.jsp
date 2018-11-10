<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
body {
	font-family: 'Montserrat', sans-serif;
}
/* Category Ads */
#ads {
	margin: 30px 0 30px 0;
}

#ads .card
{
border-style:solid; 
border-color: #f9c3ec;
border-width: .5px;
margin-top: 10px;
height: 300px;
}

#ads .card-detail-badge {
	background: #f9c3ec;
	text-align: center;
	border-radius: 30px 30px 30px 30px;
	color: #000;
	padding: 5px 10px;
	font-size: 14px;
	margin-left: 42%;
	margin-top: 2%;
}

#ads .card:hover {
	background: #fff;
	box-shadow: 12px 15px 20px 0px rgba(46, 61, 73, 0.15);
	border-radius: 4px;
	transition: all 0.3s ease;
}

#ads .card-image-overlay {
	font-size: 20px;
}

#ads .card-image-overlay span {
	display: inline-block;
}

#ads .ad-btn {
	text-transform: uppercase;
	width: 150px;
	height: 40px;
	border-radius: 80px;
	font-size: 16px;
	line-height: 35px;
	text-align: center;
	border: 3px solid #e6de08;
	display: block;
	text-decoration: none;
	margin: 20px auto 1px auto;
	color: #000;
	overflow: hidden;
	position: relative;
	background-color: #f9c3ec;
}

#ads .ad-btn:hover {
	background-color: #e6de08;
	color: #1e1717;
	border: 2px solid #e6de08;
	background: transparent;
	transition: all 0.3s ease;
	box-shadow: 12px 15px 20px 0px rgba(46, 61, 73, 0.15);
}

#ads .ad-title h5 {
	text-transform: uppercase;
	font-size: 18px;
}
.img-fluid
{
margin-left: 40%;
margin-top: 9px;
}
</style>

<div>
<nav class="navbar navbar">
  <a class="navbar-brand">Shop By Category</a>
  
<ul class="nav navbar-nav">
<c:forEach items="${catlist}" var="c">
     <li><a href="products?catname=${c.category_Name}">${c.category_Name}</a>
     </li>
    </c:forEach>
      </ul>
      </div>
    
<div class="container">
	<div class="row" id="ads">
		<c:forEach items="${prodlist}" var="l">
			<div class="col-md-4">
				<div class="card rounded">
					<div class="card-image">
						<img class="img-fluid"
							alt="https://imageonthefly.autodatadirect.com/images/?USER=eDealer&PW=edealer872&IMG=USC80HOC011A021001.jpg&width=440&height=262"
							src="resources/pimages/${l.product_id}.jpg" />
					</div>
					<div class="card-image-overlay m-auto">
						<span class="card-detail-badge">&#x20B9 ${l.price}</span>
					</div>
					<div class="card-body text-center">
						<div class="ad-title m-auto">
							<h5>${l.product_Name}</h5>
						</div>
						<a class="ad-btn" href="OneProduct?pid=${l.product_id}">View</a>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</div>