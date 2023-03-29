console.log(areArraysTheSame([1, 2, 3], [4, 5, 6]));
console.log(areArraysTheSame([1, 2, 3], [1, 2, 3]));
console.log(areArraysTheSame([1, 2, 3], [1, 2, 3, 4]));


function areArraysTheSame(array1, array2) {
    if (array1.length !== array2.length) {
        return false;
    }

    for (var i = 0; i < array1.length; i++) {
        if (array1[i] !== array2[i]) {
            return false;
        }
        
    }
    return true;
}