var randomBodyParts = ["Face", "Nose", "Hair"];
var randomAdjectives = ["Smelly", "Boring", "Stupid"];
var randomWords = ["Fly", "Marmot", "Stick", "Monkey", "Rat"];

// Pick a random body part from the randomBodyParts array:
var randomBodyPart = randomBodyParts[Math.floor(Math.random() * 3)];
// Pick a random adjective from the randomAdjectives array:
var randomAdjective = randomAdjectives[Math.floor(Math.random() * 3)];
// Pick a random word from the randomWords array:
var randomWord = randomWords[Math.floor(Math.random() * 5)];
// Join all the random strings into a sentence:
var randomString = "Your " + randomBodyPart + " is like a " + randomAdjective + " " + randomWord + "!!!";

var pickRandomWord = function(arrIndex) {
    return Math.floor(Math.random()*arrIndex.length)
}

// Join all the random strings into a sentence:
var randomString = "Your " + randomBodyParts[pickRandomWord(randomBodyParts)] + 
" is like a " + randomAdjectives[pickRandomWord(randomAdjectives)] + 
" " + randomWords[pickRandomWord(randomWords)] + "!!!";

console.log(randomString);