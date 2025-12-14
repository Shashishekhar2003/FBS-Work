//Accept array and print prime number of array
#include <stdio.h>

void main() {
    int arr[10], n;

    printf("Enter size of array: ");
    scanf("%d", &n);

    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Prime numbers in array: ");
    for (int i = 0; i < n; i++) {
        int num = arr[i];
        int flag = 0;   

        if (num <= 1) 
        {
            flag = 1;   
        } else 
        {
            for (int j = 2; j <= num / 2; j++)
             {
                if (num % j == 0) {
                    flag = 1;  
                    break;
                }o9
            }
        }

        if (flag == 0) {
            printf("%d ", num);   
        }
    }
}
