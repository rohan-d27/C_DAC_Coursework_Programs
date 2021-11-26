#include<stdio.h>

int main()
{
	int ch, num, res;
	printf("\n Enter your choice: \n 1.Factorial\n 2.Sumof digit\n 3.Reverse");
	scanf("%d,ch");
	 if(ch==1)
          {res=fact(num);
          }   
       else if(ch==2)
           {res=sum_digits(num);
           } 
       else if(ch==3)
           {res=reverse(num);
           } 
             printf("\n Enter a number: ");
       scanf(" %d",&num) ;
            printf("\n Result = %d",res);
             return 0;
         }
         
			int res,fact(int n)
{
{
  			 int fact=1,i;
  			 for(i=2;i<=n;i++)
    	{
		res=fact*i;
   		 } 
   		    return res;
}
}

int reverse(int n)   
{
  int res,rem, rev_num=0;
  while(n>0)
  {
    rem=n%10;  
    res=rev_num*10+rem;    
    n=n/10;
  }
  return res;
}

