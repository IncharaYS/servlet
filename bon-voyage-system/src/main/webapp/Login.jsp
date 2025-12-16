<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en" xmlns="http://www.w3.org/1999/html" xmlns:c="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Login page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/travel-agency.js"></script>
    <style>
        .form-label{
            color:#000080;
        }
        .required{
        color:red;
        }
<!--    body {-->
<!--      background-image: url('images/bg.png');-->
<!--      background-color: #f2f6ff;-->
<!--      background-repeat: no-repeat;-->
<!--      background-size: cover;-->
<!--      background-position: center;-->
<!--      backdrop-filter: blur(3px);-->
<!--      font-family: 'Poppins', sans-serif;-->
<!--}-->

    </style>
</head>
<body style="background-color: #f2f6ff;">

<nav class="navbar navbar-expand-lg p-1"
     style="background: #0ea5e9; backdrop-filter: blur(6px); font-family: 'Poppins', sans-serif;">
    <div class="container-fluid">
        <a class="navbar-brand fs-3">Bon Voyage Travel Agency</a>
        <div class="collapse navbar-collapse" id="nav">
            <ul class="navbar-nav ms-auto fs-5">
                <li class="nav-item"><a class="nav-link" href="travelagency">Register</a></li>

            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex  justify-content-center align-items-center vh-100">
    <div class="card shadow-lg rounded-4 p-4  w-75 " style="max-width: 600px; background-color:#f2f6ff;">

        <form action="login" method="post" onsubmit="return validateLoginForm()">
            <h5 class="mb-4 text-center">Login:</h5>
            <div class="mb-3">
                <label for="email" class="form-label fw-bold">Email:<span class="required">*</span><small id="dupEmailMsg" class="text-danger"> ${dupEmail}</small>
                </label>
                <input type="text" id="email" name="email" class="form-control" placeholder="Enter your email" value="${userInfo.email}"
                       oninput="validateEmail(this)" >
                <small id="emailMsg" class="text-danger"></small>
            </div>

            <div class="mb-3">
                <label for="password" class="form-label fw-bold">Password:<span class="required">*</span></label>
                <input type="password" id="password" name="password" class="form-control" placeholder="Enter your password" value="${userInfo.password}"
                       oninput="validatePassword(this)">
                <small id="passwordMsg" class="text-danger"></small>
            </div>

            <c:if test="${failureMsg!=null}">
                <small id="invalidEmailMsg" class="text-danger">${failureMsg}  <a href="travelagency">Register</a></small>
            </c:if>

            <small id="invalidPwdMsg" class="text-danger">${wrongPwd}</small>



            <div class="text-center">
                <button type="submit" class="btn btn-primary btn-lg px-4 py-2 rounded-3 " value="login" name="SuccessfullLogin">
                    Login
                </button>
            </div>

        </form>

    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>
</html>