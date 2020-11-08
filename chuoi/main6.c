#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	char ten1[15]="zed";
	char ten2[15]= "yasuo";
	printf("ten old: %s\n", ten1);
	strcpy(ten1, ten2);
	printf("ten new:%s", ten1);
	return 0;
}
