/*Find factorial of given number.
Input: n = 5 */

#include<stdio.h>

int getFact();
void main()
{
    int factorial=getFact();
    printf("%d",factorial);
}

int getFact()
{
    int n=5;
    int fact=1;

    while(n>1)
    {
        fact=fact*n;
        n--;
    }
    return fact;
}