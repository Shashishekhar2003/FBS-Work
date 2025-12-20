//Write a program to scan string from user then scan a single character and search it in a accepted string.

#include<stdio.h>
#include<string.h>
void main()
{
    char str[10];
    printf("Enter string :");
    scanf("%s",str);

    printf("String is: %s",str);

    char ch;
    int flag=0;
    printf("\nEnter the Char you want to scan in string :");
    scanf(" %c",&ch);
    for(int i=0;i<10;i++)
    {
        if(str[i]==ch)
        printf("Character %c found at %d",ch,i);
        flag=1;
    }
    if(flag==0)
    {
        printf("Char Not Found in string");
    }
    
}