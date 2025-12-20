//Employee (id, name, salary)

#include<stdio.h>
#include<string.h>
struct Employee storeemp();
void displayemp(struct Employee );
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
    emp1=storeemp();     //store fun call

    displayemp(emp1);    //DIsplay fun call
}

struct Employee storeemp()
{
    struct Employee temp;

    printf("\nEmployee ID: ");
    scanf("%d",&temp.id);

    printf("Employee Name: ");
    scanf("%s",temp.name);

    printf("Employee Salary:");
    scanf("%lf",&temp.salary);

    return temp;
}

void displayemp(struct Employee emp)
{
    printf("\nEmployee ID: %d \nEmployee Name: %s \nEmployee Salary: %lf",emp.id,emp.name,emp.salary);
}