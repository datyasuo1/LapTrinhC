#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int basic;
	printf("\n please enter your basic:");
	scanf("%d", &basic);
	switch (basic)
	{
		case 200:
	    printf("\n bonus is dolla %d\n", 50);
		break;	
				case 300:
	    printf("\n bonus is dolla %d\n", 125);
		break;
				case 400:
	    printf("\n bonus is dolla %d\n", 140);
		break;
				case 500:
	    printf("\n bonus is dolla %d\n", 175);
		break;
		default:
		printf("\n invalid entry");
		break;
		
	}
	return 0;
}
