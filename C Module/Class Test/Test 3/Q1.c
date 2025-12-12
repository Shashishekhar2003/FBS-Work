// WAP Print even and odd numbers in given range

#include <stdio.h>
void geteven(int, int);
void getodd(int , int );
 void main()
{
    int start, end;
    printf("Enter the range ( Start & End )");
    scanf("%d %d", &start, &end);

    geteven(start, end);
    
    getodd(start,end);
}
void geteven(int start, int end)
{
    for (int i = start; i <= end; i++)
    {
        if (i % 2 == 0)
        {
            printf("Even %d :", i);
        }
    }
}

void getodd(int start, int end)
{
        for (int i = start; i <= end; i++)
    {
        if (i % 2 == 1)
        {
            printf("Odd %d :", i);
        }
    }
    
}