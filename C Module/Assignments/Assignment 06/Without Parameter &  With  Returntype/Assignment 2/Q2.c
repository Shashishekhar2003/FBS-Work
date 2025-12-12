// Accept three sides of a triangle from the user and determine whether the triangle is equilateral, isosceles, or scalene.
// equilateral triangle = all sides same length
// isosceles triangle = two sides same length
// scalene triangle = all sides diff. length

// Using Function type 2

#include <stdio.h>
int triangle();
void main()
{

    int res = triangle();

    if (res == 1)
    {
        printf("The triangle is Equilateral.\n");
    }
    else if (res == 2)
    {
        printf("The triangle is Isosceles.\n");
    }
    else if (res == 3)
    {
        printf("The triangle is Scalene.\n");
    }
    else
    {
        printf("The sides do not form a triangle.\n");
    }
}

int triangle()
{

    int side1, side2, side3;
    int area;
    printf("Enter the three Sides of triangle");
    scanf("%d %d %d", &side1, &side2, &side3);

    if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
    {

        if (side1 == side2 && side2 == side3)
        {
            return 1;
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            return 2;
        }
    }
    else
    {
        return 3;
    }
}