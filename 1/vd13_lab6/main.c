#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	char letter;
	printf("you can enter a character now: ");
	letter = getchar();
	putchar(letter);
return 0;
}
