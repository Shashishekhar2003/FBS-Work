//Write a program to check whether a given year is a leap year.
#include<stdio.h>
void getyear(int);
void main()
{
    int year;
    printf("Enter Year :");
    scanf("%d",&year);
    getyear(year);

}

void getyear(int year)
{
   
    if((year%4==0 && year%100!=0) || (year%400==0))
    {
        printf("Leap Year");

    }
    else
    {
        printf(" Not Leap Year");

    }
}