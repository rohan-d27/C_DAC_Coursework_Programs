package Employee;

public class Employee {

	
		
		private int id;
		private String name;
		private int salary;
		

		Employee()
		{
			
		}
		Employee(int a,String n)
		{
			id=a;
			name = n;	
		}
		
		Employee(int a,String n, int s)
		{	
			id=a;
			name = n;
			salary = s;
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
		public String empDetails()
		{		
			String str = "Name:" + name + ", id:" + id + ", salary : " + salary;
			return str;
		}
		
		

	};
