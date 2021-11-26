
public class Employee {
	private int id;
	private String name;
	private int salary;
	private String gender;


	Employee()
	{

	}
	Employee(int a,String n)
	{
		id=a;
		name = n;	
	}

	Employee(int a,String n, int s,String g)
	{	
		id=a;
		name = n;
		salary = s;
		gender  =g;
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

	public void setSalary(int s)
	{
		salary=s;
	}

	public int getSalary()
	{
		return salary;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String toString()
	{		
		String str = "Name:" + name + ", id:" + id + ", salary : " + salary+",Gender: "+gender;
		return str;
	}

};
