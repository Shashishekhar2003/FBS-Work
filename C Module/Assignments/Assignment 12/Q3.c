//Q3.WAP to Remove the nth Index Character from a Non-Empty String

#include<stdio.h>
void main()
{
    char str[10];
    int index;

    printf("Enter the String :");
    scanf("%s",str);
    printf("Enter the INDEX that you want to remove :");
    scanf("%d",&index);

    for(int i=0 ; i<10 ; i++)
    {
        if(i==index)
        {
            str[i]=' ';
        }
    }
    printf("Updated String is : %s",str);
}