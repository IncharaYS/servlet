<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Matrimony</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  <script src="js/matrimony.js"></script>


  <style>
    body {
        background: linear-gradient(135deg, #ffe6e6, #ffffff);
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
    .card h3 {
        color: #800000;
    }
    #genderMsg {
        color: #b30000;
    }
    .btn-primary {
        background-color: #800000;
        border-color: #800000;
    }
    .btn-primary:hover {
        background-color: #b30000;
        border-color: #b30000;
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

<div class="container mt-5">
  <div class="card shadow-lg rounded-4 p-4 bg-white">
    <h3 class="mb-4 text-center">Matrimony Registration</h3>

    <form action="matrimony" method="post" onsubmit="return validateForm()">


    <div class="mb-3">
        <label for="email" class="form-label fw-bold">Email:</label>
        <input type="text" id="email" name="email" class="form-control" placeholder="Enter your email" required
               oninput="validateEmail(this)">
        <small id="emailMsg" style="color:red"></small>
      </div>

      <div class="mb-3">
        <label for="for" class="form-label fw-bold">Create Profile For:</label>
        <select id="for" class="form-select" name="for" required>
          <option value="">--Select--</option>
          <option value="Myself">Myself</option>
          <option value="Son">Son</option>
          <option value="Daughter">Daughter</option>
          <option value="Sister">Sister</option>
          <option value="Brother">Brother</option>
        </select>
      </div>

      <div class="mb-3">
        <label class="form-label fw-bold">Gender:</label>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gender" value="male" id="male" onclick="onGenderSelect()" required>
          <label class="form-check-label" for="male">Male</label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gender" value="female" id="female" onclick="onGenderSelect()">
          <label class="form-check-label" for="female">Female</label>
        </div>
        <div id="genderMsg" class="fw-medium mt-2" style="display:none;"></div>
      </div>





      <div id="otherFields" style="display:none;">

        <div class="mb-3">
          <label for="dob" class="form-label fw-bold">Date of Birth:</label>
          <input type="date" id="dob" name="dob" class="form-control" required>
        </div>

        <div class="mb-3">
          <label for="motherTongue" class="form-label fw-bold">Mother Tongue:</label>
          <select id="motherTongue" name="motherTongue" class="form-select" required>
            <option value="">--Select--</option>
            <option value="Kannada">Kannada</option>
            <option value="Telugu">Telugu</option>
            <option value="Tamil">Tamil</option>
            <option value="Hindi">Hindi</option>
            <option value="Malayalam">Malayalam</option>
            <option value="English">English</option>
          </select>
        </div>

        <div class="mb-3">
          <label for="religion" class="form-label fw-bold">Religion:</label>
          <select id="religion" name="religion" class="form-select" required>
            <option value="">--Select--</option>
            <option value="Hindu">Hindu</option>
            <option value="Christian">Christian</option>
            <option value="Muslim">Muslim</option>
            <option value="Sikh">Sikh</option>
            <option value="Jain">Jain</option>
            <option value="Buddhist">Buddhist</option>
            <option value="Others">Others</option>
          </select>
        </div>

        <div class="mb-3">
          <label for="maritalStatus" class="form-label fw-bold">Marital Status:</label>
          <select id="maritalStatus" name="maritalStatus" class="form-select" required>
            <option value="">--Select--</option>
            <option value="Never Married">Never Married</option>
            <option value="Divorced">Divorced</option>
            <option value="Widowed">Widowed</option>
            <option value="Separated">Separated</option>
          </select>
        </div>

        <div class="mb-3">
          <label for="height" class="form-label fw-bold">Height (in feet):</label>
          <input type="number" id="height" name="height" class="form-control" placeholder="Enter your Height"
                 min="1" max="7" step="0.1" required oninput="validateHeight(this)">
          <small id="heightMsg" style="color:red"></small>
        </div>

        <div class="text-center mt-4">
          <button type="submit" class="btn btn-primary px-5">Submit</button>
        </div>

      </div>

    </form>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>
