//Q6.WAP to Take in a String and Replace Every Blank Space with special symbol.
#include<stdio.h>
#include<string.h>
void main()
{
    char str[30];

    printf("Enter the string :");
    fgets(str, sizeof(str), stdin);

    for(int i=0;i<strlen(str);i++)
    {
        if(str[i]==' ')
        {
            str[i]='!';
        }
    }
    printf("%s",str);
}