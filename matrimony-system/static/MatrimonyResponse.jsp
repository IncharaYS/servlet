<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Matrimony response</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body class="bg-primary-subtle" >
<nav class="navbar navbar-expand-lg p-1"
     style="background: #0d6efd; backdrop-filter: blur(6px);">
  <div class="container-fluid">
    <a class="navbar-brand text-white fs-3">Matrimony app</a>

    <div class="collapse navbar-collapse" id="nav">
      <ul class="navbar-nav ms-auto fs-5">
        <li class="nav-item"><a class="nav-link text-white" href="index">Home</a></li>
        <li class="nav-item"><a class="nav-link text-white" href="matrimony">Matrimony</a></li>
      </ul>
    </div>
  </div>
</nav>


<div class="container d-flex justify-content-center py-5">
  <div class="card shadow-lg p-4 w-100" style="max-width: 900px;">
    <h4 class="mt-4 mb-3 text-center text-success">${successMsg}</h4>
    <h4 class="mt-4 mb-3 text-center text-danger">${failureMsg}</h4>

    <% if (request.getAttribute("successMsg") != null) { %>
    <h3 class="mt-4 mb-3 ps-4">Submitted details are:</h3>
    <div class="ps-4">

      <h3 class="mt-4" style="color:#2b68d1; font-weight:700;">Personal Details</h3>
      <hr>
      <p><strong>Email:</strong> ${email}</p>
      <p><strong>Created Profile for:</strong> ${createProfileFor}</p>
      <p><strong>Gender:</strong> ${gender}</p>
      <p><strong>Date of birth:</strong> ${dateOfBirth}</p>
      <p><strong>Mother tongue:</strong> ${motherTongue}</p>
      <p><strong>Religion:</strong> ${religion}</p>
      <p><strong>Marital status:</strong> ${maritalStatus}</p>
      <p><strong>Height:</strong> ${height}</p>
      <% } %>
    </div>
  </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>