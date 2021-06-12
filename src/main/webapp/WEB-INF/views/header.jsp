<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="utf-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/setup-room.css" />">
</head>
<body>
    <header>
        <div class="logo-container">
            <h1>Logo</h1>
        </div>
        <div class="menu-container">
            <ul>
                <li>
                    <p>Workforce management</p>
                    <ul>
                        <li><a href="">Account</a></li>
                        <li><a href="">Adminstrator</a></li>
                        <li><a href="">Role</a></li>
                    </ul>
                </li>
                <li>
                    <p>Hotel management</p>
                    <ul>
                        <li><a href="<c:url value="/room/setup_room"/> ">Room</a></li>
                        <li><a href="<c:url value="/type_room/setup_type_room"/> ">Type room</a></li>
                        <li><a href="">Service</a></li>
                        <li><a href="">Promotion</a></li>
                    </ul>
                </li>
                <li>
                    <p>Booking management</p>
                    <ul>
                        <li><a href="">Booking</a></li>
                        <li><a href="">Booking Details</a></li>
                        <li><a href="">Customers</a></li>
                        <li><a href="">Card Info</a></li>
                        <li><a href="">Register service</a></li>
                        <li><a href="">Register promotion</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="account-container">
            <div class="username">
                <p>Đức Phước</p>
            </div>
        </div>
    </header>

</body>
</html>