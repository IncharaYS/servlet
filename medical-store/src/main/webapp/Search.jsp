<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Search Customer</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

  <style>
    body {
        background-color: #f2f6ff;
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

    .search-card {
        background: rgba(255, 255, 255, 0.95);
        border-radius: 20px;
        padding: 40px 40px;
        box-shadow: 0px 10px 25px rgba(0, 0, 0, 0.25);
        max-width: 700px;
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

    .page-wrapper {
        margin-top: 80px;
        margin-bottom: 40px;
    }
  </style>
</head>

<body>

<nav class="navbar navbar-expand-lg shadow-sm">
  <div class="container-fluid">
    <a class="navbar-brand fs-3">MedTrust Medical Store</a>

    <div class="collapse navbar-collapse" id="nav">
      <ul class="navbar-nav ms-auto fs-5">
        <li class="nav-item"><a class="nav-link" href="register">Register Again</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container d-flex justify-content-center align-items-start page-wrapper">
  <div class="search-card shadow-lg">

    <form action="search" method="get">

      <div class="mb-3">
        <label for="email" class="form-label fw-bold">
          Enter Email to Search Customer:
          <span class="required">*</span>
        </label>
        <input type="text" id="email" name="email" class="form-control"
               placeholder="Enter email to search"
               oninput="validateEmail(this)">
        <small id="emailMsg" class="text-danger"></small>
      </div>

      <div class="mb-4 mt-4">
        <input type="submit" class="btn btn-primary px-5 py-2 rounded-4" name="action" value="Submit">
        <input type="submit" class="btn btn-primary px-5 py-2 rounded-4 ms-4" name="action" value="Clear">
      </div>

    </form>

    <h4 class="text-center text-danger mb-4">${failureMsg}</h4>

    <c:if test="${dto!=null}">
      <div class="alert alert-success mt-3">
        <h4 style="color:#0ea5e9;">Customer Details:</h4>
        <p><strong>Name: </strong>${dto.fullName}</p>
        <p><strong>Email: </strong>${dto.email}</p>
        <p><strong>Phone Number: </strong>${dto.phoneNo}</p>
        <p><strong>Age: </strong>${dto.age}</p>

        <a href="update?email=${dto.email}" class="btn btn-outline-primary mt-2">
          Update Info
        </a>
      </div>
    </c:if>

  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
