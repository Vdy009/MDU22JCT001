<jsp:include page="aheader.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="card">
	<img src="images/learn6.jpg" class="card-img" width="100%"
		height="630px">

	<div class="card-img-overlay">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-4 mt-2">
					<div class="card shadow">
						<div class="card-header text-center">
							<h3>Course Details</h3>
						</div>
						<div class="card-body">
							<div class="form-group form-row">
								<label class="col-sm-4">Course Name</label>
								<div class="col-sm-8" style="font-weight: bold; color:Blue;">${c.cname }</div>
							</div>
							<div class="form-group form-row">
								<label class="col-sm-4">Price</label>
								<div class="col-sm-8" style="font-weight: bold; color:Blue;">&#8377; ${c.amount }</div>
							</div>

							<div class="form-group form-row">
								<label class="col-sm-4">Duration</label>
								<div class="col-sm-8" style="font-weight: bold; color:Blue;">${c.duration } hours</div>
							</div>

							<div class="form-group form-row">
								<label class="col-sm-4">Category</label>
								<div class="col-sm-8" style="font-weight: bold; color:Blue;">${c.category }</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-sm-4 mt-2">
					<div class="card shadow" style="width: 150%; position: absolute;">

						<div class="card flex-row">
							<img class="card-img-left" src="images/pay.jpg" width="40%" />


							<div class="card-body">

								<form method="post">

									<h3>Payment Details</h3>
									<input type="hidden" name="itemid" value="${param.id }">
									<input type="hidden" name="userid"
										value="${sessionScope.userid }"> <input type="hidden"
										name="vendorid" value="${c.userid }"> <input
										type="hidden" name="itemname" value="${c.cname }"> <input
										type="hidden" name="itemtype" value="Course">
									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Amount</label>
										<div class="col-sm-8">
											<input type="text" readonly name="price" value="${c.amount }"
												class="form-control" />
										</div>
									</div>
									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Card No</label>
										<div class="col-sm-8">
											<input type="text" name="cardno" required maxlength="16"
												class="form-control" />
										</div>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Name on Card</label>
										<div class="col-sm-8">
											<input type="text" name="nameoncard" required
												class="form-control" />
										</div>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">CVV</label>
										<div class="col-sm-8">
											<input type="text" maxlength="3" required name="cvv"
												class="form-control" />
										</div>
									</div>

									<div class="form-group form-row">
										<label class="col-sm-4 col-form-label">Expiry</label>
										<div class="col-sm-8">
											<input type="month" placeholder="MM/YYYY" required
												name="expiry" class="form-control" />
										</div>
									</div>
									<input type="submit" value="Make Payment"
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
.card-body {
	background-color: #E1F28D;
}

label {
	font-weight: bold;
	font-size: 15px;
}

h3 {
	color: #0818A8;
	font-weight: bold;
}
</style>
<jsp:include page="footer.jsp"></jsp:include>