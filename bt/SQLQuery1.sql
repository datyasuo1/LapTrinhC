IF EXISTS (SELECT * FROM sys.databases WHERE Name='Example5') DROP DATABASE Example5 
GO 
CREATE DATABASE Example5 
GO 
USE Example5 
GO 
--Tạo bảng Lớp học 
CREATE TABLE LopHoc( 
MaLopHoc INT PRIMARY KEY IDENTITY, 
TenLopHoc VARCHAR(10) 
) 
GO 
CREATE TABLE SinhVien( 
MaSV int PRIMARY KEY, 
TenSV varchar(40), 
MaLopHoc int, 
CONSTRAINT fk FOREIGN KEY (MaLopHoc) REFERENCES LopHoc(MaLopHoc) ) 
GO 
CREATE TABLE SanPham ( 
MaSP int NOT NULL, 
TénP varchar(40) NULL 
) 
GO 
CREATE TABLE StoreProduct( 
ProductID int NOT NULL, 
Name varchar(40) NOT NULL,
INSERT INTO StoreProduct (ProductID, Name) VALUES (111, Rivets)

GO 
CREATE TABLE ContactPhone ( 
Person_ID int IDENTITY(500,1) NOT NULL, 
MobileNumber bigint NOT NULL 
) 
GO 
CREATE TABLE CellularPhone( 
Person_ID uniqueidentifier DEFAULT NEWID() NOT NULL, 
PersonName varchar(60) NOT NULL 
) 
INSERT INTO CellularPhone(PersonName) VALUES('William')
SELECT * FROM CellularPhone  
GO 
UNIQUE CREATE TABLE ContactPhone ( 
Person_ID int PRIMARY KEY, 
MobileNumber bigint UNIQUE, 
ServiceProvider varchar(30), 
LandlineNumber bigint UNIQUE 
) 
INSERT INTO ContactPhone values (101, 983345674, 'Hutch', NULL) INSERT INTO ContactPhone values (102, 983345674, 'Alex', NULL) GO 

CREATE TABLE PhoneExpenses ( 
Expense_ID int PRIMARY KEY, 
MobileNumber bigint FOREIGN KEY REFERENCES ContactPhone (MobileNumber), 
Amount bigint CHECK (Amount >0) 
) 
GO 
ALTER TABLE ContactPhone  
ALTER COLUMN ServiceProvider varchar(45) 
GO 
ALTER TABLE ContactPhone  
DROP COLUMN ServiceProvider  
ALTER TABLE ContactPhone ADD CONSTRAINT CHK_RC CHECK(RentalCharges >0) GO 
ALTER TABLE Person.ContactPhone  
DROP CONSTRAINT CHK_RC 




