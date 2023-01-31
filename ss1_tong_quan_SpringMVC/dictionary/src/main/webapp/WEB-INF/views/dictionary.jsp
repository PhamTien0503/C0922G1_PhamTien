<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31-01-23
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DICTIONARY</title>
</head>
<body>
<h1>Dictionary</h1>
<form action="/search" method="post">
<h3>Input English</h3>
<input type="text" name="english"><button type="submit">Search</button><br>
<h3>Vietnamese</h3>
<span><h3>${vietnamese}</h3></span><br>
</form>
</body>
</html>
