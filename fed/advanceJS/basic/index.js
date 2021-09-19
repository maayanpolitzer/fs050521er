var x = 5.43;
var b = true;
var s = "maayan";
var arr = [x, b, s];
/*
arr2 = {
    0: x,
    1: b,
    2: s
};

arr2[arr2.length] = "Moshe";    // arr.push();

*/
console.log(arr);
console.log(arr.length);
console.log(console);

console.log(document);

arr[2] = "Moshe";
console.log(arr[2]);

// OBJECTS:
// key: value, key: value, key: value....

// array is a type of object.

var person = {
    first: "Maayan",
    last: "Politzer",
    age: "35"
};

console.log(person.last);   // Politzer // person.PROPERTY_NAME
var w = "last";
console.log(person[w]);// Politzer // person[VAR]

person.wife = "Irit";

console.log(person);
console.log("**********");

document.getElementById("before").innerHTML = person.first + "," + person.last + "," + person.age;

function change() {
    var key = document.querySelector("#key").value;
    var v = document.getElementById("v").value;
    person[key] = v;
    document.getElementById("after").innerHTML = person.first + "," + person.last + "," + person.age;
}
