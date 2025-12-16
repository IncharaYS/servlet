<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Update page</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/travel-agency.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">

    <style>
        .form-label{
            color:#000080;
        }
        .required{
        color:red;
        }

    body {
      background-image: url('images/bg.png');
      background-color: #f2f6ff;
      background-repeat: no-repeat;
      background-size: cover;
      background-position: center;
      backdrop-filter: blur(3px);
      font-family: 'Poppins', sans-serif;
}


    </style>
</head>


<body style="background-color: #f2f6ff;">


<nav class="navbar navbar-expand-lg p-1"
     style="background: #0ea5e9; backdrop-filter: blur(6px); font-family: 'Poppins', sans-serif;">
  <div class="container-fluid">
    <a class="navbar-brand fs-3 fw-medium">Bon Voyage Travel Agency</a>

    <div class="collapse navbar-collapse" id="nav">
      <ul class="navbar-nav ms-auto fs-5">
          <li class="nav-item"><a class="nav-link fw-bold">${userName}</a></li>
        <li class="nav-item fw-medium"><a class="nav-link" href="home">Home</a></li>
          <li class="nav-item"><a class="nav-link" href="search">Search</a></li>
          <li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>

      </ul>
    </div>
  </div>
</nav>

<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow-lg rounded-4 p-4 bg-white w-100" style="max-width: 420px;">
    <h3 class="mb-4 text-center" style="color:#000080;">Update User Information:</h3>

    <form action="update" method="post" onsubmit="return validateForm()">

<div class="mb-3">
    <label for="fullName" class="form-label fw-bold">Full Name:<span class="required">*</span></label>
  <input type="text" id="fullName" name="fullName" class="form-control" placeholder="Enter your full name" value="${userInfo.fullName}">
  <small id="nameMsg" class="text-danger"></small>
</div>


<div class="mb-3">
  <label for="email" class="form-label fw-bold">Email:<span class="required">*</span></label>
  <input type="text" id="email" name="email"  disabled  class="form-control" placeholder="Enter your email"
         oninput="validateEmail(this)" value="${userInfo.email}">
  <small id="emailMsg" class="text-danger"></small>
    <input type="hidden" name="email" value="${userInfo.email}">
</div>

<!--      <div class="mb-3">-->
<!--        <label for="password" class="form-label fw-bold">Password:<span class="required">*</span></label>-->
<!--        <input type="password" id="password" name="password" class="form-control" placeholder="Enter your password"-->
<!--               oninput="validatePassword(this)" value="${userInfo.password}">-->
<!--        <small id="passwordMsg" class="text-danger"></small>-->
<!--      </div>-->





        <div class="mb-3 position-relative">
            <label for="password" class="form-label fw-bold">
                Password:<span class="required">*</span>
            </label>
            <div class="input-group">
                <input type="password" id="password" name="password" class="form-control"
                       placeholder="Enter your password"
                       oninput="validatePassword(this)" value="${userInfo.password}">
                <button type="button" class="btn btn-outline-secondary"
                        onclick="togglePassword()" id="toggleBtn">
                    <i class="bi bi-eye"></i>
                </button>
            </div>
            <small id="passwordMsg" class="text-danger"></small>
        </div>




        <div class="mb-3">
        <label for="phoneNo" class="form-label fw-bold">Phone Number:<span class="required">*</span></label>
        <input type="number" id="phoneNo" name="phoneNo" class="form-control" value="${userInfo.phoneNo}" placeholder="Enter your phone number"
               oninput="validatePhoneNo(this)" >
        <small id="phoneNoMsg" class="text-danger"></small>
      </div>


      <div class="mb-3">
        <label for="country" class="form-label fw-bold">Country:<span class="required">*</span></label>
        <input type="text" id="country" name="country" class="form-control" placeholder="Enter your country" value="${userInfo.country}">
        <small id="countryMsg" class="text-danger"></small>
      </div>


        <h6 id="invalidInfo" class="text-danger">${invalidData}</h6>
      <div class="text-center mt-4">
        <input type="submit" class="btn btn-primary px-5" value="Update">
      </div>




    </form>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>
</html>