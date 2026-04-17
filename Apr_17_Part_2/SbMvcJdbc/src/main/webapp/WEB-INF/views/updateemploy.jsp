<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 17-04-2026
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="updatefinal">
        <center>
            Employ No :
            <input type="number" name="empno" value="${employFound.empno}"
                        readonly
                    /> <br/><br/>
            Employ Name :
            <input type="text" name="name" value="${employFound.name}" />
                    <br/><br/>
            Gender :
            <input type="text" name="gender" value="${employFound.gender}" />
            <br/><br/>
            Department :
            <input type="text" name="dept" value="${employFound.dept}" />
            <br/><br/>
            Designation :
            <input type="text" name="desig" value="${employFound.desig}" />
            <br/><br/>
            Basic :
            <input type="number" name="basic" value="${employFound.basic}" />
            <br/><br/>
            <input type="submit" value="Update" />
        </center>
    </form>
</body>
</html>
