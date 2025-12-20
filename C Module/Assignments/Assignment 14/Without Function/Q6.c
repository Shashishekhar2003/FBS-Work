//Date (date, month, year)

struct Date
{
    int date,month,year;
};
#include<stdio.h>
void main()
{
    struct Date d1,d2;
    printf("Date :");
    scanf("%d",&d1.date);

    printf("Month :");
    scanf("%d",&d1.month);

    printf("Year :");
    scanf("%d",&d1.year);

    printf("\nDate :%d \nMonth %d \nYear :%d ",d1.date,d1.month,d1.year);
}