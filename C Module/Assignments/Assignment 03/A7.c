/*Find factorial of given number.
Input: n = 5 */

#include<stdio.h>
void main()
{
    int n=5;
    int fact=1;

    while(n>1)
    {
        fact=fact*n;
        n--;
    }
    printf("%d",fact);
}