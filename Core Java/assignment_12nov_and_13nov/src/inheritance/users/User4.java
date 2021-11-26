package inheritance.users;

import java.util.Scanner;

import inheritance.Date;
import inheritance.Employee;
import inheritance.Patient;

public class User4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		//System.out.println("Employee Object With no parameter construtor.");
		populate(e1);
		//System.out.println("Employee Object With parameterized construtor.");
		System.out.println("Enter Employee id:");
		int id1=sc.nextInt();
		System.out.println("Enter Employee name");
		String n1=sc.next();
		System.out.println("Enter Dob:");
		System.out.println("Enter Date:");
		int dd1=sc.nextInt();
		System.out.println("Enter Month:");
		int dm1=sc.nextInt();
		System.out.println("Enter Year:");
		int dy1=sc.nextInt();
		Date dob1=new Date(dd1,dm1,dy1);
		System.out.println("Enter Employee Department");
		String dep1=sc.next();
		System.out.println("Enter Salary:");
		int sal1=sc.nextInt();
		
		Employee e2=new Employee(n1,dob1,id1,dep1,sal1);
		System.out.println(" ");
		display(e1);
		
		display(e2);
	}
		static void populate(Employee e1)
		{
			Scanner bc=new Scanner(System.in);
			System.out.println("Enter Employee id:");
			int id=bc.nextInt();
			e1.setEmpid(id);
			System.out.println("Enter Employee name");
			String n=bc.next();
			e1.setName(n);
			System.out.println("Enter Dob:");
			System.out.println("Enter Date:");
			int dd=bc.nextInt();
			System.out.println("Enter Month:");
			int dm=bc.nextInt();
			System.out.println("Enter Year:");
			int dy=bc.nextInt();
			e1.setDob(new Date(dd,dm,dy));
			System.out.println("Enter Employee Department");
			String dep=bc.next();
			e1.setDepartment(dep);
			System.out.println("Enter Salary:");
			int sal=bc.nextInt();
			e1.setSalary(sal);
		
		}
		static void display(Employee e)
		 {
			
			 
				 System.out.println("Employee id: "+e.getEmpid()+"Name: "+e.getName()+"\nDOB: "+e.getDob()+"\nDepartment: "+e.getDepartment()+"\nSalary: "+e.getSalary()+"\n");
			 
		 }
		 
}
