#include<stdio.h>
int main() 
{
    int num,i,t=0;
    printf("enter a number to print table ");
    scanf("%d",&num);
    for(i=1;i<=10;i++)
    {
      t=num*i;
      printf("table is %d*%d = %d\n",num,i,t);
    }
}