use infinite26;

-- Display list of tables avaialble in the current database

show tables;

-- Display Info about Dept table 

DESC Dept;

-- Dispaly info about Emp table 

DESC Emp;

-- Display all records from Emp table 

select * from Emp;

-- Display Empno, Ename, job,sal, Deptno from Emp table
-- Projection Operator 

select Empno, Ename, Job, Sal, DeptNo
from Emp ;

-- Display all records whose sal >= 2000 

select * from Emp where sal >= 2000;

-- Display info whose job is 'MANAGER' 

select * from Emp where job='MANAGER';

-- Display info whose Ename is 'WARD' or 'CLARK'
-- or 'JAMES"

select * from EMp where ename='WARD' OR 
Ename='CLARK' OR Ename='JAMES';

-- BETWEEN...AND : Used to display records from 
-- start to end range

select * from Emp where sal between 1000 and 3000;

select * from Emp where sal NOT between 1000 and 3000;

select * from Emp where hiredate between '1980-01-01'
AND '1982-12-31';

-- LIKE : Used to display records w.r.t. Wild Cards 

-- Display records whose name starts with 'S' 

select * from Emp where Ename LIKE 'S%';

-- Display Records whose name ends with 'S' 

select * from Emp where ename LIKE '%S';

-- Display info whose ename starts with J and 5th char is S'

select * from Emp where Ename LIKE 'J___S';

-- IN Clause : Used to check with multiple values of particular attribute

select * from Emp where job IN('CLERK','MANAGER','SALESMAN');

select * from Emp where job 
NOT IN('CLERK','MANAGER','SALESMAN');

select * from Emp where ENAME 
IN('SCOTT','FORD','ADAMS','JAMES');

select * from Emp where ENAME NOT
IN('SCOTT','FORD','ADAMS','JAMES');

-- Order By : Used to display data w.r.t. Specific Field(s) in ascending 
-- or Descending Order 

select Empno,Ename,job,sal,Mgr from Emp 
order By Ename;

select Empno,Ename,job,sal,Mgr from Emp 
order By SAL DESC;

select Empno, Ename, Job, Sal, Mgr 
from Emp ORDER BY JOB, Ename;
