package com.cdac.iet;/*2.Create a class Employee having member empId(int), empName(String),gender(char)*/

import java.util.Scanner;

class Employee2
{
	int id;
	String name;
	String gender;

	void populate()
	{


		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id : ");
	    	id = sc.nextInt();
		System.out.print("Enter the name : ");
	        name = sc.next();
		System.out.print("Enter the gender : ");
            gender = sc.next();
	}

	void display()
	{

	System.out.println("Employee id = " + id);
  	System.out.println("Employee name = " + name);
  	System.out.println("Employee gender = " + gender);

	}
}


class testemployee
{

    private static Employee2[] emp;

    public static void main(String args[])
{

	System.out.println("How many Employee data you want to enter");
	Scanner num=new Scanner(System.in);
	int n=num.nextInt();

	Employee2 []emp= new Employee2[n];

	for(int i=0;i<n;i++)

	{

		emp[i]=new Employee2();
		emp[i].populate();

	}

System.out.println(" Data Entered as below ");

	for(int i=0; i<n; i++)
	{

	emp[i].display();
	}


}
}