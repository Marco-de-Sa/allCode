var userScore = prompt("what is your score?");
alert("you get a " + medalForScore(userScore) + "medal");

function medalForScore(score) {
    if (score < 3) {
        return "Bronze";
    }
    if (score < 7) {
        return "Silver";
    }
    return "Gold";
};