<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Matrimony Response</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  <style>
    body {
      background: linear-gradient(135deg, #ffe6e6, #ffffff);
    }
    .card {
      border: none;
    }
    .card h3, .card p {
      color: #800000;
    }
    .text-success {
      color: #b30000 !important;
    }
    .text-danger {
      color: #cc0000 !important;
    }
    .card hr {
      border-top: 2px solid #800000;
      width: 50%;
      margin-left: 0;
      margin-bottom: 1rem;
    }
     .navbar {
    background: rgba(128, 0, 0, 0.85);
    backdrop-filter: blur(6px);
  }
    .navbar .nav-link {
      color: white !important;
    }
    .navbar-brand {
      color: white !important;
    }
  </style>
</head>
<body>

<nav class="navbar navbar-expand-lg p-1">
  <div class="container-fluid">
    <a class="navbar-brand fs-3">Matrimony app</a>

    <div class="collapse navbar-collapse" id="nav">
      <ul class="navbar-nav ms-auto fs-5">
        <li class="nav-item"><a class="nav-link" href="index">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="matrimony">Matrimony</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container py-5 d-flex justify-content-center">
  <div class="card shadow-lg rounded-4 p-5 w-100" style="max-width: 900px; background-color:#fff0f0;">

    <h4 class="text-center text-success mb-3">${successMsg}</h4>
    <h4 class="text-center text-danger mb-4">${failureMsg}</h4>

    <% if (request.getAttribute("successMsg") != null) { %>
    <h3 class="mb-4 ps-3" style="font-weight:700;">Submitted Details:</h3>
    <hr>

    <div class="ps-3">
      <p><strong>Email:</strong> ${dto.email}</p>
      <p><strong>Created Profile for:</strong> ${dto.createProfileFor}</p>
      <p><strong>Gender:</strong> ${dto.gender}</p>
      <p><strong>Date of birth:</strong> ${dto.dateOfBirth}</p>
      <p><strong>Mother tongue:</strong> ${dto.motherTongue}</p>
      <p><strong>Religion:</strong> ${dto.religion}</p>
      <p><strong>Marital status:</strong> ${dto.maritalStatus}</p>
      <p><strong>Height:</strong> ${dto.height}</p>
    </div>
    <% } %>

  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>
