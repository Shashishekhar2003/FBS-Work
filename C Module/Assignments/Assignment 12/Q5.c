//Q5.WAP to Count the Number of Vowels in a String
#include<stdio.h>
#include<string.h>
void main()
{
    char str[10];
    int count=0;

    printf("Enter the String : ");
    scanf("%s",str);

    for(int i=0;i<strlen(str);i++)
    {
        if(str[i]=='a' || str[i]=='e' ||str[i]=='i' ||str[i]=='o')
        {
            ++count;
        }

    }
    printf("Numbers of Vowels is : %d",count);
}