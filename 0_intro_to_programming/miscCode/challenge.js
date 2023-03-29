var animals = ["Cat", "Fish","Lemur", "Komodo Dragon"];
var temp;

for (var i = 0; i < animals.length ; i++) {
    temp = animals[i];
    temp = "awesome " + temp;
    animals[i] = temp;
}

console.log(animals);