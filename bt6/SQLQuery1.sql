create database company1
go
use company1
go
drop database company1
go

create table brand(
brandid int primary key ,
nameid varchar(50),
address varchar(100),
tel int,
quantity int

)
go
 
 insert into brand values (123,'Asus','USA',832388,2000),
                          (124,'samsung','Korea',55866,3000),
						  (125,'apple','USA',48865,2000),
						  (126,'sony','Korea',64565,9000)
go



create table product(
productid int,
names varchar(50),
description varchar(100),
unit varchar(100),
price int,
quantityavailable int,
brandid int ,
constraint um foreign key (brandid) references brand(brandid)
)
go

insert into product values (1,'laptop','sp moi','chiec',20000000,10,123),
                           (2,'phone','sp moi','chiec',15000000,15,124),
						   (3,'macbook','sp moi','chiec',50000000,10,125),
						   (4,'televition','sp moi','chiec',2000000,15,126),
						   (5,'phone','sp moi','chiec',30000000,10,125) 
go

select * from product
where quantityavailable<11
go


select*from brand
where brandid=123

go



select nameid from brand
go

select nameid from brand
order by nameid DESC

go

select names from product
order by names DESC
go

select * from product
where brandid=123
go

select count (nameid) from brand
go
select count (names)  from product
go

select quantity from brand
go

alter table Product 
add constraint Price  Check (Price > 0)
go

drop table brand
go
 					    

drop table product
go

