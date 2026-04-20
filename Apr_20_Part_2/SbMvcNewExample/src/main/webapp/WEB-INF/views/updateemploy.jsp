<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 20-04-2026
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="updatefinal">
    <center>
        Employ No :
        <input type="number" name="empno" value="${employ.empno}" readonly /> <br/><br/>

        Employ Name :
        <input type="text" name="name" value="${employ.name}" /> <br/><br/>

        Gender :
        <select name="gender">
            <option value="MALE" ${employ.gender == 'MALE' ? 'selected' : ''}>MALE</option>
            <option value="FEMALE" ${employ.gender == 'FEMALE' ? 'selected' : ''}>FEMALE</option>
        </select> <br/><br/>

        Department :
        <input type="text" name="dept" value="${employ.dept}" /> <br/><br/>

        Designation :
        <input type="text" name="desig" value="${employ.desig}" /> <br/><br/>

        Salary :
        <input type="number" name="basic" value="${employ.basic}" /> <br/><br/>

        <input type="submit" value="Update" />
    </center>
</form>
</body>
</html>
