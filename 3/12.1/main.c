#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	 int n;
  int num [ 100 ];
  int l;
  int desnum [ 100 ], k;
  int i, j, temp;
  printf ( " \ n Nh?p t?ng s? d?u c?n nh?p: " );
  sacnf ( " $ d " , & n);
  clrscr ();
  cho (l = 0 ; l <n; l ++)
  {
  printf ( " \ n Nh?p ði?m c?a sinh viên % d : " , 1 + 1 );
  scanf ( " % d " , & num [l]);
}
cho (k = 0 ; k <n; k ++)
desnum [k] = num [k];
cho (i = 0 ; i <n - 1 ; i ++)
{
cho (j = i + 1 ; j <n; j ++)
{
if (desnum [i] <desnum [j])
{
temp = desnum [i];
desnum [i] = desnum [j];
desnum [j] = temp;
}
}
}
cho (i = 0 ; i <n; i ++)
printf ( " \ n S? t?i [$ d] là % d " , i, desnum [i]);
	return 0;
}
