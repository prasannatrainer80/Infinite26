<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 22-04-2026
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="menu.jsp" /> <hr/>
    <form method="get" action="showsearchcourselist">
        <center>
            <p>Enter Course id :</p>
            <input type="text" name="courseid"> <br/><br/>
            <input type="submit" value="Search">
        </center>
    </form>
</body>
</html>
