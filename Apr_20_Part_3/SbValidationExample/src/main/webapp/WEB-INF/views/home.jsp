<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 20-04-2026
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form method="post" action="save" modelAttribute="employ">
        Employ No :
        <form:input path="empno" />
        <form:errors path="empno" cssStyle="color:red" />
        <br/><br/>
        Employ Name :
        <form:input path="name" />
        <form:errors path="name" cssStyle="color:red" />
        <br/><br/>
        Salary :
        <form:input path="basic" />
        <form:errors path="basic" cssStyle="color:red" />
        <br/><br/>
        <input type="submit" value="Add" />
    </form:form>
</body>
</html>
