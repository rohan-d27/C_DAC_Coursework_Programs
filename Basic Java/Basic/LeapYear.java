package com.cdac.iet;/*Write a Java program to enter a year value from user and print whether it leap year or not*/

import java.util.Scanner;


public class LeapYear
{
	public static void main(String args[])
{
	System.out.println("Enter a year:");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	if (year % 4 == 0) 
	{
      if (year % 100 == 0) 
	  {
        if (year % 400 == 0)
		{
          System.out.println(year + " is a leap year.");
		}
        else
		{ 
	      System.out.println(year + " is not a leap");
		}
      }
      else
	  {
		  System.out.println(year + " is a leap");
	  }
    }
    else
	{
		System.out.println(year + " is not a leap");
	}
}

}