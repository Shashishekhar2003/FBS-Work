//Distance ( feet, inch)


struct Distance
{
    int feet,inch;
};
#include<stdio.h>
void main()
{
    struct Distance d1;
    printf("feet :");
    scanf("%d",&d1.feet);

    printf("inch :");
    scanf("%d",&d1.inch);

    printf("\nfeet :%d \nMin %d",d1.feet,d1.inch);
}