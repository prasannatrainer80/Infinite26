<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 16-04-2026
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="login.jsp">
        <center>
            User Name :
            <input type="text" name="userName" /> <br/><br/>
            Password :
            <input type="password" name="passCode" /> <br/><br/>
            <input type="submit" value="Login" />
        </center>
    </form>
    <%
        if (request.getParameter("userName") !=null && request.getParameter("passCode") != null) {
            PrintWriter pw = response.getWriter();
            String user = request.getParameter("userName");
            String pwd = request.getParameter("passCode");
            if (user.equals("Infinite") && pwd.equals("Infinite")) {

            } else {
                pw.println("Invalid Credentials...");
            }
        }
    %>
</body>
</html>
