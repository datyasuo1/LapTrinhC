#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	printf("welcome to agribank\n");
	int ma_the;   
    int ma_pin;
    int chuyen_tien;
    int so_du = 2000;
    int so_tai_khoan;
    int so_tien_chuyen;
    int so_tien_rut;
    int rut_tien;
    int a;
    char ans = 'y';
	printf("xin moi nhap ma the", ma_the);
	scanf("%d", &ma_the);
	fflush(stdin);
	
	if(ma_the == 1234)
	{
		printf("xin moi nhap ma pin", ma_pin);
		scanf("%d", &ma_pin);
		if(ma_pin ==4321)
		{
			printf("moi ban chon 1 trong 2 lua chon\n1 chuyen tien\n2 rut tien\n");
			scanf("%d", &a);
			
			if(a==1)
			{
				printf("xin moi nhap so tai khoan chuyen");
				scanf("%d", &so_tai_khoan);

				printf("so du cua ban la 2000\n");
				
				printf("moi ban nhap so tien can chuyen");
				scanf("%d", &so_tien_chuyen);
				if(so_tien_chuyen<2000)
				{																								
				printf("chuyen tien thanh cong\nso tien con lai la: %d", so_du - so_tien_chuyen);
				}
				else
				printf("so tien chuyen khong hop le");							
			}
			    else 
			    if(a==2)
			    {
				scanf("%d", &rut_tien);
			    printf("nhap so tien can rut", so_tien_rut);
			    scanf("%d", &so_tien_rut);
			    if(so_tien_rut%50==0 && so_tien_rut <1000)
	            { 
				
			    printf("thao tac co the mat phi , ban co muon tiep tuc(y/n)");
			    fflush(stdin);
			    scanf("%d", &ans);
			    if(ans == 'y')
			{
			    printf("rut tien thanh cong\nso tien con lai la:%d", so_du - so_tien_rut);
			}
				else
				printf("huy thao tac thanh cong");
            } 
				else
				printf("so tien khong hon le");
		        }
			    else
			    printf("cam on quy khacd su dung dich vu");
		}
			     else
				printf("ma pin cua ban sai moi nhap lai");
   } 
	else
	printf("ma the ban khong dung ");
	return 0;
}
