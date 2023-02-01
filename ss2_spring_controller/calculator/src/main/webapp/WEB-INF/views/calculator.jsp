<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01-02-23
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <style>
        input{
            margin: 7px;
        }
    </style>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator" method="post">
<input type="number" name="number1" placeholder="number 1">
<input type="number" name="number2" placeholder="number 2"><br>
<button type="submit" name="action" valueue="+">Addition(+)</button>
<button type="submit" name="action" value="-">Subtraction(-)</button>
<button type="submit" name="action" value="x">Multiplication(x)</button>
<button type="submit" name="action" value="/">Division(/)</button>
</form>
<span><h3>Result: </h3></span>
<span><h4>${result}</h4></span>
</body>
</html>
