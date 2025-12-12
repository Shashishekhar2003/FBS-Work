#include <stdio.h>
void main()
{
    int units, rs;
    printf("Enter the Units : ");
    scanf("%d", &units);

    if (units <= 50)
    {
        rs = units * 30;
        printf("%d", rs);
    }
    else if (units < 150)
    {
        rs = units * 40;
        printf("%d", rs);
    }
    else if (units >= 151)
    {
        rs = units * 50;
        printf("%d", rs);
    }
}