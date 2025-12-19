function onPlayerTypeChange() {
    const type = document.getElementById("playerType").value;

    document.getElementById("battingDiv").style.display = "none";
    document.getElementById("bowlingDiv").style.display = "none";
    document.getElementById("stumpsDiv").style.display = "none";
    document.getElementById("submit").style.display = "none";

    document.getElementById("battingAverage").required = false;
    document.getElementById("bowlingAverage").required = false;
    document.getElementById("noOfStumps").required = false;

    if (type === "Batter") {
        showBatting();
        showSubmit();
    }
    else if (type === "Bowler") {
        showBowling();
        showSubmit();
    }
    else if (type === "AllRounder") {
        showBatting();
        showBowling();
        showStumps();
        showSubmit();
    }
    else if (type === "Keeper") {
        showBatting();
        showStumps();
        showSubmit();
    }
}

function showBatting() {
    document.getElementById("battingDiv").style.display = "block";
    document.getElementById("battingAverage").required = true;
}

function showBowling() {
    document.getElementById("bowlingDiv").style.display = "block";
    document.getElementById("bowlingAverage").required = true;
}

function showStumps() {
    document.getElementById("stumpsDiv").style.display = "block";
    document.getElementById("noOfStumps").required = true;
}

function showSubmit(){
    document.getElementById("submit").style.display = "block";
}



function validateForm() {

    let requiredFields = [
        { id: "playerName", name: "Player Name" },
        { id: "password", name: "Password" },
        { id: "age", name: "Age" },
        { id: "state", name: "State" },
        { id: "playerType", name: "Player Type" }
    ];

    for (let field of requiredFields) {
        let input = document.getElementById(field.id);
        if (!input || input.value.trim() === "") {
            alert(field.name + " cannot be empty");
            input.focus();
            return false;
        }
    }

    let playerType = document.getElementById("playerType").value;

    if (playerType === "Batter") {
        if (isEmpty("battingAverage", "Batting Average")) return false;
    }

    if (playerType === "Bowler") {
        if (isEmpty("bowlingAverage", "Bowling Average")) return false;
    }

    if (playerType === "AllRounder") {
        if (isEmpty("battingAverage", "Batting Average")) return false;
        if (isEmpty("bowlingAverage", "Bowling Average")) return false;
        if (isEmpty("noOfStumps", "No. of Stumps")) return false;
    }

    if (playerType === "Keeper") {
        if (isEmpty("battingAverage", "Batting Average")) return false;
        if (isEmpty("noOfStumps", "No. of Stumps")) return false;
    }

    return true;
}


function isEmpty(id, fieldName) {
    let input = document.getElementById(id);
    if (!input || input.value.trim() === "") {
        alert(fieldName + " cannot be empty");
        input.focus();
        return true;
    }
    return false;
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




function validatePlayerLogin() {
    if (document.getElementById("playerName").value.trim() === "") {
        alert("Player Name cannot be empty");
        return false;
    }
    if (document.getElementById("password").value.trim() === "") {
        alert("Password cannot be empty");
        return false;
    }
    return true;
}

function validateCompanyLogin() {
    if (document.getElementById("email").value.trim() === "") {
        alert("Email cannot be empty");
        return false;
    }
    if (document.getElementById("password").value.trim() === "") {
        alert("Password cannot be empty");
        return false;
    }
    return true;
}

