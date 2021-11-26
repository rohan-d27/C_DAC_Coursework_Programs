package com.cdac.iet;/*2. Write a Java program to read 2 numbers from user and print addition, subtraction, multiplication, division and modulus.*/



import java.util.Scanner;


public class Twonum

{
	public static void main(String args[])
{	
	
	System.out.print("Enter two numbers");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int add=num1+num2;
	int sub=num1-num2;
	int mul=num1*num2;
	float div=(float)num1/num2;
	float  mod=(float)num1%num2;
	System.out.printf("Addition:%d \nSubstraction:%d \nMultiplication:%d \nDivision:%f \nModulas:%f",add,sub,mul,div,mod);
}

}