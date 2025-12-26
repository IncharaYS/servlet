function onPlayerTypeChange() {
    const type = document.getElementById("playerType").value;
    hideAll();

    if (type === "BATTER") {
        showBatting();
    }
    else if (type === "BOWLER") {
        showBowling();
    }
    else if (type === "ALLROUNDER") {
        showBatting();
        showBowling();
    }
    else if (type === "KEEPER") {
        showBatting();
        showStumps();
    }

    document.getElementById("submit").style.display = "block";
}



function hideAll() {
    document.getElementById("battingDiv").style.display = "none";
    document.getElementById("bowlingDiv").style.display = "none";
    document.getElementById("stumpsDiv").style.display = "none";
}

function showBatting() {
    document.getElementById("battingDiv").style.display = "block";
}

function showBowling() {
    document.getElementById("bowlingDiv").style.display = "block";
}

function showStumps() {
    document.getElementById("stumpsDiv").style.display = "block";
}
