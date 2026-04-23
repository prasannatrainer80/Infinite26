drop database if exists college;

create database college;

use college;

create table CourseList
(
   courseno varchar(15) primary key,
   duration int,
   startDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   endDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   HOD varchar(30)
);

Drop Table Subjects;

create table subjects
(
   subjectid INT AUTO_INCREMENT Primary Key,
   year int,
   instructor varchar(28),
   subject varchar(150),
   theory int,
   practical int
);

drop table Feedback;

create table Feedback
(
   FID int AUTO_INCREMENT primary key ,
   StudentName varchar(30),
   instructor varchar(30),
   subject varchar(30),
   FbValue ENUM('EXCELLENT','GOOD','ADQUATE','INADEQUATE')
);