#include<stdio.h>
#include<string.h>
void main()
{
    char name[]="Yashodeep Badge";
    char sName[10];
    strncpy(sName,name,9);

    printf("%s",sName);
}

//Copies at most n characters from src to dest.