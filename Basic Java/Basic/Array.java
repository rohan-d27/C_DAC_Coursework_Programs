package com.cdac.iet;/*Write an array and display its elements*/


import java.util.Scanner;


public class Array
{
	public static void main(String args[])
{
	int []arr =new int[5];
	System.out.println("Enter 5 elements of array");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
	 arr[i]=sc.nextInt();
	}
	System.out.println("Array is:");	
 	for(int i=0;i<arr.length;i++)
	{
	System.out.printf("\t%d",arr[i]);
	}
}

}