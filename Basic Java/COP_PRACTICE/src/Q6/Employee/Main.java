package Q6.Employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter how many Employee data you want to enter:");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		Employee[] arr =new Employee[t];
	     read(arr);
		menu(arr);
	}
	public static void read(Employee arr[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
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
		System.out.println("Enter address");
		Address ad=new Address();
		arr[i].setAd(ad);
		System.out.println("Enter Flat no.:");
		String fn=sc.next();
		ad.setFlatno(fn);
		System.out.println("Enter Building name:");
		String bn=sc.next();
		ad.setBuildname(bn);
		System.out.println("Enter Area name:");
		String ar=sc.next();
		ad.setArea(ar);
		System.out.println("Enter City name:");
		String cna=sc.next();
		ad.setCity(cna);
		System.out.println("Enter State name:");
		String sn=sc.next();
		ad.setState(sn);
		System.out.println("Enter Country name:");
		String cn=sc.next();
		ad.setCountry(cn);
		System.out.println("Enter Pincode:");
		int pn=sc.nextInt();
		ad.setPincode(pn);
	}
	}
	public static void display(Employee arr[])
	{
		for(int i=0;i<arr.length;i++)
		{

			System.out.println(arr[i].empDetails());
		}
	}
public static void menu(Employee arr[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter choice from below:"
			+ "\n1)Display employees having salary > 5000"
			+ "\n2)Display all details"
			+ "\n3)Update particular employee salary by 20% depending upon empID"
			+ "\n4)Search employee as per his employee id and display that employee\n");
	int key =sc.nextInt();
	
	switch (key) {
	case 1:
		    salarygt(arr);
		    menu(arr);
			break;
	case 2:
			display(arr);
			 menu(arr);
			break;
	case 3:
		updatesal(arr);
		display(arr);
		 menu(arr);
		break;
	case 4:
		searchid(arr);
		 menu(arr);
		break;

	default:
		break;
	}
}
public static void salarygt(Employee arr[])
{
	for(int i=0;i<arr.length;i++)
	if(arr[i].getSalary()>=5000)
	{
		System.out.println( arr[i].empDetails());
	}
}
public static void updatesal(Employee arr[])
{
	Scanner sc=new Scanner(System.in);
System.out.println("Enter id to update salary by 20%");
int k=sc.nextInt();
for(int i=0;i<arr.length;i++)
	if(arr[i].getId()==k)
	{
		double v=arr[i].getSalary()*0.2 + arr[i].getSalary();
		arr[i].setSalary(v);
	}
	
}
public static void searchid(Employee arr[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id to show details");
	int k=sc.nextInt();
	for(int i=0;i<arr.length;i++)
		if(arr[i].getId()==k)
		{
			System.out.println( arr[i].empDetails());
		}
	
}


}
