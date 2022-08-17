<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
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
		<div class="col-md-3" style="background-color:#f8f9fa;">
				<div class="mb-3" style="padding-top:5px">
					<p style="font-weight:bold; font-size:20px; text-align:center">Class Faculty Mapping</p><br>
					<form name="frm" method="post" action="cfmap">
						<span>Faculty Name</span> 
						<select style="background-color:#DAF7A6" class="form-select" name="fId">
							<option selected>Select Faculty...</option>
							<c:forEach var="fac" items="${flist }">
							<option value="${fac.fId }">${fac.factName}</option>
							</c:forEach>
						</select> 
						<br> 
						<span>Class Name</span><br> 
						<select style="background-color:#DAF7A6" class="form-select form-select-mt-3" name="classId">
							<option selected>Select Class...</option>
							<c:forEach var="cls" items="${clist }">
							<option value="${cls.classId }">${cls.className}</option>
							</c:forEach>
						</select> 
						<br>
						<div style="text-align: center">
							<input type="submit" value="Map" class="btn btn-success" />
						</div>
						<br>
						<p style="color:red;text-style:italic;font-size:15px;text-align: center">${msg}</p>
					</form>
				</div>
		</div>
		<div class="col-md-1"></div>
		<div class="col-md-4">
			<table class="table table-success table-striped" style="background-color:#f8f9fa;border-radius:5px; text-align:center; border:3px">
				<thead>
					<tr>
						<th scope="col">S No.</th>
						<th scope="col">Class ID</th>
						<th scope="col">Faculty ID</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="cf" items="${cflist }">
						<tr>
							<td>${cf.sNo }</td>
							<td>${cf.classId }</td>
							<td>${cf.fId }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="col-md-2"></div>
	</div>
</div>
</body>
</html>