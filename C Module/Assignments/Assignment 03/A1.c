// Print 1 to 10 numbers

/* #include<stdio.h>
void main()
{
    int no=1;
    while (no<=10)
    {
        printf("%d ",no);
        no++;
    }

}
 */

#include <stdio.h>
void main()
{
    int no;
    int flag;
    for (no = 1; no <= 10; no++)
    {
        if (no < 2)
        {
            continue;
        }
        flag = 0;

        for (int j = 2; j < no / 2; j++)
        {
            if (no % j == 0)
            {
                flag = 1;
                break;
            }
        }
        if(flag==0)
        {
            printf("%d",no);
        }
    }
}