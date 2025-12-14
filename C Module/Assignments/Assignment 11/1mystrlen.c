#include<stdio.h>
#include<string.h>
int mystrlen(char* );
void main()
{
    char name[]="yashodeep";
    int len=mystrlen(name);
    printf("Length of string is %d",len);
}

int mystrlen(char* str)
{
    int i=0;
    while(str[i]!='\0')
        i++;
        
    return i;
}