<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Travel Agency Response</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body style="background-color: #f2f6ff;">

<nav class="navbar navbar-expand-lg p-1"
     style="background: #0ea5e9; backdrop-filter:blur(6px);  font-family: 'Poppins', sans-serif;">
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


<div class="container py-5 d-flex justify-content-center">
  <div class="card shadow-lg rounded-4 p-5 w-100" style="max-width: 900px;">

    <h4 class="text-center text-success mb-3">${successMsg}</h4>
    <h4 class="text-center text-danger mb-4">${failureMsg}</h4>

    <% if (request.getAttribute("successMsg") != null) { %>
    <h3 class="mb-4 ps-3" style="font-weight:700;">Submitted Details:</h3>
    <hr>

    <div class="ps-3">
      <p><strong>Full Name:</strong> ${dto.fullName}</p>
      <p><strong>Email:</strong> ${dto.email}</p>
      <p><strong>Phone Number:</strong> ${dto.phoneNo}</p>
      <p><strong>Country:</strong> ${dto.country}</p>
    </div>
    <% } %>

    <div class="mt-4 text-center">
      <a href="TravelAgency.jsp" class="btn border-primary rounded btn-primary w-50">Submit Another Response</a>
    </div>

  </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>
</html>