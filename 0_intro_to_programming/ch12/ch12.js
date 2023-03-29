//sets the speed of the train later in the code
var trainSpeed = 250;

//sets the start position of the train
var trainPosition = 0;

var animation;

//makes the train able to detect whether it has been clicked on
var train = document.getElementById("train");
train.addEventListener("click", speedUp);

//makes the stop button able to function
var stopButton = document.getElementById("stopButton");
stopButton.addEventListener("click", stopTrain);


function speedUp() {
    if (trainSpeed > 10) {
        trainSpeed -= 10;
    }
    console.log("train speed: " + trainSpeed);

    clearInterval(animation);
    animation = setInterval(frame, trainSpeed);

    function frame() {
        trainPosition += 2;
        train.style.left = trainPosition + 'px';
        console.log(trainPosition);
        checkPosition(trainPosition);
    }
}

function checkPosition(currentPosition) {
    if (currentPosition > 260) {
        alert("Crash!");
        console.log("Crash!");
        clearInterval(animation);
    }
}

function stopTrain() {
    clearInterval(animation);
    console.log("Whew! That was close!");
}