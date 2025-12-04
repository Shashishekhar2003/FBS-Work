//4. Print strong numbers in the given range 1 to n.

#include <stdio.h>
void main()
{
    for(int range=1;range<50;range++)
    {
        
    int num = range;
    int ogNum = num;

    int sum = 0;

    while (num > 0)
    {
        int rem = num % 10;

        int fact = 1;
        int i = 1;

        while (i <= rem)
        {
            fact = fact * i;
            i++;
        }

        sum = sum + fact;
        num = num / 10;
        
    }
    if(sum==ogNum)
    {
        printf(" %d is Strong Number ",ogNum);
    }
    }
}