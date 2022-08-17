<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Faculty Password</title>
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
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="card bg-light">
            	<div class="card-header" style="font-weight:bold;font-size:20px; text-align:center">
                    Change Password
                </div>
                <div class="card-body">
					<form name="loginform" method="post" action="chpassprocess">
						<label for="oldpass" class="form-label" style="padding-top:4px">Old Password</label>							
						<input style="background-color:#DAF7A6" type="text" id="oldpass" name="oldpass" class="form-control" placeholder="Enter Old Password">					
						<label for="newpass" class="form-label" style="padding-top:4px">New Password</label>							
						<input style="background-color:#DAF7A6" type="text" id="newpass" name="newpass" class="form-control" placeholder="Enter New Password">							
						<label for="conpass" class="form-label" style="padding-top:4px">Confirm Password</label>							
						<input style="background-color:#DAF7A6" type="text" id="conpass" name="conpass" class="form-control" placeholder="Re-Enter New Password">
                    	<br />
                        <div class="row">
                            <div class="col-md-12" style="text-align: center;">
                                <input type="submit" value="Submit" class="btn btn-success" />
                            </div>
                        </div>
						<div style="color:red;text-style:italic;font-size:15px">${msg}</div>
					</form>
					<br>
                </div>
            </div>
		</div>
		<div class="col-md-4"></div>
	</div>
</div>
</body>
</html>