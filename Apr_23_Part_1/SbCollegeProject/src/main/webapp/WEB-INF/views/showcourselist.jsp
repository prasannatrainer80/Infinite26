<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 22-04-2026
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="menu.jsp" /> <hr/>
<table border="3" align="center">
    <tr>
        <th>Course No</th>
        <th>Duration</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Hod</th>
    </tr>
    <c:forEach var="course" items="${courseList}">
        <tr>
            <td>${course.courseno}</td>
            <td>${course.duration}</td>
            <td>${course.startdate}</td>
            <td>${course.enddate}</td>
            <td>${course.hod}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
