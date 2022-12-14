<jsp:include page="aheader.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="card">
	<img src="images/ELearning.jpg" class="card-img" width="100%"
		height="630px">

	<div class="card-img-overlay">

		<div class="container-fluid">

			<div class="row">

				<div class="col-sm-4 mx-auto mt-2">
					<div class="card shadow">

						<div class="card flex-row"
							style="width: 200%; position: absolute; left: -50%; top: 30px;">
							<img class="card-img-left" src="images/admin.jpg" width="40%"
								height="auto" />

							<div class="card-body">
								<form method="post">
									<h2 class="card-title"
										style="color: #0818A8; font-weight: bold">Modify User
										Information</h2>

									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">User ID</label>
										<div class="col-sm-8">
											<input type="text" name="userid" readonly
												class="form-control" value="${user.userid }" />
										</div>
									</div>
									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">User Name</label>
										<div class="col-sm-8">
											<input type="text" name="name" class="form-control"
												value="${user.name }" />
										</div>
									</div>
									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Contact No</label>
										<div class="col-sm-8">
											<input type="text" name="phone" maxlength="10"
												value="${user.phone }" class="form-control" />
										</div>
									</div>
									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Address</label>
										<div class="col-sm-8">
											<input type="text" name="address" value="${user.address }"
												class="form-control" />
										</div>
									</div>
									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Date of Birth</label>
										<div class="col-sm-8">
											<input type="date" name="dob" value="${user.dob }"
												class="form-control" />
										</div>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Role</label>
										<div class="col-sm-8">
											<select name="role" class="form-control">
												<option value="">-- select Role --</option>
												<option ${user.role == 'Learner' ? 'selected':'' }
													value="Learner">Learner</option>
												<option ${user.role == 'Vendor' ? 'selected':'' }
													value="Vendor">Vendor</option>
											</select>
										</div>
									</div>

									<div class="form-group form-row">
										<label for="active" class="col-sm-4 col-form-label">Status</label>
										<div class="col-sm-8">
											<input id="active" type="checkbox" name="active" value="1"
												${user.active ? 'checked':'' } class="form-check-control" />
										</div>
									</div>

									<input type="submit" value="Update Information"
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
label{
font-weight: bold; 
font-size:15px
}

input,select{
font-weight: bold; 
}

.card-body{
background-color: #DDA0DD;
}
</style>
<jsp:include page="footer.jsp"></jsp:include>