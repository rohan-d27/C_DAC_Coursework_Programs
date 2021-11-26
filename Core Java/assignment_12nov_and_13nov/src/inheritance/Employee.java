package inheritance;

public class Employee extends Person {

	private int empid;
	private String department;
	private int salary;
	
	public Employee(String n,Date d,int eid,String dept,int sal)
	{
		super(n,d);
		this.empid=eid;
		this.department=dept;
		this.salary=sal;
		System.out.println("Parameterized constructor of Employee class");
	}
	
	public Employee()
	{
		System.out.println("No Parameter constructor of Employee class");
	}
	
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
