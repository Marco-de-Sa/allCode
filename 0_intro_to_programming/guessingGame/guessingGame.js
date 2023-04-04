var secret = Math.floor(Math.random() * 10 + 1);
var isGuess = true;

while(isGuess === true){
    var answer = prompt("Please guess the secret number (1-10)");
    var guess = parseInt(answer);

    if (secret === guess){
        alert("Correct!");
        isGuess = false;
    }else{
        isGuess = true;
        if(secret > guess){
            alert("Incorrect, too low!");
        }else{
            alert("Incorrect, too high!");
        }
    }
}