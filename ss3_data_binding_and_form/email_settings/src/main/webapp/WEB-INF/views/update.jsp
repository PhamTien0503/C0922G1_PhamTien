<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02-02-23
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Settings</title>
</head>
<body>
<h1>Settings</h1>
<form:form modelAttribute="setting" action="/update" method="post">
    <table>
        <tr>
            <td style="background-color: aqua">Languages:</td>
            <td><form:select items="${languages}" path="language"></form:select></td>
        </tr>
        <tr>
            <td style="background-color: aqua">Page size:</td>
            <td>
                <span>Show</span>
                <span><form:select items="${pageSize}" path="pageSize"></form:select></span>
                <span>emails per page</span>
            </td>
        </tr>
        <tr>
            <td style="background-color: aqua">Spams filter:</td>
            <td>
                <span><form:checkbox path="spamFilter"></form:checkbox></span>
                <span>Enable spams filter</span>
            </td>
        </tr>
        <tr>
            <td style="background-color: aqua">Signature</td>
            <td><form:textarea path="signature" rows="3"></form:textarea></td>
        </tr>
        <tr>
            <td><form:button>Update</form:button></td>
            <td><form:button>Cancel</form:button></td>
        </tr>
    </table>
    <form:hidden path="id" value="${setting.id}"></form:hidden>
    <form:hidden path="nameSetting" value="${setting.nameSetting}"></form:hidden>
</form:form>
</body>
</html>
