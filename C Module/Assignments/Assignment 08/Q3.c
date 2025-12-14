//3. Find sum of all numbers.

#include<stdio.h>
void main()
{
    int arr[10];
    int sum=0;
    printf("Enter the Elements of Array 1 :");    
    for(int i=0 ; i<10 ; i++)
        scanf("%d",&arr[i]);

    printf("Your Array 1 is ");
    for(int i=0 ; i<10 ; i++)
        printf("%d ",arr[i]);


    for(int i=0 ; i<10 ; i++)
    {
        sum=sum+arr[i];
    }
    printf("\n Sum is: %d ",sum);

}
