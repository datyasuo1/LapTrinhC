#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int x,y;
	printf("Nhap x=");
	scanf("%d",&x);
	printf("\nNhap y=");
	scanf("%d",&y);

	if(x>3000||x<2000)
	printf("\nx=%d",x);
	if(y>=100&&y<=500)
	printf("\ny=%d",y);
	return 0;
}
