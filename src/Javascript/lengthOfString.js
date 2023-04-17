function getLengths(arr) {
    let lengths = [];
    for (let i = 0; i < arr.length; i++) {
        lengths.push(arr[i].length);
    }
    return lengths;
}

let strings =  ["0524", "0", "000111224", "24"];
let lengths = getLengths(strings);
console.log(lengths);
