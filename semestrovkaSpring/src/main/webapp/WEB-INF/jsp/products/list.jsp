<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
    <link rel="stylesheet" href="../../style/categories.css"/>
    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>

<body>
<div>
    <table>
        <thead>
        <th>walletID</th>
        <th>walletBalance ₽</th>
        <th>walletName</th>
        <th> </th>
        <th> </th>
        </thead>
        <c:forEach items="${products}" var="category">
            <tr>
                <td>${productId}</td>
                <td>${category.price}</td>
                <td>${category.productName}</td>
<%--                <form action="${pageContext.request.contextPath}/allProducts" method="post">--%>
<%--                    <input type="hidden" name="productId" value="${category.id}">--%>
<%--                    <button type="submit">Delete Product</button>--%>
<%--                </form>--%>

                            <td><input type="hidden" name="action" value="delete"/>
                    <button class="deleteBut" type="submit">Delete</button></td>
                <td><input type="hidden" name="action" value="Update"/>
                    <button class="updateBut" type="submit">Update</button></td>

            </tr>
        </c:forEach>
    </table>
    <br>
    <input type="button" value="Add"
        onclick="window.location.href = 'add' "/>
</div>
    <a href="/">Главная</a>
</div>
</body>
</html>



