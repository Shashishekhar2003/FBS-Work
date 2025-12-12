/*Accept a number and check if it is divisible by 3, 5, or both.
(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
both" or” Divisible by None”)
*/

#include <stdio.h>
int divisible();
void main()
{
    int res = divisible();
    if (res == 1)
        printf("The Number is Divisible by both ");
    else if (res == 2)
        printf("The number is Divisible by 3");
    else if (res == 3)
        printf("The number is Divisible by 5");
    else
        printf("The number id Divisible by None");
}

int divisible()
{
    int num = 30;

    if (num % 3 == 0 && num % 5 == 0)
        return 1;
    else if (num % 3 == 0)
        return 2;
    else if (num % 5 == 0)
        return 3;
    else
        return 4;
}