function validateEmail() {
    const input=document.getElementById("email");
    const msg=document.getElementById("emailMsg");
    const email=input.value.trim();
    const pattern=/^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (email === "") {
        msg.textContent = "Email is required.";
        input.setCustomValidity("Invalid");
        input.reportValidity();

    } else if (!pattern.test(email)) {
        msg.textContent="Entered email is not valid.";
        input.setCustomValidity("Invalid");
        input.reportValidity();

    } else {
        msg.textContent="";
        input.setCustomValidity("");
    }
}


//function updateLabel() {
//    const gender=document.querySelector("input[name='gender']:checked");
//    const label=document.getElementById("gbLabel");
//    const genderMsg=document.getElementById("genderMsg");
//    if (!gender) return;
//
//    label.textContent = gender.value === "male" ? "Groom" : "Bride";
//
//    genderMsg.style.display = "block";
//    genderMsg.textContent = gender.value === "male"
//        ? "Enter Groom details"
//        : "Enter Bride details";
//}
//
//function showFields() {
//    document.getElementById("otherFields").style.display = "block";
//}

function onGenderSelect() {
    const gender = document.querySelector("input[name='gender']:checked");
    const genderMsg = document.getElementById("genderMsg");

    genderMsg.style.display = "block";
    genderMsg.textContent = gender.value === "male"
        ? "Enter Groom details"
        : "Enter Bride details";

    document.getElementById("otherFields").style.display = "block";
}

function validateHeight(input) {
    const msg=document.getElementById("heightMsg");
    const value=parseFloat(input.value);

    if (isNaN(value)) {
        msg.textContent = "Height is required.";
        input.setCustomValidity("Invalid");
    }
    else if (value<1||value>7) {
        msg.textContent="Height must be between 1 and 7 feet.";
        input.setCustomValidity("Invalid");
    }
     else {
        msg.textContent = "";
        input.setCustomValidity("");
    }

    input.reportValidity();
}


