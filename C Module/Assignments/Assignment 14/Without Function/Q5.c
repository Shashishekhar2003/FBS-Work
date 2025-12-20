//SalesManager (id, name, salary, incentive, target)

struct SalesManager
{
    int id;
    char name[10];
    double salary;
    int incentive;
    int target;
};
#include<stdio.h>
#include<string.h>
void main()
{
    struct SalesManager sm1,sm2;

    printf("SalesManager Details\n");
    printf("ID :");
    scanf("%d",&sm1.id);

    printf("Name :");
    scanf("%s",sm1.name);

    printf("Salary :");
    scanf("%lf",&sm1.salary);

    printf("Incentive :");
    scanf("%d",&sm1.incentive);

    printf("Target :");
    scanf("%d",&sm1.target);

    printf("\nId=%d \nName=%s \nSalary=%lf \nIncentive=%d \nTarger=%d",sm1.id,sm1.name,sm1.salary,sm1.incentive,sm1.target);

}