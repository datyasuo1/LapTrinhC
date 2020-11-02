#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{int a,b,c;
	printf("Nhap a=");
	scanf("%d",&a);
	printf("\nNhap b=");
	scanf("%d",&b);
	c=b-a;

	if(c==a)
	printf("c=a");
	else if(c==b)
	printf("c=b");
	else
	printf("c#a#b");

	return 0;
}
