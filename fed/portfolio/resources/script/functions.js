function initMap() {
    var mapCenter = { lat: 32.238885, lng: 34.996342 };
    var map = new google.maps.Map(document.getElementById("map"), {
        center: { lat: 40.76, lng: -73.983 },
        zoom: 15,
        mapTypeId: "satellite",
        heading: 90,
        tilt: 45,
    });
    map.setTilt(45);
    var marker = new google.maps.Marker({
        position: mapCenter,
        map: map
    });
}

document.getElementById("homeSection").addEventListener("wheel", changeMenuToNormal);

document.getElementById("prjectsSection").addEventListener("wheel", changeMenuToSticky);
document.getElementById("contactSection").addEventListener("wheel", changeMenuToSticky);


function changeMenuToSticky(event) {
    document.getElementById("menu").classList.add("sticky");
}

function changeMenuToNormal(event) {
    document.getElementById("menu").classList.remove("sticky");
}


