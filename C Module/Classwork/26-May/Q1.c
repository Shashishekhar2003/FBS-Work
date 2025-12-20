struct student
{
    int id;
    char name[10];
    int marks;
};
#include <stdio.h>
#include <string.h>
struct student store();
void display(struct student );
void main()
{
    struct student s1, s2, s3;

    printf("ENter Details of Students 1:");
    s1 = store();
    printf("ENter Details of Students 2:");
    s2 = store();
    printf("ENter Details of Students 3:");
    s3 = store();

    display(s1);
    display(s2);
    display(s3);
}
struct student store()
{
    struct student temp;
    
    scanf("%d", &temp.id);

    scanf("%s", temp.name);

    scanf("%d", &temp.marks);

    return temp;
}

void display(struct student s)
{
    printf("\nID is %d", s.id);
    printf("\nName is : %s", s.name);
    printf("\nMarks is : %d\n \n", s.marks);
}
