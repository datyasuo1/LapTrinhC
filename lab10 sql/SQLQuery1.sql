 create database b1
 go
 use b1
 go
create table Employee(
	EmployeeID int primary key,
	Name varchar(100),
	Tel char(11),
	Email varchar(30)
)
go

insert into Employee values (1, ' Thanh', '0942883190', 'buithanh281002@gmail.com'),
							(2, 'DAT', '0974525739', 'DAT@gmail.com'),
							(3, 'ANH', '0948364825', 'ANH@gmail.com'),
							(4, 'MY', '0974539284', 'MY@gmail.com'),
							(5, 'TRAM ANH', '0973940567', 'TRAMANH@gmail.com'),
							(6, ' Duy Anh', '0928467037', 'nguyenanh@gmail.com')
go

create table Groups(
	GroupID int primary key,
	GroupName varchar(30),
	LeaderID int,
	ProjectID int,
	constraint pid foreign key (ProjectID) references Project(ProjectID)
)
go

insert into Groups values (1, 'BHT', 1, 1),
							(2, 'CDT', 2, 2)
go

create table Project(
	ProjectID int primary key,
	ProjectName varchar(30),
	StartDate datetime,
	EndDate datetime,
	Period int,
	cost money
)
go

insert into Project values (1, 'Chinh Phu Dien Tu', 1/1/2021, 5/1/2021, 4, 1000000000),
							(2, 'Cong Nghiep Dien Tu', 1/1/2021, 5/1/2021, 4, 1000000000)
go

create table GroupDetail(
	GroupID int,
	EmployeeID int,
	Status char(20),
	constraint gid foreign key (GroupID) references Groups(GroupID),
	constraint eid foreign key (EmployeeID) references Employee(EmployeeID)
)
go

insert into GroupDetail values (1, 1, 'improgress'),
								(2, 2, 'done'),
								(1, 3, 'improgress'),
								(2, 4, 'done'),
								(1, 5, 'improgress'),
								(2, 6, 'done')
go

select * from Employee
go

drop table GroupDetail
go

select  y.EmployeeID, y.Name, y.Tel, y.Email, k.EmployeeID, k.GroupID  from Employee y
join GroupDetail as k on y.EmployeeID = k.EmployeeID
Where GroupID = 1
go

Select COUNT(EmployeeID) from GroupDetail
where GroupID = 1

Select COUNT(EmployeeID) from GroupDetail
where GroupID = 2

select y.EmployeeID, y.Name, k.EmployeeID, k.GroupID, k.Status   from Employee y
join GroupDetail as k on y.EmployeeID = k.EmployeeID
where Status ='Done' 
go

select r.*,k.* , y.* from Groups r
join GroupDetail as k on r.GroupID = k.GroupID
join Employee as y on k.EmployeeID = y.EmployeeID
go

select r.*,k.* , y.*,p.* from Employee r
join GroupDetail as k on r.EmployeeID = k.EmployeeID
join Groups as y on k.GroupID = y.GroupID
join Project as p on y.ProjectID = p.ProjectID
Where StartDate <10/12/2021
go

select * from Employee
where Name is not null
go

create unique index IX_Group on GroupDetail(GroupID,EmployeeID)
go

create unique index IX_Project on Project(Projectname,StartDate,EndDate)
go

create procedure duan as
select * from Project
where cost = 
go
exec duan
go

create procedure ketqua as
select y.EmployeeID, y.Name, k.EmployeeID, k.GroupID, k.Status   from Employee y
join GroupDetail as k on y.EmployeeID = k.EmployeeID
where Status ='Done' 
select * from GroupDetail
go
exec ketqua
go

drop proc ketqua
go

create procedure ketqua1 as
select y.EmployeeID, y.Name, k.EmployeeID, k.GroupID, k.Status   from Employee y
join GroupDetail as k on y.EmployeeID = k.EmployeeID
where Status ='improgress' 

exec ketqua1
go

drop Procedure ketqua1
go