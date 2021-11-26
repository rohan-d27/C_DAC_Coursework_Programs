package ModEmployee;

public class ModEmp {

	private int id;
	private String name;
	private int salary;
	private String dob;
	

    ModEmp()
    {
    	
    }
    
	ModEmp(int a,String n)
	{
		id=a;
		name = n;	
	}
	
	ModEmp(int a,String n, int s,String d)
	{	
		id=a;
		name = n;
		salary = s;
		dob=d;
	}
	
	

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String empDetails()
	{		
		String str = "Name:" + name + ", id:" + id + ", salary : " + salary ;
		return str;
	}
	

};



