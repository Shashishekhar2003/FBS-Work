//HR (id, name, salary, commission)
#include<stdio.h>
#include<string.h>
struct HR store();
void display(struct HR);
struct HR
{
    int id;
    char name[10];
    double salary;
    int commission;

};
void main()
{
    struct HR hr1,hr2;

    printf("*****HR Details*****");
    hr1=store();
    
   display(hr1);

}

struct HR store()
{
    struct HR temp;
    printf("\nHR id:");
    scanf("%d",&temp.id);
    
    printf("HR Name:");
    scanf("%s",temp.name);

    printf("HR Salary:");
    scanf("%lf",&temp.salary);

    printf("HR Commission:");
    scanf("%lf",&temp.commission);

    return temp;
}

void display(struct HR hr)
{
    printf("HR Id=%d \nHR Name=%s \nHR Salary=%lf \nHR Commission=%d",hr.id,hr.name,hr.salary,hr.commission);

}