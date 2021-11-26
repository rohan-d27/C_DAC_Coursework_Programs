package com.cdac.iet;

import java.util.Scanner;

public class Histogram2
{
	
	public static void main(String args[])
	{
		int num=0, num2=0;
		System.out.print("Enter a int : ");

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		//num2 = sc.nextInt();

		print_histogram(num);
		//print_histogram(num2);
		System.out.println("");
		System.out.println("");
		print_vhistogram(num);
		
	}
	
	static void print_histogram(int num)
	{
		System.out.print(num + " : ");
				
		for(int i=0; i<num; i++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}

	static void print_vhistogram(int num)
	{
		for(int i=0; i<num; i++)
		{
			System.out.println("*");
		}
		System.out.println("--");
		System.out.print(num);
	}

}
