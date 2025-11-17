<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>Coffee Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>



<body class="bg-dark text-white">
<nav class="navbar navbar-expand-lg p-2"
     style="background: rgba(255,255,255,0.2); backdrop-filter: blur(6px);">
    <div class="container-fluid">
        <a class="navbar-brand text-white fs-3">Coffee Portal</a>

        <div class="collapse navbar-collapse" id="nav">
            <ul class="navbar-nav ms-auto fs-5">
                <li class="nav-item"><a class="nav-link text-white" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="Coffee.jsp">Coffee</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="CoffeeLand.jsp">Coffee Land</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="Cafeteria.jsp">Cafeteria</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="Customer.jsp">Customer</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="CustomerFeedback.jsp">Feedback</a></li>
            </ul>
        </div>
    </div>
</nav>


<div class="container d-flex flex-column justify-content-center align-items-center vh-100">

    <h1 class="mb-5">Welcome to Coffee Management System</h1>
    <h5 class="mb-3">Choose Form To Fill:</h5>

    <div class="d-flex flex-column gap-3 w-50">

        <a href="Coffee.jsp" class="btn btn-light p-3">Coffee Form</a>
        <a href="CoffeeLand.jsp" class="btn btn-light p-3">Coffee Land Form</a>
        <a href="Cafeteria.jsp" class="btn btn-light p-3">Cafeteria Form</a>
        <a href="Customer.jsp" class="btn btn-light p-3">Customer Form</a>
        <a href="CustomerFeedback.jsp" class="btn btn-light p-3">Customer Feedback Form</a>

    </div>

</div>

</body>
</html>
