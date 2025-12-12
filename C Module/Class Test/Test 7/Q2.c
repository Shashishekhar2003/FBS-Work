#include <stdio.h>
void main() {
    int n, flag = 1;
    
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements:\n", n);
    for(int i=0; i<n; i++) {
        scanf("%d", &arr[i]);
    }

    for(int i=0; i<n/2; i++) {
        if(arr[i] != arr[n-1-i]) {
            flag = 0;
            break;
        }
    }

    if(flag == 1)
        printf("Array is Palindrome\n");
    else
        printf("Array is Not Palindrome\n");
}
