<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index Page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <style>
        body {
            background: linear-gradient(135deg, #ffe6e6, #ffffff);
        }
         .navbar {
         background: rgba(128, 0, 0, 0.85);
         backdrop-filter: blur(6px);
         }
        .navbar .nav-link {
            color: white !important;
        }
        .navbar-brand {
            color: white !important;
        }
        .card h1 {
            color: #800000;
        }
        .card h5 {
            color: #b30000;
        }
        .btn-danger {
            background-color: #800000;
            border-color: #800000;
        }
        .btn-danger:hover {
            background-color: #b30000;
            border-color: #b30000;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg p-1">
    <div class="container-fluid">
        <a class="navbar-brand fs-3">Matrimony app</a>

        <div class="collapse navbar-collapse" id="nav">
            <ul class="navbar-nav ms-auto fs-5">
                <li class="nav-item"><a class="nav-link" href="index">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="matrimony">Matrimony</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card shadow-lg rounded-4 p-4 text-center w-75" style="max-width: 600px; background-color:#fff0f0;">
        <h1 class="mb-4">Welcome to Matrimony App</h1>
        <h5 class="mb-4">Click the button below to register</h5>
        <a href="matrimony" class="btn btn-danger btn-lg px-5 py-3 rounded-3">
            Register Now
        </a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>
</html>
