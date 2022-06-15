<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
<div>
    <form method="post">
        <h2>${errorMsg}</h2>
        <label for="name">Name</label>
        <input type="text" name="name" id="name" required>
        <label for="lastname">LastName</label>
        <input type="text" name="lastname" id="lastname" required>
        <label for="email">Email</label>
        <input type="text" name="email" id="email" required>
        <label for="username">Username</label>
        <input type="text" name="username" id="username" required>

        <input type="submit" value="Register">

        <a href="/user/list">Users' list</a>
    </form>
</div>
</body>