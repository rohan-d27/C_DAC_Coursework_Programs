package com.cdac.iet;/*Print Horizontal Histogram take input from user*/

import java.util.Scanner;

public class Histogram
{
		public static void main(String args[])
		{
			System.out.print("Enter three numbers : ");
			Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int num3=sc.nextInt();
			print_histogram(num1);
			print_histogram(num2);
			print_histogram(num3);
			
			
		}
static void print_histogram(int num)
	{
		System.out.printf("%d stars: ",num);		
		for(int i=0; i<num; i++)
		{
			System.out.print("*");
		}
		System.out.println("\n");
	}
		
}