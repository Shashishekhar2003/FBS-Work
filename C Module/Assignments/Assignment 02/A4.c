/*
Ask the user to enter marks.
Then show the result based on these rules:
If marks are more than 75 → show "Distinction"
If marks are more than 65 → show "First Class"
If marks are more than 55 → show "Second Class"
If marks are 40 or more → show "Pass Class"
If marks are less than 40 → show "Fail" 
*/

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