package com.cdac.iet;/*Write a Java program to input a number and a digit and count & print number of times the d*/


import java.util.Scanner;
   
public class Digit
   
{ 
	public static void main(String Args[]) 
{
		
	 System.out.println("Enter a number");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 System.out.println("Enter a Digit to count in given number");
	 int d=sc.nextInt();
	 int m=0,count=0;
	 while(n!=0)
	{
       	 m=n%10;
	     if(m==d)
		 {
		   count++;
		 }
		 n=n/10;
		 
	}
	System.out.printf("Digit appeared %d times in given number",count);
}

}
