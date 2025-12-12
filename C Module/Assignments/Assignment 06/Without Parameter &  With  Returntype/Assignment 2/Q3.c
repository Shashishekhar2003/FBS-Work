//Write a program to find greatest of three numbers using nested if-else.
// Solve using Function Type 2

#include <stdio.h>
int findGreatest(); 
void main() 
{
    int greatest = findGreatest();
    printf("The greatest number is: %d\n", greatest);
}

int findGreatest() 
{
    int a, b, c;
    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    if (a > b) {
        if (a > c) {
            return a;
        } else {
            return c;
        }
    } else {
        if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}

