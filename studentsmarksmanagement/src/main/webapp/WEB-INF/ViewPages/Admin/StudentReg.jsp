<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student Registration</title>
<style type="text/css">
.dropbtn {
		background-color: #FF5833;
		border-radius: 10px;
		padding:5px;
  		color: white;
  		font-size: 16px;
  		cursor: pointer;
	}

	.dropdown {
  		position: relative;
  		display: inline-block;
	}

	.dropdown-content {
  		display: none;
  		position: absolute;
  		background-color: #f9f9f9;
  		min-width: 160px;
	   	box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  		z-index: 1;
	}

	.dropdown-content a {
  		color: white;
  		padding: 12px 16px;
  		text-decoration: none;
  		display: block;
	}

	.dropdown-content a:hover {
		background-color: background-color: #990000;
	}

	.dropdown:hover .dropdown-content {
  		display: block;
	}

	.dropdown:hover .dropbtn {
  		background-color: #990000;
	}
</style>
<link href="CSS/Style.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="nav">
	<div class="left">
		<span>Techno College Marks Management System</span>
	</div>
	<div class="right">
		<button class="dropbtn"><a href="adminhome" class="link-light" style="text-decoration:none">Admin Home</a> </button>
		<button class="dropbtn"><a href="classes" class="link-light" style="text-decoration:none">Classes</a></button> 
		<div class="dropdown">
  			<button class="dropbtn">Student</button>
  				<div class="dropdown-content">
    				<a href="studentreg" class="link-light" style="text-decoration:none">Student Registration</a>
    				<a href="studentlist" class="link-light" style="text-decoration:none">Student List</a>
  				</div>
		</div>
		<div class="dropdown">
  			<button class="dropbtn">Faculty</button>
  				<div class="dropdown-content">
    				<a href="facultyreg" class="link-light" style="text-decoration:none">Faculty Registration</a>
    				<a href="facultylist" class="link-light" style="text-decoration:none">Faculty List</a>
  				</div>
		</div>
		<button class="dropbtn"><a href="cfmaps" class="link-light" style="text-decoration:none">Class-Faculty Mapping</a></button> 
		<button class="dropbtn"><a href="login" class="link-light" style="text-decoration:none">Logout</a></button> 
	</div>
</div>
<br><br><br><br>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8" style="background-color:#f8f9fa;">
			<div class="m-3">
				<form name="form1" method="post" action="studentregprocess">
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4" style="font-weight:bold; text-align:center">
						Student Registration
					</div>
					<div class="col-md-4"></div>
				</div>
				<div class="row">
					<div class="col-md-4">
						    <label class="form-label">Roll No</label>
							<input style="background-color:#DAF7A6" type="text" class="form-control" id="rollno" name="rollno" required>
					</div>
					<div class="col-md-5">
						    <label class="form-label">Name</label>
							<input style="background-color:#DAF7A6" type="text" class="form-control" id="name" name="name" required>
					</div>
					<div class="col-md-3">
						    <label class="form-label">Gender</label>
							<select style="background-color:#DAF7A6" class="form-select form-select-mt-3" name="gender">
							<option selected>Select...</option>
							<option value="Male">Male</option>
							<option value="Female">Female</option>
							</select>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						    <label class="form-label">Address</label>
							<input style="background-color:#DAF7A6" type="text" class="form-control" id="address" name="address" required>
					</div>
					<div class="col-md-3">
						    <label class="form-label">Location</label>
							<input style="background-color:#DAF7A6" type="text" class="form-control" id="location" name="location" required>
					</div>
					<div class="col-md-3">
						    <label class="form-label">Email</label>
							<input style="background-color:#DAF7A6" type="email" class="form-control" id="email" name="email" required>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						    <label class="form-label">Phone</label>
							<input style="background-color:#DAF7A6" type="text" class="form-control" id="phone" name="phone" required>
					</div>
					<div class="col-md-4">
						    <label class="form-label">Class</label>
							<select style="background-color:#DAF7A6" class="form-select form-select-mt-3" name="classname">
							<option selected>Select Class...</option>
							<c:forEach var="cls" items="${clist }">
							<option value="${cls.className }">${cls.className}</option>
							</c:forEach>
							</select>
					</div>
					<div class="col-md-4">
						<label class="form-label">Password</label>
						<input style="background-color:#DAF7A6" type="password" class="form-control" id="password" name="password" required>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4" style="padding-top:10px; margin-left:70px">
						<input type="submit" class="btn btn-success" value="Submit"/>&nbsp;&nbsp;&nbsp;
						<input type="reset" class="btn btn-danger value="Reset"/>
					</div>
					<div class="col-md-4"></div>
				</div>
				</form>
				<div style="color:red;text-style:italic;font-size:25px;text-align:center">${msg }</div>
			</div>
		</div>
		<div class="col-md-2"></div>
	</div>
</div>
</body>
</html>