<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <style>
            html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}

            .clickable{
                cursor: pointer;
            }
        </style>

    </head>
    <body onload="listen()">

        <header class="w3-container" style="padding-top:22px">
            <h5><b><i class="fa fa-dashboard"></i>National Train System</b></h5>
        </header>

        <div class="w3-row-padding w3-margin-bottom">

            <div class="w3-quarter clickable" onclick="openModel('location');" data-toggle="tooltip" data-placement="bottom" title="Click to see location history">
                <div class="w3-container w3-red w3-padding-16">
                    <div class="w3-left"><i class="fa fa-map-marker w3-xxxlarge" aria-hidden="true"></i></div>
                    <div class="w3-right">
                        <h3 id="location"></h3>
                    </div>
                    <div class="w3-clear"></div>
                    <h4>Location</h4>
                </div>
            </div>

            <div class="w3-quarter clickable" onclick="openModel('speed');" data-toggle="tooltip" data-placement="bottom" title="Click to see speed history">
                <div class="w3-container w3-blue w3-padding-16">
                    <div class="w3-left"><i class="fa fa-dashboard w3-xxxlarge"></i></div>
                    <div class="w3-right">
                        <h3 id="speed"></h3>
                    </div>
                    <div class="w3-clear"></div>
                    <h4>Speed</h4>
                </div>
            </div>

            <div class="w3-quarter clickable" onclick="openModel('temp');" data-toggle="tooltip" data-placement="bottom" title="Click to see temperature history">
                <div class="w3-container w3-teal w3-padding-16">
                    <div class="w3-left"><i class="fa fa-thermometer-empty w3-xxxlarge" aria-hidden="true"></i></div>
                    <div class="w3-right">
                        <h3 id="temp"></h3>
                    </div>
                    <div class="w3-clear"></div>
                    <h4>Temperature</h4>
                </div>
            </div>

            <div class="w3-quarter clickable" onclick="openModel('humidity');" data-toggle="tooltip" data-placement="bottom" title="Click to see humidity history">
                <div class="w3-container w3-orange w3-text-white w3-padding-16">
                    <div class="w3-left"><i class="fa fa-tint w3-xxxlarge" aria-hidden="true"></i></div>
                    <div class="w3-right">
                        <h3 id="humidity"></h3>
                    </div>
                    <div class="w3-clear"></div>
                    <h4>Humidity</h4>
                </div>
            </div>
        </div>


        <!--        All Models -->

        <div class="modal fade" id="MainModle" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="MainModleLable">Modal title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body" id="MainModleBody">

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>


        <script type='text/javascript' src='/NTS_IOT_WEB/dwr/engine.js'></script>
        <script type='text/javascript' src='/NTS_IOT_WEB/dwr/interface/JMSListner.js'></script>
        <script type='text/javascript' src='/NTS_IOT_WEB/dwr/util.js'></script>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" ></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>

        <script>
                $(document).ready(function () {
                    $('[data-toggle="tooltip"]').tooltip();
                });

                function openModel(name) {
                    switch (name) {
                        case "location":
                            $("#MainModleLable").text("Location History");
                            document.getElementById("MainModleBody").innerHTML = location2;
                            $("#MainModle").modal();
                            break;

                        case "speed":
                            $("#MainModleLable").text("Speed History");
                            document.getElementById("MainModleBody").innerHTML = speed;
                            $("#MainModle").modal();
                            break;
                        case "temp":
                            $("#MainModleLable").text("Temprature History");
                            document.getElementById("MainModleBody").innerHTML = temp;
                            $("#MainModle").modal();
                            break;
                        case "humidity":
                            $("#MainModleLable").text("Humidity History");
                            document.getElementById("MainModleBody").innerHTML = humidity;
                            $("#MainModle").modal();
                            break;

                    }
                }


                let location2 = "";
                let speed = "";
                let temp = "";
                let humidity = "";
                function listen() {
                    JMSListner.MessageListner({
                        callback: function (str) {
                            let response = JSON.parse(str);
                            if (str !== "") {
                                let currentLocation = $("#location").text();
                                if (currentLocation !== "") {
                                    location2 = location2 + "<span>" + currentLocation + "</span><br><span>";
                                }
                                let currentSpeed = $("#speed").text();
                                if (currentLocation !== "") {
                                    speed = speed + "<span>" + currentSpeed + "</span><br><span>";
                                }
                                let currentTemp = $("#temp").text();
                                if (currentLocation !== "") {
                                    temp = temp + "<span>" + currentTemp + "</span><br><span>";
                                }
                                let currentHumidity = $("#humidity").text();
                                if (currentLocation !== "") {
                                    humidity = humidity + "<span>" + currentHumidity + "</span><br><span>";
                                }

                            }
                            document.getElementById("temp").innerHTML = response.temp + "<span>&#8451;</span>";
                            $("#humidity").text(response.humidity + " AH");
                            $("#speed").text(response.speed + " Kmp/h");
                            $("#location").text("(" + response.latitude + ", " + response.longitude + ")");
                            listen();
                        }
                    });

                }
        </script>

    </body>
</html>
