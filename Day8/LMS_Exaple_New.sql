Drop Database If Exists LmsHexa;

Create Database Lmshexa;

Use LmsHexa;

Create Table Employee
(
   EMP_ID INT PRIMARY KEY,
   EMP_NAME VARCHAR(30) NOT NULL,
   EMP_MAIL VARCHAR(30) NOT NULL,
   EMP_MOB_NO VARCHAR(15) NOT NULL,
   EMP_DT_JOIN DATE NOT NULL,
   EMP_DEPT CHAR(25),
   EMP_MANAGER_ID INT,
   EMP_AVAIL_LEAVE_BAL INT,
   FOREIGN KEY(EMP_MANAGER_ID) 
   REFERENCES EMPLOYEE(EMP_ID)
);

INSERT INTO EMPLOYEE(EMP_ID,EMP_NAME,EMP_MAIL,
EMP_MOB_NO,EMP_DT_JOIN,EMP_DEPT,EMP_MANAGER_ID,
EMP_AVAIL_LEAVE_BAL) VALUES(1000,'Devadarshan',
'Deva@infinite.com','9942345211','2026-01-03',
'JAVA',NULL,12),
(2000,'Kaviya',
'Kaviya@infinite.com','9902122442','2026-01-02',
'JAVA',1000,16),
(3000,'Naveen',
'Naveen@infinite.com','9002113442','2026-03-03',
'Angular',1000,10),
(3001,'Mega',
'Mega@infinite.com','9011232244','2026-03-03',
'React',2000,10),
(3002,'Bawin',
'Bawin@infinite.com','9882255221','2026-03-03',
'Angular',2000,12),
(4001,'Pavithra',
'Pavithra@infinite.com','9006622111','2026-04-04',
'React',3000,16),
(4002,'Balu',
'Balu@infinite.com','9882255221','2026-03-03',
'Angular',3000,12);

Drop Table If Exists Leave_History;

Create Table Leave_History
(
    LEAVE_ID INT AUTO_INCREMENT,
    EMP_ID INT,
    Leave_Start_Date Date,
    Leave_End_Date Date,
    Leave_Type ENUM('EL','PL','ML') DEFAULT 'EL',
    Leave_Status ENUM('PENDING','APPROVED','DENIED') DEFAULT 'PENDING',
    LEAVE_NO_OF_DAYS INT,
    LEAVE_REASON VARCHAR(30),
    LEAVE_MNGR_COMMENTS VARCHAR(200),
    CONSTRAINT pk_LeaveHistory_leaveId Primary Key(LEAVE_ID),
    CONSTRAINT FK_LeaveHistory_LeaveID 
    FOREIGN KEY(EMP_ID) REFERENCES EMPLOYEE(EMP_ID)
);
-- select * from Employee;

INSERT INTO LEAVE_HISTORY(EMP_ID,Leave_Start_Date,Leave_End_Date,
Leave_Type,Leave_Reason) values(1000,'2026-10-10',
'2026-10-15','EL','Going Home'),
(3001,'2026-12-12','2026-12-12','PL','Exams'),
(4002,'2026-12-31','2026-12-31','PL','Celebrations');


