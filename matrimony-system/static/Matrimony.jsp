<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Matrimony</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  <script src="js/matrimony.js"></script>
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


<form  action="matrimony" method="post">

  <div>
    <div class="col-md-6">
      <label for="email" class="form-label">Email:</label>
      <input type="text" id="email" name="email" class="form-control" placeholder="Enter your email" required oninput="validateEmail(this)">
      <small id="emailMsg" style="color:red"></small>
    </div>

    <div class="col-md-6 mt-3">
      <label for="for" class="form-label">Create Profile For:</label>
      <select id="for" class="form-select" name="for" required>
        <option value="">--Select--</option>
        <option value="Myself">Myself</option>
        <option value="Son">Son</option>
        <option value="Daughter">Daughter</option>
        <option value="Sister">Sister</option>
        <option value="Brother">Brother</option>
      </select>
    </div>



    <div class="col-md-6 mt-3">
      <label class="form-label">Gender:</label>

      <div class="form-check">
        <input class="form-check-input" type="radio" name="gender" value="male" id="male" onclick="onGenderSelect()" required>
        <label class="form-check-label" for="male">Male</label>
      </div>

      <div class="form-check">
        <input class="form-check-input" type="radio" name="gender" value="female" id="female" onclick="onGenderSelect()">
        <label class="form-check-label" for="female">Female</label>
      </div>

      <div id="genderMsg" class="text-danger mt-2" style="display:none;"></div>
    </div>





    <div id="otherFields" style="display:none;">


      <div class="col-md-6 mt-3">
        <label for="dob" class="form-label">Date of Birth:</label>
        <input type="date" id="dob" name="dob" class="form-control" required>
      </div>

      <div class="col-md-6 mt-3">
        <label for="motherTongue" class="form-label">Mother Tongue:</label>
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

      <div class="col-md-6 mt-3">
        <label for="religion" class="form-label">Religion:</label>
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

      <div class="col-md-6 mt-3">
        <label for="maritalStatus" class="form-label">Marital Status:</label>
        <select id="maritalStatus" name="maritalStatus" class="form-select" required>
          <option value="">--Select--</option>
          <option value="Never Married">Never Married</option>
          <option value="Divorced">Divorced</option>
          <option value="Widowed">Widowed</option>
          <option value="Separated">Separated</option>
        </select>
      </div>

      <div class="col-md-6 mt-3">
      <label for="height" class="form-label">Height (in feet):</label>
      <input type="number" id="height" name="height" class="form-control" placeholder="Enter your Height" min="1" max="7" step="0.1"
             required oninput="validateHeight(this)">
      <small id="heightMsg" style="color:red"></small>
    </div>


      <div class="col-md-6 mt-4">
        <button type="submit" class="btn btn-primary">Submit</button>
      </div>

    </div>



  </div>
</form>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>