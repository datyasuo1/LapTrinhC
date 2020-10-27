#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int num;
	printf("the even numbers from 1 to 30 are \n");
	for (num = 2; num <= 30 ; num +=2)
	printf("%d", num);
	return 0;
}
