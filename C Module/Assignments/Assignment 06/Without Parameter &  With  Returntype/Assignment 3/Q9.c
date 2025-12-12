/*Check the given number is Palindrome number or not.
Input: n = 121*/

#include<stdio.h>
int getpalindrome();
void main()
{
    int res=getpalindrome();
    if(res==0)
    printf("Its Palindrome");
    else
    printf("Not Palindrome");
}

int getpalindrome()
{
    int num=121;
    int ognum=num;
    int rev=0;
    int digit;

    while(num>0)
    {
        digit=num%10;
        rev=rev*10+digit;
        num=num/10;
    }
    if(rev=ognum)
        return 0;
    else
        return 1;
}