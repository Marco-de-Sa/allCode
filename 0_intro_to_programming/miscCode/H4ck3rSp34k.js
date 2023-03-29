var input = "javascript is awesome";
var output = "";

for (var x = 0; x < input.length; x++) {
    if (input[x] === "a") {
        output += "4";
    } else if (input[x] === "e") {
        output += "3";
    } else if (input[x] === "i") {
        output += "1";
    } else if (input[x] === "o") {
        output += "0";
    } else {
        output += input[x]
    }
}
console.log(output)