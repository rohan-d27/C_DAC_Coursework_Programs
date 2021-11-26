package com.cdac.iet;/* Write a Java program to accept a number from user and find sum of its digits.
   Example if input is 123 output is 6  (means 1+2+3)*/
   
import java.util.Scanner;
   
public class SumofDigits
   
{ 
	public static void main(String Args[]) 
{
		
	 System.out.println("Enter a number");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int add=0;
	 int d=0;
	   while(n!=0)
	{	   
       	 d=n%10;
		 add=add+d;
		 n=n/10;
	}
	System.out.println("Sum of digits is " + add);
}

}	