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
    var color = "rgb(" + red + "," + green + "," + blue + ")";
    var preview = document.getElementById("preview");
    preview.style.backgroundColor = color;
}

function getValueFromInputById(elementId) {
    var input = document.getElementById(elementId);
    return input.value;
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




