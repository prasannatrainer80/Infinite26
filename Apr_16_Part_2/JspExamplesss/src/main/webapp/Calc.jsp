<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 16-04-2026
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="get" action="Calc.jsp">
        <center>
            First Number :
            <input type="number" name="firstNo" /> <br/><br/>
            Second Number :
            <input type="number" name="secondNo" /> <br/><br/>
            <input type="submit" value="Calculation" />
        </center>
    </form>
<%
    if (request.getParameter("firstNo") !=null && request.getParameter("secondNo") !=null) {
        PrintWriter pw = response.getWriter();
        int firstNo, secondNo, result;
        firstNo = Integer.parseInt(request.getParameter("firstNo"));
        secondNo = Integer.parseInt(request.getParameter("secondNo"));
        result = firstNo + secondNo;
        pw.println("Sum is  " + result + "<br/>");
        result = firstNo - secondNo;
        pw.println("Sub is  " + result + "<br/>");
        result = firstNo * secondNo;
        pw.println("Mult is  " + result + "<br/>");
    }
%>
</body>
</html>
