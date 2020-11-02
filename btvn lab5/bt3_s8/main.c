#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float a,b,c;
	printf("Nhap a=");
	scanf("%f",&a);
	printf("Nhap b=");
	scanf("%f",&b);
	printf("Nhap c=");
	scanf("%f",&c);

	if(a>=b&&a>=c)
	printf("\nso lon nhat la %f",a);
	else if(b>=a&&b>=c)
	printf("\nso lon nhat la %f",b);
	else
	printf("\nso lon nhat la %f",c);
	return 0;
}
