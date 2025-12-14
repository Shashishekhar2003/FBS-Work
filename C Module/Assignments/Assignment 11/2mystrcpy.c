//mystrcpy
#include<stdio.h>
#include<string.h>
void mystrcpy(char* , char* );
void main()
{
    char str1[]="Yashodeep ";
    char str2[10];

    mystrcpy(str1,str2);

}

void  mystrcpy(char* src, char* dest) 
{
    int i=0;
    while(src[i]!='\0')
    {
       dest[i]=src[i];
        i++;
    }
    dest[i] = '\0';
   printf("Copied String is %s",dest);

}