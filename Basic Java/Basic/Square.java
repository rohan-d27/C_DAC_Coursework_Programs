package com.cdac.iet;/*4. Write a Java program to read a number and print its square.create a function*/

import java.util.Scanner;


public class Square
{

public static void main(String args[])
{
	System.out.print("Enter a number to get Square: ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	mysqr(num);
}
static void mysqr(int num)
{
	int sqr=num*num;
	System.out.printf("Square:%d",sqr);
}
}
	