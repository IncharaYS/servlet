<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width,initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  <title>Customer Feedback</title>
</head>

<body class="bg-dark text-white">


<nav class="navbar navbar-expand-lg p-2" style="background: rgba(255,255,255,0.2); backdrop-filter: blur(6px);">
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


<div class="p-4 px-5">
<h1>Enter Feedback</h1> <br>

<form action="feedback" method="post">

  <div class="mb-3">
    <label class="form-label" for="name">Customer Name:</label>
    <input type="text" id="name" class="form-control" name="name" required>
  </div>

  <div class="mb-3">
    <label class="form-label" for="email">Email:</label>
    <input type="email" id="email" class="form-control" name="email" required>
  </div>

  <div class="mb-3">
    <label class="form-label" for="comments">Comments:</label>
    <textarea id="comments" class="form-control" name="comments" required></textarea>
  </div>

  <div class="mb-3">
    <label class="form-label" for="rating">Rating:</label>
    <input type="number" id="rating" class="form-control" name="rating" required>
  </div> <br>

  <button type="submit" class="btn btn-secondary w-25">Submit</button>

</form>
</div>

</body>
</html>
