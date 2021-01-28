create database lab10

use AdventureWorks2019
select * into lab10.dbo.WorkOrder from Production.WorkOrder

use lab10
select * into WorkOrderIX from WorkOrder

select * from WorkOrder
select * from WorkOrderIX

create index IX_WorkOrderID on WorkOrderIX(WorkOrderID)

select * from WorkOrder where WorkOrderID=72000

select * from WorkOrderIX where WorkOrderID=72000

create database CodeLean
go

use CodeLean
go

create table classes (
classname char(6),
teacher varchar(30),
timeslot varchar(30),
class int,
lab int
)
go

insert into classes values('hoa','thuan','hai gio',01,1),
                           ('ly','tuan anh','hai gio',02,2),
						   ('anh','hoa','hai gio',03,3),
						   ('toan','thuan','hai gio',04,4)
go

select * from classes
go

create unique clustered index MyClusteredIndex on classes(classname)
go

create nonclustered index TeacherIndex on classes(teacher)
go

drop index TeacherIndex on classes
go

alter index MyClusteredIndex on classes rebuild with(fillfactor=60)
go

create index ClassLabIndex on classes(Class, Lab)
go

exec sp_helpindex 'classes'
go

create database ok10
go

use ok10
go

create table student(
studentno int primary key,
studentname nvarchar(50),
studentaddress nvarchar(100),
phoneno int,
)
go

insert into student values (1,'Pham Thanh Dat','Thanh Hoa',123456),
                           (2,'Bui Huu Thanh','Ha Noi',25665),
						   (3,'Tran Van Duong','Ha Noi',5444898),
						   (4,'Nguyen Hoang Anh','Ha Noi',4458654)
go

select * from student
go

create table department (
deptno int primary key,
deptname varchar (50),
managername nvarchar(30)
)
go

insert into department values (01,'srrk','hoa'),
                              (02,'srrj','hai'),
							  (03,'srrh','thanh'),
							  (04,'srrg','dat')
go

select * from department
go

create table assignment(
assignmentno int primary key,
description nvarchar(100),
)
go

insert into assignment values(12,'hoa lam ve nha'),
                             (23,'ly lam ve nha'),
							 (34,'toan lam ve nha'),
							 (45,'anh lam ve nha')
go

select * from assignment
go

create table works_assign(
jobid int primary key,
studentno int,
assignment int,
totalhours int,
jobdetails nvarchar(450)
constraint lk foreign key (studentno) references student(studentno),
constraint bk foreign key (assignment) references  assignment(assignmentno)
)
go

insert into works_assign values(123,1,12,3,'chua xong'),
                               (234,2,23,4,'chua xong'),
							   (345,3,34,3,'chua xong'),
							   (456,4,45,3,'chua xong')
go

select * from works_assign
go

create clustered IX_Student on student(studentno)
go

alter index IX_student on student rebuild
go

create nonclustered index IX_Dept on department(deptname,managername)
go