//Product (id, name, quantity, price)
struct Product
{
    int id;
    char name[10];
    int quantity;
    int price;
};
#include<stdio.h>
#include<string.h>
void main()
{
    struct Product p1;

    printf("Product Id :");
    scanf("%d",&p1.id);

    printf("Product Name :");
    scanf("%s",p1.name);

    printf("Product Quantity :");
    scanf("%d",&p1.quantity);

    printf("Product Price :");
    scanf("%d",&p1.price);

    printf("\nProduct id=%d \nProduct Name=%s \nProduct Quantity=%d \nProduct Price=%d",p1.id,p1.name,p1.quantity,p1.price);
}