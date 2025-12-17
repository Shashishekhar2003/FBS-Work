#include<stdio.h>
void main()
{
    int no=5;
    int a=2,b=3,x=0;

    for(int i=1;i<no;i++)
    {
        x=x+a;
        for (int j=1;j<=i;j++)
        {
            a=b+j;
            b=b+i+j;
        }
    }
    printf("a= %d b= %d c= %d",a , b ,x);

}