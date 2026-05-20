drop database if exists mailtask;

create database mailtask;

use mailtask;

create table UserData
(
   UserId INT PRIMARY KEY AUTO_INCREMENT,
   FirstName varchar(30),
   LastName varchar(30),
   UserName varchar(30) UNIQUE,
   Password varchar(100),
   Email varchar(30),
   Mobile varchar(30),
   Status varchar(10) default 'FALSE',
   Otp varchar(15)
);