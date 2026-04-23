<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 22-04-2026
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="menu.jsp" /> <hr/>
<center>
    <p>
        Course Id :<b> ${courseListFound.courseno}</b>
    </p>
    <p>
        Duration :<b> ${courseListFound.duration}</b>
    </p>
    <p>
        Start Date :<b> ${courseListFound.startdate}</b>
    </p>
    <p>
        End Date :<b> ${courseListFound.enddate}</b>
    </p>
    <p>
        Head Of Department :<b> ${courseListFound.hod}</b>
    </p>
</center>
</body>
</html>
