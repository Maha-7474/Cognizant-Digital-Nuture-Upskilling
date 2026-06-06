// =====================================
// JavaScript Basics & Setup
// =====================================

console.log("Welcome to the Community Portal");

window.addEventListener("load", function () {
    alert("Page Fully Loaded");
});

// =====================================
// Variables and Data Types
// =====================================

const eventName = "Community Picnic";
const eventDate = "2026-07-15";
let seats = 100;

console.log(`Event: ${eventName}, Date: ${eventDate}`);

seats--;
console.log("Remaining Seats:", seats);

// =====================================
// Event Class & Objects
// =====================================

class Event {
    constructor(name, date, seats, category) {
        this.name = name;
        this.date = date;
        this.seats = seats;
        this.category = category;
    }
}

Event.prototype.checkAvailability = function () {
    return this.seats > 0;
};

const events = [
    new Event("Music Night", "2026-08-20", 50, "Music"),
    new Event("Workshop", "2026-09-10", 25, "Education"),
    new Event("Sports Day", "2026-10-05", 100, "Sports")
];

// =====================================
// Functions
// =====================================

function addEvent(event) {
    events.push(event);
}

function registerUser(eventObj) {
    try {
        if (eventObj.seats <= 0) {
            throw new Error("No seats available");
        }

        eventObj.seats--;
        console.log("Registration Successful");
    }
    catch (error) {
        console.error(error.message);
    }
}

function filterEventsByCategory(category) {
    return events.filter(event => event.category === category);
}

// =====================================
// Closure Example
// =====================================

function registrationCounter() {
    let count = 0;

    return function () {
        count++;
        return count;
    };
}

const trackRegistrations = registrationCounter();

// =====================================
// Arrays & Methods
// =====================================

events.push(
    new Event("Food Festival", "2026-11-20", 75, "Food")
);

const musicEvents =
    events.filter(event => event.category === "Music");

console.log(musicEvents);

const formattedEvents =
    events.map(event => `Workshop on ${event.name}`);

console.log(formattedEvents);

// =====================================
// DOM Manipulation
// =====================================

function renderEvents() {

    const container =
        document.querySelector("#eventContainer");

    if (!container) return;

    container.innerHTML = "";

    events.forEach(event => {

        const card =
            document.createElement("div");

        card.className = "eventCard";

        card.innerHTML = `
            <h3>${event.name}</h3>
            <p>Date: ${event.date}</p>
            <p>Seats: ${event.seats}</p>
            <button onclick="registerUser(events[0])">
                Register
            </button>
        `;

        container.appendChild(card);
    });
}

// =====================================
// Phone Validation
// =====================================

function validatePhone() {

    let phone =
        document.getElementById("phone").value;

    let msg =
        document.getElementById("phoneMsg");

    if (/^\d{10}$/.test(phone)) {

        msg.innerHTML = "Valid Phone Number";
        msg.style.color = "green";

    } else {

        msg.innerHTML =
            "Enter a Valid 10 Digit Number";

        msg.style.color = "red";
    }
}

// =====================================
// Dropdown Fee Display
// =====================================

function showFee() {

    let fee =
        document.getElementById("eventType").value;

    document.getElementById("feeDisplay")
        .innerHTML = "Event Fee: ₹" + fee;
}

// =====================================
// Feedback Submit
// =====================================

function submitFeedback() {

    document.getElementById("submitMsg")
        .innerHTML =
        "Feedback Submitted Successfully";
}

// =====================================
// Character Counter
// =====================================

function countCharacters() {

    let count =
        document.getElementById("feedbackText")
        .value.length;

    document.getElementById("charCount")
        .innerHTML = count;
}

// =====================================
// Double Click Image
// =====================================

function enlargeImage() {

    let img =
        document.getElementById("eventImage");

    if (img.style.width === "500px") {

        img.style.width = "250px";

    } else {

        img.style.width = "500px";
    }
}

// =====================================
// Video Event
// =====================================

function videoReady() {

    document.getElementById("videoMessage")
        .innerHTML = "Video Ready To Play";
}

// =====================================
// Local Storage
// =====================================

function savePreference() {

    let selected =
        document.getElementById("preferredEvent")
        .value;

    localStorage.setItem(
        "preferredEvent",
        selected
    );

    sessionStorage.setItem(
        "lastVisit",
        new Date()
    );
}

function loadPreference() {

    let saved =
        localStorage.getItem(
            "preferredEvent"
        );

    if (saved) {

        document.getElementById(
            "preferredEvent"
        ).value = saved;
    }
}

function clearPreferences() {

    localStorage.clear();
    sessionStorage.clear();

    alert("Preferences Cleared");
}

// =====================================
// Geolocation
// =====================================

function findLocation() {

    if (!navigator.geolocation) {

        alert(
            "Geolocation Not Supported"
        );

        return;
    }

    navigator.geolocation.getCurrentPosition(

        function (position) {

            document.getElementById(
                "locationResult"
            ).innerHTML =

                `Latitude:
                ${position.coords.latitude}
                <br>
                Longitude:
                ${position.coords.longitude}`;

        },

        function (error) {

            switch (error.code) {

                case error.PERMISSION_DENIED:

                    alert(
                        "Permission Denied"
                    );

                    break;

                case error.TIMEOUT:

                    alert(
                        "Request Timed Out"
                    );

                    break;

                default:

                    alert(
                        "Location Error"
                    );
            }
        },

        {
            enableHighAccuracy: true,
            timeout: 10000,
            maximumAge: 0
        }
    );
}

// =====================================
// Fetch API
// =====================================

function fetchEvents() {

    fetch(
        "https://jsonplaceholder.typicode.com/posts"
    )

        .then(response => response.json())

        .then(data => {

            console.log(
                "Fetched Data:",
                data
            );
        })

        .catch(error => {

            console.error(error);
        });
}

// =====================================
// Async Await
// =====================================

async function fetchEventsAsync() {

    try {

        let response =
            await fetch(
                "https://jsonplaceholder.typicode.com/posts"
            );

        let data =
            await response.json();

        console.log(data);

    } catch (error) {

        console.error(error);
    }
}

// =====================================
// Form Handling
// =====================================

document.addEventListener(
    "DOMContentLoaded",

    function () {

        loadPreference();

        renderEvents();

        const form =
            document.querySelector("#regForm");

        if (form) {

            form.addEventListener(
                "submit",

                function (event) {

                    event.preventDefault();

                    console.log(
                        "Form Submitted"
                    );

                    alert(
                        "Registration Successful"
                    );
                }
            );
        }
    }
);

// =====================================
// Debugging
// =====================================

console.log("Debug Started");

debugger;

console.log(events);

// =====================================
// Before Unload
// =====================================

window.onbeforeunload =
    function () {

        return "Unsaved changes may be lost.";
    };