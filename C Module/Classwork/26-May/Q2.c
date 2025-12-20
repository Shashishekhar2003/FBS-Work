struct Employee
{
    int id;
    char name[10];
    double salary;
    char name[10]
}

#include<stdio.h>
#include<string.h>
void main()
{
    struct Employee emp1,emp2,emp3;

    printf("Enter the Details of Employee.\n");

    printf("Employee 1 :");
    emp1=storeEmp();

    printf("Employee 2 :");
    emp1=storeEmp();

    printf("Employee 3 :");
    emp1=storeEmp();


    displayEmp(emp1);
    displayEmp(emp2);
    displayEmp(emp3);

}

struct Employee storeEmp()
{
    struct Employe temp;
    printf("ID :");
    scanf("%d",&temp.id);
    printf("Name :");
    scanf("%s",temp.name);
    printf("Salary :");
    scanf("%lf",&temp.salary);

    return temp;
}