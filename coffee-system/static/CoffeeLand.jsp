<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width,initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
  <title>Coffee Land</title>
</head>


<body class="bg-dark text-white">

<nav class="navbar navbar-expand-lg p-2" style="background: rgba(255, 255, 255, 0.2); backdrop-filter: blur(6px);">
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
<h1>Enter Coffee Land Details</h1> <br>

<form action="coffeeLand" method="post">
  <div class="mb-3">
    <label class="form-label">Size by Acre:</label>
    <input type="number" class="form-control" name="size" required>
  </div>

  <div class="mb-3">
    <label class="form-label">Total Plants:</label>
    <input type="number" class="form-control" name="totalPlants" required>
  </div>

    <div class="mb-3">
      <label class="form-label">Total Yield:</label>
      <input type="number" class="form-control" name="yield" required>
    </div>


  <div class="mb-3">
    <label class="form-label">Expenditure:</label>
    <input type="text" class="form-control" name="expenditure" required>
  </div>

  <div class="mb-3">
    <label class="form-label">Profit Made:</label>
    <input type="text" class="form-control" name="profit" required>
  </div>

  <div class="mb-3">
    <label class="form-label">Fertilizer Quantity Used:</label>
    <input type="text" class="form-control" name="fertilizer" required>
  </div> <br>

  <button type="submit" class="btn btn-secondary w-25">Submit</button>

</form>
</div>

</body>
</html>
