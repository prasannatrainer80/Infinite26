<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 23-04-2026
  Time: 08:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="menu.jsp" />
    <hr/>
    <form method="post" action="savefeedback">
        <center>
            Student Name :
            <input type="text" name="studentname" />
            <br/><Br/>
            Instructor :
            <select name="instructor">
                <c:forEach var="instructor" items="${instructors}">
                    <option value="${instructor}">${instructor}</option>
                </c:forEach>
            </select> <br/>
            Subject :
            <input type="text" name="subject" /> <br/>
            Fb Value :
            <select name="fbvalue">
                <option value="EXCELLENT">Excellent</option>
                <option value="GOOD">Good</option>
                <option value="ADEQUATE">ADEQUATE</option>
                <option value="INADEQUATE">INADEQUATE</option>
            </select> <br/>
            <input type="submit" value="Add Feedback" />
        </center>
    </form>
</body>
</html>
