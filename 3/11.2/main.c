#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int ary [ 10 ];
  int i, t?ng s?, cao;
  cho (i = 0 ; i < 10 ; i ++)
  {
  	   printf ( " \ n Nh?p gi� tr?: % d : " , i + 1 );
  	   scanf ( " % d " , & ary [i]);
  }
  / * Hi?n th? gi� tr? cao nh?t trong s? c�c gi� tr? �? nh?p * /
  cao = ary [ 0 ];
  cho (i = 1 ; i < 10 ; i ++)
  {
  	  if (ary [i]> high)
  	  cao = ary [i];
  }
  printf ( " \ n Gi� tr? cao nh?t ��?c nh?p l� % d " , cao);

  / * In gi� tr? trung b?nh �? nh?p cho ary [10] * /
  cho (i = 0 , t?ng = 0 ; i < 10 ; i ++)
  t?ng = total + ary [i];

  printf ( " \ n Gi� tr? trung b?nh c?a ph?n t? ary l� % d " , total / i);
	return 0;
}
