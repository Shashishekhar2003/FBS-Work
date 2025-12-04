/* Q1.Print a solid square pattern
Input: n = 4
Output:

* * * *
* * * *
* * * *
* * * * 

*/

#include <stdio.h>

int main() {
    int n = 4; // Size of the square
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("* ");
        }
        printf("\n"); // Move to the next line after each row
    }
}
