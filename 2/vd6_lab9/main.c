#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int count = 0;
	while (count < 100)
	{
		printf("this goes on forever, help !!!\n");
		count+=10;
		printf("\t%d", count);
		count-=10;
		printf("\t%d", count);
		printf("\Ctrl - C will help");
	}
	return 0;
}
