#include <stdio.h>
int i;
void indexMin(int arr[], int size){
    printf("cac phan tu cua ham:\n");
    for (i=1; i<=size; i++) {
        printf("arr[%d]= ", i);
        scanf("%d", &arr[i]);
    }
    int min=arr[1];
    int vitri=1;
    for (i=1; i<=size; i++) {
        if (min>arr[i]){
            min=arr[i];
            vitri = i;
        }
    }
    printf("Giá tri nho nhat = %d\n", min);
    printf("Vi tri phan tu la arr[%d]\n", vitri);
}
int main(){
    int arr[5];
    indexMin(arr, 5);
    return 0;
}

