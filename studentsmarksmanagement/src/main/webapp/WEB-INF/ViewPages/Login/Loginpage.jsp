<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="CSS/Style.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="nav">
	<div class="left">
		<span>Techno Main Salt Lake</span>
	</div>
</div>
<br><br>
<div class="mt-5">
	    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">

                <div class="card bg-light" style="background-color:#FFFF00 ">
                    <div class="card-header" style="font-weight:bold;font-size:20px; text-align:center">
                        Login
                    </div>
                    <img class="card-img-top" src="Images/img_avatar.png" alt="Card image cap" style="width:60%; height:60%; margin-left:95px">
                    <div class="card-body">
					<form name="loginform" method="post" action="login">
                        <label for="forUser" class="form-label">Username / Mail ID</label>
                        <input type="text" style="background-color:	#00FF00" name="username" class="form-control" placeholder="Enter Username or Email Id">
                        <label for="forPassword" class="form-label">Password</label>
                        <input type="password" style="background-color:	#FF0000" name="password" class="form-control" placeholder="Enter Password">
<!--                         <label for="forUserType" class="form-label">User Type</label> -->
						<select style="background-color:#DAF7A6" class="form-select mt-3" name="usertype">
							<option selected>Select user type...</option>
							<option value="admin">Admin</option>
							<option value="faculty">Faculty</option>
							<option value="student">Student</option>
						</select>
                    <br />
                        <div class="row">
                            <div class="col-md-12" style="text-align: center;">
                                <input type="submit" value="Login" class="btn btn-success" />&nbsp;&nbsp;
                                <input type="reset" value="Reset" class="btn btn-danger" />
                            </div>
                        </div>
                        <div class="row">
                        	<div class="col-md-12">
                        		<span style="color:red">${msg }</span>
                        	</div>
                        </div>
					</form>
					<br>
                    </div>
                </div>
            </div>
			<div class="col-md-4"></div>
        </div>
    </div>
</div>
</body>
</html>