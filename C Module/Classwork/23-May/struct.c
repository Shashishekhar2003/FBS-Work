#include<stdio.h>
#include<string.h>
struct student 
{
    int roll;
    char name[10];
    int marks;
};
void main()
{
    struct student s1,s2;

    printf("\n \nEnter Details of Student 1.");
    printf("\nEnter Roll No of Student  =");
    scanf("%d",&s2.roll);

    printf("Enter Name of Student  =");
    scanf("%s",s2.name);

    printf("Enter Marks of student  =");
    scanf("%d",&s2.marks);

    printf("\nRoll No = %d \nName is : %s \nMarks= %d",s2.roll,s2.name,s2.marks);
}