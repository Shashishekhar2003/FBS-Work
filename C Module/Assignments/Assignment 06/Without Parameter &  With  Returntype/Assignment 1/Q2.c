#include<stdio.h>
int Pallindrome();
void main()
{
    int res;
    res = Pallindrome();
    
    res==0  ?  printf("Pallindrome")  :  printf("Not Pallindrome");
}

int Pallindrome()
{
    int no;
    printf("Enter Number : ");
    scanf("%d",&no);
    if (no % 10 == no / 1000)
        return 1;
    else
        return 0;
}