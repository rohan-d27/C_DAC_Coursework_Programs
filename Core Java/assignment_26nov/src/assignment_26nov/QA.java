package assignment_26nov;

public class QA extends Employee {
	private int noOfTestCases;

	public QA(String name, int age, String gender, int empid, String role, int bankaccno, int basicSal,int noOfTestCases) {
		super(name, age, gender, empid, role, bankaccno, basicSal);
		this.noOfTestCases=noOfTestCases;
	}

	public int getNoOfTestCases() {
		return noOfTestCases;
	}

	public void setNoOfTestCases(int noOfTestCases) {
		this.noOfTestCases = noOfTestCases;
	}

	@Override
	public String toString() {
		return super.toString()+"\nQA no Of Test Cases=" + noOfTestCases+"";
	}

	@Override
	public float cal_Salary() {
		float salary=this.getBasicSal()+(0.2f*this.getBasicSal())+8000+(10*this.noOfTestCases);
		return salary;
	}

}
