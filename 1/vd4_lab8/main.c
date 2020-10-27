#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int num1, num2, res;
	char op;
	num1=90;
	num2=33;
	op='-';
	switch (op)
	{ 
	case '+':
	res= num1 +num2;
	printf("\nThe Sum is: %d",res);
	break;
	case'-':
    res=num1-num2;
    printf("\nNumber afer Subtraction: %d",res);
    break;
	case'/':
    res=num1/num2;
    printf("\nNumber afer Division: %d",res);
	case'*':
    res=num1*num2;
    printf("\nNumber afer multiplication: %d",res);
    break;
    default:
    printf("\nInvalid");
    break;
	}
	return 0;
}
