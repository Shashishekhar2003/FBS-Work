//Write a program to check whether a given character is a vowel or consonant.
#include<stdio.h>
void getVowelConsonant(char);
void main()
{
    char ch;
    printf("Enter the Char : ");
    scanf("%c",&ch);
    getVowelConsonant(ch);
}

void getVowelConsonant(char ch)
{
    if((ch=='a'||ch=='e'||ch=='i' ||ch=='o'||ch=='u'))
    {
        printf("Its a Vowel");
    }
    else{
         printf("Its not a Vowel");
    }
}