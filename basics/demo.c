#include<stdio.h>
int main(){
    int n, sum=0;
    printf("enter the number of element in the array: ");
    scanf("%d",&n);
    if(n<=0){
        printf("invalid...");
        return 0;
    }
    int arr[n];
    printf("enter %d elements of array: ",n);
    for(int i=0; i<n; i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0; i<n; i++){
        sum += arr[i];
    }
    printf("sum is %d",sum);
    return 0;
}