create database BookLibrary
go
use BookLibrary
go
create table Book(
BookCode int ,
BookTitle varchar(100) NOT NULL,
Author varchar(50) NOT NULL,
Edition int ,
BookPrice money,
Copies int,
constraint BookCode PRIMARY KEY(BookCode)
)
go

insert into Book values(123,'doraemon','fujio',18,16000,20)
insert into Book values(124,'conan','aoyama gosho',17,14000,15)
insert into Book values(125,'shin','yoshito',16,13000,21)
insert into Book values(126,'one piece','eiichiro oda',22,18000,25)
select * from Book
go

create table Member(
MemberCode int,
Name varchar(50) NOT NULL,
Address varchar(100) NOT NULL,
PhoneNumber int,
constraint MemberCode PRIMARY KEY(MemberCode)
)
go

insert into Member values(01,'dat','thanh hoa',02211321) 
insert into Member values(02,'thanh','ha noi',023211321) 
insert into Member values(03,'tram anh','ha noi',022114521) 
insert into Member values(04,'chi','ho chi minh',022112321) 
select * from Member
go

create table IssueDetails(
BookCode int, 
MemberCode int, 
IssueDate datetime, 
ReturnDate datetime,
CONSTRAINT fk FOREIGN KEY (BookCode) REFERENCES Book(BookCode),
CONSTRAINT ak FOREIGN KEY (MemberCode) REFERENCES Member(MemberCode)
)
go

insert into IssueDetails values (123,01,12,16)
insert into IssueDetails values (124,02,15,20)
insert into IssueDetails values (125,03,18,21)
insert into IssueDetails values (126,04,23,28)
select * from  IssueDetails
go

alter table IssueDetails
drop CONSTRAINT fk,
CONSTRAINT ak

alter table Member
drop constraint MemberCode

alter table Book
drop constraint BookCode

alter table IssueDetails
add constraint MemberCode PRIMARY KEY(MemberCode),
constraint PhoneNumber PRIMARY KEY(PhoneNumber)

alter table Book
add constraint BookCode PRIMARY KEY (BookCode),
constraint BookPrice CHECK (BookPrice <200 and BookPrice>0)

alter table IssueDetails
add CONSTRAINT fk FOREIGN KEY (BookCode) REFERENCES Book(BookCode),
CONSTRAINT ak FOREIGN KEY (BookCode) REFERENCES Member(MemberCode)

alter table IssueDetails
alter column  MemberCode int NOT NULL

alter table IssueDetails
alter column  BookCode int NOT NULL

alter table IssueDetails
add constraint pk primary key( BookCode, MemberCode)


