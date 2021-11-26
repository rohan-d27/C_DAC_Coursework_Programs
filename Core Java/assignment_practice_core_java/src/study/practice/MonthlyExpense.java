package study.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class MonthlyExpense {
	ArrayList<ExpenseDetails> exp;

	
	public MonthlyExpense() {
		exp=new ArrayList<ExpenseDetails> ();
	}
	
	
	public ArrayList<ExpenseDetails> getExp() {
		return exp;
	}


	public void setExp(ArrayList<ExpenseDetails> exp) {
		this.exp = exp;
	}


	public void addNewExpense(ExpenseDetails temp)
	{
		
		GregorianCalendar dd = new GregorianCalendar();
		if((temp.getExpenseDate().getYear()==dd.get(Calendar.YEAR))&&(temp.getExpenseDate().getMonth()==((dd.get(Calendar.MONTH)+1))))
		{
			
			this.exp.add(temp);
		}
		else
		{
			throw new NotCurrentMonthException();
			//System.out.println("Expenses of only current month and year will be added!!!");
		}
	}
	
	
	public void showAll() {
		for(ExpenseDetails e: exp)
		{
			System.out.println(e);
		}
	}
	
	
	public double getTotalExpenditure()
	{
		double sum=0;
		for(ExpenseDetails e: exp)
		{
			sum+=e.getExpenseAmount();
		}
		return sum;
	}
}
