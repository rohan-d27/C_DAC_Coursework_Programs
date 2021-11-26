/*Q1.Write a class Employee having fields id, name ,salary
write no-args and parameterized constructor  and showEmpDetails  function--- 
show the info in the class
create another class MainEmpUser in that class In
public static void main(String args[])
create an employee array of size entered by user
in a loop accept the employee details for each employee and create an Employee object 
add the object to the array after completing this---
in another loop show details of all the employees entered in the array.*/

package Employee;

import java.util.Scanner;

public class MainEmployee {
	
	public static void main(String[] args) {
		System.out.println("Enter how many Employee data you want to enter:");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		Employee[] arr =new Employee[t];
		for(int i=0;i<t;i++)
		{
			
			arr[i]=new Employee();
			System.out.println("Enter id");
			int a=sc.nextInt();
			arr[i].setId(a);
			System.out.println("Enter name");
			String n=sc.next();
			arr[i].setName(n);
			System.out.println("Enter salary"); 
			int s=sc.nextInt();
			arr[i].setSalary(s);
		}
		for(int i=0;i<t;i++)
		{
		 
		 System.out.println(arr[i].empDetails());
		}
		
	}

}
