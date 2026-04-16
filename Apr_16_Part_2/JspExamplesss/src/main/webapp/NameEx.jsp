<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 16-04-2026
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form method="get" action="NameEx.jsp">
    <center>
      Student Name :
        <input type="text" name="sname" /> <br/><br>
        <input type="submit" value="Show" />
    </center>
  </form>
<%
    PrintWriter pw = response.getWriter();
    String sname;
    if (request.getParameter("sname")!=null) {
        sname = request.getParameter("sname");
        pw.println("Student Name is  " +sname);
    }

%>
</body>
</html>
