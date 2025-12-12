//Q1. WAP to find common elements in two array

#include<stdio.h>
void comm(int* , int* );
void main()
{
    int arr1[5],arr2[5];

    printf("Enter Array 1 : ");
    for(int i=0 ; i<5 ; i++)
    {
        scanf("%d",&arr1[i]);
    }

    for(int i=0 ; i<5 ; i++)
    {
        printf("%d ",arr1[i]);
    }
    

    printf("\nEnter Array 2 : ");
    for(int i=0 ; i<5 ; i++)
    {
        scanf("%d",&arr2[i]);
    }

    for(int i=0 ; i<5 ; i++)
    {
        printf("%d ",arr2[i]);
    }

    comm(arr1,arr2);

}

void comm(int* arr1, int* arr2)
{
    printf("\nCommon Elements are :");
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            if(arr1[i]==arr2[j])
            {
                printf("%d ",arr1[i]);
            }
        }
    }
}

