<jsp:include page="aheader.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

	
		<div class="card">
		<img src="images/ELearning.jpg" class="card-img" width="100%"
			height="630px">

		<div class="card-img-overlay">
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-4 mx-auto mt-2">
						<div class="card shadow">
							<div class="card flex-row" style="width: 200%; position:absolute; left:-50%; top:30px;">
								<img class="card-img-left" src="images/signup.jpg" width="40%" height="auto" />						

							<div class="card-body" style="background-color:	#FAFAD2;">
							<h2 class="card-title" style="color: #0818A8; font-weight: bold">Register New User</h2>
								<sf:form method="post" modelAttribute="user">
									<div class="form-group form-row">
									
										<sf:label path="name" style="font-weight: bold; font-size:15px" cssClass="col-sm-4 col-form-label">User Name</sf:label>
										<div class="col-sm-8">
											<sf:input type="text" path="name" style="font-weight: bold;" cssClass="form-control" />
											<sf:errors path="name" cssClass="text-danger text-small" />
										</div>
									</div>
									<div class="form-group form-row">
										<sf:label path="phone" style="font-weight: bold; font-size:15px" cssClass="col-sm-4 col-form-label">Contact No</sf:label>
										<div class="col-sm-8">
											<sf:input type="text" path="phone" style=" font-weight: bold;" maxlength="10"
												cssClass="form-control" />
											<sf:errors path="phone" cssClass="text-danger text-small" />
										</div>
									</div>
									<div class="form-group form-row">
										<sf:label path="address" style="font-weight: bold; font-size:15px" cssClass="col-sm-4 col-form-label">Address</sf:label>
										<div class="col-sm-8">
											<sf:input type="text" path="address" cssClass="form-control" style="font-weight: bold;" />
											<sf:errors path="address" cssClass="text-danger text-small" />
										</div>
									</div>
									<div class="form-group form-row">
										<sf:label path="dob" style="font-weight: bold; font-size:15px" cssClass="col-sm-4 col-form-label">Date of Birth</sf:label>
										<div class="col-sm-8">
											<sf:input type="date" path="dob" cssClass="form-control" style="font-weight: bold;" />
											<sf:errors path="dob" cssClass="text-danger text-small" />
										</div>
									</div>
									<div class="form-group form-row">
										<sf:label path="userid" style="font-weight: bold; font-size:15px" cssClass="col-sm-4 col-form-label">User ID</sf:label>
										<div class="col-sm-8">
											<sf:input type="text" path="userid" cssClass="form-control" style="font-weight: bold;" placeholder="Enter your Email here" />
											<sf:errors path="userid" cssClass="text-danger text-small" />
										</div>
									</div>
									<div class="form-group form-row">
										<sf:label path="pwd" style="font-weight: bold; font-size:15px" cssClass="col-sm-4 col-form-label">Password</sf:label>
										<div class="col-sm-8">
											<sf:input type="password" path="pwd" cssClass="form-control" style="font-weight: bold;" />
											<sf:errors path="pwd" cssClass="text-danger text-small" />
										</div>
									</div>
									<div class="form-group form-row">
										<sf:label path="cpwd" style="font-weight: bold; font-size:15px" cssClass="col-sm-4 col-form-label">Repeat Password</sf:label>
										<div class="col-sm-8">
											<sf:input type="password" path="cpwd" cssClass="form-control" style="font-weight: bold;" />
											<sf:errors path="cpwd" cssClass="text-danger text-small" />
										</div>
									</div>
									<div class="form-group form-row">
										<sf:label path="role" style="font-weight: bold; font-size:15px" cssClass="col-sm-4 col-form-label">Role</sf:label>
										<div class="col-sm-8">
											<sf:select path="role" cssClass="form-control" style="font-weight: bold;">
												<sf:option value="">-- Select Role --</sf:option>
												<sf:option value="Learner">Learner</sf:option>
												<sf:option value="Vendor">Vendor</sf:option>
											</sf:select>
											<sf:errors path="role" cssClass="text-danger text-small" />
										</div>
									</div>
									<input type="submit" value="Register"
										class="btn btn-success float-right px-4">
								</sf:form>

							</div>
						</div>
					</div>
				</div>
		</div>
	</div></div></div>
<jsp:include page="footer.jsp"></jsp:include>