#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int i, n = 0 ;
  m?c int ;
  char x [ 10 ] [ 12 ];
  char temp [ 12 ];

  clrscr ();
  printf ( " Nh?p t?ng chu?i v�o m?t d?ng ri�ng \ n \ n " );
  printf ( " Nh?p 'K?T TH�C' khi h?t \ n \ n " );

  / * �?c trong danh s�ch c�c chu?i * /
  l�m
  {
  	printf ( " Chu?i % d : " , n + 1 );
  	scanf ( " % s " , x [n]);
} while ( strcmp (x [n ++], " H?T " ));

/ * S?p x?p l?i danh s�ch c�c chu?i * /

n = n - 1 ;
for (item = 0 ; item <n - 1 ; ++ item)
{
	/ * T?m chu?i th?p nh?t c?n l?i * /

	for (i = item + 1 ; i <n; ++ i)
{
 if ( strcmp (x [item], x [i])> 0 )
 {
 / * Trao �?i hai chu?i * /
 strcpy (t?m th?i, x [item]);
 strcpy (x [item], x [i]);
 strcpy (x [i], t?m th?i);
}
}
}
/ * Hi?n th? danh s�ch c�c chu?i �? s?p x?p * /
printf ( " Danh s�ch c�c chu?i �? ghi: \ n " );

cho (i = 0 ; i <n; ++ i)
{
 printf ( " \ n Chu?i % D l� % s " , i + 1 , x [i]);
}
	return 0;
}
