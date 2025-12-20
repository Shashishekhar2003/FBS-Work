#include <stdio.h>
#include <string.h>
struct student store();
void display(struct student );
struct student
{
    int roll;
    char name[10];
    int marks;
};
void main()
{
    struct student s1, s2;

    printf("\n \nEnter Details of Student .");
    s1 = store();   //Fun Call

    display(s1);   //Fun Call 
}

struct student store()
{
    struct student temp;
    printf("\nEnter Roll No of Student  =");
    scanf("%d", &temp.roll);
    printf("Enter Name of Student  =");
    scanf("%s", temp.name);
    printf("Enter Marks of student  =");
    scanf("%d", &temp.marks);

    return temp;
}

void display(struct student s)
{
    printf("\nRoll No = %d \nName is : %s \nMarks= %d", s.roll, s.name, s.marks);

}