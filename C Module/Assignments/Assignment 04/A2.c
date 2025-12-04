// 2. Print prime numbers in the given range 1 to n.

#include <stdio.h>
void main()
{
    for (int range = 2; range < 50; range++)
    {
        int no = range, i, flag=0;

        for (i = 2; i < no; i++)
        {
            if (no % i == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            printf(" %d Its Prime \n",range);
        }
    }
}