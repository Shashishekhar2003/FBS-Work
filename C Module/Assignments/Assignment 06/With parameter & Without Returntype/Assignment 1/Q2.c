#include<stdio.h>
void getPallindrome(int);
void main()
{
    int no;
    printf("Enter the Number : ");
    scanf("%d",&no);
    getPallindrome(no);
}

void getPallindrome(int no)
{
    
    if(no%10==no/100)
    {
        printf("Pallindrome");
    }
    else
    {
        printf("Not Pallindrome");

    }
}