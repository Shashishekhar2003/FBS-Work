//WAP Replace all Occurrences of ‘a’ with $ in a String
#include<stdio.h>
#include<string.h>
void main()
{
    char str[10];
    printf("Enter string :");
    scanf("%s",str);

    printf("String is: %s",str);

    for(int i=0;i<10;i++)
    {
        if(str[i]=='a')
        {
            str[i]='@';
        }
    }
    printf("\nUpdated String is = %s",str);
}