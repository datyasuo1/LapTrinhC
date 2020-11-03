#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int i;
	int ary[10];
	
	for(i=0; i<10; i++){
	printf("nhap cac so ", i);
	scanf("%d", &ary[i]);
    }		
    for(i=0; i<10; i+=2)
	 printf("ary[%d]", i); 

}
