<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01-02-23
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List condiment</title>
</head>
<body>
<h1>List condiments</h1>
<c:forEach var="condiment" items="${condiment}">
    ${condiment}<br>
</c:forEach>
</body>
</html>
