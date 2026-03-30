Data Types : 



&#x09;int, float, numeric(9,2), char, varchar,

&#x09;	date,time,datetime,enum 



Types of commands we have in Database Are



1\) DDL (Data Definition Language) 



&#x09;CREATE : Used to create any database object. 



To Create a Table, 



Create Table Table\_name

(

&#x20;  field1 datatype,

&#x20;  field2 datatype,

&#x20;  field3 datatype,

&#x20;  ...

&#x20;  ...

&#x20;  ...

)



&#x09;ALTER



&#x09;DROP



&#x09;TRUNCATE 



2\) DML (Data Manipulation Language) 



&#x09;INSERT : Used to add records into table.



&#x09; INSERT INTO Table\_name(field1,field2,Field3...)

&#x09;	value(value1,value2,value3)



&#x09;UPDATE : Used to update the table old values with new 

values. 



&#x09;Syntax : Update table\_name set Field1=new\_value,

&#x09;		Field2=New\_value {Where Condition}



&#x09;DELETE : Used to delete the table records 



&#x09;DELETE From Table\_name where condition;





3\) DQL : SELECT



4\) DCL



Lets create a table as Employ



Employ(Empno,Name,Gender,Dept,Desig,Basic) 



&#x09;Empno -> Primary Key (INT)

&#x09;Name -> NOT NULL

&#x09;Dept -> varchar(30) 

&#x20;       Gender -ENUM(MALE,FEMALE)

&#x09;Desig -> varchar(30),

&#x20;       Basic -> Numeric(9,2) Total 9 digits in that 2 decimals are 

&#x09;		there. 



Create a Database As LMS and in that create Employee Table

as parent able and Leave\_History as Child Table



EMP\_ID INT,

EMP\_NAME CHAR(20),

EMP\_MAIL CHAR(30),

EMP\_MOB\_NO varchar(15),

EMP\_DT\_JOIN DATE,

EMP\_DEPT CHAR(25),

EMP\_MANAGER\_ID INT,

EMP\_AVAIL\_LEAVE\_BAL INT



These are the fields are there and table to be created. 



Emp\_ID is Primary Key



EMP\_MANAGER\_ID Must be EMP\_ID 

&#x20;

Create a Table as LEAVE\_HISTORY as



LEAVE\_ID INT PRIMARY KEY AUTO\_INCREMENT,

LEAVE\_NO\_OF\_DAYS INT,

LEAVE\_MNGR\_COMMENTS VARCHAR(200),

EMP\_ID INT FOREIGN KEY,

LEAVE\_START\_DATE DATE NOT NULL, 

LEAVE\_END\_DATE DATE NOT NULL,

LEAVE\_TYPE ENUM ('EL','PL','ML' ) DEFAULT 'EL',

LEAVE\_STATUS ENUM ('PENDING','APPROVED','DENIED') DEFAULT 'PENDING',

LEAVE\_REASON  CHAR(50) NOT NULL,

















