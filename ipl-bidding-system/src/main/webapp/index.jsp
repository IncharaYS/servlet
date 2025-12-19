<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>IPL Bidding index</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-image: url('images/bg.png');
            background-color: #f2f6ff;
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
            backdrop-filter: blur(5px);
            font-family: 'Poppins', sans-serif;
        }

        /* Darker navbar */
        .navbar {
            background: #0b3c5d; /* dark blue */
        }

        .nav-link {
            color: #ffffff !important;
            margin-left: 15px;
        }

        .nav-link:hover {
            text-decoration: underline;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-expand-lg p-2">
    <div class="container-fluid">
        <a class="navbar-brand fs-3 text-white">IPL Bidding System</a>

        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto fs-5 d-flex flex-row">
                <li class="nav-item">
                    <a class="nav-link" href="login">Player Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="companylogin">Company Login</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card shadow-lg rounded-4 p-4 text-center w-75"
         style="max-width: 500px; background-color:#fff0ff;">

        <h1 class="mb-4">Welcome to IPL Bidding</h1>
        <h5 class="mb-4">Please choose your registration type</h5>

        <div class="d-grid gap-3">
            <a href="register" class="btn btn-primary btn-lg py-3 rounded-3">
                Register as Player
            </a>

            <a href="companylogin" class="btn btn-success btn-lg py-3 rounded-3">
                Login as Company
            </a>
        </div>

    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
