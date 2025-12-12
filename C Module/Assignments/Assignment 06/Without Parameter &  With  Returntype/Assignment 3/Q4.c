#include<stdio.h>
int getprime();
void main()
{
    int res=getprime();
    if(res==0)
    printf("Prime");
    else
    printf("Not Prime");
}

int getprime()
{
    int no=3,i=2,flag=0;
    while(i<no)
    {
        if(no %i==0)
        {
            flag=1;
            break;
        }
        i++;
    }
     if(flag==0){
            return 0;
        }
        else{
            return 1;
        }
}