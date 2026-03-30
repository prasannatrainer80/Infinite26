select empno, ename, job,sal,comm from Emp;

select empno, ename,job,sal,comm,
CASE WHEN COMM IS NULL THEN 0
ELSE COMM END 'Comm'
from Emp;

select empno, ename,job,sal,comm,
CASE WHEN COMM IS NULL THEN 0
ELSE COMM END 'Comm',
case 
  WHEN COMM IS NULL THEN SAL
  ELSE SAL+COMM 
END 'TakeHome'
from Emp;

