#include<stdio.h>
#include<string.h>
void main()
{
    char str1[]="yash";
    char str2[]="Badge";

    int res = strcmp(str1,str2);

    if(res==0)
    printf("String are Equal");
    else if(res>0)
    printf("str1 > str2");
    else if(res<0)
    printf("str1 < str2");
}

//In your case:
// "yash" vs "Badge" → 'y' (ASCII 121) is greater than 'B' (ASCII 66)