//Q1. Print Sum of Prime Number in given range
#include <stdio.h>

void main() 
{
    int start, end, i, j, flag, sum = 0;

    printf("Enter the start number: ");
    scanf("%d", &start);
    printf("Enter the end number: ");
    scanf("%d", &end);

    printf("Prime numbers between %d and %d are:\n", start, end);

    for (i = start; i <= end; i++)  
    {
        if (i < 2)   
            continue;

        flag = 0;   

        for (j = 2; j <= i / 2; j++)   
        {
            if (i % j == 0) 
            {
                flag = 1;
                break;
            }
        }

        if (flag == 0)   
        {
            printf("%d ", i);
            sum += i;
        }
    }

    printf("\nSum of prime numbers between %d and %d is: %d\n", start, end, sum);

    
}
