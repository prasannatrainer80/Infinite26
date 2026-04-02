select Job,sum(sal) from Emp Group BY Job
HAVING SUM(SAL) > 5000;

select job, avg(sal) from Emp Group By Job;

select job,max(sal) from Emp group by job
Having MAX(SAL) > 2000;

select job,min(sal) from Emp Group By Job;

select job, count(*) From Emp Group By Job
HAVING COUNT(*) > 1;

