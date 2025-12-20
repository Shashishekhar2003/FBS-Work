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
struct SalesManager store();
void display(struct SalesManager);
void main()
{
    struct SalesManager sm1,sm2;

    printf("SalesManager Details\n");
    sm1=store();

    display(sm1);

    

    

}

struct SalesManager store()
{
    struct SalesManager temp;

    printf("ID :");
    scanf("%d",&temp.id);

    printf("Name :");
    scanf("%s",temp.name);

    printf("Salary :");
    scanf("%lf",&temp.salary);

    printf("Incentive :");
    scanf("%d",&temp.incentive);

    printf("Target :");
    scanf("%d",&temp.target);

    return temp;
}

void display(struct SalesManager sm)
{
    printf("\nId=%d \nName=%s \nSalary=%lf \nIncentive=%d \nTarger=%d",sm.id,sm.name,sm.salary,sm.incentive,sm.target);

}