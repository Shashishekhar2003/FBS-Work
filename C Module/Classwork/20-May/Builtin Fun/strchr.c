//strchr() – Find first occurrence of char

#include<stdio.h>
#include<string.h>
void main()
{
    char name[]="yashodeep";

    char *ptr=strchr(name,'e');

    if(ptr!=NULL)
    printf("First occurrance of 'e' found at %lu",ptr - name);  
    //ptr - str gives the index (position) of the found character in the string.
}