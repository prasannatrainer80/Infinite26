-- SELECT * FROM infinite26.employ;

Create Table Login
(
   userName varchar(30) Primary Key,
   passCode varchar(30) NOT NULL
);

Insert into Login(UserName,Passcode)
values('Balu','Venkat'),
('Mega','Mega'),
('Dhivya','Sundar');