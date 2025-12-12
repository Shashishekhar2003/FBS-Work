/*Check the given number is Armstrong number or not..
Input: n = 153*/

#include<stdio.h>
int getAmstrong();
void main()
{
    int res=getAmstrong();
    if(res==0)
    printf("Its Armstrong Number");
    else
    printf("Its Not Armstrong Number");

}

int getAmstrong()
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
        return 0;
    else
        return 1;
}