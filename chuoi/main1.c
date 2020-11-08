#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	char name[20];
printf("Enter your name:");
scanf("%s", &name); 
printf("Hi there: %s",name); 
	return 0;
}
