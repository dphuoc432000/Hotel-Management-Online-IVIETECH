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
    <link rel="stylesheet" href="<c:url value="/resources/setup-room-type-service.css" />">
</head>
<body>
    <jsp:include page="header.jsp"/>
    <main>
        <div class="btn-container">
            <button onclick="showform()" class="btn btn-them btn-warning">Thêm</button>
        </div>
        <div class="table-container">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Room number</th>
                    <th>Price</th>
                    <th>Size</th>
                    <th>Description</th>
                    <th>Type</th>
                    <th colspan="2">Action</th>
                </tr>
                <c:forEach items="${roomEntityList}" var="roomEntity">
                    <tr>
                        <td>${roomEntity.getRoomID()}</td>
                        <td>${roomEntity.getRoomNumber()}</td>
                        <td>${roomEntity.getPrice()}</td>
                        <td>${roomEntity.getSize()}</td>
                        <td>${roomEntity.getDescription()}</td>
                        <td>${roomEntity.getTypeRoomEntity().getTypeRoomName()}</td>
                        <td><a href="<c:url value="/admin/room/edit_room?roomID=${roomEntity.getRoomID()}"/> ">Edit</a></td>
                        <td><a href="<c:url value="/admin/room/delete_room?roomID=${roomEntity.getRoomID()}"/> ">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div class="layout" onclick="offshowform()"></div>
        <div class="show-form">
        <div class="form-container">
            <form:form method="post" action="save_room" modelAttribute="roomEntity">
                <table>
                    <tr>
                        <td><form:label path="roomNumber">Room Number</form:label></td>
                        <td>
                            <form:input type="text" name="roomNumber" id="roomNumber" path="roomNumber"/>
                            <form:errors path="roomNumber" cssClass="error" />
                        </td>
                    </tr>
                    <tr>
                        <td><form:label path="price">Price</form:label></td>
                        <td>
                            <form:input type="text" name="price" id="price" path="price"/>
                            <form:errors path="price" cssClass="error" />
                        </td>
                    </tr>
                    <tr>
                        <td><form:label path="size">Size</form:label></td>
                        <td>
                            <form:input type="number" name="size" id="size" path="size"/>
                            <form:errors path="size" cssClass="error" />
                        </td>
                    </tr>
                    <tr>
                        <td><form:label path="mainImage">Main Image</form:label></td>
                        <td><form:input type="file" name="mainImage" id="mainImage" accept="image/png, image/jpeg" path="mainImage"/>
                            <form:errors path="mainImage" cssClass="error" /></td>
                    </tr>
                    <tr>
                        <td><form:label path="subImage1">Sub Image</form:label></td>
                        <td><form:input type="file" name="sub-img" id="sub-img" path="subImage1"/>
                            <form:errors path="subImage1" cssClass="error" />
                        </td>
                    </tr>
                    <tr>
                        <td><form:label path="subImage2">Sub Image</form:label></td>
                        <td><form:input type="file" name="sub-img" id="sub-img" path="subImage2"/>
                            <form:errors path="subImage2" cssClass="error" />
                        </td>
                    </tr>
                    <tr>
                        <td><form:label path="subImage3">Sub Image</form:label></td>
                        <td><form:input type="file" name="sub-img" id="sub-img" path="subImage3"/>
                            <form:errors path="subImage3" cssClass="error" />
                        </td>
                    </tr>
                    <tr>
                        <td><form:label path="description">Description</form:label></td>
                        <td><form:textarea name="description" id="description" cols="30" rows="0" cssStyle="resize: none" path="description"/>
                            <form:errors path="description" cssClass="error" />
                        </td>
                    </tr>
                    <tr>
                        <td><form:label path="typeRoomEntity.typeRoomID">Type room</form:label></td>
                        <td>
                            <form:select id="typeRoomEntity.typeRoomID" name="typeRoomEntity.typeRoomID"  path="typeRoomEntity">--%>
                                <form:option value="">Choose a type room</form:option>
                                <c:forEach var="typeRoomEntity" items="${listTypeRoomEntityList}">
                                    <form:option value="${typeRoomEntity.getTypeRoomID()}">${typeRoomEntity.getTypeRoomName()}</form:option>
                                </c:forEach>
                            </form:select>
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
    </main>
    <script src="<c:url value="/resources/setup_service.js"/>"></script>
</body>
</html>