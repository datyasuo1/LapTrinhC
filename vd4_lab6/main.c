#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	printf(" a string in various forms:\n");
	printf("without any format command:\n");
	printf("good day Mr. Lee. \n");
	printf("with fomrmat commad but without any modifier:\n");
	printf("[%s]\n", "good day Mr. Lee.");
	printf("with digit string 4 as modifier: \n");
	printf("[%4s]\n", "good day Mr. Lee.");
	printf("with digit string 19 as modifier: \n");
	printf("[%19s]\n", "good day Mr. Lee.");
	printf("with digit string 23 as modifier: \n");
	printf("[%23s]\n", "good day Mr. Lee.");
	printf("wthi digit string 25.4 as modifier: \n");
	printf("[%25.4s]\n", "gooday Mr. Lee.");
	printf("with - digit string 25.4 as modifier: \n");
	printf("[%-25.4s]\n", "good day Mr. shroff.");
	
	return 0;
}
