#include<stdio.h>
int main()
{
		int num1, num2, i, sum;
	printf("nhap so 1 :");
	scanf("%d", &num1);
	
	printf("nhap so 2 :");
	scanf("%d", &num2);
	for(i=num1; i<=num2; i++)
	if(i%2 !=0)
    sum+=-i;
	printf("%d", sum);
}
