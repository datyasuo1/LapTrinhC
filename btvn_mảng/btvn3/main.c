#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int arr[10], sum;
    float avg;
	int i, max, min;
	int count1=0, count2=0;
	for(i=0; i<10; i++)
	{
	printf("nhap day so");
	scanf("%d", &arr[i]); 
	 sum += arr[i];
	 } 
	 printf("tong la :%d\n", sum);
	 avg=sum;
	 printf("tb cong la:%f\n", avg/10);
    max=arr[0];
	 for(i=0; i<10; i++)
	 {if(arr[i]>max)
	 max=arr[i];
	 }
	 printf("gia tri lon nhat la %d\n", max);
	 for(i=0; i<10; i++)
	 {if(max==arr[i])
	 {
	 count1+=1;}
	 }
	 printf("so lan xuat hien max la %dlan\n", count1);
	 min=arr[0];
	 for(i=0; i<10; i++)
	 {if(arr[i]<min)
	 min=arr[i];
	  } 
	printf("gia tri nho nhat la %d", min);
	for(i=0; i<10; i++)
	 {if(min==arr[i])
	 {
	 count2+=1;}
	 }
	 printf("so lan xuat hien min la %dlan\n", count2);
	return 0;
}
