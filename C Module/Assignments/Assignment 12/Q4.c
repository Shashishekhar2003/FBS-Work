//Q4. WAP to Form a New String where the First Character and the Last Character have been Exchanged

#include<stdio.h>
#include<string.h>
void main()
{
    char str[10];
    char first,last,result;

    printf("Enter the string :");
    scanf("%s",str);

    if(strlen(str)==1)
    {
        printf("No Change");
    }
    else if(strlen(str)<10)
    {
        char temp = str[0];
        str[0] = str[strlen(str)-1];
        str[strlen(str)-1] = temp;
        printf("New String : %s",str);

    }
}