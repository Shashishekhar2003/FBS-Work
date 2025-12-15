//Ternary Operator
/* syntax = 

Variable = cindition ? true value : False value  ;
 */

#include<stdio.h>
/* void main(){
    int no=8;
    int x = no%2==0 ? printf("Even") : printf("Odd");
} */

void main()
{
    int a=10,b=200,c=30,x;
    x=a>b ?   a>c ? a : c   :   b>c ? b : c  ;
    printf("%d is grater ",x);

}