<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width,initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  <title>Coffee</title>
</head>
<body>
<h1>Enter Your Coffee Details</h1> <br> <br>

<form action="coffee" method="post">

  <div class="mb-3">
    <label class="form-label" for="coffeeType">Coffee Type:</label>
    <input type="text" id="coffeeType" class="form-control" name="coffeeType" required>
  </div>

  <div class="mb-3">
    <label class="form-label" for="price">Price:</label>
    <input type="text" id="price" class="form-control" name="price" required>
  </div>

  <div class="mb-3">
    <label class="form-label" for="quantity">Quantity:</label>
    <input type="number" id="quantity" class="form-control" name="quantity" required>
  </div>

  <div class="mb-3">
    <label class="form-label" for="farmer">Farmer:</label>
    <input type="text" id="farmer" class="form-control" name="farmer">
  </div>

  <div class="mb-3">
    <label class="form-label" for="location">Location:</label>
    <input type="text" id="location" class="form-control" name="location">
  </div>

  <button type="submit" class="btn btn-secondary">Submit</button>

</form>

</body>
</html>