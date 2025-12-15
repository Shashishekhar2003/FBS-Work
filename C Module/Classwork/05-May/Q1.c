#include <stdio.h>
void evenodd();
void Pallindrome();
void leapYear();
void vowel();
void vote();
void uppercase();
void tsalary();

void triangle();
void greatest_among_three();
void grade();
void discount();

void main()
{

    int choice;
    printf(" 1 evenodd() \n 2 Pallindrome() \n 3 leapYear() \n 4 vowel() \n 5 vote() \n 6 uppercase() \n 7 tsalary()  \n 8 triangle() \n 9 greatest_among_three() \n 10 grade() \n 11 discount()");

    printf("\n Enter Your Choice ");
    scanf("%d", &choice);

    if (choice == 1)
    {
        evenodd();
    }
    else if (choice == 2)
    {
        Pallindrome();
    }
    else if (choice == 3)
    {
        leapYear();
    }
    else if (choice == 4)
    {
        vowel();
    }
    else if (choice == 5)
    {
        vote();
    }
    else if (choice == 6)
    {
        uppercase();
    }
    else if (choice == 7)
    {
        tsalary();
    }
    else if (choice == 8)
    {
        triangle();
    }
    else if (choice == 9)
    {
        greatest_among_three();
    }
    else if (choice == 10)
    {
        grade();
    }
    else if (choice == 11)
    {
        discount();
    }
    else
    {
        printf("Wrong Choice ");
    }

} // Main End Here

void evenodd()
{
    int num = 10;
    if (num % 2 == 0)
    {
        printf("\n Number is Even");
    }
    else
    {
        printf("\n Number is Odd");
    }
} // Fun evenodd end here

void Pallindrome()
{
    int no = 123;
    if (no % 10 == no / 100)
    {
        printf("\n Pallindrome");
    }
    else
    {
        printf("\n Not Pallindrome");
    }
} // Fun Pallindrome End

void leapYear()
{
    int year = 2000;
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
    {
        printf("\n Year %d Leap Year", year);
    }
    else
    {
        printf("\n Year is %d Not Leap Year", year);
    }
} // Fun leapYear End here

void vowel()
{
    char latter = 'x';

    if ((latter == 'a' || latter == 'e' || latter == 'i' || latter == 'o' || latter == 'u'))
    {
        printf("\n %c Its a Vowel", latter);
    }
    else
    {
        printf("\n %c Its not a Vowel", latter);
    }

} // Fun vowel End

void vote()
{
    int age = 20;

    if (age >= 18)
    {
        printf("\n Age %d You can Vote", age);
    }
    else
    {
        printf("\n Age %d You Can not Vote", age);
    }
} // Fun Vote End

void uppercase()
{
    char ch = 'z';

    if (ch >= 'A' && ch <= 'Z')
    {
        printf("\n %c Its Uppercase", ch);
    }
    else
    {
        printf("\n %c Its Lowercase", ch);
    }
} // Fun uppercase End

void tsalary()
{
    double bs = 7000;
    double da, ta, hra, ts;

    if (bs <= 5000)
    {
        da = bs * 0.10;
        ta = bs * 0.20;
        hra = bs * 0.25;
    }
    else
    {
        da = bs * 0.15;
        ta = bs * 0.25;
        hra = bs * 0.30;
    }
    ts = ta + da + hra;
    printf("\n %lf Total Salary is %lf ", bs, ts);
} // Fun tsalary End

void triangle()
{
    int side1 = 10, side2 = 10, side3 = 12;
    int area;

    if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
    {

        if (side1 == side2 && side2 == side3)
        {
            printf("\n The triangle is Equilateral.\n");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            printf("\n The triangle is Isosceles.\n");
        }
    }
    else
    {
        printf("\n The triangle is Scalene.\n");
    }
} // Fun Triangle ENd

void greatest_among_three()
{
    int a = 100, b = 800, c = 25;

    if (a > b)
    {
        if (a > c)
        {
            printf("\n A = %d is Grater  ", a);
        }
        else
        {
            printf("\n C = %d is grater  ", c);
        }
    }
    else
    {
        if (b < c)
        {
            printf("\n C = %d is Grater  ", c);
        }
        else
        {
            printf("\n B = %d is Grater  ", b);
        }
    }
} // Fun greatest_among_three() End

void grade()
{
    int marks = 46;

    if (marks > 75)
    {
        printf("\n A+ Grade");
    }
    else
    {
        if (marks > 55)
        {
            printf("\n B+ Grade");
        }
        else
        {
            if (marks > 45)
            {
                printf("\n C+ Grade ");
            }
            else
            {
                if (marks > 35)
                {
                    printf("\n P Grade");
                }
                else
                {
                    printf("\n Fail");
                }
            }
        }
    }
} // Fun grade End

void discount()
{
    int price = 800;
    char student = 'y';
    double discount;

    if (student == 'y' && price > 500)
    {
        discount = (20 / price) * 100;
    }
    else
    {
        discount = (10 / price) * 100;
    }
    if (student == 'n' && price > 600)
    {
        discount = (15 / 550) * 100;
    }

    printf("\n ");
    printf("\n Price = %d Discount = %lf ", price, discount);
} // Fun Discount END
