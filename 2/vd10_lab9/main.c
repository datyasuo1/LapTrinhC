#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int num;
	labell:
	printf("\nenter a number (1):");
	scanf("%d", &num);
	if (num == 1)
	goto test;
	else
	goto labell;
	test:
	printf("all done....");
	
	return 0;
}
