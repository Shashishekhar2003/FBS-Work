/* Q3. Program to manage TO-DO-LIST Implement structure to store task details (task id, description , Status)
write menu driven code to add task , update task , display task  Use Functions in it .*/

typedef struct Task
{
    int taskId;
    char description[20];
    char status[10];

} Task;

#include <stdio.h>
#include <string.h>
void addtask(Task* ,int );
void updatetask(Task* ,int );
void displaytask(Task* ,int );
void main()
{
    Task T1[4];

    int size = 4;

    int choice;

    while (1)
    {
        printf("*****TASK MANAGER*****\n");
        printf("1.Add Task\n");
        printf("2.Update Task\n");
        printf("3.Display Task\n");
        printf("4.Exit\n");
        printf("Enter Your Choice :");
        scanf("%d",&choice);

        switch (choice)
        {
        case 1:
            addtask(T1,size);
            break;

        case 2:
            updatetask(T1,size);
            break;

        case 3:
            displaytask(T1,size);
            break;

        case 4:
            exit(0);
            break;

        default:
            printf("Invalid Input......");
            break;
        }
    }
}//main end

void addtask(Task* ptr,int size)
{
    for(int i=0;i<size;i++)
    {
        printf("Task %d",i+1);
        printf("\nTask ID:");
        scanf("%d",&ptr[i].taskId);

        printf("Task Description:");
        scanf("%s",ptr[i].description);

        printf("Task Status:\n");
        scanf("%s",ptr[i].status);
    }
}

void updatetask(Task* ptr,int size)
{
    int id;
    printf("\nEnter Task ID that you want to Update :");
    scanf("%d",&id);

    for(int i=0;i<size;i++)
    {
        if(id==ptr[i].taskId)
        {
            printf("ID:");
            scanf("%d",&ptr[i].taskId);
            printf("description :");
            scanf("%s",ptr[i].description);
            printf("Status :");
            scanf("%s",ptr[i].status);
        }
    }
}

void displaytask(Task* ptr,int size)
{
    for(int i=0;i<size;i++)
    {
        printf("\nTask ID:%d \nTask Description:%s \nTask Status:%s ",ptr[i].taskId,ptr[i].description,ptr[i].status);
    }
}