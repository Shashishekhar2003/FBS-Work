//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
void main()
{
    char ch='z';

    if(ch>='A' && ch<='Z')
{
    printf("Its Uppercase");
}
else{
    printf("Its Lowercase");
}
}