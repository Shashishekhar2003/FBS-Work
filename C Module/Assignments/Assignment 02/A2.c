//Accept three sides of a triangle from the user and determine whether the triangle is equilateral, isosceles, or scalene.
//equilateral triangle = all sides same length
//isosceles triangle = two sides same length
//scalene triangle = all sides diff. length
#include<stdio.h>
void main()
{
    int side1=10,side2=10,side3=12;
    int area;

    if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) 
    {

        if (side1 == side2 && side2 == side3) 
        {
            printf("The triangle is Equilateral.\n");
        } 
        else if (side1 == side2 || side2 == side3 || side1 == side3) 
        {
            printf("The triangle is Isosceles.\n");
        } 

    } 
            else 
        {
            printf("The triangle is Scalene.\n");
        }

}