<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Students Marks</title>
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
		<div class="col-md-8" style="background-color:#f8f9fa;">
			<div class="m-3">
				<form name="form1" method="post" action="addmarksprocess">
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4" style="font-weight:bold; text-align:center">
						Add Marks of a Student
					</div>
					<div class="col-md-4"></div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-6">
						    <label class="form-label">Exam Type</label>
							<select style="background-color:#DAF7A6" class="form-select form-select-mt-3" name="examType">
							<option selected>Select...</option>
							<option value="Qtrly">Qtrly</option>
							<option value="Halfyrly">Halfyrly</option>
							<option value="Final">Final</option>
							</select>
					</div>
					<div class="col-md-3"></div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<label class="form-label">Science</label>
						<input style="background-color:#DAF7A6" type="text" class="form-control" id="science" name="science" required>
					</div>
					<div class="col-md-4">
						<label class="form-label">Maths</label>
						<input style="background-color:#DAF7A6" type="text" class="form-control" id="maths" name="maths" required>
					</div>
					<div class="col-md-4">
						<label class="form-label">Computer</label>
						<input style="background-color:#DAF7A6" type="text" class="form-control" id="computer" name="computer" required>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<label class="form-label">Total</label>
						<input style="background-color:#DAF7A6" type="text" class="form-control" id="total" name="total" disabled>
					</div>
					<div class="col-md-4">
						<label class="form-label">Average</label>
						<input style="background-color:#DAF7A6" type="text" class="form-control" id="average" name="average" disabled>
					</div>
					<div class="col-md-4">
						<label class="form-label">Grade</label>
						<input style="background-color:#DAF7A6" type="text" class="form-control" id="grade" name="grade" disabled>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<label class="form-label">Student Roll No</label>
						<input style="background-color:#DAF7A6" type="text" class="form-control" id="rollNo" name="rollNo" required>
					</div>
					<div class="col-md-4">
						<label class="form-label">Class Name</label>
						<input style="background-color:#DAF7A6" type="text" class="form-control" id="classId" name="classId"  value="${cf.classId }" disabled>
					</div>
					<div class="col-md-4">
						<label class="form-label">Faculty Name</label>
						<input style="background-color:#DAF7A6" type="text" class="form-control" id="fId" name="fId"  value="${cf.fId }" disabled>
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