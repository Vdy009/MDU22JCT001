<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
<style>
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
<br><br><br><br>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="m-3">
				<table class="table table-striped caption-top" style="background-color:#f8f9fa;border-radius:5px;">
				<caption style="color:#FF7D33; font-weight:bold; text-align:center; font-size:35px">Student List</caption>
				<thead>
				<tr>
					<th scope="col">Roll No</th>
					<th scope="col">Name</th>
					<th scope="col">Gender</th>
					<th scope="col">Address</th>
					<th scope="col">Location</th>
					<th scope="col">Phone</th>
					<th scope="col">Email</th>
					<th scope="col">Password</th>
					<th scope="col">Class ID</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach var="std" items="${slist }">
				<tr>
					<td>${std.rollNo }</td>
					<td>${std.stdName }</td>
					<td>${std.gender }</td>
					<td>${std.address }</td>
					<td>${std.location }</td>
					<td>${std.phone }</td>
					<td>${std.email }</td>
					<td>${std.password }</td>
					<td>${std.classId }</td>
				</tr>
				</c:forEach>
				</tbody>
				</table>
			</div>
		</div>
		<div class="col-md-2"></div>
	</div>
</div>
</body>
</html>