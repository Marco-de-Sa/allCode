var word = prompt("What word do you choose?");
var wordArr = [];
var hasBeenGuessed = true;

while (word.length < 1) {
    word = prompt("What word do you choose?");
}

for (var i = 0; i < word.length; i++) {
    wordArr[i] = "_";
}

var remainingLetters = words.length;

while (remainingLetters > 0) {
    alert(wordArr.join(" "))
}