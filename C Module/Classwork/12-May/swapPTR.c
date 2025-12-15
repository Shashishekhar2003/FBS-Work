#include<stdio.h>
void swap(int* ,int*);     //Fun Decl
void main()
{
    int a=10,b=20;
    
    swap(&a,&b);      //FUn CAll
    printf("a= %d b= %d ",a,b);
}

    void swap(int*x , int*y)    //Fun Def
    {
        int temp=*x;
        *x=*y;
        *y=temp;

    }
