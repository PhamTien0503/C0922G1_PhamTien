<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01-02-23
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choose condiment</title>
    <style>
        input{
            margin-left: 20px;
            margin-bottom: 20px;
        }
        button{
            margin-left: 20px;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<h1>Sandwich condiments</h1>
<form action="/save" method="post">
    <input type="checkbox" id="condiment1" name="condiment" value="Lettuce">
    <lable for="condiment1">Lettuce</lable>
    <input type="checkbox" id="condiment2" name="condiment" value="Tomato">
    <lable for="condiment2">Tomato</lable>
    <input type="checkbox" id="condiment3" name="condiment" value="Mustard">
    <lable for="condiment3">Mustard</lable>
    <input type="checkbox" id="condiment4" name="condiment" value="Sprouts">
    <lable for="condiment4">Sprouts</lable> <br>
    <button type="submit">Save</button>
</form>
</body>
</html>
