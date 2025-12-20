//Employee (id, name, salary)

#include<stdio.h>
#include<string.h>
struct Employee
{
    int id;
    char name[10];
    double salary;
};
void main()
{
    struct Employee emp1,emp2;

    printf("......Fill the Employee Details......");
    printf("\nEmployee ID: ");
    scanf("%d",&emp1.id);

    printf("Employee Name: ");
    scanf("%s",emp1.name);

    printf("Employee Salary:");
    scanf("%lf",&emp1.salary);

    printf("\nEmployee ID: %d \nEmployee Name: %s \nEmployee Salary: %lf",emp1.id,emp1.name,emp1.salary);
}