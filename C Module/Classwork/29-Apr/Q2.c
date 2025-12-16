// Marks 75=A+  55=B+  45=C+  35=Pass 34< fail

#include <stdio.h>
void main()
{
    int marks = 46;

    if (marks > 75)
    {
        printf("A+ Grade");
    }
    else
    {
        if (marks > 55)
        {
            printf("B+ Grade");
        }
        else
        {
            if (marks > 45)
            {
                printf("C+ Grade ");
            }
            else
            {
                if (marks > 35)
                {
                    printf("P Grade");
                }
                else
                {
                    printf("Fail");
                }
            }
        }
    }
}