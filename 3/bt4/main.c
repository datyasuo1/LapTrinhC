#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int i, j, k;
	printf("nhap so hang");
	scanf("%d", &i);
	
	for(j=0; j<=i; j++)
   {printf("\n");
   for(k=1;k<=j;k++)
   printf("%d", k);
   }
	return 0;
}
