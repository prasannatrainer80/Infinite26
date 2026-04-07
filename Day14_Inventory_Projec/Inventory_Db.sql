drop database if exists inventory;

create database inventory;

use inventory;

create table stock
(
	stockid varchar(30) primary key,
	ItemName varchar(30),
	Price numeric(9,2),
	QuantityAvail INT,
	Status varchar(20) default 'AVAILABLE'
);

Create  table Orders
(
   OrderId varchar(30) primary key,
   StockID varchar(30) References Stock(StockId),
   QtyOrd int,
   billAmount numeric(9,2)
);
   
Create Table Amount
(
  Gamt numeric(9,2)
);

insert into Amount values(0);
