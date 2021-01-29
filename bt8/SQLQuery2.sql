CREATE DATABASE Lab11
GO
USE Lab11
GO
CREATE VIEW ProductList
AS
SELECT ProductID, Name FROM AdventureWorks2019.Production.Product
GO
SELECT * FROM ProductList
GO
--Bài 2: Tạo khung nhìn có sử dụng câu lệnh JOIN.
CREATE VIEW SalesOrderDetail
AS
SELECT pr.ProductID, pr.Name, od.UnitPrice, od.OrderQty, od.UnitPrice*od.OrderQty as [Total Price]
FROM AdventureWorks2019.Sales.SalesOrderDetail od
JOIN AdventureWorks2019.Production.Product pr
ON od.ProductID=pr.ProductID
GO
SELECT * FROM SalesOrderDetail
GO
--Bài 3: Viết code theo ví dụ sau
USE AdventureWorks2019
GO
--Tạo khung nhìn lấy ra thông tin cơ bản trong bảng Person.Contact
CREATE VIEW V_Contact_Info AS
SELECT FirstName, MiddleName, LastName
FROM Person.Person
GO
--Tạo khung nhìn lấy ra thông tin về nhân viện
CREATE VIEW V_Employee_Contact AS
SELECT p.FirstName, p.LastName, e.BusinessEntitylD, e.HireDate
FROM HumanResources.Employee e
JOIN Person.Person AS p ON e.BusinessEntitylD = p.BusinessEntitylD ;
GO
--Xem một khung nhìn
SELECT * FROM V_Employee_Contact
GO
--thay đổi khung nhìn V_Employee-Contact băng yiẹt thêm cột Birthdatẹ
ALTER VIEW V_Employee_Contact AS
SELECT p.FirstName, p.LastName, e.BusinessEntitylD, e.HireDate, e.Birthdate
FROM HumanResources.Employee e
JOIN Person.Person AS p ON e.BusinessEntitylD = p.BusinessEntitylD WHERE p.FirstName like '%B%';
GO
--Xóa một khung nhìn
DROP VIEW V_Contact_Info
GO
--Xem đinh nghĩa khung nhìn V_Employee Contact
EXECUTE sp_helptext V_Employee_Contact
--Xem các thành phạn mà khung nhìn phụ thuộc
EXECUTE sp_depends 'V_Employee_Contact'
GO
--Tạo khung nhìn ổn mà định nghĩa bị ẩn đi (không xem được định nghĩa khung nhìn)
CREATE VIEW OrderRejects
WITH ENCRYPTION
AS
SELECT PurchaseOrderlD, ReceivedQty, RejectedQty,
RejectedQty / ReceivedQty AS RejectRatio, DueDate
FROM Purchasing. PurchaseOrderDetail
WHERE RejectedQty / ReceivedQty > 0
AND DueDate > CONVERT(DATETIME,20010630,101) ;
--Không xem được định nghĩa Khung nhìn V_Contact_Info
sp_helptext 'OrderRejects'
GO
--Không xem được định .nghĩa Khung nhìn V_Contact_Info
sp_helptext 'OrderRejects'
GO
--Thay đổi khung nhìn thêm tùy chọn CHECK OPTION
ALTER VIEW V_Employee_Contact AS
SELECT p.FirstName, p.LastName, e.BusinessEntitylD, e.HireDate FROM HumanResources.Employee e
JOIN Person.Person AS p ON e.BusinessEntitylD = p.BusinessEntitylD
WHERE p.FirstName like 'A%' WITH CHECK OPTION
GO
SELECT * FROM V_Employee_Contact
--Cập nhật được khung nhìn khi FirstName bất đầu bằng ký tự 'A'
UPDATE V_Employee_Contact SET FirstName='Atest' WHERE LastName='Amy'
--Không cập nhật được khung nhìn khi FirstName bất đầu bằng ký tự khác'A'
UPDATE V_Employee_Contact SET FirstName='BCD' WHERE LastName='Atest'
GO
--Phải xóa khung nhìn trước
DROP VIEW V_Contact_Info
GO
--Tạo khung nhìn có giản đổ
CREATE VIEW V_Contact_Info WITH SCHEMABINDING AS
SELECT FirstName, MiddleName, LastName, EmailAddress
--Phái xóa khung nhịn trước
DROP VIEW V_Contact_Info
GO
--Tạo khung nhìn có giận đổ
CREATE VIEW V_Contact_Info WITH SCHEMABINDING AS
SELECT FirstName, MiddleName, LastName, EmailAddress
FROM Person.Contact
GO
--Không thể truy, vấn được khung nhìn có tên là V_Contact_Info
select * from V_Contact_Info
GO
--Tạo chỉ mục duy nhạt trên cột EmailAddress trên khung nhìn V_Contact_Info
CREATE UNIQUE CLUSTERED INDEX IX_Contact_Email
ON V_Contact_Info(EmailAddress)
GO
--Thực hiện đổi tên khung nhìn
exec sp_rename V_Contact_Info, V_Contact_Infomation
--Trụy vấn khung nhìn
select * from V_Contact_Infomation
--Không thể thêm bản ghi vào khung nhìn
--vì có cột không cho phép. NULL trọng bạng Contact
INSERT INTO V_Contact_Infomation values ('ABC', 'DEF', 'GHI', 'abc@yahoo.com')
--Không thể xóa bản ghi của khung nhìn V_Contact_Infomation
--vì bảng Person.Contact còn có các khóa ngoại.
DELETE FROM V_Contact_Infomation WHERE LastName='Gilbert' and FirstName='Guy'


create database Book
go

use Book
go

create table BookSold(
	BookSoldID int primary key,
	CustomerID int,
	BookCode int,
	Date datetime,
	Price int,
	Amount int,
	constraint cusid foreign key (CustomerID) references Customer(CustomerID),
	constraint bcode foreign key (BookCode) references Books(BookCode)
)
go

insert into BookSold values (1, 1, 1, 1/29/2021, 20000, 1),
								(2, 1, 2, 2/29/2021, 20000, 2),
								(3, 2, 3, 3/29/2021, 20000, 1),
								(4, 2, 4, 4/29/2021, 20000, 2),
								(5, 3, 5, 5/29/2021, 20000, 1),
								(6, 3, 1, 6/29/2021, 20000, 2),
								(7, 4, 2, 7/29/2021, 20000, 1),
								(8, 4, 3, 8/29/2021, 20000, 2),
								(9, 5, 4, 9/29/2021, 20000, 1),
								(10, 5, 5, 10/29/2021, 20000, 2)
go

create table Customer(
	CustomerID int primary key,
	CustomerName varchar(50),
	Address varchar(100),
	Phone varchar(12)
)
go

insert into Customer values (1, 'Bui Huu Thanh', 'Truong Dinh', '0942883190'),
								(2, 'Chu Duc Tung', 'Luong Khanh Thien', '0946275874'),
								(3, 'Hoang Manh Cuong', 'Thanh Liet', '0986647542'),
								(4, 'Hoang Thanh Trung', 'Giai Phong', '0985746395'),
								(5, 'Pham Thanh Long', 'Minh Khai', '0947569348')
go

create table Books(
	BookCode int primary key,
	Category varchar(50),
	Author varchar(50),
	Publisher varchar(50),
	Title varchar(100),
	Price int,
	InStore int
)
go

insert into Books values (1, 'Toan Hoc', 'Thi', 'Tuoi Tre', 'Toan', 25000, 100),
							(2, 'Vat Ly', 'Thi', 'Tuoi Tre', 'Ly', 25000, 100),
							(3, 'Hoa Hoc', 'Thi', 'Tuoi Tre', 'Hoa', 25000, 100),
							(4, 'Van Hoc', 'Thi', 'Tuoi Tre', 'Van', 25000, 100),
							(5, 'Tieng Anh', 'Thi', 'Tuoi Tre', 'Anh', 25000, 100)
go

create view V_Book as
select p.BookCode, p.Title, p.Price, c.Amount, c.BookCode
from Books p
join BookSold as c on p.BookCode = c.BookCode
go

create view V_Customers as
select CustomerID, CustomerName, Address
from Customer

create view V_CustomersLast as
select a.CustomerID, a.CustomerName, a.Address, e.CustomerID, e.BookCode, d.BookCode, d.Title
from Customer
join BookSold as e on a.CustomerID = e.CustomerID
join Books as d on e.BookCode = d.BookCode
Where Date = '12/2020'

create view V_Cus as
select CustomerName 
from Customer

/ bai 4 /
create table Class(
	ClassCode varchar(10) primary key,
	HeadTeacher varchar(30),
	Room varchar(30),
	TimeSlot char,
	CloseDate datetime
)
go

insert into Class values('TH', 'Khanh', 1, 'A', 10/10/2020),
						('HH', 'Hang', 2, 'B', 10/10/2020),
						('VL', 'Huan', 3, 'C', 10/10/2020),
						('VH', 'Huong', 4, 'D', 10/10/2020),
						('TA', 'Thi', 5, 'G', 10/10/2020),
go

create table Student(
	RollNo varchar(10) primary key,
	ClassCode varchar(10),
	FullName varchar(30),
	Male bit,
	BirthDate datetime,
	Address varchar(30),
	Provide char(2),
	Email varchar(30)
	constraint cc foreign key (ClassCode) references Class(ClassCode)
)
go

insert into Student values ('TH1', 'TH', 'A.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com'),
							('TH2', 'TH', 'B.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com'),
							('TH3', 'HH', 'E.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com'),
							('TH4', 'HH', 'F.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com'),
							('TH5', 'VL', 'I.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com'),
							('TH6', 'VL', 'K.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com'),
							('TH7', 'VH', 'N.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com'),
							('TH8', 'VH', 'O.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com'),
							('TH9', 'TA', 'S.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com'),
							('TH10', 'TA', 'R.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com'),
							('TH11', 'TA', 'C.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh28102@gmail.com'),
							('TH12', 'TA', 'D.Thanh', 1, 10/28/2002, 'Truong Dinh', 'HN', 'buithanh281002@gmail.com')
							


create table Subject(
	SubjectCode varchar(10) primary key,
	SubjectName varchar(40),
	WMark bit,
	PMark bit,
	WTest_per int,
	PTest_per int
)
go

insert into Subject values ('EPC', 'Elementary Programing with C', 1, 1, 1, 1),
							('TCC', 'Toan Cao Cap', 1, 1, 1, 1),
							('TRR', 'Toan Roi Rac', 1, 1, 1, 1),
							('CNC', 'C Nang Cao', 1, 1, 1, 1),
							('LTW', 'Lap Trinh Web', 1, 1, 1, 1),

create table Mark(
	RollNo varchar(10),
	SubjectCode varchar(10),
	WMark float,
	PMark float,
	Mark float,
	constraint rn foreign key (RollNo) references Student(RollNo),
	constraint sc foreign key (SubjectCode) references Subject(SubjectCode),
	constraint rs primary key (RollNo, SubjectCode)
)
go

insert into Mark values ('TH1', 'EPC', 1, 1, 1),
						('TH2', 'EPC', 10, 10, 10),
						('TH3', 'EPC', 1, 1, 1),
						('TH4', 'EPC', 1, 1, 1),
						('TH5', 'EPC', 10, 10, 10),
						('TH6', 'EPC', 1, 1, 1),
						('TH7', 'EPC', 10, 10, 10),
						('TH8', 'EPC', 1, 1, 1),
						('TH9', 'EPC', 10, 10, 10),
						('TH10', 'EPC', 1, 1, 1),
						('TH11', 'EPC', 10, 10, 10),
						('TH12', 'EPC', 10, 10, 10),
						('TH1', 'TCC', 1, 1, 1),
						('TH1', 'TRR', 1, 1, 1),
						('TH3', 'TCC', 1, 1, 1),
						('TH3', 'TRR', 1, 1, 1),
						('TH2', 'CNC', 10, 10, 10),
						('TH4', 'LTW', 10, 10, 10),
						('TH6', 'TCC', 10, 10, 10),
						('TH5', 'TRR', 10, 10, 10)
go

create view V_2sub as
select p.RollNo, p.FullName, e.RollNo, e.Mark
from Student p
join Mark as e on p.RollNo = e.RollNo
where Mark < 4
go

create view V_Fail1 as
select p.RollNo, p.FullName, e.RollNo, e.Mark
from Student p
join Mark as e on p.RollNo = e.RollNo
where Mark < 4
go

create view V_TimeSlotG as
select c.ClassCode, s.ClassCode, s.FullName
from Class c
join Student as s on c.ClassCode = s.ClassCode
go

create view V_EPC as
select 
