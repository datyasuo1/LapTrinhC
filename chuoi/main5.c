#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	char str[15] = " new york";
	char str2[15] = "wasington";
	char chr = 'a', *loc;
	loc= strchr (str, chr);
	if(loc!=NULL)
	printf("%c co trong %s\n", chr, str);
	else
	printf("%c ko trong %s\n ", chr, str);
	loc= strchr (str2, chr);
	if(loc!=NULL)
	printf("%c co trong %s\n ", chr, str2);
	else
	printf("%c ko trong %s\n ", chr, str2);
	return 0;
}
