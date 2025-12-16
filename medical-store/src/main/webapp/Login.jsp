<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Login page</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="js/travel-agency.js"></script>
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

        .nav-link {
            color: #fff !important;
        }

        .nav-link:hover {
            color: #e3f2fd !important;
        }

        .login-card {
            background: rgba(255, 255, 255, 0.95);
            border-radius: 20px;
            padding: 40px 30px;
            box-shadow: 0px 10px 25px rgba(0, 0, 0, 0.25);
            max-width:1000px;
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
    <a class="navbar-brand fs-3 d-flex align-items-center">
      MedTrust Medical Store
    </a>
    <div class="collapse navbar-collapse" id="nav">
      <ul class="navbar-nav ms-auto fs-5"></ul>
    </div>
  </div>
</nav>


<div class="container d-flex justify-content-center align-items-center vh-100">
  <div class="login-card text-center shadow-lg">
    <form action="login" method="post" onsubmit="return validateLoginForm()">
      <h5 class="mb-4">Login:</h5>

      <div class="mb-3 text-start">
        <label for="email" class="form-label fw-bold">
          Email:<span class="required">*</span>
          <small id="dupEmailMsg" class="text-danger"> ${dupEmail}</small>
        </label>
        <input type="text" id="email" name="email" class="form-control" placeholder="Enter your email"
               value="${userInfo.email}" oninput="validateEmail(this)">
        <small id="emailMsg" class="text-danger"></small>
      </div>

      <div class="mb-3 text-start">
        <label for="password" class="form-label fw-bold">Password:<span class="required">*</span></label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Enter your password"
               value="${userInfo.password}" oninput="validatePassword(this)">
        <small id="passwordMsg" class="text-danger"></small>
      </div>

      <c:if test="${failureMsg!=null}">
        <small id="invalidEmailMsg" class="text-danger">
          ${failureMsg} <a href="register">Register</a>
        </small>
      </c:if>

      <small id="invalidPwdMsg" class="text-danger">${wrongPwd}</small>

      <div class="text-center mt-3">
        <button type="submit" class="btn btn-primary btn-lg px-5 py-2 rounded-3" name="SuccessfullLogin" value="login">
          Login
        </button>
      </div>
    </form>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
