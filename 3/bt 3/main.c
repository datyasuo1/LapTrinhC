#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int num1=1, num2=2, num3, i, a;
	printf("nhap phan tu cua day");
	scanf("%d", &i);
	
	printf("in ra 2 so\n %d", num1, num2);

	for(a=3; a<i; a++)
	{
	num3=num1+num2;
	printf("%d", num3);
	num1=num2;
	num2=num3;
}
	return 0;
}
