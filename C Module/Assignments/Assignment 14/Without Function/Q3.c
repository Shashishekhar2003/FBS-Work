//Admin (id, name, salary, allowance)

#include<stdio.h>
#include<string.h>
struct Admin
{
    int id;
    char name[10];
    double salary;
    int allowance;

};
void main()
{
    struct Admin ad1,ad2;

    printf("ADMIN DETAILS");
    printf("\nAdmin ID : ");
    scanf("%d",&ad1.id);

    printf("Admin Name :");
    scanf("%s",ad1.name);

    printf("Admin Salary :");
    scanf("%lf",&ad1.salary);

    printf("Admin Allowance: ");
    scanf("%d",&ad1.allowance);

    printf("\nAdmin ID=%d \nAdmin Name=%s \nAdmin Salary=%lf \nAdmin Allowance=%d ",ad1.id,ad1.name,ad1.salary,ad1.allowance);
}