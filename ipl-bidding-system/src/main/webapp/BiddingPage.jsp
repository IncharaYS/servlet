<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Player Bidding</title>

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
                    <a class="nav-link">${companyName}</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="companyHome">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="search">Search Player</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="logout">Logout</a>
                </li>

            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow-lg rounded-4 p-4 bg-white w-100"
         style="max-width: 460px;">

        <h3 class="mb-4 text-center" style="color:#000080;">
            Player Bidding
        </h3>

        <form action="bid" method="get" onsubmit="return validateBiddingForm()">

            <div class="mb-3">
                <label class="form-label fw-bold">
                    Player Name:
                </label>

                <input type="text" name="playerName" disabled class="form-control" id="playerName" value="${player.playerName}"
                        required>
                <input type="text" name="playerName"  class="form-control" hidden value="${player.playerName}">
            </div>




            <div class="mb-3">
                <label class="form-label fw-bold">
                    Age:
                </label>
                <input type="number" name="age" id="age" class="form-control" value="${player.age}" disabled required>
            </div>

            <div class="mb-3">
                <label class="form-label fw-bold">
                    State:
                </label>
                <input type="text" name="state" class="form-control" id="state" value="${player.state}" disabled required>
            </div>

            <div class="mb-3">
                <label class="form-label fw-bold">
                    Player Type:
                </label>
                <input type="text" name="playerType" class="form-control" id="playerType" value="${player.playerType}" disabled required>

            </div>




            <div class="mb-3" id="battingDiv" style="display:none;">
                <label class="form-label fw-bold">
                    Batting Average:
                </label>
                <input type="number"  id="battingAverage" name="battingAverage" class="form-control" value="${player.battingAverage}" disabled>
            </div>

            <div class="mb-3" id="bowlingDiv" style="display:none;">
                <label class="form-label fw-bold">
                    Bowling Average:
                </label>
                <input type="number" id="bowlingAverage" name="bowlingAverage" class="form-control" value="${player.bowlingAverage}" disabled>
            </div>

            <div class="mb-3" id="stumpsDiv" style="display:none;">
                <label class="form-label fw-bold">
                    No. of Stumps:
                </label>
                <input type="number" id="noOfStumps" name="noOfStumps" class="form-control" value="${player.noOfStumps}" disabled>
            </div>

            <div class="mb-3" id="companyDiv" style="display:block;">
                <label class="form-label fw-bold">
                    Company:
                </label>
                <input type="text" id="company" name="company" class="form-control" value="${companyName}" disabled>
                <input type="text"  name="company" class="form-control" value="${companyName}" hidden>

            </div>

            <div class="mb-3" id="bidAmountDiv" style="display:block;">
                <label class="form-label fw-bold">
                    Bid Amount:<span class="required">*</span>
                </label>
                <input type="text" id="bidAmount" name="bidAmount" class="form-control" required placeholder="Enter the amount you want to bid">
            </div>

            <div class="text-center mt-4" id="submit" style="display:none;">
                <input type="submit" name="action" class="btn btn-primary px-5" value="Bid">

            </div>
            <br>



        </form>


    </div>
</div>


<script src="js/bidding_search.js"></script>
<script>
    window.onload = function () {
    onPlayerTypeChange();
};
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
