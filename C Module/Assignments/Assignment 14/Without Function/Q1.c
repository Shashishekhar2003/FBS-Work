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

    s1.roll=14;
    strcpy(s1.name,"Yashodeep");
    s1.marks=80;

    printf("Roll No = %d \nName is : %s \nMarks= %d",s1.roll,s1.name,s1.marks);

    printf("\n \nEnter Details of Student 2.");
    printf("\nEnter Roll No of Student 2 =");
    scanf("%d",&s2.roll);

    printf("Enter Name of Student 2 =");
    scanf("%s",s2.name);

    printf("Enter Marks of student 2 =");
    scanf("%d",&s2.marks);

    printf("\nRoll No = %d \nName is : %s \nMarks= %d",s2.roll,s2.name,s2.marks);
}