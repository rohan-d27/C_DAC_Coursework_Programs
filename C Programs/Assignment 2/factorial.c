#include<stdio.h>
int main()
{
    int num,f=1,i;
    printf("Enter a number");
    scanf("%d", &num);
    for (i = num; i>0; i--)
    {
      f=f*i;
    }
    printf("factorial are %d",f);
    
}