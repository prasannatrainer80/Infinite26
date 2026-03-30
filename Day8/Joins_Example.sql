desc Dept;

Desc Emp;

select D.Deptno,Dname,Empno,Ename,Job,Sal
from Dept D INNER JOIN EMP E ON 
D.Deptno = E.DeptNo;

select A.AgentID,FirstName,LastName,City,SSN,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A INNER JOIN AgentPolicy AP
ON A.AgentID = AP.AgentID
INNER JOIN Policy P ON P.PolicyID=AP.PolicyID;

-- Apply Left-Join for above tables 

select D.Deptno,Dname,Empno,Ename,Job,Sal
from Dept D LEFT JOIN EMP E ON 
D.Deptno = E.DeptNo;

select A.AgentID,FirstName,LastName,City,SSN,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A LEFT JOIN AgentPolicy AP
ON A.AgentID = AP.AgentID
LEFT JOIN Policy P ON P.PolicyID=AP.PolicyID;

-- Apply Right-Join for above tables

select D.Deptno,Dname,Empno,Ename,Job,Sal
from Dept D RIGHT JOIN EMP E ON 
D.Deptno = E.DeptNo;

select A.AgentID,FirstName,LastName,City,SSN,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A RIGHT JOIN AgentPolicy AP
ON A.AgentID = AP.AgentID
RIGHT JOIN Policy P ON P.PolicyID=AP.PolicyID;

-- Apply Cross Join 

Select * from Dept Cross Join Emp;

-- Self Join 

select E1.Empno 'Manager No',
E1.Ename 'Manager Name',
E2.Empno 'Employ No',
E2.Ename 'Employ Name'
from Emp E1 INNER JOIN Emp E2 ON
E1.Empno = E2.Mgr
Order By E1.empno;