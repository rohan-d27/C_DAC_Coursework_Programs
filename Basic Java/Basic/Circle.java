package com.cdac.iet;
/*3. Write a Java program to read radius of a circle and print its area and circumference of it.*/


import java.util.Scanner;

public class Circle
{
public static void main(String args[])
{
	System.out.print("Enter radius of circle:");
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	float A=3.14f*r*r;
	float C=2*3.14f*r;
	System.out.printf("Area:%f \nCircumference:%f",A,C);
	
}

}
	
	
