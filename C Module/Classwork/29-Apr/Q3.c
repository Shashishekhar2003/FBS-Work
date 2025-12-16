// Check given number is +ve, -ve or neutral

#include<stdio.h>
void main()
{
    int num=-20;
    if(num>0)
        printf("Given Number %d is +VE",num);
    else
    {
        if(num<0)
            printf("Given Number %d is -Ve",num);
        else
            printf("Given Number %d is Neutral",num);
    }
}