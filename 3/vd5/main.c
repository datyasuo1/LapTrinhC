#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
 {
 		int i, j, k;
	printf("nhap so hang");
	scanf("%d", &i);
	
	for(j=i; j>0; j--)
   {printf("\n");
   for(k=0;k<=j;k++)
   printf("*");
   }
	return 0;
	return 0;
}
