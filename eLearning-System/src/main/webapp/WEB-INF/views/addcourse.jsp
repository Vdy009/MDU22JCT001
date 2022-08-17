<jsp:include page="aheader.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="card">
	<img src="images/learn4.jpg" class="card-img" width="100%"
		height="630px">

	<div class="card-img-overlay">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-4 mx-auto mt-2">
					<div class="card shadow"
						style="width: 200%; position: absolute; left: -50%; top: 50px;">
						<div class="card flex-row">
							<img class="card-img-left" src="images/study.jpg" width="40%" />
							<div class="card-body">
								<form method="post">
									<input type="hidden" name="userid"
										value="${sessionScope.userid }">
									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Course Name</label>
										<div class="col-sm-8">
											<input type="text" name="cname" class="form-control" />
										</div>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Price</label>
										<div class="col-sm-8">
											<input type="text" name="amount" class="form-control" />
										</div>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Duration</label>
										<div class="col-sm-8">
											<input type="text" name="duration" class="form-control" />
										</div>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Category</label>
										<div class="col-sm-8">
											<select name="category" class="form-control">
												<option>Instructor Led</option>
												<option>Self Learning</option>
												<option>Assessment</option>
											</select>
										</div>
									</div>
									<input type="submit" value="Save Course"
										class="btn btn-primary float-right px-4">
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<style>
label {
	font-weight: bolder;
	font-size: 20px;
}

input, select {
	font-weight: bold;
}

.card-body {
	background-color: #FF99FF;
}
</style>
<jsp:include page="footer.jsp"></jsp:include>