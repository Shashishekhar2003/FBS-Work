/*Check the given number is Armstrong number or not..
Input: n = 153*/

#include<stdio.h>
void main()
{
    int no=143;
    int ogNumber=no;
    int sum,rem;

    while(no>0)
    {
        rem=no%10;
        sum=sum+rem*rem*rem;
        no=no/10;
    }
    if(sum==ogNumber)
    {
        printf("Its Armstrong Number");
    }
    else
    {
        printf("Its Not Armstrong Number");
    }


}