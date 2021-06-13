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
    <link rel="stylesheet" href="<c:url value="/resources/setup-room-type-service.css"/> ">
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
                    <th>Title</th>
                    <th>Description</th>
                    <th>Unit</th>
                    <th>Price</th>
                    <th colspan="2">Action</th>
                </tr>
                <c:forEach items="${serviceEntityList}" var="serviceEntity">
                    <tr>
                        <td>${serviceEntity.getTitle()}</td>
                        <td>${serviceEntity.getDescription()}</td>
                        <td>${serviceEntity.getUnit()}</td>
                        <td>${serviceEntity.getPrice()}</td>
    <%--                    <td><a id="${serviceEntity.getServiceID()}" onclick="reply_click(this.id)" href="">Edit</a></td>--%>
                        <td><a href="<c:url value="/admin/service/edit_service?serviceID=${serviceEntity.getServiceID()}"/>">Edit</a></td>
                        <td><a href="<c:url value="/admin/service/delete_service?serviceID=${serviceEntity.getServiceID()}"/>">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div class="layout" onclick="offshowform()"></div>
        <div class="show-form">
            <div class="form-container">
                <form:form method="post" action="save_service" modelAttribute="serviceEntity">
                    <table>
                        <tr>
                            <td><form:label path="title">Title</form:label></td>
                            <td>
                                <form:input type="text" name="title" id="title" path="title"/>
                                <form:errors path="title" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td><form:label path="description">Description</form:label></td>
                            <td><form:textarea name="description" id="description" cols="30" rows="0" cssStyle="resize: none" path="description"/>
                                <form:errors path="description" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td><form:label path="unit">Size</form:label></td>
                            <td>
                                <form:input type="text" name="unit" id="unit" path="unit"/>
                                <form:errors path="unit" cssClass="error" />
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