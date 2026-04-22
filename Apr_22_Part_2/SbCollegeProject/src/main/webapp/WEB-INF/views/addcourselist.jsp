<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 22-04-2026
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="menu.jsp" /> <hr/>
<form method="post" action="savecourselist">
    <center>
        Course Id :
        <input type="text" name="courseno" /> <br/><br/>
        Duration :
        <input type="number" name="duration" /> <br/><br/>
        Start Date :
        <input type="date" name="startdate" /> <br/><br/>
        End Date :
        <input type="date" name="enddate" /> <br/><br/>
        Head of Department :
        <input type="text" name="hod" /> <br/><br/>
              <input type="submit" value="Add Employ" />
    </center>
</form>
</body>
</html>
