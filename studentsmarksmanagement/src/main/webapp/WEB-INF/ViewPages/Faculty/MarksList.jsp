<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Marks Details</title>
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
				<caption style="color:#FF7D33; font-weight:bold; text-align:center; font-size:35px">Students Marks List</caption>
				<thead>
				<tr style="text-align:center">
					<th scope="col">Serial No</th>
					<th scope="col">Exam Type</th>
					<th scope="col">Roll No</th>
					<th scope="col">Class ID</th>
					<th scope="col">Faculty ID</th>
					<th scope="col">Science</th>
					<th scope="col">Maths</th>
					<th scope="col">Computer</th>
					<th scope="col">Total</th>
					<th scope="col">Average</th>
					<th scope="col">Grade</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach var="mark" items="${mlist }">
				<tr style="text-align:center">
					<td>${mark.sNo }</td>
					<td>${mark.examType }</td>
					<td>${mark.rollNo }</td>
					<td>${mark.classId }</td>
					<td>${mark.fId }</td>
					<td>${mark.science }</td>
					<td>${mark.maths }</td>
					<td>${mark.computer }</td>
					<td>${mark.total }</td>
					<td>${mark.average }</td>
					<td>${mark.grade }</td>
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