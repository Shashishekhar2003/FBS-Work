//Sort the array.

#include<stdio.h>
void main()
{
    int arr[5];
    int temp;
    printf("Enter Array Elements :");
     for(int i=0 ; i<5 ; i++)
        scanf("%d",&arr[i]);

    printf("Your Array is ");

    for(int i=0 ; i<5 ; i++)
        printf("%d ",arr[i]);

    for(int i=0 ; i<5 ; i++)
    {
        for(int j=i+1;j<5;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
     printf("\nSorted Array is ");

    for(int i=0 ; i<5 ; i++)
        printf("%d ",arr[i]);
    

}