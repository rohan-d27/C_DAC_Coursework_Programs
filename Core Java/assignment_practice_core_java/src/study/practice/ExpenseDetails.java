package study.practice;



public class ExpenseDetails {
    private String expenseDescription;
    private double expenseAmount;
    private Date expenseDate;
	
   
	public ExpenseDetails() {
		
	}

	public String getExpenseDescription() {
		return expenseDescription;
	}

	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}

	public double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	@Override
	public String toString() {
		return "Expense Description=" + expenseDescription + ", Expense Amount=" + expenseAmount
				+ ", Expense Date=" + expenseDate + "\n";
	}
   
	@Override
    public boolean equals(Object obj)
    {
		ExpenseDetails temp=(ExpenseDetails)obj;
		if((this.getExpenseDescription().equals(temp.expenseDescription))&&(this.getExpenseAmount()==temp.getExpenseAmount())&&(this.getExpenseDate().equals(temp.getExpenseDate())))
				{
					return true;
				}
		else
		{
			return false;
		}
    }
       
}
