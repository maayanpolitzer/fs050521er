var elad = true;
var needToDraw = false;
var canvas;

var lastX;
var lastY;

var activeColor;

/* will be called by onload (in body tag): */
function onViewRenderedDone() {
    addClickToCircles();

    canvas = document.getElementsByTagName("canvas")[0];

    canvas.addEventListener("mousedown", function (event) {
        var activeCircle = document.getElementsByClassName("activeColor")[0];
        activeColor = getComputedStyle(activeCircle).getPropertyValue("background-color");
        needToDraw = true;
        lastX = event.offsetX;
        lastY = event.offsetY;
        draw(event);
    });
    canvas.addEventListener("mouseup", function (event) {
        needToDraw = false;
    });
    canvas.addEventListener("mouseleave", function (event) {
        needToDraw = false;
    });
    canvas.addEventListener("mousemove", function (event) {   // anonymous function
        if (needToDraw) {   // the same as: if (needToDraw == true){
            draw(event);
        }
    });
}


function draw(event) {
    // console.log("last position: " + (event.offsetX - event.movementX) + "," + (event.offsetY - event.movementY));
    // console.log("current position: " + event.offsetX + "," + event.offsetY);
    // console.log("******");
    var ctx = canvas.getContext("2d");
    console.log(ctx);
    // first option (calculate last mouse position from event properties):
    //ctx.moveTo(event.offsetX - event.movementX, event.offsetY - event.movementY); 

    // second option (using global variables to save last mouse position):
    ctx.beginPath();    // stop the last line, and start a new one.
    ctx.moveTo(lastX, lastY);
    ctx.lineTo(event.offsetX, event.offsetY);
    ctx.strokeStyle = activeColor;
    ctx.lineWidth = 4;
    ctx.stroke();
    lastX = event.offsetX;
    lastY = event.offsetY;
}

function myFunction() {
    /*
    var redInput = document.getElementById("redInput");
    console.log(redInput.value);
    var greenInput = document.getElementById("greenInput");
    console.log(greenInput.value);
    var blueInput = document.getElementById("blueInput");
    console.log(blueInput.value);
    */
    var color = getColorFromRanges();
    var preview = document.getElementById("preview");
    preview.style.backgroundColor = color;
}

function getColorFromRanges() {
    var red = getValueFromInputById("redInput");
    var green = getValueFromInputById("greenInput");
    var blue = getValueFromInputById("blueInput");
    return getColorFromRGB(red, green, blue);
}

function getColorFromRGB(red, green, blue) {
    return "rgb(" + red + "," + green + "," + blue + ")"; // rgb(0,0,0)
}

function getValueFromInputById(elementId) {
    //var input = document.getElementById(elementId);
    //return input.value;
    return document.getElementById(elementId).value;
}

function addColor() {
    // DO NOT CODE LIKE THIS!!! (I WILL KILL YOU)
    //document.getElementById("colorList").innerHTML = document.getElementById("colorList").innerHTML + "<li style='background-color:pink' class='colorCircle'></li>";

    //1. create circle.
    // 1.1. create li tag (element):
    var newColorElement = document.createElement("li");
    // 1.2. add click event listener to the new circle:
    newColorElement.addEventListener("click", selectColor);
    // 1.3. add class that will change the style to circle:
    newColorElement.classList.add("colorCircle");
    //2. get the choosen color!
    //BUG:
    //var choosenColor = document.getElementById("preview").style.backgroundColor;
    var choosenColor = getColorFromRanges();
    //3. add color to the circle.
    newColorElement.style.backgroundColor = choosenColor;
    //4. add circle next to existing circles.
    // 4.1. find the father tag/element.
    var ul = document.getElementById("colorList");
    // 4.2. add the new element to the father:
    ul.appendChild(newColorElement);
    //solution:
    //add this "<li style="background-color:..." class="colorCircle"></li>" to the color list(ul).

}

function changePickerDivDisplay() {
    var div = document.getElementById("pickerDiv");
    var button = document.getElementById("openPickerButton");

    if (elad) {
        // pickerDiv is hidden:
        div.style.visibility = "visible";
        button.innerHTML = "Close Color Picker";
    } else {
        // pickerDiv is visible:
        div.style.visibility = "hidden";
        button.innerHTML = "Open Color Picker";
    }
    elad = !elad;
    /*
        var div = document.getElementById("pickerDiv");
        var button = document.getElementById("openPickerButton");
        if (div.style.visibility == "" || div.style.visibility == "hidden") {
            // pickerDiv is hidden:
            div.style.visibility = "visible";
            button.innerHTML = "Close Color Picker";
        } else {
            // pickerDiv is visible:
            div.style.visibility = "hidden";
            button.innerHTML = "Open Color Picker";
        }
        */
}

function addClickToCircles() {
    var circles = document.getElementsByClassName("colorCircle");
    for (var i = 0; i < circles.length; i++) {
        circles[i].addEventListener("click", selectColor);
    }
}


function selectColor(event) {
    var activeColorsElements = document.getElementsByClassName("activeColor");  // return an array!
    //var oldActiveColor = activeColorsElements[0];
    // oldActiveColor.classList.remove("activeColor"); // Maayan knows that there is only one!
    // but if you dont know how many there are.... please use a loop!!!
    for (var i = 0; i < activeColorsElements.length; i++) {
        activeColorsElements[i].classList.remove("activeColor");
    }

    var clickedCircle = event.target;
    // thanks Rotem:
    //console.log(getComputedStyle(clickedCircle).getPropertyValue("background-color"));
    clickedCircle.classList.add("activeColor");
}


