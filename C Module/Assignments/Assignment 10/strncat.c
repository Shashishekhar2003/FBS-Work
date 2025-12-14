#include<stdio.h>
#include<string.h>
void main()
{
    char str1[]="Hello ";
    char str2[]="Yashodeep Badge";

    strncat(str1,str2,9);

    printf("%s ",str1);
}
