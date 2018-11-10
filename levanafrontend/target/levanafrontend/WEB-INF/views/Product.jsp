<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!--Pulling Awesome Font -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="styles.css">
<style>
@import url(http://fonts.googleapis.com/css?family=Roboto:400);
body {
  background-color:#fff;
  -webkit-font-smoothing: antialiased;
  font: normal 14px Roboto,arial,sans-serif;
}


    .container {
    padding-top: 25px;
    padding-right: 200px;
    padding-left: 200px;
    
}
.stylingerror
{
color: red;
}


.form-login {
    background-color: #D7D7D7;
    padding-top: 10px;
    padding-bottom: 20px;
    padding-left: 20px;
    padding-right: 20px;
    border-radius: 15px;
    border-color:#d2d2d2;
    border-width: 5px;
    box-shadow:0 1px 0 #cfcfcf;
}

h4 { 
 border:0 solid #fff; 
 border-bottom-width:1px;
 padding-bottom:10px;
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
            <h4>Product</h4>
			 <form:form modelAttribute="product" action="addProduct" method="post">
			 <form:input type="text" id="Product_Name" class="form-control input-sm chat-input" placeholder="Product_Name" path="Product_Name"/>
			 <form:errors  path="Product_Name" class="stylingerror"/>
			 <br/>
           
            <form:input type="text" id="productDesc" class="form-control input-sm chat-input" placeholder="productDesc" path="productDesc"/>
           <form:errors  path="productDesc" class="stylingerror"/>
           <br/>
           
            <form:input type="text" id="Quantity" class="form-control input-sm chat-input" placeholder="Quantity" path="Quantity"/>
            <form:errors  path="Quantity" class="stylingerror"/>
            <br/>
            
            <form:input type="text" id="Price" class="form-control input-sm chat-input" placeholder="Price" path="Price"/>
            <form:errors  path="Price" class="stylingerror"/>
			<br/>
			
			<form:input type="text" id="Category" class="form-control input-sm chat-input" placeholder="Category" path="Category"/>
			<form:errors  path="Category" class="stylingerror"/>
            <br/>
            
            <div class="wrapper">
            <span class="group-btn">     
               
              <input type="submit" class="btn btn-primary btn-md" value="Add Product"> <i class="fa fa-sign-in"></i>
            </span>
            </div>
			</form:form>
			
			<div class="table-responsive" style="padding-top: 20px">

		<table id="table_id" name="table_id" class="display" style="padding-top: 20px">

			<thead>

				<tr>

					<th>Product ID</th>

					<th>Product Name</th>
					
					<th>Product Desc</th>
					
					<th>Quantity</th>
					
					<th>Prize</th>

					<th>EDIT</th>

					<th>DELETE</th>

				</tr>

			</thead>

			<tbody>

				<c:forEach items="${prolist}" var="l">

					<tr>

						<td>${l.Product_Name}</td>

						<td>${l.Product_id}</td>
						
						<td>${l.productDesc}</td>
						
						<td>${l.Quantity}</td>
						
						<td>${l.Price}</td>
						
						<td>${l.Category}</td>
						

						<td><a class='btn btn-success btn-xs'

							href="editcat?catid=${l.catid}"><span

								class="glyphicon glyphicon-edit"></span> Edit</a></td>

						<td><a class='btn btn-danger btn-xs'

							href="removecat?catid=${l.catid}"><span

								class="glyphicon glyphicon-trash"></span> Delete</a></td>

					</tr>

				</c:forEach>

			</tbody>

		</table>

	</div>
			
			
            </div>
        
        </div>
    </div>
</div>
