<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>body {
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

        .welcome-card {
            background: rgba(255, 255, 255, 0.90);
            border-radius: 20px;
            padding: 40px 30px;
            box-shadow: 0px 10px 25px rgba(0, 0, 0, 0.25);
            max-width: 600px;
            backdrop-filter: blur(4px);
        }

        h1 {
            font-weight: 700;
            color: #0ea5e9;
        }

        h5 {
            color: #333;
        }

        .btn-primary {
            background-color: #0ea5e9;
            border: none;
        }

        .btn-primary:hover {
            background-color: #0284c7;
        }
    </style>
</head>

<body >

<nav class="navbar navbar-expand-lg shadow-sm">
    <div class="container-fluid">
        <a class="navbar-brand fs-3">MedTrust Medical Store</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#nav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="nav">
            <ul class="navbar-nav ms-auto fs-5">
                <li class="nav-item">
<!--                    <a class="nav-link" href="login">Login</a>-->
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="welcome-card text-center shadow-lg">
        <h1 class="mb-4">Welcome to MedTrust</h1>
        <h5 class="mb-4">Click the Below Button to Register</h5>

        <a href="register" class="btn btn-primary btn-lg px-5 py-3 rounded-3">
            Register Now
        </a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
