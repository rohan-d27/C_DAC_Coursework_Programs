package com.cdac.iet;

import java.util.Scanner;
 
public class Employee 
{
 
 	int empid;
 	String name;
 	String gender;
 
 public void getInput() 
	{
 
  	Scanner in = new Scanner(System.in);
  	System.out.print("Enter the empid : ");
  	empid = in.nextInt();
  	System.out.print("Enter the name : ");
  	name = in.next();
  	System.out.print("Enter the gender : ");
  	gender = in.next();
 	}
 
 public void display() 
	{
  
  	System.out.println("Employee id = " + empid);
  	System.out.println("Employee name = " + name);
  	System.out.println("Employee gender = " + gender);
	}
 
public static void main(String[] args) 
	{
 
	Employee e[] = new Employee[5];

  	for(int i=0; i<5; i++) 
	{
   
   	e[i] = new Employee();
   	e[i].getInput();
	}
  
System.out.println(" Data Entered as below ");
  
	for(int i=0; i<5; i++) 
	{
   
	e[i].display();
	}
	}
}