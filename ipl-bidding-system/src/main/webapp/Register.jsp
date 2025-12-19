<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Player Registration</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .form-label {
            color: #000080;
        }
        .required {
            color: red;
        }

        body {
            background-image: url('images/bg.png');
            background-color: #f2f6ff;
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
            backdrop-filter: blur(5px);
            font-family: 'Poppins', sans-serif;
        }

        .navbar {
            background: #0b3c5d;
        }

        .nav-link {
            color: #ffffff !important;
            margin-left: 15px;
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

<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow-lg rounded-4 p-4 bg-white w-100"
         style="max-width: 420px;">

        <h3 class="mb-4 text-center" style="color:#000080;">
            Player Registration
        </h3>

        <form action="register" method="post" onsubmit="return validateForm()">

        <div class="mb-3">
                <label class="form-label fw-bold">
                    Player Name:<span class="required">*</span>
                </label>

            <h4 class="text-center text-danger mb-3">${exists}</h4>

                <input type="text" name="playerName" class="form-control" id="playerName"
                       placeholder="Enter player name" required>
            </div>


            <div class="mb-3">
                <label class="form-label fw-bold">
                    Password:<span class="required">*</span>
                </label>
                <input type="password" id="password" name="password"
                       class="form-control"
                       placeholder="Enter password" oninput="validatePassword(this)">
                <small id="passwordMsg"  class="text-danger"></small>
            </div>



            <div class="mb-3">
                <label class="form-label fw-bold">
                    Age:<span class="required">*</span>
                </label>
                <input type="number" name="age" class="form-control"
                       min="10" max="60" id="age" placeholder="Enter age" required>
            </div>

            <div class="mb-3">
                <label class="form-label fw-bold">
                    State:<span class="required">*</span>
                </label>
                <input type="text" name="state" class="form-control"
                       placeholder="Enter state" id="state" required>
            </div>

            <div class="mb-3">
                <label class="form-label fw-bold">
                    Player Type:<span class="required">*</span>
                </label>
                <select id="playerType" name="playerType"
                        class="form-select"
                        onchange="onPlayerTypeChange()" required>
                    <option value="">-- Select --</option>
                    <option value="Batter">Batter</option>
                    <option value="Bowler">Bowler</option>
                    <option value="AllRounder">All-Rounder</option>
                    <option value="Keeper">Wicket Keeper</option>
                </select>
            </div>

            <div class="mb-3" id="battingDiv" style="display:none;">
                <label class="form-label fw-bold">
                    Batting Average:<span class="required">*</span>
                </label>
                <input type="number" step="0.01"
                       id="battingAverage"
                       name="battingAverage"
                       class="form-control"
                       placeholder="Enter batting average">
            </div>

            <div class="mb-3" id="bowlingDiv" style="display:none;">
                <label class="form-label fw-bold">
                    Bowling Average:<span class="required">*</span>
                </label>
                <input type="number" step="0.01"
                       id="bowlingAverage"
                       name="bowlingAverage"
                       class="form-control"
                       placeholder="Enter bowling average">
            </div>

            <div class="mb-3" id="stumpsDiv" style="display:none;">
                <label class="form-label fw-bold">
                    No. of Stumps:<span class="required">*</span>
                </label>
                <input type="number"
                       id="noOfStumps"
                       name="noOfStumps"
                       class="form-control"
                       placeholder="Enter no. of stumps">
            </div>

            <div class="text-center mt-4" id="submit" style="display:none;">
                <input type="submit"  class="btn btn-primary px-5" value="Submit">

                </input>
            </div>

        </form>
    </div>
</div>

<script src="js/ipl_bidding.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
