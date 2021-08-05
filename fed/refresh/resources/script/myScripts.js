var elad = true;

function myFunction() {
    /*
    var redInput = document.getElementById("redInput");
    console.log(redInput.value);
    var greenInput = document.getElementById("greenInput");
    console.log(greenInput.value);
    var blueInput = document.getElementById("blueInput");
    console.log(blueInput.value);
    */
    var red = getValueFromInputById("redInput");
    var green = getValueFromInputById("greenInput");
    var blue = getValueFromInputById("blueInput");
    //var color = "rgb(" + red + "," + green + "," + blue + ")"; // rgb(0,0,0)
    var color = getColorFromRGB(red, green, blue);
    var preview = document.getElementById("preview");
    preview.style.backgroundColor = color;
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
    // 1.2. add class that will change the style to circle:
    newColorElement.classList.add("colorCircle");
    //2. get the choosen color!
    var choosenColor = document.getElementById("preview").style.backgroundColor;
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




