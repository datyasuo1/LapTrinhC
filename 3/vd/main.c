#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int num1;
	int num2;
	int i;
	printf("nhap so 1 :");
	scanf("%d", &num1);
	
	printf("nhap so 2 :");
	scanf("%d", &num2);
	
	for(i = num1; i <= num2; i ++ )
	{	
		if(i%2 !=0)

		  printf("%d\n", i);
	}
	return 0;
}
