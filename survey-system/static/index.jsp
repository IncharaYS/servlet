<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body class="bg-primary-subtle
" >
<nav class="navbar navbar-expand-lg p-1"
     style="background: #0d6efd; backdrop-filter: blur(6px);">
    <div class="container-fluid">
        <a class="navbar-brand text-white fs-3">Survey App</a>

        <div class="collapse navbar-collapse" id="nav">
            <ul class="navbar-nav ms-auto fs-5">
                <li class="nav-item"><a class="nav-link text-white" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="Survey.jsp">Take Survey</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex flex-column justify-content-center align-items-center vh-80 pt-5">

    <h1 class="mb-5">Welcome to the Survey</h1>
    <h5 class="mb-3">Click the below Button to fill the form:</h5>
    <div class="d-flex flex-column gap-2 w-50 ">
        <a href="Survey.jsp" class=" btn btn-light p-3 border-2 border-primary rounded "><h5 class="text-primary">Survey Form</h5></a>
    </div>

</div>

</body>
</html>