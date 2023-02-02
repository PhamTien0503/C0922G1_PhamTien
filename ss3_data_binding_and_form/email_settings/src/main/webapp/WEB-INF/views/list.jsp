<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02-02-23
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setting List</title>
</head>
<body>
<h1>List Settings</h1>
<h3 style="color: red">${mess}</h3>
<table border="1">
    <tr style="color: black;background-color: blue">
        <th>ID</th>
        <th>Name</th>
        <th>Language</th>
        <th>Page Size</th>
        <th>Spam filter</th>
        <th>Signature</th>
        <th>Edit</th>
    </tr>
    <c:forEach var="setting" items="${settingList}">
        <tr>
            <td>${setting.id}</td>
            <td>${setting.nameSetting}</td>
            <td>${setting.language}</td>
            <td>${setting.pageSize}</td>
            <td>${setting.spamFilter}</td>
            <td>${setting.signature}</td>
            <td>
                <button type="submit"><a href="/update?id=${setting.id}">Update</a></button>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
