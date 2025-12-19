<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Player Login</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/ipl_bidding.js"></script>

    <style>
        .form-label { color:#000080; }
        .required { color:red; }

        body {
            background-image: url('images/bg.png');
            background-color: #f2f6ff;
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
            backdrop-filter: blur(3px);
            font-family: 'Poppins', sans-serif;
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

<nav class="navbar navbar-expand-lg p-1"
     style="background:#0b3c5d;">
    <div class="container-fluid">
        <a class="navbar-brand fs-3 text-white">IPL Bidding System</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto fs-5 d-flex flex-row">
                <li class="nav-item">
                    <a class="nav-link" href="index">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="register">Register</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card shadow-lg rounded-4 p-3 bg-white w-100" style="max-width: 420px;">

        <form action="login" method="post" onsubmit="return validatePlayerLogin()">

            <h5 class="mb-4 text-center">Player Login</h5>

            <div class="mb-3">
                <label class="form-label fw-bold">
                    Player Name:<span class="required">*</span>
                </label>
                <input type="text" id="playerName" name="playerName"
                       class="form-control" placeholder="Enter player name">
            </div>

            <div class="mb-3">
                <label class="form-label fw-bold">
                    Password:<span class="required">*</span>
                </label>
                <input type="password" id="password" name="password"
                       class="form-control" placeholder="Enter password">
            </div>

            <c:if test="${loginError!=null}">
                <small class="text-danger">${loginError}</small>
            </c:if>

            <div class="text-center mt-3">
                <button type="submit"
                        class="btn btn-primary btn-lg px-4 py-2 rounded-3">
                    Login
                </button>
            </div>

        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
