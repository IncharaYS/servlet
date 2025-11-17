<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Customer Response</title>
</head>

<body class="bg-dark text-white">


<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card bg-secondary text-white shadow-lg p-4" style="width:600px;">

        <h2 class="mb-4 text-center">Customer Details Submitted</h2>

        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
        <p><strong>Coffee Flavour:</strong> ${flavour}</p>
        <p><strong>Quantity:</strong> ${quantity}</p>
        <p><strong>Payment Mode:</strong> ${paymentMode}</p>

        <div class="mt-4 text-center">
            <a href="Customer.jsp" class="btn btn-light w-50">Submit Another Response</a>
        </div>

    </div>

</div>

</body>
</html>
