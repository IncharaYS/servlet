<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search page</title>

    <script src="js/travel-agency.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .form-label{
            color:#000080;
        }
        .required{
        color:red;
        }

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
                <li class="nav-item"><a class="nav-link fw-bold">${userName}</a></li>
                <li class="nav-item"><a class="nav-link" href="home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
            </ul>
        </div>
    </div>
</nav>


<div class="container d-flex justify-content-center py-5">
    <div class="card shadow-lg rounded-4 p-4 w-100" style="max-width:800px;">


    <form action="search" method="get">

            <div class="mb-3">
                <label for="searchBy" class="form-label fw-bold">Search By:</label>
                <select id="searchBy" name="searchBy" class="form-select" onchange="onSearchByChange(this.value)">
                    <option >--Select--</option>
                    <option value="email">Email</option>
                    <option value="name">Name</option>
                    <option value="phoneNo">Phone Number</option>
                    <option value="country">Country</option>
                </select>
            </div>


            <div class="mb-3">
                <label id="searchLabel" for="searchByValue" class="form-label fw-bold">Enter value to search:
                    <span class="required">*</span></label>
                <input type="text" id="searchByValue" name="searchByValue" class="form-control" placeholder="Enter value">
                <small id="errorMsg" class="text-danger"></small>
            </div>



            <div class="mb-3">
                <input type="submit" class="btn btn-primary px-5 py-2 rounded-4 ms-3" name="action" value="Submit">
                <input type="submit" class="btn btn-primary px-5 py-2 rounded-4 ms-5" name="action" value="Clear">
            </div>


        </form>

            <h4 class="text-center text-danger mb-4">${failureMsg}</h4>


        <c:if test="${not empty userInfo}">
            <h4 class="text-center mb-3" style="color:#000080;">User Details:</h4>

            <div class="table-responsive">
                <table class="table table-bordered table-striped table-hover align-middle text-center">
                    <thead class="table-primary">
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Phone Number</th>
                        <th>Country</th>
                        <th>Action</th>
                    </tr>
                    </thead>

                    <tbody>
                    <c:forEach items="${userInfo}" var="user">
                        <tr>
                            <td>${user.fullName}</td>
                            <td>${user.email}</td>
                            <td>${user.phoneNo}</td>
                            <td>${user.country}</td>
                            <td>
                                <a class="btn btn-sm btn-outline-primary"
                                   href="update?email=${user.email}">
                                    Update
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </c:if>




    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>


</body>
</html>