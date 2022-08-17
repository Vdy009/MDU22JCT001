<jsp:include page="aheader.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<div class="card shadow">

<img src="images/learn7.jpg" class="card-img" width="100%"
		height="630px">

	<div class="card-img-overlay">
	<div class="card-body">
	<a href="/adservice" class="btn btn-warning btn-sm float-right mt-2 mr-2">Add
				Service</a>
		<a href="/acourses" class="btn btn-primary btn-sm mr-2 mt-2 float-right">Courses</a>
				<form style="width:700px;" class="float-right">
		<button class="btn btn-success btn-sm float-right mr-2 mt-2">Search</button>
		<div style="width:200px" class="float-right py-2 mr-2">
			<select name="role" class="form-control form-control-sm">
				<option ${param.role=='all' ? 'selected':'' } value="all">-- All Vendors --</option>
				<c:forEach items="${vendors }" var="v">
					<option ${param.role eq v.userid ? 'selected':'' } value="${v.userid }">${v.name }</option>
				</c:forEach>				
			</select>
		</div>

		</form>	
		
		
		<h1 class="p-2" style="border-bottom:2px solid green; font-weight: bold; color:#760A5F;">All Services List</h1>
		<c:if test="${msg ne null }">
		<div class="alert text-success font-weight-bold">${msg }</div>
		</c:if>
		<table class="table table-success table-bordered table-sm">
			<thead>
				<tr>
					<th>Id</th>
					<th>Service Name</th>
					<th>Price</th>
					<th>User ID</th>
					
					<!-- <th>Action</th> -->
				
				</tr>
			</thead>
			<tbody>
				<c:forEach var="u" items="${list }">
					<tr>
						<td>${u.id }</td>
						<td>${u.sname }</td>
						<td>&#8377; ${u.price }</td>
						<td>${u.userid }</td>
				
				<%-- <td><a href="/buyservice?id=${u.id }" class="btn btn-primary btn-sm">Buy Now</a></td> --%>
				
					</tr>
				</c:forEach>
			</tbody>
		</table>	
	</div>
</div></div>
<script>
$(function(){
	$("#role").change(function(){
		let role=$(this).val();
		location.href="services?role="+role;
	});
	
});
</script>

<jsp:include page="footer.jsp"></jsp:include>