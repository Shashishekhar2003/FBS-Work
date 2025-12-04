#include<stdio.h>
void main ()
{
    int a=10,b=20,temp;

    temp=a;
    a=b;
    b=temp;

    printf("A= %d , B= %d ",a,b );
}