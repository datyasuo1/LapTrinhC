#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int num, res;
	printf("enter a number:");
	scanf("%d", &num);
	res = num % 2;
	if (res == 0)
	printf("the number is even");
	else
	printf("the number is odd");
	
	return 0;
}
