#include<stdio.h>
#include<string.h>
int mystrcmp(char* ,char* );
void main()
{
    char str1[]="apple";
    char str2[]="apple";

    int res = mystrcmp(str1,str2);

    if(res==0)
    printf("String are Equal");
    else if(res>0)
    printf("str1 > str2");
    else if(res<0)
    printf("str1 < str2");
}

int mystrcmp(char* str1,char* str2)
{
    int i =0;
    while (str1[i]!='\0' || str2[i]!='\0')
    {
        if(str1[i]!=str2[i])
        {
            if(str1[i]>str2[i])
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        
        i++;

    }
    return 0;

}