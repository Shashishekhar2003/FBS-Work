//Q. Remove nth index char from non empty string

#include<stdio.h>
#include<string.h>
void main()
{
    char name[]="firstbit";
    int n=5;

    int i=0;
    while(name[i]!='\0')
    {
        if((i<name[5])&&(name[i]==name[5]))
        {
            name[i]=name[i+1];
        }
        i++;
    }
    name[i]='\0';
    printf("%s",name);
}