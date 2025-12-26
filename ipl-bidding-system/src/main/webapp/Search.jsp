<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Player Bidding Search</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .form-label { color:#000080; }
        .required { color:red; }

        body {
            min-height: 100vh;
            background-image: url('images/bg.png');
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
            background-attachment: fixed;
            backdrop-filter: blur(3px);
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
                    <a class="nav-link" href="logout">Logout</a>
                </li>
            </ul>
        </div>
    </div>
</nav>




<div class="container-fluid mt-5 d-flex justify-content-center">

    <div class="card shadow-lg rounded-4 p-4 bg-white w-75">

        <h3 class="mb-4 text-center" style="color:#000080;">
            Player Information
        </h3>

        <form action="search" method="get">

            <div class="mb-3">
                <label class="form-label fw-bold">
                    Player Type:<span class="required">*</span>
                </label>
                <select id="playerType" name="playerType" class="form-select" value="${player}" onchange="onPlayerTypeChange()" required>
                    <option value="">-- Select --</option>
                    <option value="BATTER">Batter</option>
                    <option value="BOWLER">Bowler</option>
                    <option value="ALLROUNDER">All-Rounder</option>
                    <option value="KEEPER">Wicket Keeper</option>

                </select>
            </div>

            <div class="mb-3" id="battingDiv" style="display:none;">
                <label class="form-label fw-bold">Minimum Batting Average:</label>
                <input type="number" step="0.01" name="battingAverage" class="form-control" placeholder="Enter batting average">
            </div>

            <div class="mb-3" id="bowlingDiv" style="display:none;">
                <label class="form-label fw-bold">Minimum Bowling Average:</label>
                <input type="number" step="0.01" name="bowlingAverage" class="form-control" placeholder="Enter bowling average">
            </div>

            <div class="mb-3" id="stumpsDiv" style="display:none;">
                <label class="form-label fw-bold">Minimum No. of Stumps:</label>
                <input type="number" name="noOfStumps" class="form-control" placeholder="Enter stumps count">
            </div>

            <div class="text-center mt-4" id="submit" style="display:block;">
                <input type="submit" name="action" value="Search" class="btn btn-primary px-5 py-2 rounded-3"/>

                <input type="submit" name="action" value="Clear" formnovalidate
                       class="btn btn-secondary px-5 py-2 rounded-3 ms-2"/>

            </div>

        </form>



        <c:if test="${not empty searchList}">

            <div class="container mt-4">
                <div class="card shadow-lg rounded-4 p-3 bg-white">

                    <h3>Player details:</h3>

                    <table class="table table-bordered">
                        <thead class="table-info text-center">
                        <tr>
                            <th>Player Name</th>
                            <th>Age</th>
                            <th>State</th>
                            <th>Player Type</th>

                            <c:if test="${selectedPlayerType eq 'BATTER'}">
                                <th>Batting Average</th>
                            </c:if>

                            <c:if test="${selectedPlayerType eq 'BOWLER'}">
                                <td>Bowling Average</td>
                            </c:if>

                            <c:if test="${selectedPlayerType eq 'ALLROUNDER'}">
                                <th>Batting Average</th>
                                <th>Bowling Average</th>
                            </c:if>

                            <c:if test="${selectedPlayerType eq 'KEEPER'}">
                                <th>Batting Average</th>
                                <th>No. of Stumps</th>
                            </c:if>

                            <th>Bid</th>
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach var="player" items="${searchList}">
                            <tr>
                                <td>${player.playerName}</td>
                                <td>${player.age}</td>
                                <td>${player.state}</td>
                                <td>${player.playerType}</td>

                                <c:if test="${selectedPlayerType eq 'BATTER'}">
                                    <th>${player.battingAverage}</th>
                                </c:if>

                                <c:if test="${selectedPlayerType eq 'BOWLER'}">
                                    <th>${player.bowlingAverage}</th>
                                </c:if>

                                <c:if test="${selectedPlayerType eq 'ALLROUNDER'}">
                                    <th>${player.battingAverage}</th>
                                    <th>${player.bowlingAverage}</th>
                                </c:if>

                                <c:if test="${selectedPlayerType eq 'KEEPER'}">
                                    <th>${player.battingAverage}</th>
                                    <th>${player.noOfStumps}</th>
                                </c:if>


                                <td class="text-center">
                                    <a href="bid?playerName=${player.playerName}" class="btn btn-primary btn-sm">Bid</a>
                                </td>
                            </tr>

                        </c:forEach>

                        </tbody>
                    </table>


                </div>
            </div>
        </c:if>

        <c:if test="${not empty limitReached}">
            <script>
                alert("Bid limit reached for this player.");
            </script>
        </c:if>

        <c:if test="${not empty successMsg}">
            <script>
                alert("Bid for player ${player.playerName} successfull");
            </script>
        </c:if>


    </div>
</div>




<script src="js/bidding_search.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
