#include<stdio.h>
void main()
{
    int no;
    printf("Enter the number : ");
    scanf("%d",&no);

    if(no<0)
    printf("Number is -VE");
    else if(no>0)
    printf("Nuber is +VE");
    else
    printf("Number is Neutral");
}
