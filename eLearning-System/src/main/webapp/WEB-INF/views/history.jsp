<jsp:include page="aheader.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<div class="card shadow">

	<img src="images/learn7.jpg" class="card-img" width="100%"
		height="630px">

	<div class="card-img-overlay">
		<div class="card-body">

			<h1 class="p-2"
				style="border-bottom: 2px solid green; font-weight: bold; color:#760A5F;">Course
				and Services Purchased</h1>
			<c:if test="${msg ne null }">
				<div class="alert text-success font-weight-bold">${msg }</div>
			</c:if>
			<div class="row">
				<div class="col-sm-6">
					<h5>Courses</h5>
					<table class="table table-danger table-bordered table-sm">
						<thead>
							<tr>
								<th>Id</th>
								<th>Course Name</th>
								<th>Price</th>
								<th>User ID</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${ clist}" var="cl">
								<tr>
									<td>${cl.id }</td>
									<td>${cl.itemname }</td>
									<td>${cl.price }</td>
									<td>${cl.vendorid }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="col-sm-6">
					<h5>Services</h5>
					<table class="table table-danger table-bordered table-sm">
						<thead>
							<tr>
								<th>Id</th>
								<th>Service Name</th>
								<th>Price</th>
								<th>User ID</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${ slist}" var="cl">
								<tr>
									<td>${cl.id }</td>
									<td>${cl.itemname }</td>
									<td>${cl.price }</td>
									<td>${cl.vendorid }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>

		</div>
	</div>
</div>

<style>
h5 {
	font-weight: bold;
	font-size: 30px;
	color: red;
}
</style>

<jsp:include page="footer.jsp"></jsp:include>