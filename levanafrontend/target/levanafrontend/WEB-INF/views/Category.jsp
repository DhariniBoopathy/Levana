<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

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
.stylingerror
{
color: red;
}


.wrapper {
    text-align: center;
}
</style>


<div class="container">
    <div class="row">
        <div>
            <div class="form-login">
            <h4>Category</h4>
			 
			  <form:form modelAttribute="category" action="addCategory" method="post">
			 <form:input type="text" id="Category_Name" class="form-control input-sm chat-input" placeholder="Category_Name" path="category_Name"/>
			 <form:errors  path="category_Name" class="stylingerror"/>
			 <br/>
            
            <form:input type="text" id="CategoryDesc" class="form-control input-sm chat-input" placeholder="CategoryDesc" path="categoryDesc"/>
              <form:errors  path="categoryDesc" class="stylingerror"/>
           <br/>
           
            <div class="wrapper">
            <span class="group-btn">     
              
                     <input type="submit" class="btn btn-primary btn-md" value="Add Category"> <i class="fa fa-sign-in"></i>
            </span>
            </div>
			</form:form>
			
			<div class="table-responsive" style="padding-top: 20px">

			<table id="table_id" name="table_id" class="display" style="padding-top: 20px">

				<thead>

					<tr>

						<th>CATEGORY ID</th>

						<th>CATEGORY NAME</th>
						
						<th>CATEGORY Description</th>

						<th>EDIT</th>

						<th>DELETE</th>

					</tr>

				</thead>

				<tbody>

					<c:forEach items="${catlist}" var="l">

						<tr>

							<td>${l.category_id}</td>

							<td>${l.category_Name}</td>
							<td>${l.categoryDesc}</td>

							<td><a class='btn btn-success btn-xs'

								href="editcategory?catname=${l.category_id}"><span

									class="glyphicon glyphicon-edit"></span> Edit</a></td>

							<td><a class='btn btn-danger btn-xs'

								href="deleteCategory?catname=${l.category_id}"><span

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

<script type="text/javascript">

	$(document).ready(function() {

		$('#table_id').dataTable({

			"pagingType" : "full_numbers",

			"lengthMenu" : [ [ 2, 5, 10, -1 ], [ 2, 5, 10, "All" ] ],

			"ordering" : true,

		});

	});
</script>