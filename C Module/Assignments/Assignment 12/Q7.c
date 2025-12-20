//Q.7WAP to Remove the Characters of Odd Index Values in a String
#include<stdio.h>
#include<string.h>
void main()
{
    char str[10];
    char newStr[10];
    int j=0;

    printf("Enter the string :");
    scanf("%[^\n]",str);

    for(int i=0;i<strlen(str);i++)
    {
        if(i%2==0)
        {
            newStr[j++]=str[i];
        }
    }
    newStr[j]='\0';

    printf("New String is : %s",newStr);
}