<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="CR" value="${pageContext.request.contextPath}/resources/pimages" />
<c:set var="cr2" value="${pageContext.request.contextPath}/admin" />

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
	padding-right: 5%;
	padding-left: 5%;
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
.row
{
border-style: solid;
	border-color: #f9c3ec;
	border-width: .5px;
}
.myform{
margin-left: 5%;
margin-right: 5%;
	
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
	<c:if test="${!edit}">
		<c:url var="url" value="addProduct"></c:url>
	</c:if>

	<c:if test="${edit}">
		<c:url var="url" value="updateproduct"></c:url>
	</c:if>

	<div class="row">
			<h4>Product</h4>
			<form:form class="myform" modelAttribute="Product" action="${url}" method="post"
				enctype="multipart/form-data">
				<c:if test="${edit}">
					<form:input type="text" id="Product_Name"
						class="form-control"
						placeholder="product_Name" path="product_id" readonly="true" />
					<br />
				</c:if>
				<form:input type="text" id="Product_Name"
					class="form-control" placeholder="product_Name"
					path="product_Name" />
				<form:errors path="product_Name" class="stylingerror" />
				<br />

				<form:input type="text" id="productDesc"
					class="form-control" placeholder="productDesc"
					path="productDesc" />
				<form:errors path="productDesc" class="stylingerror" />
				<br />
				<form:input type="text" id="quantity"
					class="form-control" placeholder="quantity"
					path="quantity" />
				<form:errors path="quantity" class="stylingerror" />
				<br />
				<form:input type="text" id="price"
					class="form-control" placeholder="price"
					path="price" />
				<form:errors path="price" class="stylingerror" />
				<br />
				<form:select path="Category.category_id"
					class="form-control">
					<c:forEach items="${catlist}" var="l">
						<form:option value="${l.category_id}">${l.category_Name }</form:option>
					</c:forEach>
				</form:select>
				<br />
				<form:input type="file" class="form-control"
					placeholder="image" path="pimage" />
				<c:if test="${!edit}">
					<div class="wrapper">
						<span class="group-btn"> <input type="submit"
							class="btn btn-primary btn-md" value="Add Product"> 
						</span>
					</div>
				</c:if>
				<c:if test="${edit}">
					<div class="wrapper">
						<span class="group-btn"> <input type="submit"
							class="btn btn-primary btn-md" value="Update category"> 
						</span>
					</div>
				</c:if>
			</form:form>
		</div>
		<div class="table-responsive" style="padding-top: 20px">
			<table id="table_id" name="table_id" class="display"
				style="padding-top: 20px">

				<thead>

					<tr>
					    <th>Product Image</th>

						<th>Product ID</th>

						<th>Product Name</th>

						<th>Product Desc</th>

						<th>Quantity</th>

						<th>Price</th>
						<th>Category</th>

						<th>EDIT</th>

						<th>DELETE</th>

					</tr>

				</thead>

				<tbody>

					<c:forEach items="${prodlist}" var="l">

						<tr>
						
						  
       <td><img src="${CR}/${l.product_id}.jpg" height="50px" width="50px"></td>
							<td>${l.product_id}</td>


							<td>${l.product_Name}</td>


							<td>${l.productDesc}</td>

							<td>${l.quantity}</td>

							<td>${l.price}</td>

							<td>${l.category.category_Name}</td>


							<td><a class='btn btn-success btn-xs'
								href="${cr2}/editproduct?pid=${l.product_id}"><span
									class="glyphicon glyphicon-edit"></span> Edit</a></td>

							<td><a class='btn btn-danger btn-xs'
								href="${cr2}/deleteproduct?pid=${l.product_id}"><span
									class="glyphicon glyphicon-trash"></span> Delete</a></td>

						</tr>

					</c:forEach>

				</tbody>

			</table>
		</div>


	</div>

</div>
</div>
