#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */



int check(int num);
	 int main()
	 {
     int i, num;
	 for(i=0; i<=5; i++)
	 {printf("\nso thu %d",  i);
	 scanf("%d", &num);
	check(num);
	 }

}
	int check(int num )
	{
	   if(num%50==0)
	printf("%d la boi so cua 50", num);
else 
printf("%d ko la boi so cua 50", num);
}
