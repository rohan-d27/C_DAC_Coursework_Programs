/*COP_Assignment_2*/
/*Q2.Modify the Employee class written above id, name ,salary  Date dob(date of birth), 
no-args and parameterized constructor add one more parameterized constructor with fields
showEmpDetails --- show the info in the class
dob is a reference of class MyDate. Write a class MainEmpUser in that write
where you  create a few employees and call showdetails method.*/



package ModEmployee;

import java.util.Scanner;

public class MainModEmp {

	public static void main(String[] args) {
		System.out.println("Enter how many Employee data you want to enter:");

		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();

		ModEmp[] arr =new ModEmp[t];
		Date[] brr =new Date[t];
		for(int i=0;i<t;i++)
		{

			arr[i]=new ModEmp();
			System.out.println("Enter id");
			int a=sc.nextInt();
			arr[i].setId(a);
			System.out.println("Enter name");
			String n=sc.next();
			arr[i].setName(n);
			System.out.println("Enter salary"); 
			int s=sc.nextInt();
			arr[i].setSalary(s);
			System.out.println("Enter date of birth in dd-mm-yyyy format");
			String d=sc.next();
			arr[i].setDob(d);


			brr[i]=new Date();
			brr[i].setDateDMY(arr[i].getDob());
		}

		for(int i=0;i<t;i++)
		{
			System.out.println("\n\n" + arr[i].empDetails() + "\n");

			brr[i].display();
		}

	}	
}


