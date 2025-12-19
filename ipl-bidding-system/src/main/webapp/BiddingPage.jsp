<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
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

<!-- NAVBAR -->
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

<!-- SEARCH CARD -->
<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow-lg rounded-4 p-4 bg-white w-100" style="max-width: 420px;">

        <h3 class="mb-4 text-center" style="color:#000080;">
            Player Bidding Search
        </h3>

        <form action="search" method="get">

            <!-- PLAYER TYPE -->
            <div class="mb-3">
                <label class="form-label fw-bold">
                    Player Type:<span class="required">*</span>
                </label>
                <select id="playerType" name="playerType"
                        class="form-select"
                        onchange="onPlayerTypeChange()" required>
                    <option value="">-- Select --</option>
                    <option value="BATTER">Batter</option>
                    <option value="BOWLER">Bowler</option>
                    <option value="ALLROUNDER">All-Rounder</option>
                    <option value="KEEPER">Wicket Keeper</option>

                </select>
            </div>

            <!-- BATTING -->
            <div class="mb-3" id="battingDiv" style="display:none;">
                <label class="form-label fw-bold">Minimum Batting Average:</label>
                <input type="number" step="0.01"
                       name="battingAverage"
                       class="form-control"
                       placeholder="Enter batting average">
            </div>

            <!-- BOWLING -->
            <div class="mb-3" id="bowlingDiv" style="display:none;">
                <label class="form-label fw-bold">Maximum Bowling Average:</label>
                <input type="number" step="0.01"
                       name="bowlingAverage"
                       class="form-control"
                       placeholder="Enter bowling average">
            </div>

            <!-- STUMPS -->
            <div class="mb-3" id="stumpsDiv" style="display:none;">
                <label class="form-label fw-bold">Minimum No. of Stumps:</label>
                <input type="number"
                       name="noOfStumps"
                       class="form-control"
                       placeholder="Enter stumps count">
            </div>

            <!-- BUTTONS -->
            <div class="text-center mt-4" id="submit" style="display:none;">
                <button type="submit" name="action" value="Submit"
                        class="btn btn-primary px-5 py-2 rounded-3">
                    Search Players
                </button>

                <button type="submit" name="action" value="Clear"
                        class="btn btn-secondary px-5 py-2 rounded-3 ms-2">
                    Clear
                </button>
            </div>

        </form>
    </div>
</div>


<c:if test="${not empty searchList}">
    <div class="container mt-4">
        <div class="card shadow-lg rounded-4 p-3 bg-white">
            <table class="table table-bordered">
                <thead class="table-info text-center">
                <tr>
                    <th>Player Id</th>
                    <th>Player Name</th>
                    <th>Age</th>
                    <th>State</th>
                    <th>Player Type</th>

                    <c:if test="${selectedPlayerType eq 'BATTER'}">
                        <td>${player.battingAverage}</td>
                    </c:if>

                    <c:if test="${selectedPlayerType eq 'BOWLER'}">
                        <td>${player.bowlingAverage}</td>
                    </c:if>

                    <c:if test="${selectedPlayerType eq 'ALLROUNDER'}">
                        <td>${player.battingAverage}</td>
                        <td>${player.bowlingAverage}</td>
                    </c:if>

                    <c:if test="${selectedPlayerType eq 'KEEPER'}">
                        <td>${player.battingAverage}</td>
                        <td>${player.noOfStumps}</td>
                    </c:if>


                    <th>Bid</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="player" items="${searchList}">
                    <tr>
                        <td class="text-center">${player.id}</td>
                        <td>${player.playerName}</td>
                        <td>${player.age}</td>
                        <td>${player.state}</td>
                        <td>${player.playerType}</td>

                        <c:if test="${selectedPlayerType eq 'BATTER'}">
                            <th>Batting Avg</th>
                        </c:if>

                        <c:if test="${selectedPlayerType eq 'BOWLER'}">
                            <th>Bowling Avg</th>
                        </c:if>

                        <c:if test="${selectedPlayerType eq 'ALLROUNDER'}">
                            <th>Batting Avg</th>
                            <th>Bowling Avg</th>
                        </c:if>

                        <c:if test="${selectedPlayerType eq 'KEEPER'}">
                            <th>Batting Avg</th>
                            <th>No of Stumps</th>
                        </c:if>


                        <td class="text-center">
                            <a href="playerBid?playerId=${player.id}"
                               class="btn btn-primary btn-sm">
                                Bid
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</c:if>

<script src="js/bidding_search.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
