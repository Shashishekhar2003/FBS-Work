#include<stdio.h>
void main()
{
    for (int i=1;i<=15;i++)
    {
        for (int j =1; j<=15; j++)
        {
            if(i==1 || i==15  || j==1 || j==15 || i==j || i+j==16 || i==8 || j==8)
            printf(" * "); 
            else
            printf("   ");

        }
        printf("\n");
    }
}