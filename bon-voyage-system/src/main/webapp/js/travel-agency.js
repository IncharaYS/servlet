function validateEmail() {
    const input=document.getElementById("email");
    const msg=document.getElementById("emailMsg");
    const email=input.value.trim();
    const pattern=/^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (email === "") {
        msg.textContent="Email is required.";

    } else if (pattern.test(email)) {
        msg.textContent="";
    } else {
        msg.textContent="Entered email is not valid.";

    }
}

function validatePhoneNo(){

    const input=document.getElementById("phoneNo");
    const msg=document.getElementById("phoneNoMsg");
    const phoneNo=input.value.trim();

    const pattern = /^\+?\d{10,15}$/;

        if (phoneNo === "") {
            msg.textContent = "Phone number is required.";
        } else if (pattern.test(phoneNo)) {
            msg.textContent = "";
        } else {
            msg.textContent = "Enter a valid phone number";
        }

}

function validatePassword() {
    const input = document.getElementById("password");
    const msg = document.getElementById("passwordMsg");
    const password = input.value.trim();

    const pattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

    if (password === "") {
        msg.textContent = "Password is required.";
    }
    else if (pattern.test(password)) {
        msg.textContent = "";
    }
    else {
        msg.textContent = "Password must be 8 chars,include uppercase,lowercase,number & special character.";
    }
}


function validateForm() {
    let requiredFields=[
        {id:"fullName",name:"Full Name" },
        {id:"email",name:"Email" },
        {id:"password",name:"Password" },
        {id:"phoneNo",name:"Phone Number" },
        {id:"country",name:"Country" }
    ];

    for (let field of requiredFields) {
        let input=document.getElementById(field.id);
        if (!input||input.value.trim()==="") {
            alert(field.name+" cannot be empty");
            input.focus();
            return false;
        }
    }
    return true;
}


function validateLoginForm() {
    let requiredFields=[
        {id:"email",name:"Email" },
        {id:"password",name:"Password" },
    ];

    for (let field of requiredFields) {
        let input=document.getElementById(field.id);
        if (!input||input.value.trim()==="") {
            alert(field.name+" cannot be empty");
            input.focus();
            return false;
        }
    }
    return true;
}

function togglePassword() {
  const passwordInput = document.getElementById("password");
  const toggleBtn = document.getElementById("toggleBtn");

  if (passwordInput.type === "password") {
    passwordInput.type = "text";
    toggleBtn.innerHTML = '<i class="bi bi-eye-slash"></i>'; // change icon
  } else {
    passwordInput.type = "password";
    toggleBtn.innerHTML = '<i class="bi bi-eye"></i>'; // change back
  }
}




  function onSearchByChange(value) {
      const input = document.getElementById("searchByValue");
      const label = document.getElementById("searchLabel");
      const errorMsg = document.getElementById("errorMsg");

      input.value = "";
      errorMsg.textContent = "";
      input.oninput = null;

      switch (value) {
          case "email":
              label.innerHTML = 'Enter Email to Search User:<span class="required">*</span>';
              input.placeholder = "Enter email";
              input.oninput = validateSearchEmail;
              break;

          case "name":
              label.innerHTML = 'Enter Name to Search User:<span class="required">*</span>';
              input.placeholder = "Enter name";
              break;

          case "phoneNo":
              label.innerHTML = 'Enter Phone Number to Search User:<span class="required">*</span>';
              input.placeholder = "Enter phone number";
              input.oninput = validateSearchPhone;
              break;

          case "country":
              label.innerHTML = 'Enter Country to Search User:<span class="required">*</span>';
              input.placeholder = "Enter country";
              break;

          default:
              label.innerHTML = 'Enter value to search:<span class="required">*</span>';
              input.placeholder = "Enter value";
      }
  }



  function validateSearchEmail() {
      const input = document.getElementById("searchByValue");
      const errorMsg = document.getElementById("errorMsg");
      const pattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

      errorMsg.textContent = pattern.test(input.value)
          ? ""
          : "Invalid email format";
  }

  function validateSearchPhone() {
      const input = document.getElementById("searchByValue");
      const errorMsg = document.getElementById("errorMsg");
      const pattern = /^[0-9]{10}$/;

      errorMsg.textContent = pattern.test(input.value)
          ? ""
          : "Phone number must be 10 digits";
  }
