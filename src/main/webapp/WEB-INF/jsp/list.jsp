<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List</title>
</head>
<body>
<div>
    <c:forEach items="${users}" var="user">
        <p>${user.firstName}</p>
    </c:forEach>
</div>
</body>