#include<stdio.h>
int main()
{
    int i,even,odd;
    for (int i = 0; i <=10;i++)
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
       printf("%d",even);
       printf("%d",odd);
}