#include<stdio.h>
#include<string.h>
void main()
{
    char name[]="Yashodeep";
    char firstName[10];

    strcpy(firstName,name);

    printf("String Copied is %s",firstName);
}

//Copies src string into dest.