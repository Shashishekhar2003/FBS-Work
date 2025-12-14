//4. Find odd and even among the numbers.

#include<stdio.h>
void main()
{
    int arr[10];
  
    printf("Enter the Elements of Array 1 :");    
    for(int i=0 ; i<10 ; i++)
        scanf("%d",&arr[i]);

    printf("Your Array 1 is ");
    for(int i=0 ; i<10 ; i++)
        printf("%d ",arr[i]);

    printf("\nEven Numbers :");
    for(int i=0;i<10;i++)
    {
        if(arr[i]%2==0)
        printf(" %d",arr[i]);

    }
}