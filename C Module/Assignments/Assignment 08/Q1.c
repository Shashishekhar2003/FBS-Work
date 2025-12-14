//1. Find minimum and maximum number in array.

#include<stdio.h>
void main()
{
    int arr[10];
    printf("Enter the Elements :\n");
    for(int i=0 ; i<10 ; i++)
        scanf("%d",&arr[i]);

    printf("Your Array is ");
    for(int i=0 ; i<10 ; i++)
        printf("%d ",arr[i]);


    int max=arr[0];
    for(int i=1 ; i<10 ; i++)
        if(arr[i]>max)
        max=arr[i];

    printf("\n Max Element is : %d",max);

/*     int min=arr[0];
    for(int i=1 ; i<10 ; i++)
        if(arr[i]<min)
        min=arr[i];
        
    printf("\n Min Element is : %d",min);
 */
}