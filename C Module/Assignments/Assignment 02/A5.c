/*
Accept the price from user. Ask the user if he is a student (user may say y or n). If he
is a student and he has purchased more than 500 than discount is 20% otherwise
discount is 10%.But if he is not a student then if he has purchased more than 600
discount is 15% otherwise there is not discount.
*/
#include<stdio.h>
void main()
{
    int price=550;
    char student='y';
    double discount;

    if(student=='y' && price>500)
    {
        discount=(20/price)*100;
       
    }
    else{
         discount=(10/price)*100;
    }
    if(student=='n' && price>600)
    {
        discount=(15/550)*100;
    }

    printf(" Price = %d Discount = %lf ",price,discount);
}