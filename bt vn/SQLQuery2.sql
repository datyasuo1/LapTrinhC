CREATE TABLE DonDatHang(
MaSoDonHang int,
NguoiDatHang nvarchar (30),
DiaChi nvarchar( 50),
DienThoai int,
NgayDatHang datetime ,
)
GO
INSERT INTO DonDatHang (MaSoDonHang, NguoiDatHang,DiaChi,DienThoai,NgayDatHang) 
VALUES (1, 'Nguyen Van An', '111 Nguyen Trai, Thanh Xuan , Ha Noi', 9877454321 ,'11/18/09' ),
       (2, 'Nguyen Van Ha', '121 Nguyen Trai, Thanh Xuan , Ha Noi', 98765543421 ,'10/13/09' ),
       (3, 'Nguyen Van Nam','112 Nguyen Trai, Thanh Xuan , Ha Noi', 98765434261 ,'12/18/09' )
GO
SELECT * FROM DonDatHang
GO

CREATE TABLE DanhSachHang(
STT int,
TenHang nvarchar (300),
MoTaHang nvarchar (300),
DonVi varchar (200),
Gia int,
SoLuong int,
ThanhTien int,
)
GO
INSERT INTO  DanhSachHang (STT, TenHang, MoTaHang, DonVi, Gia,SoLuong,ThanhTien) 
	VALUES (1,'May Tinh T450', 'May nhap moi ', 'Chiec', 1000, 1,1000),
	 (2, 'Dien Thoai Nokia5670', 'Dien thoai dang hot', 'Chiec',200,2,400),
	(3,'May In SamSung450', 'May in dang e','Chiec', 100,1,100)
GO

SELECT * FROM DanhSachHang
GO

SELECT Sum(ThanhTien) AS "Tong Tien"
FROM DanhSachHang
GO

drop table DonDatHang
go
drop table DanhSachHang
go

select distinct NguoiDatHang from DonDatHang
select distinct TenHang from DanhSachHang
select distinct MasoHang from DonDatHang
