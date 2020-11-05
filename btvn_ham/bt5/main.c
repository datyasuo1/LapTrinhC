#include <stdio.h>

int tong(int a, int b){
	return a+b;
}
int hieu(int a, int b ){
	return a-b;
}
int tich(int a, int b){
	return a*b;
}
int thuong(int a, int b){
	return a/b;
}
int main()
 {int chose, a, b;
 printf("tinh toan\n===========");
 printf("\nxin moi nhap a va b\n");
 scanf("%d", &a);
 scanf("%d", &b);
 printf("xin moi ban chon cac chuc nang\n1tinh tong\n2tinh hieu\n3tinh tich\n4tinh thuong\n");
 scanf("%d", &chose);
 if(chose==1){
 	printf("tong 2 so la: %d", (a+b));
 }
 else if(chose==2){
 		printf("hieu 2 so la: %d", (a-b));
 }
 else if(chose==3){
 	printf("tich 2 so la: %d", (a*b));
 }
 else if(chose==4){
   printf("thuong 2 so la: %d", (a/b));
 }
	return 0;
}
