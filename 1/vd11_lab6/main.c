#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	char letter;
	printf("\nplease enter any character: ");
	letter = getchar();
	printf("\nthe character entered by you is %c. ", letter);
	return 0;
}
