package assignment_26nov;

public abstract class Employee extends Person {
	private int empid;
	private String role;
	private int bankaccno;
	private int basicSal;

	public Employee(String name, int age, String gender, int empid, String role, int bankaccno, int basicSal) {
		super(name, age, gender);
		this.empid = empid;
		this.role = role;
		this.bankaccno = bankaccno;
		this.basicSal = basicSal;
	}

	public final void pay_Salary() {
		System.out.println(cal_Salary());
	}
	public abstract float cal_Salary();

	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getBankaccno() {
		return bankaccno;
	}

	public void setBankaccno(int bankaccno) {
		this.bankaccno = bankaccno;
	}

	public int getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		return  super.toString()+"\nEmp id=" + empid + "\nRole=" + role + "\nBank Acc No=" + bankaccno
				+ "\nBasicSal=" + basicSal;
	}


}
