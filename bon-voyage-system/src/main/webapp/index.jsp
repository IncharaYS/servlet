<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index page</title>
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
    </style>
</head>
<body style="background-color: #f2f6ff;">

<nav class="navbar navbar-expand-lg p-1"
     style="background: #0ea5e9; backdrop-filter: blur(6px); font-family: 'Poppins', sans-serif;">
    <div class="container-fluid">
        <a class="navbar-brand fs-3">Bon Voyage Travel Agency</a>

        <div class="collapse navbar-collapse" id="nav">
            <ul class="navbar-nav ms-auto fs-5">
                <li class="nav-item"><a class="nav-link" href="login">Login</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center vh-100 ">
    <div class="card shadow-lg rounded-4 p-4 text-center w-75 " style="max-width: 450px; background-color:#fff0ff;">
        <h1 class="mb-4">Welcome Bon Voyage Travel Agency</h1>
        <h5 class="mb-4">Click the button below to register</h5>
        <a href="travelagency" class="btn btn-primary btn-lg px-5 py-3 rounded-3">
            Register Now
        </a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>
</html>