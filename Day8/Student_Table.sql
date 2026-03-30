use infinite26;

drop table if exists Student;

Create Table Student
(
   Sno INT Primary Key,
   Name varchar(30),
   Sub1 INT,
   Sub2 INT,
   Sub3 INT,
   Total Numeric(9,2),
   Aveg Numeric(9,2)
);

Insert into Student(sno,name,sub1,sub2,sub3)
values(1,'Mega',88,90,81),
(2,'Kaviya',90,87,88),
(3,'Deva',90,88,78),
(4,'Noorey',81,90,88);

/* Update Total and Aveg Fields */

Update Student Set Total = Sub1 + Sub2 + Sub3,
	Aveg = (Sub1+Sub2+Sub3)/3;
    
Update Student set Name='Atchaya' WHERE Sno=4;

select * from Student;