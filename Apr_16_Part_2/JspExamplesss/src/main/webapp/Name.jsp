<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 16-04-2026
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="get" action="Name.jsp">
        <center>
            First Name :
            <input type="text" name="firstName" /> <br/><br/>
            Last Name :
            <input type="text" name="lastName" /> <br/><br/>
            <input type="submit" value="Show" />
        </center>
    </form>
<%
    if (request.getParameter("firstName") !=null && request.getParameter("lastName") != null) {
            PrintWriter pw = response.getWriter();
            String firstName, lastName;
            firstName = request.getParameter("firstName");
            lastName = request.getParameter("lastName");
            String fullName = firstName + " " +lastName;
            pw.println("Full-Name is  " +fullName);
    }
%>
</body>
</html>
