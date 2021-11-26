#include<stdio.h>
int main()
{
   int ch, num, res;
   
  
       printf("\n  1. Factorial of a number");
       printf("\n  2. Sum of digits of a number");
       printf("\n  3. reverse of a number");
       printf("\n  4. exit");
       printf("\n Enter choice (1..4)");
       scanf(" %d",&ch);
       if(ch>4)  
       { 
           printf("\n Invalid input Enter 1..4"); 
       }
       
       printf("\n Enter a number: ");
       scanf(" %d",&num) ;
       if(ch==1)
          {res=fact(num);
          }   
       else if(ch==2)
           {res=sum_digits(num);
           } 
       else if(ch==3)
           {res=reverse(num);
           } 

       printf("\n Result = %d",res);

   
    printf("\n Bye.....");
    return 0;
}

int fact(int n)
{
   int fact=1,i;
   for(i=2;i<=n;i++)
    {fact=fact*i;
    } 
  
   return fact;
}

int reverse(int n)   
{
  int rem, rev_num=0;
  while(n>0)
  {
    rem=n%10;  
    rev_num=rev_num*10+rem;    
    n=n/10;
  }
  return rev_num;
}

