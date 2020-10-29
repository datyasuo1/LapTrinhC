#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int num ,a, c;
	printf("nhap so num :");
	scanf("%d", &num);
	printf("bang cuu chuong%d\n", num);
	printf("\n");
	for(a=0; a<=10; a++)
	printf("%d x %d = %d\n", a, num, a*num);
	return 0;
}
