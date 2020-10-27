#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int x;
	char i, ans;
	i = 'Y';
	do{
	x = 0;
	ans = 'y';
	printf("\nenter sequence of character");
	do{
	i = getchar();
	x++ ;
	}while (i != '\n');
	i = 'Y';
	printf("\nnumber of character entered is:%d", --x);
	printf("\nmore senquences (Y/N)?");
	ans = getch();	
	}while (ans == 'Y' || ans == 'Y');
	return 0;
}
