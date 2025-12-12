/*Check the given number is Perfect number or not.
Input: n = 28*/

#include <stdio.h>
int getPerfect();
void main()
{
    int res = getPerfect();
    if (res == 0)
        printf("Its Perfect Number");
    else
        printf("Its not Perfect Number");
}

int getPerfect()
{
    int no = 28;
    int i = 1, sum = 0;
    while (i < no)
    {
        if (no % i == 0)
        {
            sum = sum + i;
        }
        i++;
    }

    if (sum == no)
        return 0;
    else
        return 1;
}