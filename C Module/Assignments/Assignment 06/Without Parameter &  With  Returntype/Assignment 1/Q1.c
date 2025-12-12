//1. Convert Ass_1 and ASS_2 program into functions with type 1

#include <stdio.h>
int evenodd();
void main()
{
   int res = evenodd();  //call
    if(res==1)
        printf("No is Even ");
    else
        printf("No is odd ");
}
int evenodd()     // Fun Def
{
    int no=8;
    return no%2==0;    //return int here
}
