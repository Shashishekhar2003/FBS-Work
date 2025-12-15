#include<stdio.h>
void main()
{
    int a=10;
    int* ptr=&a;

    printf("Value of a= %d \n",a);

    printf("Address of a= %u \n",&a);

    printf("Address of a = %u \n",ptr);
    

    printf("Address of ptr = %u \n",&ptr);

    printf("Value of ptr = %d \n",ptr);

    printf("Value of ptr = %d \n",(ptr+1));
    printf("Value of ptr = %d \n",(ptr+2));
    printf("Value of ptr = %d \n",(ptr+3));
    printf("Value of ptr = %d \n",(ptr+4));

}