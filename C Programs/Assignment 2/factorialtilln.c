#include<stdio.h>
int main()
{
    int i,j,fact=1;
    for (i=1;i<=7;i++)
    {
        fact=1;
        for(j=1;j<=i;j++)
        {
            fact=fact*j;
        }
               printf("\n factorial of %d=%d",i,fact);
    }
    return 0;
}