//HR (id, name, salary, commission)
#include<stdio.h>
#include<string.h>
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
    printf("\nHR id:");
    scanf("%d",&hr1.id);
    
    printf("HR Name:");
    scanf("%s",hr1.name);

    printf("HR Salary:");
    scanf("%lf",&hr1.salary);

    printf("HR Commission:");
    scanf("%lf",&hr1.commission);

    printf("HR Id=%d \nHR Name=%s \nHR Salary=%lf \nHR Commission=%d",hr1.id,hr1.name,hr1.salary,hr1.commission);
}