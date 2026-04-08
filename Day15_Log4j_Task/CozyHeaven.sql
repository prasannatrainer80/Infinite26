DROP DATABASE IF EXISTS CozyHeaven;

CREATE DATABASE CozyHeaven;
USE CozyHeaven;

DROP TABLE ADMIN;
delete from admin where adminid=1;
CREATE TABLE Admin (
	AdminId INT PRIMARY KEY AUTO_INCREMENT,
    AdminName VARCHAR(50) NOT NULL,
    City VARCHAR(20) NOT NULL,
    Email VARCHAR(50) NOT NULL UNIQUE,
    UserName VARCHAR(50) NOT NULL,
    Password VARCHAR(20),
    Mobile BIGINT NOT NULL
);
alter table admin add column roles varchar(10);
desc admin;
update admin set roles = 'ADMIN_ROLE' where adminid=1;
INSERT INTO ADMIN(AdminName, City, Email, UserName, Password, Mobile) values
('Chandini','Tadepalligudem','chandini@gmail.com','chandini','chandini@123','9677150084');

drop table hotel;

CREATE TABLE Hotel (
    HotelId INT PRIMARY KEY AUTO_INCREMENT,
    AdminId INT,
    HotelName VARCHAR(100) NOT NULL,
    HotelType VARCHAR(50) NOT NULL,
    City VARCHAR(30) NOT NULL,
    State VARCHAR(30) NOT NULL,
    Email VARCHAR(50) NOT NULL,
    ContactNumber BIGINT NOT NULL,
    Facilities VARCHAR(100),
    Capacity INT NOT NULL,
    Address VARCHAR(100) NOT NULL,
    FOREIGN KEY (AdminId) REFERENCES Admin(AdminId)
);

INSERT INTO Hotel (HotelName, HotelType, City, State, Email, ContactNumber, Facilities, Capacity, Address) VALUES
('The Taj Mahal Palace', 'Luxury', 'Mumbai', 'Maharashtra', 'taj.mumbai@gmail.com', 9166665656, 'Spa, Pool, Gym, Free Wi-Fi', 300, 'Apollo Bunder, Colaba'),
('The Oberoi', 'Luxury', 'New Delhi', 'Delhi', 'oberoi.delhi@gmail.com', 9111239360, 'Spa, Pool, Gym, Free Wi-Fi, Airport Shuttle', 250, 'Dr. Zakir Hussain Marg'),
('ITC Grand Chola', 'Luxury', 'Chennai', 'Tamil Nadu', 'itc.chennai@gmail.com', 9422239393, 'Spa, Pool, Gym, Free Wi-Fi, Restaurant', 400, 'Anna Salai, Guindy'),
('The Leela Palace', 'Luxury', 'Bengaluru', 'Karnataka', 'leela.bengaluru@gmail.com', 8044440000, 'Spa, Pool, Gym, Free Wi-Fi, Business Center', 350, 'Old Airport Road, Kodihalli'),
('Taj Falaknuma Palace', 'Heritage', 'Hyderabad', 'Telangana', 'falaknuma.hyderabad@gmail.com', 9140662332, 'Spa, Pool, Gym, Free Wi-Fi, Royal Dining', 200, 'Engine Bowli, Falaknuma');

UPDATE hotel set adminid=1 where hotelid=1;
UPDATE hotel set adminid=1 where hotelid=2;
UPDATE hotel set adminid=1 where hotelid=3;
UPDATE hotel set adminid=1 where hotelid=4;
UPDATE hotel set adminid=1 where hotelid=5;
UPDATE hotel set adminid=1 where hotelid=6;

select * from hotel;

CREATE TABLE Customers (
    CustomerId INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Email VARCHAR(50) NOT NULL UNIQUE,
    Password VARCHAR(20) NOT NULL,
    Phone BIGINT NOT NULL,
    Gender VARCHAR(10),
    City VARCHAR(20),
    State VARCHAR(20)
);

INSERT INTO Customers (FirstName, LastName, Email, Password, Phone, Gender, City, State) VALUES
('Arjun', 'Sharma', 'arjun.sharma@gmail.com', 'Arjun@123', 9876543210, 'Male', 'Mumbai', 'Maharashtra'),
('Priya', 'Verma', 'priya.verma@gmail.com', 'Priya@123',8765432109, 'Female', 'Chennai', 'Tamil Nadu'),
('Rohan', 'Patel', 'rohan.patel@gmail.com', 'Rohan@123',9876123456, 'Male', 'Ahmedabad', 'Gujarat'),
('Sneha', 'Reddy', 'sneha.reddy@gmail.com', 'Sneha@123',9176541098, 'Female', 'Hyderabad', 'Telangana'),
('Vikram', 'Singh', 'vikram.singh@gmail.com', 'Vikram@123',9176543219, 'Male', 'Delhi', 'Delhi');

ALTER TABLE customers ADD COLUMN UserName VARCHAR(255);
UPDATE customers SET username = 'arjun' WHERE CustomerId = 1;
UPDATE customers SET username = 'priya' WHERE CustomerId = 2;
UPDATE customers SET username = 'rohan' WHERE CustomerId = 3;
UPDATE customers SET username = 'sneha' WHERE CustomerId = 4;
UPDATE customers SET username = 'vikram' WHERE CustomerId = 5;


select * from customers;

drop table hotelInfo;

CREATE TABLE HotelInfo (
    InfoId INT PRIMARY KEY AUTO_INCREMENT,
    HotelId INT,
    RoomType ENUM('AC', 'NON-AC', 'SUITE', 'DELUXE') NOT NULL,
    NoOfRooms INT NOT NULL,
    Rent DOUBLE NOT NULL,
    RoomSize VARCHAR(20) NOT NULL,
    BedType ENUM('Single', 'Double', 'King') NOT NULL,
    AvailableRooms INT,
    FOREIGN KEY (HotelId) REFERENCES Hotel(HotelId)
);

INSERT INTO HotelInfo (HotelId, RoomType, NoOfRooms, Rent, RoomSize, BedType,AvailableRooms) VALUES
(1, 'AC', 10, 8000.00, 'Medium', 'King', 10),
(1, 'DELUXE', 10, 10000.00, 'Large', 'Double', 10),
(1, 'NON-AC', 15, 5000.00, 'Medium', 'Single', 15),
(1, 'SUITE', 15, 22000.00, 'Large', 'King', 15),
(2, 'DELUXE', 10, 12000.00, 'Large', 'Double', 10),
(2, 'NON-AC', 20, 4500.00, 'Medium', 'Single', 20),
(2, 'AC', 15, 9500.00, 'Medium', 'Double', 15),
(2, 'SUITE', 5, 27000.00, 'Large', 'King', 5),
(3, 'DELUXE', 10, 10000.00, 'Large', 'Double', 10),
(3, 'NON-AC', 15, 3000.00, 'Medium', 'Single', 15),
(3, 'AC', 20, 5000.00, 'Medium', 'Double', 20),
(3, 'SUITE', 15, 15000.00, 'Large', 'King', 15),
(4, 'DELUXE', 10, 9000.00, 'Large', 'Double', 10),
(4, 'NON-AC', 10, 3500.00, 'Medium', 'Single', 10),
(4, 'AC', 15, 7000.00, 'Medium', 'Double', 15),
(4, 'SUITE', 5, 12000.00, 'Large', 'King', 5),
(5, 'DELUXE', 15, 15000.00, 'Large', 'Double', 15),
(5, 'NON-AC', 20, 8500.00, 'Medium', 'Single', 20),
(5, 'AC', 15, 10000.00, 'Medium', 'Double', 15),
(5, 'SUITE', 10, 20000.00, 'Large', 'King', 10);


select * from hotelinfo;

CREATE TABLE Booking (
    BookingId INT PRIMARY KEY AUTO_INCREMENT,
    CustomerId INT,
    InfoId INT,
    BookingStartDate DATE NOT NULL,
    BookingEndDate DATE NOT NULL,
    RoomType VARCHAR(10),
    BedType VARCHAR(10),
    AdvanceAmount DOUBLE NOT NULL,
    BookingDate DATE NOT NULL,
    Comments VARCHAR(30),
    NoOfRooms INT NOT NULL,
    NoOfAdults INT NOT NULL,
    NoOfChildren INT NOT NULL,
    status VARCHAR(10) DEFAULT 'BOOKED',
    FOREIGN KEY (CustomerId) REFERENCES Customers(CustomerId),
    FOREIGN KEY (InfoId) REFERENCES HotelInfo(InfoId)
);


INSERT INTO Booking (CustomerId, InfoId, BookingStartDate, BookingEndDate, RoomType, BedType, AdvanceAmount, BookingDate, Comments, NoOfRooms, NoOfAdults, NoOfChildren) VALUES
(1, 1, '2024-12-15', '2024-12-20', 'AC' , 'KING' , 2000.00, '2024-10-15', 'Vacation', 1, 2, 2),
(1, 1, '2024-09-15', '2024-09-20', 'AC' , 'KING' ,2000.00, '2024-08-28', 'Marriage', 1, 2, 2);

update booking set status='BOOKED' where bookingId=1;

select sum(noofrooms) as noofrooms from booking where infoid=1 and (bookingdate between '2024-12-15' and '2024-12-20') or (bookingstartdate = '2024-12-15') or (bookingenddate = '2024-12-20') ;

select count(*) from booking where infoid=1 and
(bookingstartdate between '2024-09-15' and '2024-12-20') OR (bookingEndDate='2024-09-15') OR (bookingstartDate='2024-09-15');


TRUNCATE Booking;

select * from booking;

drop table payment;

create table payment(
	PaymentId INT PRIMARY KEY AUTO_INCREMENT,
    BookingId INT,
    BillAmount DOUBLE,
    AdvanceAmount DOUBLE,
    NoOfDays INT NOT NULL,
    BalanceAmount INT,
    PaymentDate Date,
    Comments VARCHAR(100),
    FOREIGN KEY (BookingId) REFERENCES Booking(BookingId)
);

truncate payment;

INSERT INTO payment (BookingId, BillAmount, AdvanceAmount, NoOfDays, BalanceAmount)
VALUES 
(1, 8000, 2000, 1, 6000);

drop table refund;

CREATE TABLE Refund(
	refundId INT PRIMARY KEY AUTO_INCREMENT,
    bookingId INT,
    custId INT ,
    RefundAmount INT,
    CancelDate DATE NOT NULL,
    RefundDate DATE NOT NULL,
	FOREIGN KEY(bookingId) references Booking(bookingID),
    FOREIGN KEY(custId) references Customers(customerID)
);

truncate refund;


DROP TABLE reviews;

CREATE TABLE Reviews (
    ReviewId INT PRIMARY KEY AUTO_INCREMENT,
    HotelId INT,
    CustomerId INT,
    Rating INT CHECK (Rating BETWEEN 1 AND 5),
    ReviewText TEXT,
    ReviewDate DATE,
    FOREIGN KEY (HotelId) REFERENCES Hotel(HotelId),
    FOREIGN KEY (CustomerId) REFERENCES Customers(CustomerId)
);


INSERT INTO Reviews (HotelId, CustomerId, Rating, ReviewText, ReviewDate) VALUES
(1, 1, 5, 'Amazing stay with great service. The spa and pool were fantastic!', '2024-08-15'),
(2, 2, 4, 'Beautiful hotel with excellent amenities. The only downside was the slow check-in process.', '2024-08-20'),
(3, 3, 5, 'The food and service were outstanding. Highly recommend this hotel!', '2024-08-22'),
(4, 4, 4, 'Very comfortable stay. The room was spacious, but the Wi-Fi could be faster.', '2024-08-25'),
(5, 5, 5, 'Royal experience! The dining was exceptional and the hotel staff were very attentive.', '2024-08-27');



