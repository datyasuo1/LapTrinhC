#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int cnt;
	for (cnt = 1; cnt <= 10; cnt++)
	{
		if (cnt == 5)
		continue;
		printf("%d\t", cnt);
	}
	return 0;
}
