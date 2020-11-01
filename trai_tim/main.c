#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	char ten_crush;
	int i;
	char ans;
	
	printf("nhap ten crush:");
	scanf("%s", &ten_crush);
	for(i=1; i<=100; i++)
	printf("fall in love%d\n", i);
	
	do{
		printf(" lam nguoi yeu anh nhe baby\n ");
		printf(" yes or no: ");
		scanf("%s", &ans);
	} while ( ans != 'y' );
		printf(" len phuong \n\n");
	// phan trai tim	
		int a, b, size = 15;
		
		 for (a = size/2; a <= size; a = a+2)
    {
        for (b = 1; b < size-a; b = b+2)        
            printf(" ");
            
        for (b = 1; b <= a; b++)
            printf("*");
   
        for (b = 1; b <= size-a; b++)
            printf(" ");
         
        for (b = 1; b <= a-1; b++)
            printf("*");
 
        printf("\n");
    }
 
    for (a = size; a >= 0; a--)
    {
        for (b = a; b < size; b++)
            printf(" ");
 
        for (b = 1; b <= ((a * 2) - 1); b++)
            printf("*");
 
        printf("\n");  
    }
		
	return 0;
}
