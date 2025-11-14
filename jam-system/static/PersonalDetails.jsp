<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Personal details</title>
</head>
<body>
<h1>Fill in personal details</h1>
<form action="personalDetails" method="post">
  <label for="name">Name:
    <input type="text" id="name" name="name"/>
  </label> <br>
  <label for="phoneNo">Phone number:
    <input type="number" id="phoneNo" name="phoneNo"/>
  </label> <br>
  <label for="email">Email:
    <input type="email" id="email" name="email"/>
  </label> <br>
  <label for="gender">Gender:
    <input type="radio" id="gender" name="gender" value="Male"/>Male
    <input type="radio" id="gender1" name="gender" value="Female"/>Female
  </label> <br>
  <input type="submit" value="Submit">
</form>
</body>
</html>