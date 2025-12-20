//Complex (real, imaginary)


struct Complex
{
    int real,imaginary;
};
#include<stdio.h>
void main()
{
    struct Complex c1;
    printf("real :");
    scanf("%d",&c1.real);

    printf("imaginary :");
    scanf("%d",&c1.imaginary);

    printf("\nreal :%d \nMin %d",c1.real,c1.imaginary);
}
