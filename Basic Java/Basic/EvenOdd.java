package com.cdac.iet;/*5. Write a Java program to enter a number and print whether it is even or odd.*/

import java.util.Scanner;

public class EvenOdd
{
	public static void main(String Args[])
	{
	  System.out.print("Enter a number to check even or odd: ");
	  Scanner sc = new Scanner(System.in);
	  int num=sc.nextInt();
	  int e=num%2;
	  if(e==0)
	  {
		  System.out.print("Number is Even");
	  }
	  else
	  {
		  System.out.print("Number is Odd");
	  }
	}
}

	  

