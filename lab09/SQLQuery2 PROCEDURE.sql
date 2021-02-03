--cac vi du
use AdventureWorks2019
go
--tao mot thu tuc luu tru lay ra toan bo nhan vien va lam theo na mcos tham so dau vao la mot nam
create procedure sp_DisplayEmplayeeHireYear
@HireYear int
as
select * from HumanResources.Employee
where datepart (YY, HireDate)=@HireYear
exec sp_DisplayEmplayeeHireYear 2003
go

--tao thu tuc luu tru so nguoi vao trong 1 man xac dinh co tham so dau ra la 1 nam,
--tham so dau ra la so nguoi vao lam trong nam nay
create procedure sp_EmployeeHireYearCount
@HireYear int,
@Count int OUTPUT
as
select @Count=COUNT(*) From HumanResources.Employee
Where DatePart (YY, HireDate)=@HireYear
go
--chay thu tuc luu tru can phai truyen vao 1 tham so dau vao va 1 tham so dau ra.
declare @number int
Exec sp_EmployeeHireYearCount 2003, @number OUTPUT
PRINT @Number
go

--tao thu tuc luu tru dem so nguoi vao lam trong 1 nam xac dinh co tha nso dau vao 1 nam , ham tra ve so nguoi vao lam nam do
create procedure sp_EmployeeHireYearCount2
@HireYear int
as
declare @Count int
select @Count=COUNT(*) from HumanResources.Employee
where datepart (YY, HireDate)=@HireYear
return @Count
go
--chay thu tuc luu tru can phai truyen vao 1 tham so dau vao va lay so nguoi lam trong nam do
declare @Number int
exec @Number = sp_EmployeeHireYearCount2 2003
print @Number
go
--tao ban tam #students
create table #students
(
rollno varchar(6) constraint pk students primary key ,
fullname nvarchanr(100),
birthday datetime constraint DF_studentsBirthday default
dateadd(yy, -18, GETDATE)
)
go
--tao thu tuc luu tru tam de chen du lieu vao bang tam 
create procedure #spInsertStudent
@rollno varchar(6),
@fullname nvarchar(100),
@birthday datetime
as begin
if(@birthday is null)
  set @birthday=DATEADD(YY, -18, GETDATE())
  insert into #students (rollno,fullname,birthday)
   value(@rollno,@fullname,@birthday)
end
go
--su dung thu tuc luu tru de chen vao du lieu vao bang tam
exec #spstudents 'A12345', 'abc',Null
exec #spstudents 'A54321', 'abc','12/24/2011'
-
create procedure #spdeletestudents
@rollNo varchar(6), 
@fullName nvarchar(100), 
@birthday datetime 
AS BEGIN 
IF(@birthday IS NULL) 
SET @birthday=DATEADD(YY, -18, GETDATE()) 
INSERT INTO #Students(RollNo, FullName, Birthday) 
VALUES(@rollNo, @fullName, @birthday) 
END 
GO 
--Sử dụng thủ tục lưu trữ để chèn dữ liệu vào bảng tạm EXEC #spStudents 'A12345', 'abc', NULL 
EXEC #spStudents 'A54321', 'abc', '12/24/2011' 
SELECT * FROM #Students 
--Tạo thủ tục lưu trữ tạm để xóa dữ liệu từ bảng tạm theo RollNo CREATE PROCEDURE #spDeleteStudents 
@rollNo varchar(6) 
AS BEGIN 
DELETE FROM #Students WHERE RollNo=@rollNo 
END 
--Xóa dữ liệu sử dụng thủ tục lưu trữ 
EXECUTE #spDeleteStudents 'A12345' 
GO 
--Tạo một thủ tục lưu trữ sử dung lệnh RETURN để trả về một số nguyên CREATE PROCEDURE Cal_Square @num int=0 AS 

Store Procedure Thủ tục lưu trữ BEGIN 
RETURN (@num * @num); 
END 
GO 
--Chạy thủ tục lưu trữ 
DECLARE @square int; 
EXEC @square = Cal_Square 10; 
PRINT @square; 
GO 
--Xem định nghĩa thủ tục lưu trữ bằng hàm OBJECT_DEFINITION 
SELECT  
OBJECT_DEFINITION(OBJECT_ID('HumanResources.uspUpdateEmployeePersonalI nfo')) AS DEFINITION 
--Xem định nghĩa thủ tục lưu trữ bằng 
SELECT definition FROM sys.sql_modules 
WHERE  
object_id=OBJECT_ID('HumanResources.uspUpdateEmployeePersonalInfo') GO 
--Thủ tục lưu trữ hệ thống xem các thành phần mà thủ tục lưu trữ phụ thuộc 
sp_depends 'HumanResources.uspUpdateEmployeePersonalInfo' GO 
USE AdventureWorks 
GO 
--Tạo thủ tục lưu trữ sp_DisplayEmployees 
CREATE PROCEDURE sp_DisplayEmployees AS 
SELECT * FROM HumanResources.Employee 
GO 

Store Procedure Thủ tục lưu trữ --Thay đổi thủ tục lưu trữ sp_DisplayEmployees 
ALTER PROCEDURE sp_DisplayEmployees AS 
SELECT * FROM HumanResources.Employee 
WHERE Gender='F' 
GO 
--Chạy thủ tục lưu trữ sp_DisplayEmployees 
EXEC sp_DisplayEmployees 
GO 
--Xóa một thủ tục lưu trữ 
DROP PROCEDURE sp_DisplayEmployees 
GO 
-- 
CREATE PROCEDURE sp_EmployeeHire 
AS 
BEGIN 
--Hiển thị 
EXECUTE sp_DisplayEmployeesHireYear 1999 
DECLARE @Number int 
EXECUTE sp_EmployeesHireYearCount 1999, @Number OUTPUT 
PRINT N'Số nhân viên vào làm năm 1999 là: ' +  
CONVERT(varchar(3),@Number) 
END 
GO 
--Chạy thủ tục lưu trữ 
EXEC sp_EmployeeHire  
GO 
--Thay đổi thủ tục lưu trữ sp_EmployeeHire có khối TRY ... CATCH ALTER PROCEDURE sp_EmployeeHire 
@HireYear int 

Store Procedure Thủ tục lưu trữ AS 
BEGIN 
BEGIN TRY 
EXECUTE sp_DisplayEmployeesHireYear @HireYear 
DECLARE @Number int 
--Lỗi xảy ra ở đây có thủ tục sp_EmployeesHireYearCount chỉ truyền 2 tham số mà ta truyền 3 
EXECUTE sp_EmployeesHireYearCount @HireYear, @Number OUTPUT,  '123' 
PRINT N'Số nhân viên vào làm năm là: ' +  
CONVERT(varchar(3),@Number) 
END TRY 
BEGIN CATCH 
PRINT N'Có lỗi xảy ra trong khi thực hiện thủ tục lưu trữ' END CATCH 
PRINT N'Kết thúc thủ tục lưu trữ' 
END 
GO 
--Chạy thủ tục sp_EmployeeHire 
EXEC sp_EmployeeHire 1999 
--Xem thông báo lỗi bên Messages không phải bên Result GO 
--Thay đổi thủ tục lưu trữ sp_EmployeeHire sử dụng hàm @@ERROR ALTER PROCEDURE sp_EmployeeHire 
@HireYear int 
AS 
BEGIN 
EXECUTE sp_DisplayEmployeesHireYear @HireYear 
DECLARE @Number int 
--Lỗi xảy ra ở đây có thủ tục sp_EmployeesHireYearCount chỉ truyền 2 tham số mà ta truyền 3 

Store Procedure Thủ tục lưu trữ EXECUTE sp_EmployeesHireYearCount @HireYear, @Number OUTPUT,  '123' 
IF @@ERROR <> 0 
PRINT N'Có lỗi xảy ra trong khi thực hiện thủ tục lưu trữ' 
PRINT N'Số nhân viên vào làm năm là: ' +  
CONVERT(varchar(3),@Number) 
END 
GO 
--Chạy thủ tục sp_EmployeeHire 
EXEC sp_EmployeeHire 1999 


create table toys(
productcode varchar(50) primary key,
names varchar(30),
category varchar(30),
manufacturer varchar(40),
agerange varchar(15),
unitprice money,
netweight int,
qtyonhand int
)
go

drop table toys
go

INSERT INTO toys VALUES ('TA012','Barbie Fashionistas Doll 2','Doll','ABC COMPANY','3-9',10,125,50),
						 ('TX125','LEGO Star Wars','LEGO','LEGO COMPANY','3-12',25,400,30),
						 ('TE025','Pokemon Sword Shield 5','CARD','POKEMON COMPANY','6-12',30,325,85),
						 ('TW325','Step2 Timeless Trends Kitchen','KITCHEN','STEP COMPANY','3-12',125,1200,56),
						 ('XR025','Kid Connection Juinor Doctor','DOCTOR','STEP COMPANY','3-12',66,400,38),
						 ('MT125','CAR RACING','RACING CONTROLLER','LEGO COMPANY','3-12',25,400,96),
						 ('RT325','UNO','CARD ','ABC COMPANY','6-18',6,350,80),
						 ('AM032','TEDDY BEAR','STUFFED ANIMAL','TOY COMPANY','2-12',600,356,120),
						 ('RF025','LEGO AVENGERS','LEGO','LEGO COMPANY','3-12',65,362,80),
						 ('OP256','LEGO CREATOR','LEGO','LEGO COMPANY','3-12',25,129,52),
						 ('PL632','Barbie Fashionistas Doll 3','Doll','ABC COMPANY','3-9',15,156,140),
						 ('KL023','SHIP RACING','RACING CONTROLLER','TOY COMPANY','6-12',852,652,75),
						 ('IO025','LEGO Star Wars2','LEGO','LEGO COMPANY','3-12',365,458,65),
						 ('KI236','LEGO Star Wars3','LEGO','LEGO COMPANY','3-12',925,463,35),
						 ('ML559','LEGO Star Wars4','LEGO','LEGO COMPANY','3-12',525,856,46)
go

select * from toys
go

create procedure heavytoys
as
select * from toys
where 

exec heavytoys
go

create procedure priceincrease 
as
select * from toys
update toys
set unitprice = unitprice+10
go

exec priceincrease
go

create procedure qtyonhand
as
select * from toys
update toys
set qtyonhand =qtyonhand-5
go

exec qtyonhand
go
exec SP_helptext 'HeavyToys'
go

exec SP_helptext 'PriceIncrease'
go

exec SP_helptext 'QtyOnHand'
go

select OBJECT_DEFINITION ( OBJECT_ID('HeavyToys'))
go

select OBJECT_DEFINITION ( OBJECT_ID('PriceIncrease'))
go

select OBJECT_DEFINITION ( OBJECT_ID('QtyOnHand'))
go


SELECT definition FROM sys.sql_modules WHERE object_id = OBJECT_ID('HeavyToys')
go

SELECT definition FROM sys.sql_modules WHERE object_id = OBJECT_ID('PriceIncrease')
go

SELECT definition FROM sys.sql_modules WHERE object_id = OBJECT_ID('QtyOnHand');
go

exec sp_depends 'HeavyToys'
go

exec sp_depends 'PriceIncrease'
go

exec sp_depends 'QtyOnHand'
go

alter procedure PriceIncreace as
update Toys Set UnitPrice = UnitPrice + 10000
go
select * from Toys 
go

alter procedure QtyOnHand as
select * from Toys 
update Toys 
set QtyOnHand = QtyOnHand - 5
go
select * from Toys 
go

create Procedure SpecificPriceIncrease as
update Toys set UnitPrice = UnitPrice + QtyOnHand
go
select * from Toys 
go

alter procedure SpecificPriceIncrease 
	@number int output
as 
update Toys set UnitPrice = UnitPrice + QtyOnHand
select ProductCode, Name, UnitPrice as Price, QtyOnHand from Toys
where QtyOnHand >0
select @number = @@ROWCOUNT
go
declare @num int 
Exec SpecificPriceIncrease
@num output
print @num

alter procedure SpecificPriceIncrease 
@number int output
as
update Toys set UnitPrice = UnitPrice + QtyOnHand
select ProductCode, Name, UnitPrice 
as Price, QtyOnHand 
from Toys 
where QtyOnHand > 0
select @number = @@ROWCOUNT
exec HeavyToys

drop procedure SpecificPriceIncrease
go