<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Survey page</title>
  <style>
    .form-label {
          color: #2b68d1;
          font-weight: 600;
        }
  </style>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>


<body class="bg-primary-subtle">
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

<div class="p-4 px-5">
<!--  <h2>Enter Your Survey Details</h2><br>-->

    <form action="survey" method="post" class="row g-4">

      <h3 class="mt-4">Personal Details</h3>
      <hr>

      <div class="col-md-6">
        <label for="name" class="form-label">Name:</label>
        <input type="text" id="name" name="name" class="form-control" placeholder="Enter your name">
      </div>

      <div class="col-md-6">
        <label for="occupation" class="form-label">Occupation:</label>
        <input type="text" id="occupation" name="occupation" class="form-control" placeholder="Enter your occupation">
      </div>

      <div class="col-md-6">
        <label for="education" class="form-label">Education:</label>
        <input type="text" id="education" name="education" class="form-control" placeholder="Enter your education">
      </div>

      <div class="col-md-6">
        <label for="age" class="form-label">Age:</label>
        <input type="number" id="age" name="age" class="form-control" placeholder="Enter your age">
      </div>

      <div class="col-md-6">
        <label for="dateOfBirth" class="form-label">Date of Birth:</label>
        <input type="date" id="dateOfBirth" name="dateOfBirth" class="form-control" placeholder="Enter your date of birth">
      </div>

      <div class="col-md-6">
        <label for="height" class="form-label">Height(cm):</label>
        <input type="text" id="height" name="height" class="form-control" placeholder="Enter your height">
      </div>

      <div class="col-md-6">
        <label for="weight" class="form-label">Weight(kg):</label>
        <input type="text" id="weight" name="weight" class="form-control" placeholder="Enter your weight">
      </div>

      <div class="col-md-6">
        <label for="complexion" class="form-label">Complexion:</label>
        <input type="text" id="complexion" name="complexion" class="form-control" placeholder="Enter your complexion">
      </div>

      <div class="col-md-6">
        <label for="motherTongue" class="form-label">Mother Tongue:</label>
        <input type="text" id="motherTongue" name="motherTongue" class="form-control" placeholder="Enter your mother tongue">
      </div>

      <div class="col-md-6">
        <label for="religion" class="form-label">Religion:</label>
        <input type="text" id="religion" name="religion" class="form-control" placeholder="Enter your religion">
      </div>

      <div class="col-md-6">
        <label for="caste" class="form-label">Caste:</label>
        <input type="text" id="caste" name="caste" class="form-control" placeholder="Enter your caste">
      </div>

      <div class="col-md-6">
        <label for="bloodGroup" class="form-label">Blood Group:</label>
        <input type="text" id="bloodGroup" name="bloodGroup" class="form-control" placeholder="Enter your blood group">
      </div>






      <h3 class="mt-5">Family & Social Details</h3>
      <hr>

      <div class="col-md-6">
        <label for="fathersName" class="form-label">Father Name:</label>
        <input type="text" id="fathersName" name="fathersName" class="form-control" placeholder="Enter your father's name">
      </div>

      <div class="col-md-6">
        <label for="mothersName" class="form-label">Mother Name:</label>
        <input type="text" id="mothersName" name="mothersName" class="form-control" placeholder="Enter your mother's name">
      </div>

      <div class="col-md-6">
        <label for="maritalStatus" class="form-label">Marital Status:</label>
        <input type="text" id="maritalStatus" name="maritalStatus" class="form-control" placeholder="Enter your marital status">
      </div>

      <div class="col-md-6">
        <label for="spouseName" class="form-label">Spouse Name:</label>
        <input type="text" id="spouseName" name="spouseName" class="form-control" placeholder="Enter your spouse name">
      </div>

      <div class="col-md-6">
        <label for="noOfChildren" class="form-label">No of Children:</label>
        <input type="number" id="noOfChildren" name="noOfChildren" class="form-control" placeholder="Enter number of children">
      </div>

      <div class="col-md-6">
        <label for="noOfFamilyMembers" class="form-label">No of Family Members:</label>
        <input type="number" id="noOfFamilyMembers" name="noOfFamilyMembers" class="form-control" placeholder="Enter number of family members">
      </div>

      <div class="col-md-6">
        <label for="friendsName" class="form-label">Friend Name:</label>
        <input type="text" id="friendsName" name="friendsName" class="form-control" placeholder="Enter your friend's name">
      </div>

      <div class="col-md-6">
        <label for="nativePlace" class="form-label">Native Place:</label>
        <input type="text" id="nativePlace" name="nativePlace" class="form-control" placeholder="Enter your native place">
      </div>






      <h3 class="mt-5">Contact and ID Details</h3>
      <hr>

      <div class="col-md-6">
        <label for="mobileNo" class="form-label">Mobile Number:</label>
        <input type="number" id="mobileNo" name="mobileNo" class="form-control" placeholder="Enter your mobile number">
      </div>

      <div class="col-md-6">
        <label for="aadhaarNo" class="form-label">Aadhaar Number:</label>
        <input type="text" id="aadhaarNo" name="aadhaarNo" class="form-control" placeholder="Enter your Aadhaar number">
      </div>

      <div class="col-md-6">
        <label for="panNo" class="form-label">PAN Number:</label>
        <input type="text" id="panNo" name="panNo" class="form-control" placeholder="Enter your PAN number">
      </div>

      <div class="col-md-6">
        <label for="voterId" class="form-label">Voter ID:</label>
        <input type="text" id="voterId" name="voterId" class="form-control" placeholder="Enter your voter ID">
      </div>

      <div class="col-md-6">
        <label for="passportNo" class="form-label">Passport Number:</label>
        <input type="text" id="passportNo" name="passportNo" class="form-control" placeholder="Enter your passport number">
      </div>

      <div class="col-md-6">
        <label for="rationCardNo" class="form-label">Ration Card Number:</label>
        <input type="text" id="rationCardNo" name="rationCardNo" class="form-control" placeholder="Enter your ration card number">
      </div>





      <h3 class="mt-5">Finance & Property</h3>
      <hr>

      <div class="col-md-6">
        <label for="income" class="form-label">Income:</label>
        <input type="text" id="income" name="income" class="form-control" placeholder="Enter your income">
      </div>

      <div class="col-md-6">
        <label for="bankAccount" class="form-label">Bank Account:</label>
        <input type="text" id="bankAccount" name="bankAccount" class="form-control" placeholder="Enter your bank account">
      </div>

      <div class="col-md-6">
        <label for="taxesPaid" class="form-label">Are Taxes Paid?:</label>
        <input type="text" id="taxesPaid" name="taxesPaid" class="form-control" placeholder="Enter if taxes are paid">
      </div>

      <div class="col-md-6">
        <label for="isDisabled" class="form-label">Are You Disabled?:</label>
        <input type="text" id="isDisabled" name="isDisabled" class="form-control" placeholder="Enter if you are disabled">
      </div>

      <div class="col-md-6">
        <label for="isGovernmentEmployee" class="form-label">Are You Govt Emp?:</label>
        <input type="text" id="isGovernmentEmployee" name="isGovernmentEmployee" class="form-control" placeholder="Enter if you are a government employee">
      </div>

      <div class="col-md-6">
        <label for="insuranceCompany" class="form-label">Insurance Company:</label>
        <input type="text" id="insuranceCompany" name="insuranceCompany" class="form-control" placeholder="Enter your insurance company">
      </div>

      <div class="col-md-6">
        <label for="insuranceNo" class="form-label">Insurance Number:</label>
        <input type="text" id="insuranceNo" name="insuranceNo" class="form-control" placeholder="Enter your insurance number">
      </div>

      <div class="col-md-6">
        <label for="landInAcres" class="form-label">Land (Acres):</label>
        <input type="text" id="landInAcres" name="landInAcres" class="form-control" placeholder="Enter land in acres">
      </div>

      <div class="col-md-6">
        <label for="totalSites" class="form-label">Total Sites:</label>
        <input type="number" id="totalSites" name="totalSites" class="form-control" placeholder="Enter total sites">
      </div>

      <div class="col-md-6">
        <label for="rtcNo" class="form-label">RTC Number:</label>
        <input type="text" id="rtcNo" name="rtcNo" class="form-control" placeholder="Enter RTC number">
      </div>

      <div class="col-md-6">
        <label for="builderOwner" class="form-label">Building Owner Name:</label>
        <input type="text" id="builderOwner" name="builderOwner" class="form-control" placeholder="Enter building owner name">
      </div>

      <div class="col-md-6">
        <label for="electricityBillNo" class="form-label">Electricity Bill No:</label>
        <input type="text" id="electricityBillNo" name="electricityBillNo" class="form-control" placeholder="Enter electricity bill number">
      </div>

      <div class="col-md-6">
        <label for="waterBillNo" class="form-label">Water Bill No:</label>
        <input type="text" id="waterBillNo" name="waterBillNo" class="form-control" placeholder="Enter water bill number">
      </div>





      <h3 class="mt-5">Vehicles & Appliances</h3>

      <div class="col-md-6">
        <label for="bikeNo" class="form-label">Bike Number:</label>
        <input type="text" id="bikeNo" name="bikeNo" class="form-control" placeholder="Enter your bike number">
      </div>

      <div class="col-md-6">
        <label for="carNo" class="form-label">Car Number:</label>
        <input type="text" id="carNo" name="carNo" class="form-control" placeholder="Enter your car number">
      </div>

      <div class="col-md-6">
        <label for="noOfCycles" class="form-label">No of Cycles:</label>
        <input type="number" id="noOfCycles" name="noOfCycles" class="form-control" placeholder="Enter number of cycles">
      </div>

      <div class="col-md-6">
        <label for="shoeSize" class="form-label">Shoe Size:</label>
        <input type="number" id="shoeSize" name="shoeSize" class="form-control" placeholder="Enter your shoe size">
      </div>

      <div class="col-md-6">
        <label for="noOfShoes" class="form-label">No of Shoes:</label>
        <input type="number" id="noOfShoes" name="noOfShoes" class="form-control" placeholder="Enter number of shoes">
      </div>

      <div class="col-md-6">
        <label for="laptopModel" class="form-label">Laptop Model:</label>
        <input type="text" id="laptopModel" name="laptopModel" class="form-control" placeholder="Enter your laptop model">
      </div>

      <div class="col-md-6">
        <label for="tvModel" class="form-label">TV Model:</label>
        <input type="text" id="tvModel" name="tvModel" class="form-control" placeholder="Enter your TV model">
      </div>




      <h3 class="mt-5">Loans and Assets</h3>
      <hr>

      <div class="col-md-6">
        <label for="crop" class="form-label">Crop:</label>
        <input type="text" id="crop" name="crop" class="form-control" placeholder="Enter crop name">
      </div>

      <div class="col-md-6">
        <label for="loanNo" class="form-label">Loan Number:</label>
        <input type="text" id="loanNo" name="loanNo" class="form-control" placeholder="Enter loan number">
      </div>

      <div class="col-md-6">
        <label for="loanBalance" class="form-label">Loan Balance:</label>
        <input type="text" id="loanBalance" name="loanBalance" class="form-control" placeholder="Enter loan balance">
      </div>

      <div class="col-md-6">
        <label for="loanType" class="form-label">Loan Type:</label>
        <input type="text" id="loanType" name="loanType" class="form-control" placeholder="Enter loan type">
      </div>

      <div class="col-md-6">
        <label for="goldInGms" class="form-label">Gold (g):</label>
        <input type="text" id="goldInGms" name="goldInGms" class="form-control" placeholder="Enter gold in grams">
      </div>

      <div class="col-md-6">
        <label for="silverInGms" class="form-label">Silver (g):</label>
        <input type="text" id="silverInGms" name="silverInGms" class="form-control" placeholder="Enter silver in grams">
      </div>

      <div class="col-md-6">
        <label for="noOfCows" class="form-label">No of Cows:</label>
        <input type="number" id="noOfCows" name="noOfCows" class="form-control" placeholder="Enter number of cows">
      </div>

      <div class="col-md-6">
        <label for="petName" class="form-label">Pet Name:</label>
        <input type="text" id="petName" name="petName" class="form-control" placeholder="Enter pet name">
      </div>

      <div class="col-md-6">
        <label for="knownDiseases" class="form-label">Known Diseases:</label>
        <input type="text" id="knownDiseases" name="knownDiseases" class="form-control" placeholder="Enter known diseases">
      </div>

      <div class="col-md-6">
        <label for="shareHolding" class="form-label">Share Holding:</label>
        <input type="text" id="shareHolding" name="shareHolding" class="form-control" placeholder="Enter share holding">
      </div>

      <div class="col-12 text-center mt-5">
        <button class="btn btn-primary px-5 py-2 w-75">Submit</button>
      </div>

    </form>

</div>
</body>
</html>
