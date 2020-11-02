#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char a;
	printf("Nhap ki tu:");
	scanf("%c",&a);
	switch(a)
	{
	case 'A':
		printf("Ada");
		break;
	case 'a':
		printf("Ada");
		break;
	default:
		printf("Khong co ngon ngu lap trinh tuong ung");
		break;
	}
	return 0;
}
