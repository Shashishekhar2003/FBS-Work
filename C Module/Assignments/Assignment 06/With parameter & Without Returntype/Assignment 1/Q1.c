#include<stdio.h>
int evenodd(int);
void main()
{
    int num;
    printf("Enter the Number : ");
    scanf("%d",&num);
   
    evenodd(num);

}
int evenodd(int num)
{
    if(num%2==0)
    printf("Even");
    else
    printf("Odd");
}