package Q2_Employee_Class;
/*COP_Assignment_1*/
/*Q2.Create a class Employee having member empId(int),  empName(String),gender(char)
1.Write parameter less constructor and initialize your variables.
2.Write display function which displays the data.
Also write TestMain class in the same file  which will create the object of class Employee in it and call the display() Function.*/


import java.util.Scanner;

public class Main_Employee {

	public static void main(String[] args) {

		System.out.println("How many Employee data you want to enter:");
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();

		Employee []emp= new Employee[n];

		for(int i=0;i<n;i++)

		{

			emp[i]=new Employee();
			emp[i].populate();

		}

		System.out.println("Data Entered as below: ");

		for(int i=0; i<n; i++)
		{

			emp[i].display();
		}

	}

}
