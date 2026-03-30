/* Write a query to display ManagerName as for job
  For CLERK 'Anoop'
  For SALESMAN 'Shwetha'
  For MANAGER 'Navin'
  For ANALYST 'Manoj'
 For President 'No Manager' */
 
 select Empno,Ename,job,sal,
 CASE JOB
   WHEN 'CLERK' THEN 'Anoop'
   WHEN 'SALESMAN' THEN 'Shwetha'
   WHEN 'MANAGER' THEN 'Navin'
   WHEN 'ANALYST' THEN 'Manoj'
   else 'No Manager'
 END 'Manager'
 from Emp;
 