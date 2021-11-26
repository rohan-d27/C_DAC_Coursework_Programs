/*Write a function to print following menu
 1.factorial,
2.Sum of digits,
3.reverse of a number 
and print output*/


#include <stdio.h>

int main()
{
  int rev(int n);
  int sum(int n);	
  int fact(int);
  int c,num,f,g,res;
  
    while(1)
  {
  	
  	printf("\n1.Factorial of number\n2.Sum of number\n3.reverce of number\n4.exit");
  	printf("\nEnter the choice");
  	scanf("%d",&c);
  	if(c==4)
  	{
  	  break;	
  	}
  	  printf("\nEnter the number");
  	  scanf("%d",&f);	
  	switch(c)
  	{
  		case 1:
  			
  			 
  		     res=fact(f);
  		     printf("\nfactorial is :%d\n",res);
  		     break;
  			
  		case 2:
  			
  			 
  		     res=sum(f);
  		     printf("\nsum is :%d\n",res);
  		     break;	
  			
		case 3:
  			
  			 
  		     res=rev(f);
  		     printf("\nreverce is :%d\n",res);
  		     break;	  	
  	}
  	
  	
  }
return 0;
}

int fact(int f)
  {
  	int fact=1,i;
  	for(i=2;i<=f;i++)
  	   fact=fact*i;
  	   
  	return fact;
  	
  	
  }
  
  
  int sum(int n)
  {
  	int rem,add=0;
  	
  	while(n!=0) 
	  {
	  	
	  	rem=n%10;
	  	add=rem+add;
	  	n=n/10;
	  	
      }
     return add;
  }
  
  int rev(int n)
  {
  	
  	int rem,rev=0;
  	
  	while(n!=0) 
	  {
	  	
	  	rem=n%10;
	  	rev=(rev*10)+rem;
	  	n=n/10;
	  	
      }
     return rev;
  	
  }

