#include <stdio.h>
int evenodd(int);
void main()
{
    int no;
    printf("Enter the Number : ");
    scanf("%d",&no);

   int res = evenodd(no);  //call
    if(res==1)
        printf("No is Even ");
    else
        printf("No is odd ");
}
int evenodd(int no)     // Fun Def
{
    return no%2==0;    //return int here
}
