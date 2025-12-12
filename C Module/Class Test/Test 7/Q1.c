// Q1. WAP to accept array and exchange the data of Xth position to Yth position
// Eg=  arr[]={11,23,30,4,21,45,50}
//  Xth position =3
//  Yth Position =5
// op=  11 23 21 4 30 45 50

#include <stdio.h>
void exchange(int *, int);
void main()
{
    int arr[] = {11, 23, 30, 4, 21, 45, 50};

    printf("Orignal Array");
    for (int i = 0; i < 7; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");

    exchange(arr, 7); // Fun Call
}

void exchange(int *ptr, int n)
{
    int temp;

    temp = ptr[2];
    ptr[2] = ptr[4];
    ptr[4] = temp;

    printf("Updated Array");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", ptr[i]);
    }
}