#include<stdio.h>
#include<string.h>
void main()
{
    char name[]="yashodeep";

    char* res=strchr(name,'y');

    if(res!='\0')
    {
        printf("Found at %d",res-name);
    }
}