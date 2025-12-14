#include<stdio.h>
#include<string.h>
void mystrcat(char* , char* ,char* );
void main()
{
    char name[]="Yashodeep ";
    char sName[]="Badge";
    char str[50];

    mystrcat(name,sName,str);
}

//It combine two string

void mystrcat(char* str1, char* str2,char* str)
{
    int i=0,j=0;
     while (str1[i] != '\0')
    {
        str[i] = str1[i];
        i++;
    }


    while (str2[j] != '\0')
    {
        str[i] = str2[j];
        i++;
        j++;
    }
    str[i]='\0';
    printf("%s",str);
}