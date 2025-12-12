#include<stdio.h>
int leapYear();
void main()
{
int res = leapYear();

res==1  ?  printf("\n Year is Leap Year")  :   printf("\n Year is Not Leap Year");
}


int leapYear()
{
    int year = 2005;
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        return 1;
        
    else
        return 0;
       
}