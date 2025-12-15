#include<stdio.h>

int greatest_among_three();   
void main()
{
    int result;
    result = greatest_among_three();   // call

    printf("Greatest is %d\n", result);
}

int greatest_among_three()
{
    int a = 100, b = 800, c = 25;

    if (a > b)
    {
        if (a > c)
            return a;
        else
            return c;
    }
    else
    {
        if (b > c)
            return b;
        else
            return c;
    }
}
