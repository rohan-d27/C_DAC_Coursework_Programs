/*Write a program to get  addition of all even numbers and odd numbers between 1 to 10*/


#include<stdio.h>

int main()
{
    int i,even,odd;
    for ( i = 0; i <=10;i++)
     {
         if (i%2==0)
         {
             even=even+i;
           
         }
         else
         {
             odd=odd+i;
         }
     }
       printf("the addition of even numbers between 1 and 10 is %d\n",even);
       printf("addition of odd numbers between 1 and 10 is %d",odd);
}
