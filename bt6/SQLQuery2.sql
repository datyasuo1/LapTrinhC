create database data1
go 

use data1
go

create table information(
customerid int,
names varchar(50),
tel int,
address varchar(100),
subscription varchar (50),
RegistrationDate varchar(100),
identitycard int
)
go

drop table information
go

insert into information values (1,'Pham Thanh Dat',0123456789,'Thanh Hoa','tra truoc',12/25/2021,5848415),
                              (2,'Nguyen Hoang Anh',234567891,'Thanh Hoa','tra truoc',12/12/2021,5455818),
							  (3,'Bui Huu Thanh',5448515,'Ha Noi','tra truoc',02/25/2020,22144888),
							  (4,'Nguyen Hoang Tram Anh',59799964,'Ha Noi','tra truoc',12/25/2021,123456789)
go

select * from information
where tel=0123456789
go

select names from infomation
go

select tel from information
go

select * from information
where identitycard=123456789
go
Conversion failed when converting the varchar value 'Thanh Hoa' to data type int.
select tel from information
where identitycard=123456789
go

select tel from information
where address = 12/12/2021
go
