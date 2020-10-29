#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	char name[3];
	int age;
	int i;
	
	printf("nhap ten la :");
	scanf("%s", name); /* neu ghi day du ho va ten pham_thanh_dat thi them "gets(name);*/
	    
	printf("nhap tuoi la :");
	scanf("%d", &age);
	
	for(i=0; i<age; i++)
	printf("hello %s time %d\n", name, i+1);
	return 0;
}
