var users = [];

// function the creates an Object!
// this function is called constructor / בנאי!
// this function is an OBJECT PATTERN -> later we will learn about class/מחלקה!
function User(param1) {
    this.username = param1;
    this.password = "123";
    this.first = "Maayan";
    this.last = "Politzer";
    //this.g = new Game();
    this.fullName = this.first + " " + this.last,
        // function of an object is called method/ מתודה/ שיטה!
        this.whoAreYou = function () {
            console.log("Hello my username is " + this.username);
        }
}

/*
function KspProduct(title, image, url){
    this.title = title;
    this.image = image;
    this.url = url;
    this.visible = true;
    this.backgroundColor = "blue";
    this.shape = "circle";
}
*/

function addObjectToArray() {
    var userName = document.getElementById("myInput").value;    // new Date();
    /**
     * Function that creates an Object!
     * the function must start with upper case letter!
     * the word "new" before the function is required!
     */
    var user = new User(userName);
    // var user = createUser(userName);
    /*
    var user = {
        username: userName,
        email: "",
        password: "",
        enabled: true
    };
    */
    // var user = {};
    // user["name"] = username;
    users.push(user);
    document.getElementById("myInput").value = "";
}



function createUser(param1) {
    var obj = {
        username: param1
    };
    return obj;
}

function r(x, y) {
    var sum = x + y;
    return sum;
}

function printArray() {
    for (var i = 0; i < users.length; i++) {
        //users[i].whoAreYou();
        console.log(users[i]);
    }
}