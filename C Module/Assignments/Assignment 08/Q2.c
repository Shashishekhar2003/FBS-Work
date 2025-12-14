//2. Search the given number in array.

#include<stdio.h>
void main()
{
    int arr[5];
    printf("Enter the Elements of Array : ");
    for(int i=0 ; i<5 ; i++)      //Scan the input 
    {
        scanf("%d",&arr[i]);
    }

    printf("Your Array is = ");
    for(int i=0 ; i<5 ; i++)     //Print the array
    {
        printf("%d ",arr[i]);
    }
 
    int ele,flag=0;
    printf("\nEnter the Element you want to search :");
    scanf("%d",&ele);

    for(int i=0 ; i<5 ; i++)
    {
        if(ele==arr[i])
        {
            printf("Element found : %d ",arr[i]);
            flag=1;
            break;
        }

    }
    if(flag==0)
    printf("Element Not Found ");

}