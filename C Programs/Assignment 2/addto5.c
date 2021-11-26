/*Write a program to get addition of numbers divisible by 5 till 30*/


#include<stdio.h>

int main() 
{
    int i,sum,a=0;
    for (i=1;i<=30;i++)
    {
        a=i%5;
        if(a==0)
        {
           sum=sum+i;
        }
       
    }
            printf("sum is %d ",sum);
}
