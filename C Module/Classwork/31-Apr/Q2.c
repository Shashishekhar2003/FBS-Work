// table of 5
#include<stdio.h>
void main()
{
    int n=5;
    int table=0;
    for(int i=1; i<=10; i++)
    {
        table=n*i;
        printf(" %d",table);

    }
    printf("\n end");
}