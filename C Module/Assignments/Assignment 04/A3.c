// Print perfect numbers in the given range 1 to n.

#include <stdio.h>
void main()
{
    for (int range = 1; range < 100; range++)
    {
        int no = range;
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
        {
            printf(" %d is Perfect Number \n", no);
        }
    }
}