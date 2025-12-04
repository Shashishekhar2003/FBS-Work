/*Sum of numbers in given range.
Find sum of numbers from start to end.
Input: start = 1, end = 5
Output: 15
*/

/* #include<stdio.h>
void main()
{
    int i=1;
    int sum=0;
    while(i<=5)
    {
        sum=sum+i;
        i++;
    }
    printf(" %d ",sum);
} */

#include <stdio.h>
void main()
{
    int i, sum = 0;

    for (i = 1; i <= 5; i++)
    {
        sum = sum + i;
    }
    printf(" %d", sum);
}