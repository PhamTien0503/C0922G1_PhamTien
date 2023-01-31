<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31-01-23
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Money</title>
</head>
<body>
<h1>Convert Money</h1>
<form action="convert" method="post">
<h3>USD</h3>
<input type="number" name="usd">
<button type="submit">Convert</button>
</form>
<span><h3>VND:</h3></span>
<span>${vnd}</span>
</body>
</html>
