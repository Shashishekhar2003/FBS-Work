//Write a program to find greatest of three numbers using nested if-else.
#include<stdio.h>
void main()
{
    int a=100,b=800,c=25;

    if(a>b)
    {
        if(a>c)
        {
            printf("A = %d is Grater  ",a);
        }
        else
        {
            printf("C = %d is grater  ",c);
        }
    }
    else
    {
        if(b<c)
        {
            printf("C = %d is Grater  ",c);
        }
        else{
            printf("B = %d is Grater  ",b);
        }

    }
}