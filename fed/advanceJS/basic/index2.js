var vehicle = {
    color: "Silver",
    numOfWheels: 4,
    numOfDoors: 5,
    year: 2018,
    brand: "Fiat"
};

// change value to the object
vehicle.brand = "BMW";
var c = "color";
vehicle[c] = "Pink";

// add data to the object
vehicle.shift = "Auto";
vehicle["horsePower"] = 50;

console.log(vehicle.numOfDoors);    // 5
console.log(vehicle["year"]);       // 2018

console.log(vehicle);

vehicle.hasOwnProperty("shift");    // check if a key is present in the object.

console.log("*****");

for (var key in vehicle) {
    console.log(key + ": " + vehicle[key]);
}

console.log(vehicle);







