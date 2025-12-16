//Function to scan array
//Passing Array to function.0

#include<stdio.h>
void storearr(int* ,int );
void displayArr(int* ,int );
void main()
{
    int arr[5];

    printf("Enter Array Elements :");
    storearr(arr,5);
    printf("Stored Array is = ");
    displayArr(arr,5);
}

void storearr(int* ptr,int n)
{
    for(int i=0;i<n;i++)
    {
        scanf("%d",&ptr[i]);
    }
}

void displayArr(int* ptr,int n)
{
    for(int i=0;i<n;i++)
    {
        printf("%d ",ptr[i]);
    }
}