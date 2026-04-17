<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 17-04-2026
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form method="get" action="saveemploy">
    <center>
      Employ Number :
      <input type="number" name="empno" /> <br/><br/>
      Employ Name :
      <input type="text" name="name" /> <br/><br/>
      Gender :
      <select name="gender">
        <option value="MALE">MALE</option>
        <option value="FEMALE">FEMALE</option>
      </select> <br/><br/>
      Department :
      <select name="dept">
        <option value="Dotnet">Dotnet</option>
        <option value="Java">Java</option>
        <option value="Angular">Angular</option>
        <option value="React">React</option>
        </select> <br/><br/>
      Designation :
      <select name="desig">
        <option value="TeamLead">TeamLead</option>
        <option value="Manager">Manager</option>
        <option value="Ceo">Ceo</option>
      </select> <br/><br/>
      Salary :
      <input type="number" name="basic" /> <br/><br/>
      <input type="submit" value="Add Employ" />
    </center>
  </form>
</body>
</html>
