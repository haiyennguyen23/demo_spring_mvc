<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Quản lí sản phẩm</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
    <a type="button" class="btn btn-info" href="/view/create.jsp">Create</a>
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Img</th>
            <th>Price</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${product}" var="pr">
            <tr class="table-warning">
                <td>${pr.id}</td>
                <td>${pr.name}</td>
                <td><img src="${pr.img}" width="200px" height="200px"></td>
                <td>${pr.price}</td>
                <td><a type="button" class="btn btn-warning" href="/edit?id=${pr.id}">Edit</a></td>
                <td><a type="button" class="btn btn-danger" href="/delete?id=${pr.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%--<a href="/product">Back to list</a>--%>
</body>
</html>

