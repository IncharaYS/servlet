<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Medical Store Response</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

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

        .response-card {
            background: rgba(255, 255, 255, 0.95);
            border-radius: 20px;
            padding: 40px 40px;
            box-shadow: 0px 10px 25px rgba(0, 0, 0, 0.25);
            max-width: 1000px;
            width: 80%;
        }

        h4, h3 {
            font-family: 'Poppins', sans-serif;
        }

        .label-value p strong {
            color: #0ea5e9;
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
        <li class="nav-item"><a class="nav-link" href="search">Search</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container d-flex justify-content-center page-wrapper">
  <div class="response-card shadow-lg">

    <h4 class="text-center text-success mb-3">${successMsg}</h4>

    <h3 class="mb-4 ps-2 fw-bold" style="color:#0ea5e9;">Customer Details:</h3>
    <hr>

    <div class="ps-2 label-value">
      <p><strong>Full Name:</strong> ${dto.fullName}</p>
      <p><strong>Email:</strong> ${dto.email}</p>
      <p><strong>Phone Number:</strong> ${dto.phoneNo}</p>
      <p><strong>Age:</strong> ${dto.age}</p>
    </div>

  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
