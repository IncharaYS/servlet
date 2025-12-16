<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Update Customer Information</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="js/medicalstore.js"></script>

  <style>
    body {
        background-image: url('images/bg.png');
        background-color: #f2f6ff;
        background-repeat: no-repeat;
        background-size: cover;
        background-position: center;
        backdrop-filter: blur(3px);
        font-family: 'Poppins', sans-serif;
    }

        .navbar {
            background: rgba(14,165,233,0.9);
            backdrop-filter: blur(6px);
        }

        .navbar-brand {
            font-weight: 600;
            color: #fff !important;
        }

        .page-wrapper {
            margin-top: 40px;
            margin-bottom: 40px;
        }

        .update-card {
            background: rgba(255, 255, 255, 0.95);
            border-radius: 20px;
            padding: 40px 40px;
            box-shadow: 0px 10px 25px rgba(0, 0, 0, 0.25);

            max-width: 1200px;
            width: 80%;
        }

        .form-label {
            color: #0ea5e9;
        }

        .required {
            color: red;
        }

        .btn-primary {
            background-color: #0ea5e9;
            border: none;
        }

        .btn-primary:hover {
            background-color: #0284c7;
        }

        small.text-danger {
            font-size: 0.85rem;
        }
  </style>

</head>

<body>

<nav class="navbar navbar-expand-lg shadow-sm">
  <div class="container-fluid">
    <a class="navbar-brand fs-3">MedTrust Medical Store</a>

    <div class="collapse navbar-collapse">
      <ul class="navbar-nav ms-auto fs-5">
        <li class="nav-item"><a class="nav-link" href="search">Search</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container d-flex justify-content-center align-items-start page-wrapper">
  <div class="update-card shadow-lg">

    <h3 class="mb-4 text-center" style="color:#0ea5e9;">Update Customer Information</h3>

    <form action="update" method="get" onsubmit="return validateForm()">

      <div class="mb-3">
        <label for="fullName" class="form-label fw-bold">Full Name:
          <span class="required">*</span>
        </label>
        <input type="text" id="fullName" name="fullName" class="form-control"
               placeholder="Enter your full name" value="${dto.fullName}">
        <small id="nameMsg" class="text-danger"></small>
      </div>

      <div class="mb-3">
        <label for="email" class="form-label fw-bold">Email:
          <span class="required">*</span>
        </label>
        <input type="text" id="email" class="form-control" disabled value="${dto.email}">
        <input type="hidden" name="email" value="${dto.email}">
      </div>

      <div class="mb-3">
        <label for="password" class="form-label fw-bold">Password:
          <span class="required">*</span>
        </label>
        <input type="password" id="password" name="password" class="form-control"
               placeholder="Enter your password" value="${dto.password}"
               oninput="validatePassword(this)">
        <small id="passwordMsg" class="text-danger"></small>
      </div>

      <div class="mb-3">
        <label for="phoneNo" class="form-label fw-bold">Phone Number:
          <span class="required">*</span>
        </label>
        <input type="number" id="phoneNo" name="phoneNo" class="form-control"
               placeholder="Enter your phone number" value="${dto.phoneNo}"
               oninput="validatePhoneNo(this)">
        <small id="phoneNoMsg" class="text-danger"></small>
      </div>

      <div class="mb-3">
        <label for="age" class="form-label fw-bold">Age:
          <span class="required">*</span>
        </label>
        <input type="number" id="age" name="age" class="form-control"
               placeholder="Enter your age" value="${dto.age}">
        <small id="countryMsg" class="text-danger"></small>
      </div>


      <div class="text-center mt-4">
        <button type="submit" class="btn btn-primary px-5 py-2">Update</button>
      </div>

    </form>

  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
