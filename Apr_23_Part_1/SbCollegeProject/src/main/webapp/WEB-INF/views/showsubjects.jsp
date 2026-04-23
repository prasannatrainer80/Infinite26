<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 22-04-2026
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="menu.jsp" /> <hr/>
    <table border="3" align="center">
      <tr>
        <th>Subject Id</th>
        <th>Year</th>
        <th>Instructor</th>
        <th>Subject</th>
        <th>Theory</th>
        <th>Practical</th>
      </tr>
      <c:forEach var="subject" items="${subjects}">
        <tr>
          <td>${subject.subjectid}</td>
          <td>${subject.year}</td>
          <td>${subject.instructor}</td>
          <td>${subject.subject}</td>
          <td>${subject.theory}</td>
          <td>${subject.practical}</td>
        </tr>
      </c:forEach>
    </table>
</body>
</html>
