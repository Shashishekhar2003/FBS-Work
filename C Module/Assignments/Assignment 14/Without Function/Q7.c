//Time (hour, min, sec)


struct Time
{
    int hour,min,sec;
};
#include<stdio.h>
void main()
{
    struct Time t1,t2;
    printf("Hour :");
    scanf("%d",&t1.hour);

    printf("Min :");
    scanf("%d",&t1.min);

    printf("Sec :");
    scanf("%d",&t1.sec);

    printf("\nHour :%d \nMin %d \nSec :%d ",t1.hour,t1.min,t1.sec);
}