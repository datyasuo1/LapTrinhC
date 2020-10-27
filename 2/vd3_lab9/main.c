#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int j, i, max;
	printf("please enter the maxinum value \n");
	printf("for wich a table can be printed");
	scanf("%d", &max);
	for (i = 0, j = max; i <= max; i++, j-- )
	printf("\n%d + %d = %d", i, j, i + j);
	
	return 0;
}
