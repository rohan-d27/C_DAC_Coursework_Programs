package com.cdac.iet;/*Write a Java program to display the fibonnacci series take input from user how many numbers to show*/

import java.util.Scanner;


public class Fibonacci
{
	public static void main(String args[])
{
    System.out.println("Enter a number till you want to see Fibonacci numbers: ");
	Scanner sc=new Scanner(System.in);
	int count=sc.nextInt();
	System.out.println("Fibonacci numbers are: ");
	int n1=0,n2=1,n3,i;    
    System.out.print(n1+" "+n2);   
    
     for(i=2;i<count;++i)
 {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
 }    
  
}}  