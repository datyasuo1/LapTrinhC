#include <stdio.h>
#include <stdlib.h>
#include <math.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	float a, b, c, p, s;
	printf("nhap canh thu nhat :");
	scanf("%f", &a);
	printf("nhap canh 2 :");
	scanf("%f", &b);
	printf("nhap canh 3 :");
	scanf("%f", &c);
	if((a+b)>c && (a+c)>b && (b+c)>a)
	{p=(a+b+c)/2;
	 s=sqrt(p*(p-a)*(p-b)*(p-c));
	 printf("s= %2f", s);
	}
	else
	{
		printf("so nhap ko hop le");
	}
	return 0;
}
