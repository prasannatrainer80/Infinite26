drop database if exists jwtexinfinite;

create database jwtexinfinite;

use jwtexinfinite;

create table userdata
( 
   uid int primary key auto_increment,
   name varchar(20),
   email varchar(20),
   password varchar(100),
   roles varchar(40)
);

select * from userdata;