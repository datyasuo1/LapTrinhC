#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int ma_the, ma_pin, lan_nhap=0, chose, so_du=5000;
    int tien_rut, tai_khoan_chuyen, so_tien_chuyen, ok=0;
    char ans='y', menu;
	printf("chao mung toi ngan hang cua tui<3\n");
	
	printf("xin moi ban nhap ma the :");
	scanf("%d", &ma_the);
	
	if(ma_the == 1234)
{  
	printf("xin nhap ma pin");
	scanf("%d", &ma_pin);
	
	if(ma_pin!=4321)
{
do{
	printf("xin nhap lai ma pin");
    scanf("%d", &ma_pin);
    if(ma_pin==4321)
{
	ok==0;
    printf("ma pin dung\n");
  break;
}
	else
    lan_nhap++;
}while( lan_nhap<=2 );
	{if(ma_pin !=4321)
    printf("tai khoan bi khoa\n");
}
}
	else
{	printf("ma pin dung\n");
    while(menu !=27 ){
    printf("xin moi chon 1 trong 4 muc\n1 rut tien\n2 hien thi so du\n3 chuyen khoan\n4 ket thuc\n");
    scanf("%d", &chose);
    
   if(chose==1)
{
   printf("xin moi nhap so tien can rut");
   scanf("%d", &tien_rut);
   printf("rut tien thanh cong");
   printf("so tien con lai la:%d", so_du-tien_rut);
   printf("an B de ve menu"); 
   menu=getch();
  }
  else if(chose==2)
  {
  	printf("so tien du cua ban la%d\n", so_du);
  	printf("an B de ve menu"); 
  	menu=getch();
  }
  else if(chose==3)
  {
  	printf("xin moi ban nhap tai khoan can chuyen tien");
  	scanf("%d", &tai_khoan_chuyen);
  	printf("moi nhap so tien can chuyen");
  	scanf("%d", &so_tien_chuyen);
  	printf("thao tac nay co the mat phi ban co muon tiep tuc (y or n)");
  	scanf("%s", &ans);
  	if(ans=='y')
  	{
  	if(so_tien_chuyen<5000)
  	{
  	printf("chuyen tien thanh cong");
  	printf("so tien da chuyen di la%d", so_tien_chuyen);
  	printf("\n");
  	printf("so tien con lai la%d", so_du-so_tien_chuyen-20\n);
  	printf("an B de ve menu"); 
  	menu=getch();
	  }
	  else
	  printf("so tien chuyen ko hop le\n");
	  printf("an B de ve menu"); 
	  menu=getch();
  }
  else
  printf("huy giao dich thanh cong\n");
  printf("an B de ve menu"); 
  menu=getch();
}
else if(chose==4)
   printf("thao tav ket thuc cam on da su dung dich vu \n");
   printf("an B de ve menu"); 
   menu=getch(); 
}
}
}
     else
     printf("ma the sai");
	return 0;
}
