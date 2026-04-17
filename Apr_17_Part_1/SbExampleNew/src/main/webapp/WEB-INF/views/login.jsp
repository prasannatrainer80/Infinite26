<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 17-04-2026
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form  action="logincheck">
        <center>
            User Name :
            <input type="text" name="userName" /> <br/><br/>
            Password :
            <input type="password" name="passCode" /> <br/><br/>
            <input type="submit" value="Login" />
        </center>
    </form>
<p style="color:red">${error}</p>
</body>
</html>
