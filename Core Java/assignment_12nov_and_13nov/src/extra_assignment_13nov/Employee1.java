package extra_assignment_13nov;

public class Employee1 {
	
	private int empid;
	private String name;
	private int basicSal;
	private float hra;;
	private float pf;
	private int pt=200;
	private float netsalary;
	private float grosssalary;
	
	
	public Employee1() {
		
	}


	public Employee1(int empid, String name, int basicSal, float hra, float pf, int pt, float netsalary,
			float grosssalary) {
		this.empid = empid;
		this.name = name;
		this.basicSal = basicSal;
		this.hra = hra;
		this.pf = pf;
		this.pt = pt;
		this.netsalary = netsalary;
		this.grosssalary = grosssalary;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBasicSal() {
		return basicSal;
	}


	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}


	public float getHra() {
		return hra;
	}


	public void setHra(float hra) {
		this.hra = hra;
	}


	public float getPf() {
		return pf;
	}


	public void setPf(float pf) {
		this.pf = pf;
	}


	public int getPt() {
		return pt;
	}


	public void setPt(int pt) {
		this.pt = pt;
	}


	public float getNetsalary() {
		return netsalary;
	}


	public void setNetsalary(float netsalary) {
		this.netsalary = netsalary;
	}


	public float getGrosssalary() {
		return grosssalary;
	}


	public void setGrosssalary(float grosssalary) {
		this.grosssalary = grosssalary;
	}


	@Override
	public String toString() {
		return "\nEmpid: " + empid + "\nName: " + name + "\nBasic Salary: " + basicSal + "\nHRA: " + hra + "\nPF: " + pf
				+ "\nPT: " + pt + "\nNet Salary: " + netsalary + "\nGross Salary: " + grosssalary + "\n";
	}

	

}
