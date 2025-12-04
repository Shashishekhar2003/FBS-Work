//1. Print armstrong numbers in the given range 1 to n.
 #include <stdio.h>
void main()
{
    for (int range = 1; range <= 10000; range++)
    {
        int no = range;
        int ogNumber = no;
        int sum = 0, rem = 0;

        while (no > 0)
        {
            rem = no % 10;
            sum = sum + rem * rem * rem;
            no = no / 10;
        }

        if (sum == ogNumber)
        {
            printf("%d is an Armstrong Number\n", ogNumber);
        }
    }
}
  
