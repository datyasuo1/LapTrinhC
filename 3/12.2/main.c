#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int A [ 10 ] [ 10 ], B [ 10 ] [ 10 ], C [ 10 ] [ 10 ];
	int hàng, col;
	int i, j;
	printf ( " \ n Nh?p kích thý?c c?a ma tr?n: " );
	scanf ( " % d  % d " , & row, & col);
	printf ( " \ n Nh?p giá tr? c?a ma tr?n A và B: \ n " ); cho (i = 0 ; i <row; i ++)
	for (j = 0 ; j <col; j ++)
	{
	 printf ( " \ n A [ % d , % d ], B [ % d , % d ]: " , i, j, i, j);
	 scanf ( " % d  % d " , & A [i] [j], & B [i] [j]);
	 C [i] [j] = A [i] [j] + B [i] [j];
}
cho (i = 0 ; i <row; i ++)
for (j = 0 ; j <col; j ++)
{
printf ( " \ n A [ % d , % d ] = % d , B [ % d , % d ] = % d , c [ % d , % d ] = % d \ n " , i, j, A [ I] [j], i, j, B [i] [j], i, j, C [i] [j]);
}
	return 0;
}
