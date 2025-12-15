#include <stdio.h>
int getprime(int);       //Fun Decl
void main()
{
    int num;
    printf("Enter the Number : ");
    scanf("%d", &num);

    int res = getprime(num); // call
    if (res == 0)
        printf("Number is prime ");
    else
        printf("Number is not prime");
}   
//Main End here


int getprime(int num)    // Fun Def
{
    int flag;
    if (num <= 1)
    {
        flag = 0;
    }
    else
    {
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0)
            {
                flag = 0;
                break;
            }
        }
    }

    if (flag == 0)
        return 1;

    else
        return 0;
}