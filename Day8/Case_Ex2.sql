select * from Dept;

-- Write a Query, as For dname field as
 -- For 'ACCOUNTING' HEADoFFICE as 'Hyderabad'
--  For 'RESEARCH' HeadOffice as 'Delhi'
--  For 'SALES' headOffice as 'PUNE'
--  For 'OPERATIONS' headOffice as 'Mumbai'

select deptno,dname,loc,
case dname
   WHEN 'ACCOUNTING' THEN 'Hyderabad'
   WHEN 'RESEARCH' THEN 'Delhi'
   WHEN 'SALES' THEN 'Pune'
   WHEN 'OPERATIONS' THEN 'Mumbai'
end 'HeadOffice'
 from Dept;
