<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 17-04-2026
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="3" align="center">
        <tr>
            <th>Employ No</th>
            <th>Employ Name</th>
            <th>Gender</th>
            <th>Department</th>
            <th>Designation</th>
            <th>Basic</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="employ" items="${employList}">
            <tr>
                <td>${employ.empno}</td>
                <td>${employ.name}</td>
                <td>${employ.gender}</td>
                <td>${employ.dept}</td>
                <td>${employ.desig}</td>
                <td>${employ.basic}</td>
                <td>
                    <a href="updateemploy?empno=${employ.empno}">Update</a>
                </td>
                <td>
                    <a href="deleteemploy?empno=${employ.empno}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
<a href="addemploy">Add Employ</a>
</html>
