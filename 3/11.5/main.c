#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int arr [ 2 ] [ 3 ];
	int h�ng, col;

	for (row = 0 ; row < 2 ; row ++)
	{
		for (col = 0 ; col < 3 ; col ++)
		{
		printf ( " \ n Nh?p s? v�o [ % d ] [ % d ]: " , row, col);
		scanf ( " % d " , & arr [row] [col]);
	    }
      }
      for (row = 0 ; row < 2 ; row ++)
      {
      for (col = 0 ; col < 3 ; col ++)
      {
	    printf ( " \ n S? t?i [ % d ] [ % d ] l� % d " , row, col, arr [row] [col]);
	}
}
	return 0;
}
