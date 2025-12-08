<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Travel Agency</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/travel-agency.js"></script>
    <style>
        .form-label{
            color:#000080;
        }
        .required{
        color:red;
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
        <li class="nav-item fw-medium"><a class="nav-link" href="index">Home</a></li>
        <li class="nav-item fw-medium"><a class="nav-link" href="travelagency">Register</a></li>
          <li class="nav-item"><a class="nav-link" href="search">Search</a></li>

      </ul>
    </div>
  </div>
</nav>

<div class="container mt-5">
  <div class="card shadow-lg rounded-4 p-4 bg-white">
    <h3 class="mb-4 text-center" style="color:#000080;">Travel Agency Registration</h3>

    <form action="travelagency" method="post" onsubmit="return validateForm()">

<div class="mb-3">
    <label for="fullName" class="form-label fw-bold">Full Name:<span class="required">*</span></label>
  <input type="text" id="fullName" name="fullName" class="form-control" placeholder="Enter your full name">
  <small id="nameMsg" class="text-danger"></small>
</div>


<div class="mb-3">
  <label for="email" class="form-label fw-bold">Email:<span class="required">*</span></label>
  <input type="text" id="email" name="email" class="form-control" placeholder="Enter your email"
         oninput="validateEmail(this)">
  <small id="emailMsg" class="text-danger"></small>
</div>

      <div class="mb-3">
        <label for="password" class="form-label fw-bold">Password:<span class="required">*</span></label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Enter your password"
               oninput="validatePassword(this)">
        <small id="passwordMsg" class="text-danger"></small>
      </div>


      <div class="mb-3">
        <label for="phoneNo" class="form-label fw-bold">Phone Number:<span class="required">*</span></label>
        <input type="number" id="phoneNo" name="phoneNo" class="form-control" placeholder="Enter your phone number"
               oninput="validatePhoneNo(this)">
        <small id="phoneNoMsg" class="text-danger"></small>
      </div>


      <div class="mb-3">
        <label for="country" class="form-label fw-bold">Country:<span class="required">*</span></label>
        <input type="text" id="country" name="country" class="form-control" placeholder="Enter your country">
        <small id="countryMsg" class="text-danger"></small>
      </div>

      <div class="text-center mt-4">
        <button type="submit" class="btn btn-primary px-5">Submit</button>
      </div>

    </form>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>
</html>