package com.cdac.iet;/*. Display all prime number between 1 to 100.*/




public class Primeno
{
	public static void main(String args[])
{
	System.out.println("Prime numbers between 1 to 100 are: ");
	for(int i=1;i<100;i++)
	{ int fact=0;
	  
	   for(int j=1;j<=100;j++)
	   {
	     if(i%j==0)
		 {
		  fact++;
		  }
	   }
	   if(fact==2)
		{	
			System.out.printf("\n%d",i);
		}
    }		
}
}