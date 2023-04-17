function ageToMilliseconds(age) {
    const millisecondsPerYear = 31536000000;
    return age * millisecondsPerYear;
}

let newAge = 25
let result = ageToMilliseconds(newAge)
console.log(result)