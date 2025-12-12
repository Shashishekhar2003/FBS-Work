/* WAP to print factors of number in given range ex.= range = 10 to 15 10 = 1,2,5,10 11 = 1,11 */

#include <stdio.h>
void main()
{
    int start, end;
    printf("Enter the start and end range: ");
    scanf("%d %d", &start, &end);

    for (int num = start; num <= end; num++)   // loop through each number
    {
        printf("\n%d = ", num);   // print current number
        for (int i = 1; i <= num; i++)   // loop to find factors
        {
            if (num % i == 0)
                printf("%d ", i);
        }
    }
}
