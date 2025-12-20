//Admin (id, name, salary, allowance)

#include<stdio.h>
#include<string.h>
struct Admin store();
void display(struct Admin);
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
    ad1=store();

    display(ad1);

}

struct Admin store()
{
    struct Admin temp;

    printf("\nAdmin ID : ");
    scanf("%d",&temp.id);

    printf("Admin Name :");
    scanf("%s",temp.name);

    printf("Admin Salary :");
    scanf("%lf",&temp.salary);

    printf("Admin Allowance: ");
    scanf("%d",&temp.allowance);

    return temp;

}

void display(struct Admin ad)
{
    printf("\nAdmin ID=%d \nAdmin Name=%s \nAdmin Salary=%lf \nAdmin Allowance=%d ",ad.id,ad.name,ad.salary,ad.allowance);

}