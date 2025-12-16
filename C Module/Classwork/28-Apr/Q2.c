typedef struct student
{
    int id;
    char Name[10];
    int Marks;
}student;

#include<stdio.h>
#include<string.h>
void main()
{
    student july[5];
    printf("\nJuly Batch");
    for(int i=0;i<5;i++)
    {
        printf("Enter Details Of Student:%d \n",i+1);
        printf("ID=");
        scanf("%d",&july[i].id);
        printf("Name=");
        scanf("%s",july[i].Name);
        printf("Marks");
        scanf("%d",&july[i].Marks);
    }
    printf("\n*** Details Of July Batch ***");

    for(int i=0;i<5;i++)
    {
        printf("\nId=%d \nName=%s \nMarks=%d ",july[i].id,july[i].Name,july[i].Marks);
    }

    student aug[6];
    printf("\nAug Batch");
    for(int i=0;i<6;i++)
    {
        printf("\n\nEnter Details Of Student:%d \n",i+1);
        printf("ID=");
        scanf("%d",&aug[i].id);
        printf("Name=");
        scanf("%s",aug[i].Name);
        printf("Marks");
        scanf("%d",&aug[i].Marks);
    }

    printf("\n***Details Of Aug Batch***");
    for(int i=0;i<6;i++)
    {
        printf("\nId=%d \nName=%s \nMarks=%d ",aug[i].id,aug[i].Name,aug[i].Marks);
    }

    student sept[8];
    printf("\nSept Batch");
    for(int i=0;i<8;i++)
    {
        printf("\n\nEnter Details Of Student:%d \n",i+1);
        printf("ID=");
        scanf("%d",&sept[i].id);
        printf("Name=");
        scanf("%s",sept[i].Name);
        printf("Marks");
        scanf("%d",&sept[i].Marks);
    }
    printf("\n***Details Of Sept Batch***");
    for(int i=0;i<8;i++)
    {
        printf("\nId=%d \nName=%s \nMarks=%d ",sept[i].id,sept[i].Name,sept[i].Marks);
    }

    int id, flag = -1;
    printf("\nEnter the ID you want too Search ");
    scanf("%d",id);
    for (int i = 0; i < 5; i++)
    {
        if (july[i].id == id || aug[i].id==id ||sept[i].id==id)
        {
            flag = 1;
            break;
        }
    }
    if (flag != -1)
        printf("ID Found at index %d ", flag);
    else
        printf("ID Not Found.");
}