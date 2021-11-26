package com.cdac.iet;/*Write a Java program to enter three numbers and print maximum number*/

import java.util.Scanner;


public class MaxNum
{
	public static void main(String args[])
{
	System.out.println("Enter num1:");
	
	Scanner sc=new Scanner(System.in);
	
	int num1=sc.nextInt();
	
	System.out.println("Enter num2:");
	
	int num2=sc.nextInt();
	
	System.out.println("Enter num3:");
	
	int num3=sc.nextInt();
	
	if(num1>num2&&num1>num3)
	{
	System.out.println("Num1 is greater number");
	}
	if(num2>num1&&num2>num3)
	{
	System.out.println("Num2 is greater number");
	}
	if(num3>num1&&num3>num2)
	{
	System.out.println("Num3 is greater number");
	}
	
}

}
	
	