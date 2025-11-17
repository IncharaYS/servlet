<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Coffee Land Response</title>
</head>

<body class="bg-dark text-white">

<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card bg-secondary text-white shadow-lg p-4" style="width:600px;">

        <h2 class="mb-4 text-center">Coffee Land Details Submitted</h2>

        <p><strong>Size by Acre:</strong> ${size}</p>
        <p><strong>Total Plants:</strong> ${totalPlants}</p>
        <p><strong>Total Yield:</strong> ${yield}</p>
        <p><strong>Expenditure:</strong> ${expenditure}</p>
        <p><strong>Profit Made:</strong> ${profit}</p>
        <p><strong>Fertilizer Quantity Used:</strong> ${fertilizer}</p>

        <div class="mt-4 text-center">
            <a href="CoffeeLand.jsp" class="btn btn-light w-50">Submit Another Response</a>
        </div>

    </div>

</div>

</body>
</html>
