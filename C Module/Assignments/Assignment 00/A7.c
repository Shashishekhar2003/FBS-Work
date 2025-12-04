//Write a C program to convert given minutes into hours and remaining minutes.

#include<stdio.h>
void main()
{
    int hr,min=130;

    hr=min/60;
    min=min%60;

    printf("hr :%d , min %d ",hr,min);

}