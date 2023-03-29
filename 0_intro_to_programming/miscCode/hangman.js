var word;

var words = [
    "javascript",
    "monkey",
    "amazing",
    "pancake",
    "loss",
    "real",
    "help",
    "defence"
    ];

var wordArr = [];
var wrong = "";
var numWrong = 0;
var isWrong;
var isWronglock = false;
var isDone = false;
var correct = 0;
var guess = "";

word = pickWord(words);
wordArr = setupAnswerArray(word);

/*
for (var i = 0; i < word.length; i++) {
    wordArr[i] = "_";
}
*/

var remainingLetters = word.length;

while (remainingLetters > 0 || isDone == true) {

    //alert(wordArr.join(" "));
    showPlayerProgress(wordArr);
    guess = getGuess();
    //var guess = prompt("Guess a letter or click Cancel to stop playing.\n" + wrong);

    if (guess === null) {
        break;
    } else if (guess.length !== 1) {
        alert("please use a single letter.");
    } else {
        guess = guess.toLowerCase();
        var correctGuesses = updateGameState(guess, word, wordArr);
        isWronglock = false;
        remainingLetters = remainingLetters - correctGuesses;
        /*for (var j = 0; j < word.length; j++) {
            if (word[j] === guess && word[j] !== wordArr[j]) {
                wordArr[j] = guess;
                remainingLetters--;
                isWrong = false;
                isWronglock = false
            }else if (word[j] !== guess && isWronglock == true && word[j] !== wordArr[j]) {
                isWrong = true;
            }
        }*/
        if(isWrong){
            numWrong++;
            if (numWrong == 1) {
                wrong = "☺ ";
                j = word.length;
            } else if (numWrong == 2) {
                wrong = "☺ \n |";
                j = word.length;
            } else if (numWrong == 3) {
                wrong = "☺ \n[|";
                j = word.length;
            } else if (numWrong == 4) {
                wrong = "☺ \n[|]";
                j = word.length;
            } else if (numWrong == 5) {
                wrong = "☺ \n[|]\n[";
                j = word.length;
            } else if (numWrong == 6) {
                wrong = "☺ \n[|]\n[ ]";
                j = word.length;
            } else if (numWrong == 7) {
                wrong = "☺ \n[|]\n[ ]";
                isDone = true;
                j = word.length;
                break;
            }
        }
    }
}
showAnswerAndCongratulatePlayer.apply(wordArr);
if (isDone == true) {
    alert(word + "\nwas the answer")
}

// functions begin here

function pickWord() {
    return words[Math.floor(Math.random() * words.length)];
}

function setupAnswerArray(word) {
    for (var i = 0; i < word.length; i++) {
        wordArr[i] = "_";
    }
    return wordArr;
}

function showPlayerProgress(wordArr) {
    alert(wordArr.join(" "));
}

function getGuess() {
    return prompt("Guess a letter or click Cancel to stop playing.\n" + wrong);
}

function updateGameState(guess, word, wordArr) {
    // Update answerArray and return a number showing how many
    // times the guess appears in the word so remainingLetters
    // can be updated
    var correctG = 0;
    isWrong = false;
    for (var j = 0; j < word.length; j++) {
        if (word[j] === guess) {
            if (wordArr[j] !== "_") {
                alert("you have already guessed this letter");
                break;
            } else {
                wordArr[j] = guess;
                correctG++;
            }
            isWrong = false;
            isWronglock = true;
        }else if(word[j] !== guess && isWronglock == false && word[j] !== wordArr[j]){
            
            isWrong = true
        }
    }
    return correctG;
};

function showAnswerAndCongratulatePlayer(wordArr) {
    // Use alert to show the answer and congratulate the player
    if (remainingLetters === 0) {
        showAnswerAndCongratulatePlayer(wordArr);
    }
};