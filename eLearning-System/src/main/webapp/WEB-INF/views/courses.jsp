<jsp:include page="aheader.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<div class="card shadow">

	<img src="images/elearning02.jpg" class="card-img" width="100%"
		height="630px">

	<div class="card-img-overlay">
	<div class="card-body">
		
		<a href="/addcourse" class="btn btn-success btn-sm float-right mt-1 mr-1">Add Course</a>
		<a href="/services" class="btn btn-success btn-sm float-right mt-1 mr-1">Services</a>
		
		<h4 class="p-2" style="border-bottom:2px solid green;">My Courses List</h4>
		<c:if test="${msg ne null }">
		<div class="alert text-success font-weight-bold">${msg }</div>
		</c:if>
		<table class="table table-info table-bordered table-sm">
			<thead>
				<tr>
					<th>Id</th>
					<th>Course Name</th>
					<th>Price</th>
					<th>Duration</th>
					<th>Category</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="u" items="${list }">
					<tr>
						<td>${u.id }</td>
						<td>${u.cname }</td>
						<td>${u.amount }</td>
						<td>${u.duration } hr</td>
						<td>${u.category }</td>
						<td>${u.active ? 'Active':'Inactive' }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	
	</div>
</div>
</div>
<script>
$(function(){
	$("#role").change(function(){
		let role=$(this).val();
		location.href="services?role="+role;
	});
	
});
</script>

<jsp:include page="footer.jsp"></jsp:include>