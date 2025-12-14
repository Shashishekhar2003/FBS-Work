//5. Print alternate elements in array.

#include<stdio.h>
void main()
{
    int arr[5];
    printf("Enter the Elements :");
    for(int i=0 ; i<5 ; i++)
    scanf("%d",&arr[i]);

    printf("Array is = ");

    for(int i=0;i<5;i++)
    printf("%d ",arr[i]);

    printf("\nAlternate Numbers in Array = ");
    for(int i=0;i<5;i+=2)
    printf("%d ",arr[i]);

}