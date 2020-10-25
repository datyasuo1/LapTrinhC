#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
		printf("the number 555.55 in various forms:\n");
	printf("in float from whthout any modifier:\n");
	printf("[%f]\n", 555.55);
	printf("in exponential form without any modifier:\n");
	printf("[%e]\n", 555.55);
	printf("in float form whith - modifier:\n");
	printf("[%-f]\n", 555.55);
	printf(" in float form whith digit string 10.3 as modifier:\n");
	printf("[%10,3f]\n", 555.55);
	printf("in float form with o as modifier:\n");
	printf("[%0f]\n", 555.55);
	printf("in float form with o anh digit string 10.3");
	printf("as modifier:\n");
	printf("[%010.3f]\n", 555.55);
	printf("in float form with -, 0 ");
	printf("and digit string 10.3 as modifier:\n");
	printf("[%-010.3f]\n", 555.55);
	printf("in exponential form with 0");
	printf("and digit string 10.3 as modifier:\n");
	printf("[%010.3e]\n", 555.55);
	printf("in exponential form with -, 0");
	printf("anh degit string 10.3 as modifier:\n");
	printf("[%-010.3e]\n\n", 555.55);
	
	return 0;
}
