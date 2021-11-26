package Q2_Employee_Class;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	String gender;

	public Employee() {
		id=0;
		name="null";
		gender="null";

	}

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
