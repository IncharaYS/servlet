<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Player Response</title>

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
     style="background:#0b3c5d; backdrop-filter:blur(6px); font-family:'Poppins', sans-serif;">
    <div class="container-fluid">
        <a class="navbar-brand fs-3 text-white">IPL Bidding System</a>

        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto fs-5">
                <li class="nav-item">
                    <a class="nav-link fw-bold text-white">${playerName}</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" href="index">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" href="logout">Logout</a>
                </li>
            </ul>
        </div>
    </div>
</nav>



<div class="container py-5 d-flex justify-content-center">
    <div class="card shadow-lg rounded-4 p-3 w-100" style="max-width:420px;">

        <h4 class="text-center text-success mb-3">${successMsg}</h4>
        <h4 class="text-center text-danger mb-3">${failureMsg}</h4>


        <c:if test="${playerInfo != null}">
            <h3 class="mb-3 ps-3" style="font-weight:700;">Player Details:</h3>
            <hr>

            <div class="ps-3">
                <p><strong>Player Name:</strong> ${playerInfo.playerName}</p>
                <p><strong>Age:</strong> ${playerInfo.age}</p>
                <p><strong>State:</strong> ${playerInfo.state}</p>
                <p><strong>Player Type:</strong> ${playerInfo.playerType}</p>

                <c:if test="${playerInfo.battingAverage != null}">
                    <p><strong>Batting Average:</strong> ${playerInfo.battingAverage}</p>
                </c:if>

                <c:if test="${playerInfo.bowlingAverage != null}">
                    <p><strong>Bowling Average:</strong> ${playerInfo.bowlingAverage}</p>
                </c:if>

                <c:if test="${playerInfo.noOfStumps != null}">
                    <p><strong>No. of Stumps:</strong> ${playerInfo.noOfStumps}</p>
                </c:if>
            </div>
        </c:if>

    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
</body>
</html>
