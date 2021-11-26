package polymorphism;

public class Student extends Person {
	private int rollno;

	
	
public Student(String n,Date d,int rn)
{
	super(n,d);
	this.rollno=rn;
	//System.out.println("Parameterized constructor of Student class");
	}

	public Student() {
	//System.out.println("No Parameter constructor of Student class");
}
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student Roll no=" + rollno + ", Name=" + getName() + ", Dob=" + getDob() + "\n";
	}
	
	public boolean equals(Object obj)
	{
		Student temp=(Student)obj;
		if(this.getName().equals(temp.getName())&&this.getDob().equals(temp.getDob())&&this.getRollno()==temp.getRollno())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
