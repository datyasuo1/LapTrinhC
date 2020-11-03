#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{int a, b, c;
 a = b = c = 0;
 printf("\n enter 1st integer");
 scanf("%d", &a);
 printf("\nenter 2nd integer");
 scanf("%d", &b);
 c= adder(a, b);
 printf("\n\na & b in main() are: %d, % d", a, b);
 printf("\n\n c in main () is: %d", c);
}
adder(int a, int b)
{
	int c;
	c= a+b;
	a*=a;
	b+=5;
	printf("\n\n a & b within adder funtion are:%d, %d ", a, b);
	printf("\n c within adder funtion is : %d", c);
	return(c);
	return 0;
}
