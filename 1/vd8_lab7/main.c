#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
		char ch ;
	printf("\nenter a lower cased alphabet (a - z):" );
	scanf("%c", &ch);
	if (ch < 'a' || ch > 'z')
	printf("\ncharacter not a lower cased alphabet");
	else
	switch(ch)
	{
		case 'a':
		case 'e':
	    case 'i':
	    case 'o':
	    case 'u':
		printf("\ncharacter is a vowel");
		break;
		case 'z':
		default:
		printf("\ncharacter is a consonant");
		break;
		
		}	
	return 0;
}
