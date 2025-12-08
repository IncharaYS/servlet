<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Search page</title>

  <script src="js/travel-agency.js"></script>
  <style>
    .form-label{
        color:#000080;
    }
    .required{
    color:red;
    }

  </style>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body style="background-color: #f2f6ff;">


<nav class="navbar navbar-expand-lg p-1"
     style="background: #0ea5e9; backdrop-filter: blur(6px); font-family: 'Poppins', sans-serif;">
  <div class="container-fluid">
    <a class="navbar-brand fs-3">Bon Voyage Travel Agency</a>

    <div class="collapse navbar-collapse" id="nav">
      <ul class="navbar-nav ms-auto fs-5">
        <li class="nav-item"><a class="nav-link" href="index">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="travelagency">Register</a></li>
        <li class="nav-item"><a class="nav-link" href="search">Search</a></li>
      </ul>
    </div>
  </div>
</nav>


<div class="container d-flex justify-content-center align-items-center vh-100">
  <div class="card shadow-lg rounded-4 p-4  w-75" style="max-width: 600px; background-color:#f2f6ff;">

    <form action="search" method="post">

      <div class="mb-3">
        <label for="email" class="form-label fw-bold">Enter Email to Search User:<span class="required">*</span></label>
        <input type="text" id="email" name="email" class="form-control" placeholder="Enter your email"
               oninput="validateEmail(this)">
        <small id="emailMsg" class="text-danger"></small>
      </div>


      <div class="text-center">
        <button type="submit" class="btn btn-primary px-5 py-2 rounded-3">
          Search
        </button>
      </div>


    </form>

    <c:if test="${not empty failureMsg}">
      <h4 class="text-center text-danger mb-4">${failureMsg}</h4>
    </c:if>


    <c:if test="${userInfo != null}">
    <div class="alert alert-success mt-3">
      <h4>User Details Found:</h4>
      <p><strong>Name:</strong>${userInfo.fullName}</p>
      <p><strong>Email:</strong>${userInfo.email}</p>
      <p><strong>Phone:</strong>${userInfo.phoneNo}</p>
      <p><strong>Country:</strong>${userInfo.country}</p>
    </div>
    </c:if>


  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>



</body>
</html>