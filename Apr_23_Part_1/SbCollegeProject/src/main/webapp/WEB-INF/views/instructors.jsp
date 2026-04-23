<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 23-04-2026
  Time: 08:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="instructor" items="${instructors}">
        <c:out value="${instructor}" />
    </c:forEach>
</body>
</html>
