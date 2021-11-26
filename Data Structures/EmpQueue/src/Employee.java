
public class Employee {

	private String name;
	private int id;
	private int sal;
	
	
	public Employee(int id) 
	{
		this.id = id;
		this.sal = 0;
		this.name = ""; 
	}
	
	public Employee(int id, String name, int sal) 
	{
		this.id = id;
		this.sal = sal;
		this.name = name; 
	}
	
	public String toString() 
	{
		String str = "";
		str = "Emp ID: " + id + "\nEmp Name: " + name + "\nEmp Sal: " + sal;
		return str;
	}
	
}
