package com.cdac.iet;/*Accept input from the user and check whether the input is number or character or symbol*/

import java.util.Scanner;


public class Charcheck
{
	public static void main(String args[])
{
	System.out.println("Enter a character:");
	Scanner sc=new Scanner(System.in);
	 char ch=sc.next().charAt(0);
	 if(ch>=48&&ch<=57)
	 {
	   System.out.println("You hava entered a number");
	 }
	 else if(ch>65&&ch<=90 || ch>=97&&ch<=122)
	 {
	  System.out.println("You hava entered alphabet");
	 }
	 else
	 {
	   System.out.println("You hava entered symbol");
	 }
}

}
