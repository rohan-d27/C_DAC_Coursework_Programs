package study.practice;

import java.util.Scanner;

public class UserofExpense {

	public static void main(String[] args) {
		ExpenseDetails[] err=new ExpenseDetails[3];
		for(int i=0;i<err.length;i++)
		{
			err[i]=new ExpenseDetails();
			populateExpense(err[i]);
		}
		display(err);
		checkIfDuplicateExpense(err);

	}//end of main

	private static void checkIfDuplicateExpense(ExpenseDetails[] err) {

		for(int i=0;i<err.length;i++)
		{
			for(int j=i+1;j<err.length;j++)

			{  
				if(err[i].equals(err[j]))
				{
					System.out.println("Duplicate expense found");
					System.out.println("Expense number"+i +" and Expense number"+j+" are equal");
				}
			}
		}

	}

	private static void display(ExpenseDetails[] err) {
		for(int j=0;j<err.length;j++)
		{
			System.out.println(err[j]);
		}

	}//end of display

	private static void populateExpense(ExpenseDetails e)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter expense description:");
		String str=sc.next();
		e.setExpenseDescription(str);
		System.out.println("Enter expense amount:");
		int amt=sc.nextInt();
		e.setExpenseAmount(amt);
		System.out.println("Enter expense date:");
		Date dt=new Date();
		System.out.println("Enter Date:");
		int d=sc.nextInt();
		dt.setDate(d);
		System.out.println("Enter Month:");
		int m=sc.nextInt();
		dt.setMonth(m);
		System.out.println("Enter Year:");
		int y=sc.nextInt();
		dt.setYear(y);
		e.setExpenseDate(dt);

	}//end of populate

}
