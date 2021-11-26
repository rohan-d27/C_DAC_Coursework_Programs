package Q6.Employee;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Address ad;


	Employee()
	{

	}
	Employee(int a,String n)
	{
		id=a;
		name = n;	
	}

	Employee(int a,String n, double s,Address add)
	{	
		id=a;
		name = n;
		salary = s;
		ad=add;
	}
	public void setId(int a)
	{
		id=a;
	}

	public int  getId()
	{
		return id;
	}
	public void setName(String n)
	{
		name=n;
	}

	public String getName()
	{
		return name;
	}

	public void setSalary(double v)
	{
		salary=v;
	}

	public double getSalary()
	{
		return salary;
	}
	
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	public String empDetails()
	{		
		String str = "Name:" + name + ", id:" + id + ", salary : " + salary+" "+ad;
		return str;
	}

	

};
