//strrchr() – Find last occurrence of char

#include<stdio.h>
#include<string.h>
void main()
{
    char name[]="yashodeep";

    char *ptr=strrchr(name,'e');

    if(ptr!=NULL)
    printf("Last occurrance of 'e' found at %lu",ptr - name);  
    //ptr - str gives the index (position) of the found character in the string.
}