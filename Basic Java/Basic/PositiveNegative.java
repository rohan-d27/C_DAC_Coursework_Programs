package com.cdac.iet;
/*6. Write a Java program to enter a number and print whether it is positive or negative.*/



import java.util.Scanner;

public class PositiveNegative
{
	public static void main(String Args[])
	{
	  System.out.print("Enter a number to check even or odd: ");
	  Scanner sc = new Scanner(System.in);
	  int num=sc.nextInt();

	  if(num>0)
	  {
		  System.out.print("Number is Positive");
	  }
	  else
	  {
		  System.out.print("Number is Negative");
	  }
	}
}



