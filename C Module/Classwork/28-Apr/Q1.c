typedef struct student
{
    int id;
    char Name[10];
    int Marks;
} student;
#include <stdio.h>
#include <string.h>
void main()
{

    student arr[5];
    printf("***Arr Batch***");
    for (int i = 0; i < 5; i++)
    {
        printf("Enter Details Of Student:%d \n", i + 1);
        printf("ID=");
        scanf("%d", &arr[i].id);
        printf("Name=");
        scanf("%s", arr[i].Name);
        printf("Marks");
        scanf("%d", &arr[i].Marks);
    }
    for (int i = 0; i < 5; i++)
    {
        printf("\nId=%d \nName=%s \nMarks=%d ", arr[i].id, arr[i].Name, arr[i].Marks);
    }

    int id, flag = -1;
    printf("Enter the ID you want too Search ");
    scanf("%d", &id);
    for (int i = 0; i < 5; i++)
    {
        if (arr[i].id == id)
        {
            flag = 1;
            break;
        }
    }
    if (flag != -1)
        printf("ID Found at index %d", flag);
    else
        printf("ID Not Found.");
}