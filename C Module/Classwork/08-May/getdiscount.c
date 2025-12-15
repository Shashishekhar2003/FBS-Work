/*
Accept the price from user. Ask the user if he is a student (user may say y or n). If he
is a student and he has purchased more than 500 than discount is 20% otherwise
discount is 10%.But if he is not a student then if he has purchased more than 600
discount is 15% otherwise there is not discount. 
SOVLE USING FUN TYPE 4 
*/

#include <stdio.h>
int getdiscount(int, char, double); // fun decl
void main()
{
    int price;
    printf("Enter Price : ");
    scanf("%d", &price);

    char student;
    printf("Are you student (y or n) ");
    scanf(" %c", &student);

    double discount = 0;

    int res = getdiscount(price, student, discount); // fun call
    printf("Discount is %d : ", res);
}

int getdiscount(int price, char student, double discount) // fun def
{

    if (student == 'y' && price > 500)
    {
        discount = (20.0 / 100) * price;
        return discount;
    }
    else
    {
        discount = (10.0 / 100) * price;
        return discount;
    }
    if (student == 'n' && price > 600)
    {
        discount = (15.0 / 100) * price;
        return discount;
    }
}
