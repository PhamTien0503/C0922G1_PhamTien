<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31-01-23
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>name</th>
        <th>age</th>
    </tr>
    <c:forEach var="student" items="${studentList}">
       <tr>
        <td>${student.name}</td>
        <td>${student.age}</td>
       </tr>
    </c:forEach>
</table>
</body>
</html>
