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
    <jsp:include page="header.jsp"/>
    <main>
        <div class="left">
            <div class="form-container">
                <form:form method="post" action="save_type_room" modelAttribute="typeRoomEntity">
                    <table>
                        <tr>
                            <td><form:label path="typeRoomName">Type Room Name</form:label></td>
                            <td>
                                <form:input type="text" name="typeRoomName" id="typeRoomName" path="typeRoomName"/>
                                <form:errors path="typeRoomName" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <form:button class="btn btn-warning">Add</form:button>
                            </td>
                        </tr>
                    </table>
                </form:form>
            </div>
        </div>
        <div class="right">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                </tr>
                <c:forEach items="${listTypeRoomEntityList}" var="typeRoomEntity">
                    <tr>
                        <td>${typeRoomEntity.getTypeRoomID()}</td>
                        <td>${typeRoomEntity.getTypeRoomName()}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </main>
</body>
</html>