<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Screen</title>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
	<div class="card">
		<img src="images/ELearning.jpg" class="card-img" width="100%"
			height="750px">

		<div class="card-img-overlay">

			<div class="jumbotron text-center p-2">
				<h1>E-Learning System</h1>
			</div>
			<div class="container-fluid">

				<div class="row">
					<div class="col-sm-3 mx-auto mt-3">
						<div class="card shadow" style="width: 200%; position:absolute; left:-30%; top:30px;">
							<div class="card flex-row">
								<img class="card-img-left" src="images/signin.jpg" width="40%" />

								<div class="card-body" style="background-color:#FFA07A;">
								

									<h2 class="card-title" style="color: #0818A8; font-weight: bold;">Login Here</h2>
									<form method="post" action="validate">
										<div class="form-group">
											<label style="font-weight: bold; font-size:20px">User ID</label> <input type="text" name="userid"
												required class="form-control">
										</div>
										<div class="form-group">
											<label style="font-weight: bold; font-size:20px">Password</label> <input type="password" name="pwd"
												required class="form-control">
										</div>
										<div class="form-group">
											<label style="font-weight: bold; font-size:20px">Role</label> 
											<select name="role" required
												class="form-control">
												<option>-- Select Role --</option>
												<option value="Admin">Administrator</option>
												<option>Learner</option>
												<option>Vendor</option>
											</select>
										</div>
										<a href="register" class="btn btn-info float-left px-4">Register Here</a> 
										<input
											type="submit" value="Log In"
											class="btn btn-success float-right px-4">
									</form>
									<div class="clearfix"></div>
									<c:if test="${msg ne null }">
										<div class="alert text-success font-weight-bold">${msg }</div>
									</c:if>
									<c:if test="${error ne null }">
										<div class="alert text-danger font-weight-bold">${error }</div>
									</c:if>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>