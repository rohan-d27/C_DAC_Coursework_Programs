package study.practice;

import java.util.Scanner;

public class UserofMonthlyExpense {

	public static void main(String[] args) {
		
		MonthlyExpense m=new MonthlyExpense();
		ExpenseDetails[] err=new ExpenseDetails[5];
		
		for(int i=0;i<err.length;i++)
		{
			err[i]=new ExpenseDetails();
			populateExpense(err[i]);
			m.addNewExpense(err[i]);
		}
		
		m.showAll();
		System.out.println("Total Monthly Expense: "+m.getTotalExpenditure());
	}//end of main
	
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
