//1. Create a structure Book with data members as bname, id, author, price. Accept the
//values of all these members from user and display them.

typedef struct Book
{
    int id;
    char bname[10];
    char author[10];
    int price;

}Book;

#include<stdio.h>
void store(Book*);
void display(Book*);
void main()
{
    Book B1;

    printf("****Details Of Book****\n");

    store(&B1);

    
    display(&B1);

}
void store(Book* ptr)
{
    printf("Book ID =");
    scanf("%d",&ptr->id);

    printf("Book Name =");
    scanf("%s",ptr->bname);

    printf("Book Author =");
    scanf("%s",ptr->author);

    printf("Book Price =");
    scanf("%d",&ptr->price);
}

void display(Book* ptr)
{
    printf("****Details Of Book****\n");
    printf("\nId=%d \n Name=%s \n Author=%s \n Price=%d \n",ptr->id,ptr->bname,ptr->author,ptr->price);
}