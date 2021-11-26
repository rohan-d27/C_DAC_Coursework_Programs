/*Write a program to get prime numbers till n*/


#include<stdio.h>

int main()
{
    int n,i,fact,j;
    printf("Enter the till you want prime number");
    scanf("%d",&n);
    printf("Prime Numbers are: \n");
    for(i=1; i<=n; i++)
    {
        fact=0;
        for(j=1; j<=n; j++)
        {
            if(i%j==0)
                fact++;
        }
        if(fact==2)
            printf("%d " ,i);
    }
}
