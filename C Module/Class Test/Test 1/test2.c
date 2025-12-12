// WAP to check if this year is leap or not
//leap_year=(year%4==0 and year%100!=0) or (year%400==0)

#include <stdio.h>
void main()
{
    int year = 2025;
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
    {
        printf("Its Leap Year");
    }
    else
    {
        printf("Its not Leap Year");
    }
}