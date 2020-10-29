#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int ary [ 10 ];
  int i, t?ng s?, cao;
  cho (i = 0 ; i < 10 ; i ++)
  {
  	   printf ( " \ n Nh?p giá tr?: % d : " , i + 1 );
  	   scanf ( " % d " , & ary [i]);
  }
  / * Hi?n th? giá tr? cao nh?t trong s? các giá tr? ð? nh?p * /
  cao = ary [ 0 ];
  cho (i = 1 ; i < 10 ; i ++)
  {
  	  if (ary [i]> high)
  	  cao = ary [i];
  }
  printf ( " \ n Giá tr? cao nh?t ðý?c nh?p là % d " , cao);

  / * In giá tr? trung b?nh ð? nh?p cho ary [10] * /
  cho (i = 0 , t?ng = 0 ; i < 10 ; i ++)
  t?ng = total + ary [i];

  printf ( " \ n Giá tr? trung b?nh c?a ph?n t? ary là % d " , total / i);
	return 0;
}
