
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Survey Response</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
        rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
        crossorigin="anonymous">
</head>

<body class="bg-primary-subtle">

<div class="container d-flex justify-content-center py-5">
  <div class="card shadow-lg p-4 w-100" style="max-width: 900px;">
    <h4 class="mt-4 mb-3 text-center text-success">${successMsg}</h4>
    <h4 class="mt-4 mb-3 text-center text-danger">${failureMsg}</h4>
    <h3 class="mt-4 mb-3 ps-4">Submitted details are:</h3>
    <div class="ps-4">

      <h3 class="mt-4" style="color:#2b68d1; font-weight:700;">Personal Details</h3>
      <hr>
      <p><strong>Name:</strong> ${name}</p>
      <p><strong>Age:</strong> ${age}</p>
      <p><strong>Date of Birth:</strong> ${dateOfBirth}</p>
      <p><strong>Blood Group:</strong> ${bloodGroup}</p>
      <p><strong>Height:</strong> ${height}</p>
      <p><strong>Weight:</strong> ${weight}</p>
      <p><strong>Complexion:</strong> ${complexion}</p>
      <p><strong>Mother Tongue:</strong> ${motherTongue}</p>
      <p><strong>Religion:</strong> ${religion}</p>
      <p><strong>Caste:</strong> ${caste}</p>

      <h3 class="mt-5" style="color:#2b68d1; font-weight:700;">Family & Social Details</h3>
      <hr>
      <p><strong>Father's Name:</strong> ${fathersName}</p>
      <p><strong>Mother's Name:</strong> ${mothersName}</p>
      <p><strong>Marital Status:</strong> ${maritalStatus}</p>
      <p><strong>Spouse Name:</strong> ${spouseName}</p>
      <p><strong>No. of Children:</strong> ${noOfChildren}</p>
      <p><strong>No. of Family Members:</strong> ${noOfFamilyMembers}</p>
      <p><strong>Friend's Name:</strong> ${friendsName}</p>
      <p><strong>Native Place:</strong> ${nativePlace}</p>

      <h3 class="mt-5" style="color:#2b68d1; font-weight:700;">Contact and ID Details</h3>
      <hr>
      <p><strong>Mobile No:</strong> ${mobileNo}</p>
      <p><strong>Aadhaar No:</strong> ${aadhaarNo}</p>
      <p><strong>PAN No:</strong> ${panNo}</p>
      <p><strong>Voter ID:</strong> ${voterId}</p>
      <p><strong>Passport No:</strong> ${passportNo}</p>
      <p><strong>Ration Card No:</strong> ${rationCardNo}</p>

      <h3 class="mt-5" style="color:#2b68d1; font-weight:700;">Finance and Property</h3>
      <hr>
      <p><strong>Income:</strong> ${income}</p>
      <p><strong>Bank Account:</strong> ${bankAccount}</p>
      <p><strong>Insurance Company:</strong> ${insuranceCompany}</p>
      <p><strong>Insurance No:</strong> ${insuranceNo}</p>
      <p><strong>Taxes Paid:</strong> ${taxesPaid}</p>
      <p><strong>Share Holding:</strong> ${shareHolding}</p>
      <p><strong>Land in Acres:</strong> ${landInAcres}</p>
      <p><strong>Total Sites:</strong> ${totalSites}</p>
      <p><strong>RTC No:</strong> ${rtcNo}</p>
      <p><strong>Builder / Owner:</strong> ${builderOwner}</p>
      <p><strong>Electricity Bill No:</strong> ${electricityBillNo}</p>
      <p><strong>Water Bill No:</strong> ${waterBillNo}</p>

      <h3 class="mt-5" style="color:#2b68d1; font-weight:700;">Vehicles and Appliances</h3>
      <hr>
      <p><strong>Bike No:</strong> ${bikeNo}</p>
      <p><strong>Car No:</strong> ${carNo}</p>
      <p><strong>No. of Cycles:</strong> ${noOfCycles}</p>
      <p><strong>Shoe Size:</strong> ${shoeSize}</p>
      <p><strong>No. of Shoes:</strong> ${noOfShoes}</p>
      <p><strong>Laptop Model:</strong> ${laptopModel}</p>
      <p><strong>TV Model:</strong> ${tvModel}</p>

      <h3 class="mt-5" style="color:#2b68d1; font-weight:700;">Loans and Assets</h3>
      <hr>
      <p><strong>Crop:</strong> ${crop}</p>
      <p><strong>Loan No:</strong> ${loanNo}</p>
      <p><strong>Loan Balance:</strong> ${loanBalance}</p>
      <p><strong>Loan Type:</strong> ${loanType}</p>
      <p><strong>Gold (gms):</strong> ${goldInGms}</p>
      <p><strong>Silver (gms):</strong> ${silverInGms}</p>
      <p><strong>No. of Cows:</strong> ${noOfCows}</p>
      <p><strong>Pet Name:</strong> ${petName}</p>
      <p><strong>Known Diseases:</strong> ${knownDiseases}</p>
      <p><strong>Government Employee:</strong> ${isGovernmentEmployee}</p>
      <p><strong>Occupation:</strong> ${occupation}</p>
      <p><strong>Education:</strong> ${education}</p>

      <div class="mt-4 text-center">
        <a href="Survey.jsp" class="btn btn-light w-50">Submit Another Response</a>
      </div>

    </div>
  </div>
</div>

</body>
</html>
