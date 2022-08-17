<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Faculty Home</title>
<style>
	.card {
  		box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  		transition: 0.3s;
  		width: 25%;
  		margin-left: 37%;
	}

	.card:hover {
  		box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
	}

	.container {
  		padding: 2px 16px;
	}
	.dropbtn {
		background-color: #FF5833;
		border-radius: 10px;
		padding:5px;
  		color: white;
  		font-size: 16px;
  		cursor: pointer;
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
		<button class="dropbtn"><a href="facultyhome" class="link-light" style="text-decoration:none">Faculty Home</a></button>
		<button class="dropbtn"><a href="stdinfo" class="link-light" style="text-decoration:none">Students Info</a></button> 
		<button class="dropbtn"><a href="addmarks" class="link-light" style="text-decoration:none">Add Marks</a></button> 
		<button class="dropbtn"><a href="showmarks" class="link-light" style="text-decoration:none">Show Marks Details</a></button> 
		<button class="dropbtn"><a href="chpass" class="link-light" style="text-decoration:none">Change Password</a></button> 
		<button class="dropbtn"><a href="login" class="link-light" style="text-decoration:none">Logout</a></button> 
	</div>
</div>
<br><br>
<h1 style="text-align:center; color:red">Welcome Faculty</h1>
<br><br>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-10">
			<form name="frm2" style="margin:0 auto;width:500px">
				<table class="table table-success table-striped" style="width:100%;border-style:solid;text-align:center">
					<tr>
						<td rowspan="7">
							<img src="Images/img_avatar.png" alt="Avatar" style="width:100%; margin-top:52px">
							<div class="container">
    							<h4 style="text-align:center"><b>${fac.factName }</b></h4> 
  							</div>
						</td>
						<th>Faculty ID</th> 
						<td>${fac.fId }</td>
					</tr>
					<tr>
						<th>Gender</th> 
						<td>${fac.gender }</td> 
					</tr>	
					<tr>
						<th>Address</th>
						<td>${fac.address }</td>
					</tr>
					<tr>	
						<th>Location</th>
						<td>${fac.location }</td>
					</tr>
					<tr>	
						<th>Phone</th>
						<td>${fac.phone }</td>
					</tr>
					<tr>	
						<th>Email</th>
						<td>${fac.email }</td>
					</tr>
					<tr>	
						<th>Password</th>
						<td>${fac.password }</td>
					</tr>
				</table>
			</form>
		</div>
		<div class="col-md-1"></div>
	</div>
</div>
</body>
</html>