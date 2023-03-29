var alphabet = "abcdefghijklmnopqrstuvwxyz";
var rngString = "";

while (rngString.length<6) {
    rngString += alphabet[Math.floor(Math.random()*alphabet.length)];
}
console.log(rngString);