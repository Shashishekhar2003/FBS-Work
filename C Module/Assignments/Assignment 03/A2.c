// Print table for given number.
// Input: n = 5

/* #include <stdio.h>
void main()
{
    int n = 5, i = 1, table = 0;
    while (i <= 10)
    {
        table = i * n;
        printf(" %d", table);
        i++;
    }
} */

#include<stdio.h>
void main()
{
    int n=5,i=1,table=0;
    for(i=1;i<=10;i++)
    {
        table=i*n;
        printf(" %d",table);
    }
}