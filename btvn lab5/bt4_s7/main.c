#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	char a;
	printf("Nhap loai nhan vien:");
	scanf("%c",&a);
	if(a=='A')
	printf("Muc luong:300");
	else if(a=='B')
	printf("Muc luong:250");
	else
	printf("Muc luong:100");
	return 0;
}
