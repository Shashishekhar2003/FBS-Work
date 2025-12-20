//Q2. Accept string and replace one char from speical symbol 

#include<stdio.h>
#include<string.h>
void main()
{
    char str[10];
    printf("Enter the string :");
    scanf("%s",str);
    int len=strlen(str);

    char ch;
    char symb;
    printf("Enter the Char that you want to Replace :");
    scanf(" %c",&ch);

    printf("Enter the Speical Symbol :");
    scanf(" %c",&symb);

    for(int i=0;i<len;i++)
    {
        if(str[i]==ch)
        {
            str[i]=symb;
        }
    }
    printf("Updated String is : %s",str);
}