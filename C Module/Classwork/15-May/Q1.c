#include<stdio.h>
void main()
{
    int arr[10],brr[5],crr[7];

    //arr
    printf("Enter the Elements of Array 1 = ");
    for(int i=0 ; i<10 ; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("1st Array = ");  
    for(int i=0;i<10;i++)
    {
        printf("%d ",arr[i]);
    }


    //brr
    printf("\nEnter the elements of Array 2 =");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&brr[i]);
    }
    printf("2st Array = ");
    for(int i=0;i<5;i++)
    {
        printf("%d ",brr[i]);
    }

    //crr
    printf("\nEnter the elements of Array 3 =");
    for(int i=0;i<7;i++)
    {
        scanf("%d",&crr[i]);
    }
    printf("3st Array = ");  
    for(int i=0;i<7;i++)
    {
        printf("%d ",crr[i]);
    }
}