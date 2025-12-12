/* Write a program to find power of any number 
ex.=  2^4 = 16*/

#include<stdio.h>
void main()
{
    int base,expo;
    printf("Enter Base & Expo :");
    scanf("%d %d",&base,&expo);
    int res;

    for(int i=expo ; i<=expo ; i++)
    {
       res=base*i;
    }

    printf("%d",res);
}