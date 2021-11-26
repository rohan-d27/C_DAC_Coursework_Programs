package com.cdac.iet;/*8. Write a Java to take an integer from user and print its table.*/


import java.util.Scanner;

public class Tables

{
	public static void main(String Args[])
	{
	  System.out.print("Enter a number to print table: ");
	  Scanner sc = new Scanner(System.in);
	  int num=sc.nextInt();
	  int res=0;
	  for(int i=0;i<11;i++)
	  {
		 System.out.printf("\n %d * %d = %d",num,i,res);
	  }
	}
}