#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	int a,b;
	printf("Nhap diem sinh vien:");
	scanf("%d",&a);
	if(a>=75)
	printf("Loai A");
	else if(a>=60&&a<75)
	printf("Loai B");
	else if(a>=45&&a<60)
	printf("Loai C");
	else if(a>=35&&a<45)
	printf("Loai D");
	else
	printf("Loai E");

	return 0;
}
