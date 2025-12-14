#include<stdio.h>
void main()
{
    int arr1[10];
    int arr2[10];
    int arr3[10];
    int sum=0;
    printf("Enter the Elements of Array 1 :");    
    for(int i=0 ; i<10 ; i++)
        scanf("%d",&arr1[i]);

    printf("Your Array 1 is ");
    for(int i=0 ; i<10 ; i++)
        printf("%d ",arr1[i]);

    printf("\n Enter the Elements of Array 2 :");
    for(int i=0 ; i<10 ; i++)
        scanf("%d",&arr2[i]);

    printf("Your Array 2 is ");
    for(int i=0 ; i<10 ; i++)
        printf("%d ",arr2[i]);

//
    printf("\n New Array is :");
    for(int i=0 ; i<10 ; i++)
    {
        arr3[i]=arr1[i]+arr2[i];
        printf("%d ",arr3[i]);
    }


    for(int a=0 ; a<10 ; a++)
    {
        sum=sum+arr3[a];
    }
    printf("\n Sum is: %d ",sum);

}
