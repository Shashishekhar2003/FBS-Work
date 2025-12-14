//strncmp() Compare n characters

#include<stdio.h>
#include<string.h>
void main()
{
    char name[]="yash";
    char sName[]="yashraj";

    int res = strncmp(name,sName,2);

    if(res==0)
    printf("First 2 Char are Equal ");
    else
    printf("First 2 Char are Not Equal ");

}
