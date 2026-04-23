<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 22-04-2026
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script>
        function loadSubjectDetail() {
            let subject = frmSubject.subject.value;
            if (subject=="PC Architecture") {
                frmSubject.theory.value=42;
                frmSubject.practical.value=14;
            }
            if (subject=="PC Hardware 1") {
                frmSubject.theory.value=90;
                frmSubject.practical.value=50;
            }
            if (subject=="PC Hardware 2") {
                frmSubject.theory.value=69;
                frmSubject.practical.value=41;
            }
            if (subject=="Microprocessor") {
                frmSubject.theory.value=107;
                frmSubject.practical.value=93;
            }
            if (subject=="C#") {
                frmSubject.theory.value=84;
                frmSubject.practical.value=56;
            }
            if (subject=="Data Structures") {
                frmSubject.theory.value=60;
                frmSubject.practical.value=0;
            }
            if (subject=="Operating System") {
                frmSubject.theory.value=80;
                frmSubject.practical.value=70;
            }
            if (subject=="SQL Server") {
                frmSubject.theory.value=66;
                frmSubject.practical.value=34;
            }
            if (subject=="Networking") {
                frmSubject.theory.value=94;
                frmSubject.practical.value=156;
            }

        }
    </script>
    <title>Title</title>
</head>
<body>
<jsp:include page="menu.jsp" /> <hr/>
    <form method="post" action="savesubjects" name="frmSubject">
        <center>
            Year :
            <input type="number" name="year" /> <br/><br/>
            Instructor Name :
            <input type="text" name="instructor" /> <br/><br/>
            Select Subject :
            <select name="subject" onchange="loadSubjectDetail()">
                <option value="Select">Select Subject Here</option>
                <option value="PC Architecture">PC Architecture</option>
                <option value="PC Hardware 1">PC Hardware 1</option>
                <option value="PC Hardware 2">PC Hardware 2</option>
                <option value="Microprocessor">Microprocessor</option>
                <option value="C#">C#</option>
                <option value="Data Structures">Data Structures</option>
                <option value="Operating System">Operating System</option>
                <option value="SQL Server">SQL Server</option>
                <option value="Networking">Networking</option>
            </select> <br/><br/>
            Theory :
            <input type="number" name="theory" /> <br/><br/>
            Practical :
            <input type="number" name="practical" /> <br/><br/>
            <input type="submit" value="Add Subject" />
        </center>
    </form>
</body>
</html>
