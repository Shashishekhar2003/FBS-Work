// Grater Amomg 3 numbers

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

/*
#include<stdio.h>
void main()
{
    int a=10;
    if(a>5)
    printf("A is Grater");

    else
    printf("A is Not Grater");
}
*/