//1. Convert the time entered in hr,min,and sec into sec
#include<stdio.h>
void main()
{
    int hr=1,min=10,sec=16,hr_sec,min_sec,total_sec;

    hr_sec=hr*3600;
    min_sec=min*60;

    total_sec=hr_sec+min_sec+sec;
    printf("Total Sec is = %d",total_sec);

}