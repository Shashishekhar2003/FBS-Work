/*Accept the age and check if the person is:
Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)*/

#include <stdio.h>
int age();
void main()
{
    int res = age();
    if (res == 1)
        printf("Senior");
    else if (res == 2)
        printf("Adult");
    else if (res == 3)
        printf("Teenager");
    else
        printf("Child");
}

int age()
{
    int age;
    printf("Enter Your Age : ");
    scanf("%d",&age);

    if (age >= 60)
        return 1;
    else if (age > 20)
        return 2;
    else if (age > 12)
        return 3;
    else
        return 4;
}