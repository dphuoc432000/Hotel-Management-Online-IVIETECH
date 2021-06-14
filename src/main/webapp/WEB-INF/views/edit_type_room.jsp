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
    <link rel="stylesheet" href="<c:url value="/resources/edit-room-type-service.css" />">
</head>
<body>
    <jsp:include page="header.jsp"/>
    <main>
        <div class="left">
            <div class="form-container">
                <form:form method="post" action="save_edit_type_room" modelAttribute="typeRoomEntity">
                    <table>
                        <tr style="display: none">
                            <td><form:label path="typeRoomID">ID</form:label></td>
                            <td>
                                <form:input type="text" name="typeRoomID" id="typeRoomID" value="${typeRoomEntity.getTypeRoomID()}" path="typeRoomID"/>
                                <form:errors path="typeRoomID" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td><form:label path="typeRoomName">Type name</form:label></td>
                            <td>
                                <form:input type="text" name="typeRoomName" id="typeRoomName" value="${typeRoomEntity.getTypeRoomName()}" path="typeRoomName"/>
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
                    <td>${typeRoomEntity.getTypeRoomID()}</td>
                </tr>
                <tr>
                    <th>Type room name</th>
                    <td>${typeRoomEntity.getTypeRoomName()}</td>
                </tr>

            </table>
            <a href="<c:url value="/admin/type_room/setup_type_room"/>" class="return">Return a page</a>
        </div>
    </main>



</body>
</html>