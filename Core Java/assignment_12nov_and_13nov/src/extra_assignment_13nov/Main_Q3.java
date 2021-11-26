package extra_assignment_13nov;

import java.util.Scanner;
public class Main_Q3 {

	public static void main(String[] args) {
		 
		System.out.println("Enter number of employees:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Employee1[] err=new Employee1[n];
		for(int i=0;i<err.length;i++)
		{
			err[i]=new Employee1();
			populate(err[i]);
		}
		System.out.println("\nAll Employees Details:");
		for(int i=0;i<err.length;i++)
		{
			display(err[i]);
		}
	}
	static void populate(Employee1 e1)
	{
		
		Scanner bc=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int id=bc.nextInt();
		e1.setEmpid(id);
		System.out.println("Enter Employee name");
		String n=bc.next();
		e1.setName(n);
		System.out.println("Enter Salary:");
		int sal=bc.nextInt();
		e1.setBasicSal(sal);
		float hra=(float) (0.5*sal);
		e1.setHra(hra);
		float pf=(float) (0.12*sal);
		e1.setPf(pf);
		float gsal=(float) (sal+hra);
		e1.setGrosssalary(gsal);
		float nsal=(float) (gsal-(e1.getPt()+pf));
		e1.setNetsalary(nsal);
	}
	static void display(Employee1 e1)
	{
		System.out.println(e1);
	}
}
