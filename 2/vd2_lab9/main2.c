#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int num;
	printf("the even number from 1 to 25 are : \n\n");
	for (num=2; num <= 25; num+=2)
	printf("%d\n",num);
	return 0;
}
