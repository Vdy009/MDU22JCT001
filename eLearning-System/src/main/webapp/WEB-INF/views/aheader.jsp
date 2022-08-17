<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Screen</title>
<link rel="stylesheet" href="css/bootstrap.css">
<script src="js/jquery-3.4.1.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body>
<div class="jumbotron p-2 text-center mb-0 rounded-0 border-bottom" style="background-color:#ADD8E6;">
	<h3 style="font-weight:bold; ">Welcome to E-Learning Portal</h3>
</div>
<c:choose>
<c:when test="${sessionScope.role eq 'Admin' }">
<nav class="navbar navbar-expand-lg navbar-dark text-black" style="background-color:#87CEFA;">
  <a class="navbar-brand" href="/dashboard">Home</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="users">Users</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/aservices">Services/Courses</a>
      </li>

      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Hello ${sessionScope.uname }
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
        <a class="dropdown-item" href="/logout" target="_self">Logout</a>
        
        </div>
      </li>
    </ul>
  </div>
</nav>
</c:when>

<c:when test="${sessionScope.role eq 'Learner' }">
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="/profile">E-Learning - Learner</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/profile">Profile</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/history">Purchase History</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/allservices">Online Services</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Hello ${sessionScope.uname }
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="/logout">Logout</a>
        </div>
      </li>
    </ul>
  </div>
</nav>
</c:when>

<c:when test="${sessionScope.role eq 'Vendor' }">
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="/profile">E-Learning - Vendor</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/profile">Profile</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/orders">Orders</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/services">Services/Product</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Hello ${sessionScope.uname }
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="/logout">Logout</a>
        </div>
      </li>
    </ul>
  </div>
</nav>
</c:when>

</c:choose>
<div class="container-fluid p-1">