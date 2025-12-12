#include <stdio.h>
void get_sPrice(int, int);
void main() 
{
    int cPrice;
    int discount = 50; // Discount percentage

    printf("Enter the Cost Price of Book: ");
    scanf("%d", &cPrice);

    get_sPrice(cPrice, discount); // Call the function
}

void get_sPrice(int cPrice, int discount) 
{
    int discountAmount = (cPrice * discount) / 100;
    
    int sPrice = cPrice - discountAmount;

    printf("Selling Price of Book is: %d\n", sPrice);
}
