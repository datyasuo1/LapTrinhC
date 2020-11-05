#include <stdio.h>
#include <stdlib.h>
int i;
void nhap(int a[], int n)
{
	for(i=0; i<n; i++){
		printf("phan tu thu %d", i);
		scanf("%d", &a[i]);
	}
}
void in(int a[], int n)
{
	for(i=0; i<n; i++){
	printf("%d\t", a[i]);
	}
}
void reverse(int a[], int n){
	for(i=n; i>=0; i--){
	printf("%d\t", a[i]);
}
}
int main()
{
	int n;
	printf("so phan tu la");
	scanf("%d", &n);
     int a[n]; 
	nhap(a,n);
	printf("so phan tu vua nhap la ");
	in(a,n);
	printf("phan tu nguoc la ");
	reverse(a,n);
	
	return 0;
}
